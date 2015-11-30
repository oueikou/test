package com.fileManager.common.filter;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fileManager.common.util.Constants;

/**
 * 描述: 用户登录拦截器 
 * 项目名称:fileManager 
 * 创建日期:2015年9月11日下午3:03:07
 * 
 * @author Administrator
 * @version
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(LoginInterceptor.class);

	/**
	 * 描述： 在业务处理器处理请求之前被调用 如果返回false 从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链
	 * 
	 * 如果返回true 执行下一个拦截器,直到所有的拦截器都执行完毕 再执行被拦截的Controller 然后进入拦截器链, 从最后一个拦截器往回执行所有的postHandle() 接着再从最后一个拦截器往回执行所有的afterCompletion()
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.info("preHandle(HttpServletRequest, HttpServletResponse, Object) - start 登录拦截器 开始 --- ");
		boolean result;
		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url = requestUri.substring(contextPath.length());

		logger.info("requestUri:" + requestUri);
		logger.info("contextPath:" + contextPath);
		logger.info("url:" + url);

		/**
		 * session中无登录名并且不是登录和注册请求时，做拦截处理，跳转到登录页，其他情况不拦截
		 */
		Object userLoginName = request.getSession().getAttribute(Constants.USER_LOGIN_NAME);
		if ((userLoginName == null || "".equals(userLoginName.toString())) && !Constants.USER_LOGIN_URL.equals(url) && !Constants.USER_REGISTER_URL.equals(url) ) {
			logger.info("Interceptor：跳转到login页面！");
			request.getRequestDispatcher(Constants.USER_LOGIN_PAGE).forward(request, response);
			result = false;
		} else{
			logger.info("登录名："+userLoginName);
			logger.info("未拦截，跳转到："+url);
			result = true;
		}
		logger.info("preHandle(HttpServletRequest, HttpServletResponse, Object) - end 登录拦截器 结束 --- ");
		return result;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

}

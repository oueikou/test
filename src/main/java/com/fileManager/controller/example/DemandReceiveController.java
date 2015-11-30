package com.fileManager.controller.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fileManager.entity.example.DemandReceive;
import com.fileManager.service.example.DemandReceiveService;

@Controller
@RequestMapping("demand")
public class DemandReceiveController {
	
	@Autowired
	private DemandReceiveService demandReceiveService;
	
	@RequestMapping("receive.do")
	public ModelAndView getDemand(){
		ModelAndView mav = new ModelAndView();
		DemandReceive receive = demandReceiveService.selectByPrimaryKey(1L);
		mav.addObject("receive",receive);
		mav.setViewName("demand/receive");
		return mav;
	}
	
}

/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : file_manager

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2015-09-22 16:12:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for demand_receive
-- ----------------------------
DROP TABLE IF EXISTS `demand_receive`;
CREATE TABLE `demand_receive` (
  `DEMAND_RECEIVE_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '需求发送单ID',
  `DEMAND_SEND_ID` bigint(20) DEFAULT NULL COMMENT '服务人数',
  `RECEIVE_STORE_ID` bigint(20) DEFAULT NULL COMMENT '服务区域',
  `RECEIVE_ORG_ID` bigint(20) DEFAULT NULL COMMENT '需求发送机构',
  `RECEIVE_USER_ID` bigint(20) DEFAULT NULL COMMENT '需求发送人',
  `RECEIVE_DATE` datetime DEFAULT NULL COMMENT '接受日期',
  `STATUS` int(2) DEFAULT NULL COMMENT '1-已撤销 2-已接受 3-已成交 4-已关闭',
  `IS_DELETED` int(1) DEFAULT '0' COMMENT '是否删除',
  `CREATE_BY` bigint(20) DEFAULT NULL COMMENT '创建人',
  `CREATE_DT` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_BY` bigint(20) DEFAULT NULL COMMENT '更新人',
  `UPDATE_DT` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`DEMAND_RECEIVE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=190 DEFAULT CHARSET=utf8 COMMENT='需求接受单';

-- ----------------------------
-- Records of demand_receive
-- ----------------------------
INSERT INTO `demand_receive` VALUES ('189', '2', '4', '6', '8', '2015-09-22 11:03:38', '1', '0', null, null, null, null);

-- ----------------------------
-- Table structure for fm_file_info
-- ----------------------------
DROP TABLE IF EXISTS `fm_file_info`;
CREATE TABLE `fm_file_info` (
  `file_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `token` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '令牌',
  `file_name_original` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '原文件名',
  `file_name_sys` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '系统生成文件名',
  `file_category` int(4) DEFAULT NULL COMMENT '文件分类：1-图片；2-文档；3-音乐；4-视频；5-其他',
  `file_path` varchar(512) COLLATE utf8_bin DEFAULT NULL COMMENT '文件物理路径',
  `file_access_status` int(11) DEFAULT '1' COMMENT '文件访问状态：0-不可访问；1-用户自己访问；2-接口访问',
  `folder_id` int(11) DEFAULT NULL COMMENT '所属文件夹id',
  `upload_dt` datetime DEFAULT NULL COMMENT '上传时间',
  `is_delete` int(4) DEFAULT NULL COMMENT '逻辑删除：0-未删除；1-已删除',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_dt` datetime DEFAULT NULL COMMENT '创建日期',
  `update_by` int(11) DEFAULT NULL COMMENT '更新人id',
  `update_dt` datetime DEFAULT NULL COMMENT '更新日期',
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='文件信息表';

-- ----------------------------
-- Records of fm_file_info
-- ----------------------------

-- ----------------------------
-- Table structure for fm_folder
-- ----------------------------
DROP TABLE IF EXISTS `fm_folder`;
CREATE TABLE `fm_folder` (
  `folder_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `folder_name` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '文件夹名称',
  `parent_folder_id` int(11) DEFAULT NULL COMMENT '父文件夹id',
  `folder_level` int(11) DEFAULT NULL COMMENT '文件夹级别：1-一级目录；2-二级目录；以此类推',
  `folder_access_status` int(11) DEFAULT '1' COMMENT '文件夹访问状态：0-不可访问；1-用户自己访问；接口访问',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `token` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '令牌',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` int(11) DEFAULT NULL COMMENT '更新人id',
  `update_dt` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`folder_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of fm_folder
-- ----------------------------

-- ----------------------------
-- Table structure for fm_user
-- ----------------------------
DROP TABLE IF EXISTS `fm_user`;
CREATE TABLE `fm_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `login_name` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '登录名',
  `real_name` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '登录密码',
  `user_type` int(3) DEFAULT NULL COMMENT '用户类型：1-超级管理员',
  `is_disabled` int(2) DEFAULT '0' COMMENT '是否可用：0-可用，1-禁用，默认值是0',
  `is_deleted` int(2) DEFAULT '0' COMMENT '逻辑删除标识：0-正常, 1-已删除，默认值是0',
  `mobile` varchar(15) COLLATE utf8_bin DEFAULT NULL COMMENT '手机号',
  `email` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '邮箱',
  `identity_card` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '身份证',
  `token` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '令牌',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` int(11) DEFAULT NULL COMMENT '更新人id',
  `update_dt` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT COMMENT='用户表';

-- ----------------------------
-- Records of fm_user
-- ----------------------------
INSERT INTO `fm_user` VALUES ('1', 'admin', null, '$2a$10$EDehGEvStqP49fL/sHDTjunX02Rj1nW3JGJ7XA7wCuHltWx04JiTe', '1', '0', '0', null, null, null, null, null, '2015-09-22 14:43:05', null, '2015-09-22 14:42:59');
INSERT INTO `fm_user` VALUES ('2', 'user1', null, '$2a$10$xhUT.vYnFkU5ND4y9nVFgOSyrQqSFKFIjGsW.9rrOTwQACDTx0wF2', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `fm_user` VALUES ('3', 'user2', null, '$2a$10$hbSDeEpL7oT9CP300cwqKePidzn3Nc4JToyROm/x.McuefI52cAtK', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `fm_user` VALUES ('4', 'user3', null, '$2a$10$pw9AdzCe/lR8tFfzoSXhKuj5uziWLzH1nJqi6bQU5p7KsaeZFIGO.', null, '0', '0', null, null, null, null, null, null, null, null);

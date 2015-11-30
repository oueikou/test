/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : file_manager

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2015-09-09 10:55:47
*/

SET FOREIGN_KEY_CHECKS=0;

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
  `file_category` tinyint(4) DEFAULT NULL COMMENT '文件分类：1-图片；2-文档；3-音乐；4-视频；5-其他',
  `file_path` varchar(512) COLLATE utf8_bin DEFAULT NULL COMMENT '文件物理路径',
  `folder_id` int(11) DEFAULT NULL COMMENT '所属文件夹id',
  `upload_dt` datetime DEFAULT NULL COMMENT '上传时间',
  `is_delete` tinyint(4) DEFAULT NULL COMMENT '逻辑删除：0-未删除；1-已删除',
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
  `password` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '登录密码',
  `user_type` tinyint(3) DEFAULT NULL COMMENT '用户类型：1-超级管理员',
  `is_disabled` tinyint(2) DEFAULT '0' COMMENT '是否可用：0-可用，1-禁用，默认值是0',
  `is_deleted` tinyint(2) DEFAULT '0' COMMENT '逻辑删除标识：0-正常, 1-已删除，默认值是0',
  `mobile` varchar(15) COLLATE utf8_bin DEFAULT NULL COMMENT '手机号',
  `email` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '邮箱',
  `identity_card` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '身份证',
  `token` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '令牌',
  `create_by` int(11) DEFAULT NULL COMMENT '创建人id',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` int(11) DEFAULT NULL COMMENT '更新人id',
  `update_dt` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT COMMENT='用户表';

-- ----------------------------
-- Records of fm_user
-- ----------------------------

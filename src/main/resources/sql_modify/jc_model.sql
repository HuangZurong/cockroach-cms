/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : cockcms

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2015-10-17 20:46:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for jc_model
-- ----------------------------
DROP TABLE IF EXISTS `jc_model`;
CREATE TABLE `jc_model` (
  `model_id` int(11) NOT NULL,
  `model_name` varchar(100) NOT NULL COMMENT '名称',
  `model_path` varchar(100) NOT NULL COMMENT '路径',
  `tpl_channel_prefix` varchar(20) DEFAULT NULL COMMENT '栏目模板前缀',
  `tpl_content_prefix` varchar(20) DEFAULT NULL COMMENT '内容模板前缀',
  `title_img_width` int(11) NOT NULL DEFAULT '139' COMMENT '栏目标题图宽度',
  `title_img_height` int(11) NOT NULL DEFAULT '139' COMMENT '栏目标题图高度',
  `content_img_width` int(11) NOT NULL DEFAULT '310' COMMENT '栏目内容图宽度',
  `content_img_height` int(11) NOT NULL DEFAULT '310' COMMENT '栏目内容图高度',
  `priority` int(11) NOT NULL DEFAULT '10' COMMENT '排列顺序',
  `has_content` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否有内容',
  `is_disabled` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否禁用',
  `is_def` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否默认模型',
  `submit_url` varchar(200) DEFAULT NULL COMMENT '提交地址',
  PRIMARY KEY (`model_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='CMS模型表';

-- ----------------------------
-- Records of jc_model
-- ----------------------------
INSERT INTO `jc_model` VALUES ('1', '新闻', '1', 'news', 'news', '139', '139', '310', '310', '1', '1', '0', '1', null);
INSERT INTO `jc_model` VALUES ('2', '单页', '2', 'alone', 'alone', '139', '139', '310', '310', '2', '0', '0', '0', null);
INSERT INTO `jc_model` VALUES ('4', '下载', '4', 'download', 'download', '139', '139', '310', '310', '4', '1', '0', '0', null);
INSERT INTO `jc_model` VALUES ('5', '图库', '5', 'pic', 'pic', '139', '139', '310', '310', '5', '1', '0', '0', null);
INSERT INTO `jc_model` VALUES ('6', '视频', '6', 'vedio', 'vedio', '139', '139', '310', '310', '10', '1', '0', '0', null);
INSERT INTO `jc_model` VALUES ('8', '招聘', 'job', 'job', 'job', '139', '139', '310', '310', '10', '1', '0', '0', null);
INSERT INTO `jc_model` VALUES ('16', '图书', 'book', 'book', 'book', '139', '139', '310', '310', '10', '1', '0', '0', '');

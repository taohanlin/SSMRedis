/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : tui_guang

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2016-07-20 16:44:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pro_apply
-- ----------------------------
DROP TABLE IF EXISTS `pro_apply`;
CREATE TABLE `pro_apply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` double DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `account` varchar(255) DEFAULT NULL,
  `apply_time` datetime DEFAULT NULL,
  `dealt_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pro_apply
-- ----------------------------

-- ----------------------------
-- Table structure for pro_income
-- ----------------------------
DROP TABLE IF EXISTS `pro_income`;
CREATE TABLE `pro_income` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `game_id` int(11) DEFAULT NULL,
  `game_name` varchar(255) DEFAULT NULL,
  `game_server` int(11) DEFAULT NULL,
  `player_account` varchar(255) DEFAULT NULL,
  `player_recharge` double DEFAULT NULL,
  `proportion` double DEFAULT NULL,
  `proportion_percent` varchar(255) DEFAULT NULL,
  `income` double DEFAULT NULL,
  `income_time` datetime DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `account` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pro_income
-- ----------------------------

-- ----------------------------
-- Table structure for pro_info
-- ----------------------------
DROP TABLE IF EXISTS `pro_info`;
CREATE TABLE `pro_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `account` varchar(255) DEFAULT NULL,
  `game_id` int(11) DEFAULT NULL,
  `game_name` varchar(255) DEFAULT NULL,
  `proportion` double DEFAULT NULL,
  `proportion_update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pro_info
-- ----------------------------
INSERT INTO `pro_info` VALUES ('4', '1', 'admin', '1', '烽火东周', '1', '2016-07-05 20:22:03');

-- ----------------------------
-- Table structure for pro_log
-- ----------------------------
DROP TABLE IF EXISTS `pro_log`;
CREATE TABLE `pro_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operator` varchar(255) DEFAULT NULL,
  `operate` varchar(255) DEFAULT NULL,
  `log_describe` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  `log_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pro_log
-- ----------------------------
INSERT INTO `pro_log` VALUES ('9', 'admin', '登录', '登录成功！', '0:0:0:0:0:0:0:1', '2016-07-12 15:19:27');
INSERT INTO `pro_log` VALUES ('10', 'admin', '新增用户', '创建用户test失败， 来源参数已存在！', '0:0:0:0:0:0:0:1', '2016-07-12 15:23:31');
INSERT INTO `pro_log` VALUES ('11', 'admin', '新增用户', '创建用户test失败， 来源参数已存在！', '0:0:0:0:0:0:0:1', '2016-07-12 15:24:25');

-- ----------------------------
-- Table structure for pro_user
-- ----------------------------
DROP TABLE IF EXISTS `pro_user`;
CREATE TABLE `pro_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `realname` varchar(255) DEFAULT NULL,
  `identity` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  `login_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `bank` varchar(255) DEFAULT NULL,
  `bank_account` varchar(255) DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `origin` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pro_user
-- ----------------------------
INSERT INTO `pro_user` VALUES ('1', 'test', '89ef3075391e7a462f63193d39784314bf3e250c', 'a2afc3956ff0e4d0', 'test', null, null, null, '2016-06-23 16:40:54', '2016-06-23 16:40:58', '2016-06-30 13:15:09', null, null, '0', 'nature', '2');
SET FOREIGN_KEY_CHECKS=1;

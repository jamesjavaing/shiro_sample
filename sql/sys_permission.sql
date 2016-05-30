/*
 Navicat MySQL Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50626
 Source Host           : localhost
 Source Database       : shiro_db

 Target Server Type    : MySQL
 Target Server Version : 50626
 File Encoding         : utf-8

 Date: 05/30/2016 16:36:40 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `sys_permission`
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL COMMENT '主键',
  `name` varchar(128) NOT NULL COMMENT '资源名称',
  `type` varchar(32) NOT NULL COMMENT '资源类型：menu,button,',
  `url` varchar(128) DEFAULT NULL COMMENT '访问url地址',
  `permissioncode` varchar(128) DEFAULT NULL COMMENT '权限代码字符串',
  `parentid` int(11) DEFAULT NULL COMMENT '父结点id',
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `sys_permission`
-- ----------------------------
BEGIN;
INSERT INTO `sys_permission` VALUES ('1', '药品管理', 'menu', '/medicine/menu.do', ' ', '0', '1'), ('2', '添加药品', 'button', '/medicine/add.do', 'medicine:add', '1', '1'), ('3', '删除药品', 'button', '/medicine/delete.do', 'medicine:delete', '1', '1'), ('4', '修改药品', 'button', '/medicine/update.do', 'medicine:update', '1', '1'), ('5', '查询药品', 'button', '/medicine/query.do', 'medicine:query', '1', '1'), ('6', '系统管理', 'menu', '/systerm/menu.do', ' ', '0', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

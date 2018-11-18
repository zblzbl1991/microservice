/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : clouddb01

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2018-11-17 16:35:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptNo` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(50) DEFAULT NULL COMMENT '部门名',
  `db_source` varchar(100) DEFAULT NULL COMMENT '数据库名',
  PRIMARY KEY (`deptNo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '开发部', database());
INSERT INTO `dept` VALUES ('2', '人事部',  database());
INSERT INTO `dept` VALUES ('3', '财务部',  database());
INSERT INTO `dept` VALUES ('4', '市场部',  database());
INSERT INTO `dept` VALUES ('5', '运维部',  database());

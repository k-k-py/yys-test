/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : yys_all

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2019-03-17 23:45:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_fragment
-- ----------------------------
DROP TABLE IF EXISTS `t_fragment`;
CREATE TABLE `t_fragment` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `hellspawnId` int(8) DEFAULT NULL,
  `piece` int(8) DEFAULT NULL,
  `yys_Id` int(8) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_fragment
-- ----------------------------
INSERT INTO `t_fragment` VALUES ('1', '28', '58', '4519372');
INSERT INTO `t_fragment` VALUES ('2', '4', '32', '4519372');
INSERT INTO `t_fragment` VALUES ('3', '7', '8', '4519372');
INSERT INTO `t_fragment` VALUES ('4', '29', '12', '4519372');
INSERT INTO `t_fragment` VALUES ('5', '22', '14', '4519372');

-- ----------------------------
-- Table structure for t_hellspawn
-- ----------------------------
DROP TABLE IF EXISTS `t_hellspawn`;
CREATE TABLE `t_hellspawn` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `hellspawnName` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_hellspawn
-- ----------------------------
INSERT INTO `t_hellspawn` VALUES ('1', '大天狗', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('2', '酒吞童子', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('3', '荒川之主', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('4', '炎魔', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('5', '两面佛', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('6', '小鹿男', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('7', '茨木童子', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('8', '青行灯', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('9', '妖刀姬', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('10', '一目连', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('11', '花鸟卷', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('12', '辉夜姬', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('13', '荒', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('14', '彼岸花', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('15', '雪童子', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('16', '山风', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('17', '玉藻前', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('18', '御馔津', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('19', '面灵气', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('20', '鬼切', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('21', '白藏主', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('22', '八岐大蛇', 'ssr');
INSERT INTO `t_hellspawn` VALUES ('23', '少羽大天狗', 'sp');
INSERT INTO `t_hellspawn` VALUES ('24', '炼狱茨木童子', 'sp');
INSERT INTO `t_hellspawn` VALUES ('25', '苍风一目连', 'sp');
INSERT INTO `t_hellspawn` VALUES ('26', '稻荷神御馔津', 'sp');
INSERT INTO `t_hellspawn` VALUES ('27', '奴良陆生', '限定ssr');
INSERT INTO `t_hellspawn` VALUES ('28', '卖药郎', '限定ssr');
INSERT INTO `t_hellspawn` VALUES ('29', '鬼灯', '限定ssr');
INSERT INTO `t_hellspawn` VALUES ('30', '犬夜叉', '限定ssr');
INSERT INTO `t_hellspawn` VALUES ('31', '桔梗', '限定ssr');
INSERT INTO `t_hellspawn` VALUES ('32', '杀生丸', '限定ssr');

-- ----------------------------
-- Table structure for t_master
-- ----------------------------
DROP TABLE IF EXISTS `t_master`;
CREATE TABLE `t_master` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `masterName` varchar(255) DEFAULT NULL,
  `yys_Id` int(8) NOT NULL,
  `user_id` int(8) DEFAULT NULL,
  `yys_societyId` int(8) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_master
-- ----------------------------
INSERT INTO `t_master` VALUES ('1', '咸鱼已自闭', '4519372', '1', '1');
INSERT INTO `t_master` VALUES ('2', '爱崽子的咸鱼', '2121313', '1', '1');
INSERT INTO `t_master` VALUES ('3', '测试1号', '25457', '1', '1');

-- ----------------------------
-- Table structure for t_society
-- ----------------------------
DROP TABLE IF EXISTS `t_society`;
CREATE TABLE `t_society` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `societyName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_society
-- ----------------------------
INSERT INTO `t_society` VALUES ('1', '有关部门');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `passWord` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '18814664479', '123456');
INSERT INTO `t_user` VALUES ('2', 'root', '123456');
INSERT INTO `t_user` VALUES ('3', '526884040@qq.com', '123456');
INSERT INTO `t_user` VALUES ('4', '', '');

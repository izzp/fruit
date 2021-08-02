/*
 Navicat Premium Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : fruit

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 02/08/2021 18:45:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for fruit
-- ----------------------------
DROP TABLE IF EXISTS `fruit`;
CREATE TABLE `fruit`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sale` int(11) NULL DEFAULT NULL,
  `icon` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fruit
-- ----------------------------
INSERT INTO `fruit` VALUES (1, '苹果', 333, 'https://scpic.chinaz.net/files/pic/pic9/202012/bpic22047.jpg');
INSERT INTO `fruit` VALUES (2, '香蕉', 15, 'https://scpic.chinaz.net/files/pic/pic9/201910/bpic13875.jpg');
INSERT INTO `fruit` VALUES (3, '橘子', 299, 'https://scpic.chinaz.net/files/pic/pic9/202009/bpic21399.jpg');
INSERT INTO `fruit` VALUES (6, '火龙果', 133, 'https://scpic.chinaz.net/files/pic/pic9/201705/bpic1389.jpg');
INSERT INTO `fruit` VALUES (7, '芒果', 222, 'https://scpic.chinaz.net/files/pic/pic9/201403/apic384.jpg');
INSERT INTO `fruit` VALUES (16, '西瓜', 123, 'https://scpic.chinaz.net/files/pic/pic9/202005/apic25560.jpg');

SET FOREIGN_KEY_CHECKS = 1;

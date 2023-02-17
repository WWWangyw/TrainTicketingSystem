/*
 Navicat Premium Data Transfer

 Source Server         : mysqlconnect
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : trainstation

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 14/06/2022 07:03:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `train_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `g_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `order_time` date NOT NULL,
  `origin` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `terminus` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `leavetime` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `a_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` decimal(10, 0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (8, 1, 'G7092', '20:25', '2022-06-12', '上海', '南京', '2022-06-26', '22:24', 191);

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '评论人id，对应用户表的id',
  `pl_content` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '评论的内容',
  `pl_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 57 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_comment
-- ----------------------------
INSERT INTO `t_comment` VALUES (56, 14, 'I think', '2022-06-14 01:58:45');

-- ----------------------------
-- Table structure for t_revert
-- ----------------------------
DROP TABLE IF EXISTS `t_revert`;
CREATE TABLE `t_revert`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pl_id` int(11) NOT NULL COMMENT '评论人id，对应t_comment.id',
  `user_id` int(11) DEFAULT NULL COMMENT '回复人id，对应当前登录的账号.id',
  `hf_content` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '回复的内容',
  `hf_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '回复的时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_revert
-- ----------------------------
INSERT INTO `t_revert` VALUES (28, 56, 14, 'and i also think', '2022-06-14 06:53:53');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `realname` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (14, 'admin', '123456', 'www');
INSERT INTO `t_user` VALUES (15, 'admin', '123456', 'www');

-- ----------------------------
-- Table structure for ticket
-- ----------------------------
DROP TABLE IF EXISTS `ticket`;
CREATE TABLE `ticket`  (
  `id` int(11) NOT NULL,
  `train_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `amount` int(11) NOT NULL,
  `remainder` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ticket
-- ----------------------------
INSERT INTO `ticket` VALUES (1, 'K526', 1000, 1000);
INSERT INTO `ticket` VALUES (2, 'D282', 800, 800);
INSERT INTO `ticket` VALUES (3, 'G7002', 800, 800);
INSERT INTO `ticket` VALUES (4, 'K8401', 1000, 1000);

-- ----------------------------
-- Table structure for train
-- ----------------------------
DROP TABLE IF EXISTS `train`;
CREATE TABLE `train`  (
  `train_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `station` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `a_time` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `g_time` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `amount` decimal(10, 0) NOT NULL,
  `remainder` decimal(10, 0) NOT NULL,
  PRIMARY KEY (`train_num`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of train
-- ----------------------------
INSERT INTO `train` VALUES ('G7092', '上海/昆山/苏州/无锡/常州/丹阳/镇江/南京', '20:20/20:45/21:00/21:17/21:33/21:50/22:04/22:24', '20:25/20:47/21:02/21:19/21:35/21:52/22:06/22:29', '0.0/31.5/79.5/106.5/118.5/150/168/191', 400, 199);
INSERT INTO `train` VALUES ('G7254', '合肥/南京/无锡/苏州/昆山/上海', '06:05/07:42/07:59/08:16/08:42/09:13', '06:15/07:52/08:09/08:26/08:52/09:23', '0.0/60.5/145.5/165.5/180.5/205', 900, 900);
INSERT INTO `train` VALUES ('G7798', '汕头/南京/无锡/苏州/昆山/上海', '16:05/17:42/17:59/18:16/18:42/19:13', '16:15/17:47/18:09/18:26/18:52/19:23', '150.0/193.5/238.5/260.5', 1000, 1000);
INSERT INTO `train` VALUES ('Z98', '太原/石家庄/南京/上海', '19：40/22:02/07:50/9:45', '19：55/22:17/07:69/9:55', '80.0/138.5/154.5/180.5', 800, 798);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `status` int(11) NOT NULL,
  `sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `country` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `papers_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `papers_num` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 156 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'admin1', '123456', 2, '女', '18612345678', '123456@qq.com', '中国江苏', 'LukeW', '中国', '身份证', '321111999988883333');
INSERT INTO `users` VALUES (2, 'testuser1', '123456', 1, '女', '14612345678', 'obama@126.com', '法国巴黎', 'Lily', '法国', '港澳通行证', 'G22222222');
INSERT INTO `users` VALUES (3, 'admins', '123456', 2, '男', '15212345678', '1234@qq.com', '江苏省苏州市吴中区', '王五', '中国', '港澳通行证', 'G22222226');
INSERT INTO `users` VALUES (153, 'textuser3', '123456', 1, '男', '18712345678', '1234567@126.com', '英国伦敦', 'Tom', '英国', '护照', 'K14230223');
INSERT INTO `users` VALUES (154, 'textuser2', '123456', 1, '男', '13999999999', '12345678@163.com', '山西省太原市', '李四', '中国', '身份证', '140102199108303211');

SET FOREIGN_KEY_CHECKS = 1;

/*
Navicat MySQL Data Transfer

Source Server         : wxz
Source Server Version : 50155
Source Host           : localhost:3306
Source Database       : hospital

Target Server Type    : MYSQL
Target Server Version : 50155
File Encoding         : 65001

Date: 2019-06-18 18:43:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `Admin_num` varchar(20) NOT NULL,
  `Admin_password` varchar(20) NOT NULL,
  PRIMARY KEY (`Admin_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for case
-- ----------------------------
DROP TABLE IF EXISTS `case`;
CREATE TABLE `case` (
  `Case_num` int(20) NOT NULL,
  `Case_name` varchar(20) NOT NULL,
  `Case_sex` varchar(20) NOT NULL,
  `Case_birth` datetime NOT NULL,
  `Case_phone` varchar(20) NOT NULL,
  `Case_weight` varchar(20) DEFAULT NULL,
  `Case_address` varchar(200) DEFAULT NULL,
  `Case_allergy` varchar(200) NOT NULL,
  `Case_height` varchar(20) DEFAULT NULL,
  `Case_type` varchar(20) NOT NULL,
  `Case_symptom` varchar(700) NOT NULL,
  `Case_info` varchar(700) NOT NULL,
  `Case_advice` varchar(700) NOT NULL,
  `Case_item` varchar(700) NOT NULL,
  `Case_pre` varchar(700) CHARACTER SET utf8 COLLATE utf8_latvian_ci NOT NULL,
  PRIMARY KEY (`Case_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of case
-- ----------------------------

-- ----------------------------
-- Table structure for doctor
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `Docter_name` varchar(30) NOT NULL,
  `Docter_num` int(10) NOT NULL,
  `Docter_password` varchar(30) NOT NULL,
  `Docter_dep` varchar(20) NOT NULL,
  `Docter_time` datetime NOT NULL,
  `Docter_id` varchar(20) NOT NULL,
  `Docter_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of doctor
-- ----------------------------
INSERT INTO `doctor` VALUES ('ABC', '101', '123456', 'A301', '2019-06-12 13:26:21', '370829192306157894', '15263788974');

-- ----------------------------
-- Table structure for drug
-- ----------------------------
DROP TABLE IF EXISTS `drug`;
CREATE TABLE `drug` (
  `Drug_id` int(20) NOT NULL,
  `Drug_name` varchar(50) NOT NULL,
  `Drug_class` varchar(20) NOT NULL,
  `Drug_number` varchar(50) NOT NULL,
  `Drug_factory` varchar(200) NOT NULL,
  `Drug_type` varchar(50) NOT NULL,
  `Drug_instruction` varchar(500) DEFAULT NULL,
  `Drug_function` varchar(500) DEFAULT NULL,
  `Drug_stock` int(10) NOT NULL,
  `Drug_price` double(10,0) NOT NULL,
  `Drug_date` datetime NOT NULL,
  `Drug_expdate` datetime NOT NULL,
  PRIMARY KEY (`Drug_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drug
-- ----------------------------

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `Patient_name` varchar(20) NOT NULL,
  `Patient_sex` varchar(20) NOT NULL,
  `Patient_birth` datetime NOT NULL,
  `Patient_weight` varchar(20) DEFAULT NULL,
  `Patient_id` varchar(20) NOT NULL,
  `Patient_phone` varchar(20) NOT NULL,
  `Patient_address` varchar(200) DEFAULT NULL,
  `Patient_list` varchar(20) NOT NULL,
  PRIMARY KEY (`Patient_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patient
-- ----------------------------

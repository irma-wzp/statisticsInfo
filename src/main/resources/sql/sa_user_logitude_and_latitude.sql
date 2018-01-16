/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : hz

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2018-01-15 18:03:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sa_user_logitude_and_latitude`
-- ----------------------------
DROP TABLE IF EXISTS `sa_user_logitude_and_latitude`;
CREATE TABLE `sa_user_logitude_and_latitude` (
  `id` varchar(32) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `uid` varchar(255) NOT NULL,
  `roa` varchar(255) NOT NULL,
  `attendance` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uid` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sa_user_logitude_and_latitude
-- ----------------------------
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('1', '27', '107', 'HZ9080955acfcfff015acff9606c067a', '0.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('10', '27', '107', 'HZ9080955acfcfff015acff19528058c', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('11', '27', '107', 'HZ9080955acfcfff015acff595970628', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('12', '27', '107', 'HZ9080955acfcfff015acfef3bb30555', '73.68%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('13', '27', '107', 'HZ9080955acfcfff015acffe2d9d0718', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('14', '27', '107', 'HZ9080955acfcfff015ad0012f2f075b', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('15', '27', '107', 'HZ9080955acfcfff015acffbb22e06e1', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('16', '27', '107', 'HZ9080955acfcfff015acfeff1750561', '80.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('17', '27', '107', 'HZ9080955acfcfff015ad0081485081b', '0.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('18', '27', '107', 'HZ9080955acfcfff015acffe6c9d071f', '80.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('19', '27', '107', 'HZ9080955acfcfff015ad00776fd080d', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('2', '27', '107', 'HZ9080955acfcfff015acfe883040409', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('20', '27', '107', 'HZ9080955acfcfff015ad004788e07c8', '66.67%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('21', '0', '0', 'HZ9080955acfcfff015ad00d406d0899', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('22', '27', '107', 'HZ9080955acfcfff015ad00023b60747', '0.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('23', '0', '0', 'HZ9080955acfcfff015ad01442b709c5', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('24', '27', '107', 'HZ9080955acfcfff015ad00e797a08b2', '50.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('25', '0', '0', 'HZ9080955acfcfff015acffbfe1106e8', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('26', '27', '107', 'HZ9080955acfcfff015ad006d0b307fd', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('27', '27', '107', 'HZ9080b95b4b967f015b4c90bb090c3c', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('28', '0', '0', 'HZ9080955acfcfff015ad00511ef07de', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('29', '27', '107', 'HZ9080955acfcfff015ad0056c4f07e6', '0.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('3', '27', '107', 'HZ9080955acfcfff015acfe9cb0f044d', '72.73%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('30', '27', '107', 'HZ8bb0c95c19c59a015c1a7c61390914', '5.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('31', '27', '107', 'HZ8bb0c95c19c59a015c1a7cf0ee091f', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('32', '27', '107', 'HZ8bb0c95c19c59a015c1a7d84530929', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('33', '27', '107', 'HZ9080955acfcfff015acffcc0a006f9', '9.52%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('34', '27', '107', 'HZ9080955acfcfff015ad00407d307be', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('35', '27', '107', 'HZ9080955acfcfff015acff5e078062f', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('36', '27', '107', 'HZ8bb0c95caaecd4015caf6b39ad3243', '4.76%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('37', '27', '107', 'HZ9080955acfcfff015ad005b34007ed', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('38', '30', '120', 'HZ9080955acfcfff015ad00dde8208a4', '90.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('39', '0', '0', 'HZ9080955acfcfff015ad013642e097f', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('4', '27', '107', 'HZ9080955acfcfff015acff073f9056f', '80.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('40', '27', '107', 'HZ9080955acfcfff015ad0112c1e0917', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('41', '27', '107', 'HZ9080955acfcfff015ad011842a091f', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('42', '27', '107', 'HZ9080955acfcfff015ad010325508d2', '50.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('43', '27', '107', 'HZ9080955acfcfff015ad000764e074e', '76.92%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('44', '27', '107', 'HZ9080955acfcfff015ad012f4870975', '81.25%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('45', '27', '107', 'HZ9080955acfcfff015ad011db3d0928', '77.78%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('46', '27', '107', 'HZ9080955acfcfff015ad013b5f609b9', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('47', '27', '107', 'HZ9080955acfcfff015acff9fa940688', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('48', '27', '107', 'HZ9080955acfcfff015acff903930672', '0.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('49', '0', '0', 'HZ9080955acfcfff015acff549770621', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('5', '27', '107', 'HZ9080955acfcfff015acfea2edb0456', '80.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('50', '27', '107', 'HZ9080955acfcfff015ad0071fd40805', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('51', '27', '107', 'HZ9080955acfcfff015ad004c72d07d6', '5.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('52', '27', '107', 'HZ8bb0c95ce22e77015ce712f4f13842', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('53', '27', '107', 'HZ9080955acfcfff015acfff94630737', '75.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('54', '27', '107', 'HZ9080955acfcfff015acffb53d006d9', '0.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('55', '27', '107', 'HZ9080955acfcfff015ad010954b090c', '72.73%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('56', '27', '107', 'HZ9080955acfcfff015ad00e2fee08ab', '6.25%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('57', '27', '107', 'HZ9080955acfcfff015ad01641160a20', '50.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('58', '27', '107', 'HZ8bb0c95d10de97015d1abff89d6d06', '61.11%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('59', '27', '107', 'HZ8bb0c95ce22e77015ce25ddd100319', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('6', '27', '107', 'HZ9080955acfcfff015ad00f25bd08bd', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('60', '27', '107', 'HZ9080955acfcfff015ad0129e1a093a', '0.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('61', '127.683854351', '26.1235', 'HZ9080955acfcfff015acfea808e045d', '50.00%', '0.5');
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('62', '27', '107', 'HZ9080955acfcfff015acff145360584', '100.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('7', '27', '107', 'HZ9080955acfcfff015acff7a6110653', '18.18%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('8', '27', '107', 'HZ9080955acfcfff015ad00fd25108ca', '0.00%', null);
INSERT INTO `sa_user_logitude_and_latitude` VALUES ('9', '27', '107', 'admin', '23.81%', null);

-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        5.5.32 - MySQL Community Server (GPL)
-- 서버 OS:                        Win32
-- HeidiSQL 버전:                  8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- data_model 의 데이터베이스 구조 덤핑
CREATE DATABASE IF NOT EXISTS `data_model` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `data_model`;


-- 테이블 data_model의 구조를 덤프합니다. account
CREATE TABLE IF NOT EXISTS `account` (
  `account_no` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) DEFAULT NULL,
  `account_name` varchar(50) DEFAULT NULL,
  `account_deposit` int(10) DEFAULT NULL,
  `account_open_branch` varchar(50) DEFAULT NULL,
  `account_manager` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`account_no`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `FK_account_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 data_model의 구조를 덤프합니다. branch
CREATE TABLE IF NOT EXISTS `branch` (
  `branch_no` int(10) NOT NULL AUTO_INCREMENT,
  `branch_name` varchar(50) NOT NULL,
  `branch_manager` varchar(50) NOT NULL,
  PRIMARY KEY (`branch_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 data_model의 구조를 덤프합니다. order
CREATE TABLE IF NOT EXISTS `order` (
  `order_date` date DEFAULT NULL,
  `order_no` int(10) NOT NULL AUTO_INCREMENT,
  `account_no` int(10) DEFAULT NULL,
  `user_id` varchar(50) DEFAULT NULL,
  `event_code` int(10) DEFAULT NULL,
  `count` int(10) DEFAULT NULL,
  `money` int(10) DEFAULT NULL,
  PRIMARY KEY (`order_no`),
  KEY `account_no` (`account_no`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `FK_order_account` FOREIGN KEY (`account_no`) REFERENCES `account` (`account_no`),
  CONSTRAINT `FK_order_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.


-- 테이블 data_model의 구조를 덤프합니다. user
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` varchar(50) NOT NULL,
  `user_pw` varchar(50) DEFAULT NULL,
  `user_addr` varchar(50) DEFAULT NULL,
  `user_phone` int(10) DEFAULT NULL,
  `branch_no` int(10) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `branch_no` (`branch_no`),
  CONSTRAINT `FK_user_branch` FOREIGN KEY (`branch_no`) REFERENCES `branch` (`branch_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 내보낼 데이터가 선택되어 있지 않습니다.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

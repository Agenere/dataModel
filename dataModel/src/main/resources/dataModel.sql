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
  `account_no` varchar(100) NOT NULL,
  `user_id` varchar(50) DEFAULT NULL,
  `account_name` varchar(50) DEFAULT NULL,
  `account_deposit` int(10) DEFAULT NULL,
  `account_open_branch` varchar(50) DEFAULT NULL,
  `account_manager` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`account_no`),
  KEY `FK_account_user` (`user_id`),
  CONSTRAINT `FK_account_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table data_model.account: ~0 rows (대략적)
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
/*!40000 ALTER TABLE `account` ENABLE KEYS */;


-- 테이블 data_model의 구조를 덤프합니다. branch
CREATE TABLE IF NOT EXISTS `branch` (
  `branch_no` varchar(50) NOT NULL,
  `branch_name` varchar(50) NOT NULL,
  `branch_manager` varchar(50) NOT NULL,
  PRIMARY KEY (`branch_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table data_model.branch: ~2 rows (대략적)
/*!40000 ALTER TABLE `branch` DISABLE KEYS */;
INSERT INTO `branch` (`branch_no`, `branch_name`, `branch_manager`) VALUES
	('63220', '전주점', '김동열'),
	('63853', '익산점', '임홍근');
/*!40000 ALTER TABLE `branch` ENABLE KEYS */;


-- 테이블 data_model의 구조를 덤프합니다. user
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` varchar(50) NOT NULL,
  `user_pw` varchar(50) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `user_addr` varchar(50) DEFAULT NULL,
  `user_phone` varchar(50) DEFAULT NULL,
  `branch_no` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FK_user_branch` (`branch_no`),
  CONSTRAINT `FK_user_branch` FOREIGN KEY (`branch_no`) REFERENCES `branch` (`branch_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table data_model.user: ~2 rows (대략적)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`, `user_pw`, `user_name`, `user_addr`, `user_phone`, `branch_no`) VALUES
	('id001', 'pw001', '임홍근', 'test', '10', '63853'),
	('id002', 'pw002', '김동열', 'test1', '10', '63220');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


-- 테이블 data_model의 구조를 덤프합니다. user_order
CREATE TABLE IF NOT EXISTS `user_order` (
  `order_date` date DEFAULT NULL,
  `order_no` int(11) NOT NULL AUTO_INCREMENT,
  `account_no` varchar(50) DEFAULT NULL,
  `user_id` varchar(50) DEFAULT NULL,
  `event_code` varchar(50) DEFAULT NULL,
  `order_count` varchar(50) DEFAULT NULL,
  `order_money` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`order_no`),
  KEY `FK_user_order_account` (`account_no`),
  KEY `FK_user_order_user` (`user_id`),
  CONSTRAINT `FK_user_order_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FK_user_order_account` FOREIGN KEY (`account_no`) REFERENCES `account` (`account_no`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table data_model.user_order: ~0 rows (대략적)
/*!40000 ALTER TABLE `user_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_order` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

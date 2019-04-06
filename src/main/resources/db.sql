-- MySQL dump 10.13  Distrib 5.7.25, for Linux (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	5.7.25-0ubuntu0.18.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `test`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test`;

--
-- Table structure for table `fiz`
--

DROP TABLE IF EXISTS `fiz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fiz` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fio` varchar(50) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `number` varchar(7) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fiz`
--

LOCK TABLES `fiz` WRITE;
/*!40000 ALTER TABLE `fiz` DISABLE KEYS */;
INSERT INTO `fiz` VALUES (1,'Vlad','89529225330','Krilova st. 55-75','2248368'),(2,'Alex','89995641254','Kirova st. 17-125','3285447'),(3,'Nikita','89995788828','Bogatkova st. 125-222','2289586'),(4,'Arina','89995687410','Bogatkova st. 125-170','3845696');
/*!40000 ALTER TABLE `fiz` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ur`
--

DROP TABLE IF EXISTS `ur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ur` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fio` varchar(50) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `inn` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ur`
--

LOCK TABLES `ur` WRITE;
/*!40000 ALTER TABLE `ur` DISABLE KEYS */;
INSERT INTO `ur` VALUES (1,'Vlad','89529225330','Krilova st. 55-75','25698745610'),(2,'Alex','89995641254','Kirova st. 17-125','87459625874'),(3,'Nikita','89995788828','Bogatkova st. 125-222','54689525578'),(4,'Arina','89995687410','Bogatkova st. 125-170','11255698002');
/*!40000 ALTER TABLE `ur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fio` varchar(50) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Vlad','89529225330','Krilova st. 55-75'),(2,'Alex','89995641254','Kirova st. 17-125'),(3,'Nikita','89995788828','Bogatkova st. 125-222'),(4,'Arina','89995687410','Bogatkova st. 125-170');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-26 22:21:56

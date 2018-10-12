/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 5.5.33 : Database - chuxingbao
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`chuxingbao` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `chuxingbao`;

/*Table structure for table `t_airticket` */

DROP TABLE IF EXISTS `t_airticket`;

CREATE TABLE `t_airticket` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img` varchar(50) DEFAULT NULL COMMENT '图片',
  `start` varchar(50) DEFAULT NULL COMMENT '出发地',
  `end` varchar(50) DEFAULT NULL COMMENT '目的地',
  `date` date DEFAULT NULL COMMENT '日期',
  `flight_number` varchar(50) DEFAULT NULL COMMENT '航班',
  `money` int(11) DEFAULT NULL COMMENT '票价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_airticket` */

insert  into `t_airticket`(`id`,`img`,`start`,`end`,`date`,`flight_number`,`money`) values (1,'chgf ','南京','北京','2016-11-11','gvyjg ',98),(2,'hunh','北京','南京','2016-11-18','ji',67),(3,'ygh','南京','上海','2016-11-24','hu',56);

/*Table structure for table `t_busticket` */

DROP TABLE IF EXISTS `t_busticket`;

CREATE TABLE `t_busticket` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `start` varchar(50) DEFAULT NULL COMMENT '出发地',
  `end` varchar(50) DEFAULT NULL COMMENT '目的地',
  `date` date DEFAULT NULL COMMENT '日期',
  `bus_number` varchar(50) DEFAULT NULL COMMENT '车次',
  `money` int(8) DEFAULT NULL COMMENT '票价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `t_busticket` */

insert  into `t_busticket`(`id`,`start`,`end`,`date`,`bus_number`,`money`) values (1,'南京','北京','2016-11-11','33',99),(2,'南京','上海','2016-11-12','09',89);

/*Table structure for table `t_carousel_figure` */

DROP TABLE IF EXISTS `t_carousel_figure`;

CREATE TABLE `t_carousel_figure` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '轮播图的id',
  `img` varchar(200) DEFAULT NULL COMMENT '图片',
  `title` varchar(200) DEFAULT NULL COMMENT '标题',
  `rank` int(10) DEFAULT NULL COMMENT '序值',
  `gourl` varchar(200) DEFAULT NULL COMMENT '图片链接',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `t_carousel_figure` */

insert  into `t_carousel_figure`(`id`,`img`,`title`,`rank`,`gourl`) values (7,'http://7xswc7.com1.z0.glb.clouddn.com/o_1ahdl9ukv8canri164d1dei1m65j.jpg','把这一张图弄到第3个',3,'https://www.baidu.com/'),(8,'http://7xswc7.com1.z0.glb.clouddn.com/o_1ahdl9ukvb9q1fv2vs51l2l1c6mh.jpg','第2张轮播图',2,'https://www.nuomi.com/?cid=002540'),(9,'http://7xswc7.com1.z0.glb.clouddn.com/o_1ahdl9ukv8canri164d1dei1m65j.jpg','把这一张图弄到第一个',1,'https://www.baidu.com/'),(11,'http://7xswc7.com1.z0.glb.clouddn.com/o_1ahdl9ukvb9q1fv2vs51l2l1c6mh.jpg','第五   不要显示了',5,'https://www.nuomi.com/?cid=002540'),(12,'http://7xswc7.com1.z0.glb.clouddn.com/o_1ahdl9ukvb9q1fv2vs51l2l1c6mh.jpg','第四',4,'https://www.baidu.com/'),(13,'http://7xswc7.com1.z0.glb.clouddn.com/o_1ahdl9ukvb9q1fv2vs51l2l1c6mh.jpg','第六',6,'https://www.baidu.com/'),(14,'889','889',889,'889'),(15,'测试1','测试1',8,'测试1');

/*Table structure for table `t_gateticket` */

DROP TABLE IF EXISTS `t_gateticket`;

CREATE TABLE `t_gateticket` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '门票',
  `img` varchar(50) DEFAULT NULL COMMENT '图片',
  `attraction_name` varchar(50) DEFAULT NULL COMMENT '景点名',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `introduction` varchar(50) DEFAULT NULL COMMENT '简介',
  `money` int(8) DEFAULT NULL COMMENT '票价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `t_gateticket` */

insert  into `t_gateticket`(`id`,`img`,`attraction_name`,`address`,`introduction`,`money`) values (2,'及','中山路','你就看吧','计划 ',70),(3,'南京','杭州','就','i',89),(4,'fcgd','西湖','乎','那句',97),(6,'24747419@qq.com','111','ii','2016-06-14',100);

/*Table structure for table `t_hotel` */

DROP TABLE IF EXISTS `t_hotel`;

CREATE TABLE `t_hotel` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `img` varchar(50) DEFAULT NULL COMMENT '图片',
  `hotel_name` varchar(50) DEFAULT NULL COMMENT '酒店名',
  `district` varchar(50) DEFAULT NULL COMMENT '市区',
  `city` varchar(50) DEFAULT NULL COMMENT '城市名',
  `money` int(8) DEFAULT NULL COMMENT '多少元起',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `t_hotel` */

insert  into `t_hotel`(`id`,`img`,`hotel_name`,`district`,`city`,`money`) values (1,'哦哦','七天','i','看',60),(2,'一i','如家','街道','0',90),(3,'哦哦','旅馆一号','新街口','了',70);

/*Table structure for table `t_strategy` */

DROP TABLE IF EXISTS `t_strategy`;

CREATE TABLE `t_strategy` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '游记',
  `img` varchar(50) DEFAULT NULL COMMENT '图片',
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `account` varchar(50) DEFAULT NULL COMMENT '发表人',
  `date` date DEFAULT NULL COMMENT '发表日期',
  `introduction` varchar(50) DEFAULT NULL COMMENT '简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `t_strategy` */

insert  into `t_strategy`(`id`,`img`,`title`,`account`,`date`,`introduction`) values (2,'uu','ii','ii','2016-11-16','p'),(3,'ii','pp','ii','2016-08-03','p'),(4,'u','【我在欧洲天旋地转 Spinning Around】酣湑醉梦艳阳下（意法12日之自驾托斯卡纳）','j','2016-11-21','l'),(5,'24747419@qq.com','111','ii','2016-06-14','pp');

/*Table structure for table `t_strategy_details` */

DROP TABLE IF EXISTS `t_strategy_details`;

CREATE TABLE `t_strategy_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '详细内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `t_strategy_details` */

insert  into `t_strategy_details`(`id`,`title`,`content`) values (2,'请求','嘎嘎嘎嘎嘎嘎嘎嘎嘎嘎嘎嘎'),(3,'24747419','伟大的奋斗过返回v好吧好吧'),(4,'【我在欧洲天旋地转 Spinning Around】酣湑醉梦艳阳下（意法12日之自驾托斯卡纳）','pencil页面原型 axcure\r\nbootstrup构建页面出来\r\nvisio用例图\r\n\r\n\r\n复习资料：一个复习PPT  一个学习笔记  一个试卷\r\n');

/*Table structure for table `t_trainticket` */

DROP TABLE IF EXISTS `t_trainticket`;

CREATE TABLE `t_trainticket` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img` varchar(50) DEFAULT NULL COMMENT '图片',
  `start` varchar(50) DEFAULT NULL COMMENT '出发地',
  `end` varchar(50) DEFAULT NULL COMMENT '目的地',
  `date` date DEFAULT NULL COMMENT '日期',
  `train_number` varchar(50) DEFAULT NULL COMMENT '车次',
  `money` int(11) DEFAULT NULL COMMENT '多少元起',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `t_trainticket` */

insert  into `t_trainticket`(`id`,`img`,`start`,`end`,`date`,`train_number`,`money`) values (1,'1','E','D','2016-11-10','E3',67),(2,'2','U','M','2016-11-22','G6',90),(3,'ooopp','nanjing','beijing','2016-11-22','s11',100),(4,'q','南京','北京','2016-11-08','e3',89),(5,'w','南京','北京','2016-11-10','f4',45);

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(50) DEFAULT NULL COMMENT '账号',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`),
  UNIQUE KEY `account` (`account`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`account`,`password`) values (12,'bbb','222'),(13,'ccc','333'),(14,'2474741960@qq.com','111'),(15,'18752001862','111'),(16,'aaa','111'),(17,'ddd','111');

/*Table structure for table `t_userinfo` */

DROP TABLE IF EXISTS `t_userinfo`;

CREATE TABLE `t_userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(50) NOT NULL COMMENT '账号',
  `head` varchar(500) DEFAULT NULL COMMENT '头像',
  `sex` varchar(4) DEFAULT NULL COMMENT '性别',
  `address` varchar(50) DEFAULT NULL COMMENT '居住地址',
  `credits` int(11) DEFAULT NULL COMMENT '积分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `t_userinfo` */

insert  into `t_userinfo`(`id`,`account`,`head`,`sex`,`address`,`credits`) values (12,'bbb',NULL,NULL,NULL,NULL),(13,'ccc',NULL,NULL,NULL,NULL),(14,'2474741960@qq.com',NULL,NULL,NULL,NULL),(15,'18752001862','',NULL,NULL,NULL),(16,'aaa',NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

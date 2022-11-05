/*
SQLyog Ultimate - MySQL GUI v8.21 
MySQL - 5.1.29-rc-community : Database - finalproject
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`finalproject` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `finalproject`;

/*Table structure for table `books` */

DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `title` text,
  `author` text,
  `publisher` text,
  `genre` text,
  `link` text,
  `email` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `books` */

insert  into `books`(`title`,`author`,`publisher`,`genre`,`link`,`email`,`id`) values ('HMA The KIng','HMA KING','The HMA Publisher','Insipiration','','hafizmuzammiljo9@gmail.com',7),('The Alchemist','Paulo Coelho','HarperTorch','Quest, adventure, fantasy','https://www.booksfree.org/pages/download/26738/?dlm-dp-dl-force=1&dlm-dp-dl-nonce=eed2368ad4','uzairasad26@gmail.com',8),('The Forty Rules of Love','Elif Shafak','Penguin Books','Novel, Literary fiction','http://www.kkoworld.com/kitablar/elif-safak-esq-kko-eng.pdf','uzairasad26@gmail.com',9),('1','','11','1','1','hafizmuzammiljo9@gmail.com',11);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `name` text,
  `email` varchar(50) NOT NULL,
  `phone` text,
  `password` text,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`name`,`email`,`phone`,`password`) values ('Muzamil Ahmad','hafizmuzammiljo9@gmail.com','03161417342','Hma123'),('Uzair Baig','uzairasad26@gmail.com','03045937445','Uz@ir007');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

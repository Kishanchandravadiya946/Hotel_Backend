USE `student_tracker`;

DROP TABLE IF EXITS `customers`;

CREATE TABLE `customers`(
`id` int NOT NULL AUTO_INCREMENT,
`name` varchar(45) DEFAULT NULL,
`address` varchar(45) DEFAULT NULL,
`number` int ,
`category` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id`)
)ENGINE=InooDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
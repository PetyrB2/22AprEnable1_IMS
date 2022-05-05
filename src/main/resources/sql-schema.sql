

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(50) DEFAULT NULL,
    `email` VARCHAR(60) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`Items` (
    `productID` INT NOT NULL AUTO_INCREMENT,
	`id` INT NOT NULL,
    `item` VARCHAR(50) NOT NULL,
    `cost` DOUBLE NOT NULL,
    PRIMARY KEY (`productID`),
    FOREIGN KEY (`id`) REFERENCES customers(`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`Orders` (
    `orderID` INT NOT NULL AUTO_INCREMENT,
    `orderNumber` INT NOT NULL,
    `id` INT NOT NULL,
    `price` DOUBLE NOT NULL,
    `cost` DOUBLE NOT NULL,
    PRIMARY KEY (`orderID`),
    FOREIGN KEY (`id`) REFERENCES customers(`id`)
);
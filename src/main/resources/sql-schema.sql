
CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`Items` (
    `productID` INT NOT NULL AUTO_INCREMENT,
    `item` VARCHAR(50) NOT NULL,
    `cost` DOUBLE NOT NULL,
    PRIMARY KEY (`productID`)
);
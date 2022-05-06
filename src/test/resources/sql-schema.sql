DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS orders;

CREATE TABLE IF NOT EXISTS customers (
    `id` INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(50) DEFAULT NULL,
    `email` VARCHAR(60) NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS items (
    `productID` INT NOT NULL AUTO_INCREMENT,
    `id` INT NOT NULL,
    `item` VARCHAR(50) NOT NULL,
    `cost` DOUBLE(10) NOT NULL,
    PRIMARY KEY (`productID`),
    FOREIGN KEY (`id`) REFERENCES customers(`id`)
);
CREATE TABLE IF NOT EXISTS orders (
    `orderID` INT NOT NULL AUTO_INCREMENT,
    `id` INT NOT NULL,
    `productID` INT NOT NULL,
    `quantity` INT NOT NULL,
    PRIMARY KEY (`orderID`),
    FOREIGN KEY (`id`) REFERENCES customers(`id`),
	FOREIGN KEY (`productID`) REFERENCES items(`id`)
);

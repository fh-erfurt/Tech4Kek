USE `Tech4Kek` ;

-- -----------------------------------------------------
-- Data for table `Address` Geht
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Address` (`addressId`, `createdAt`, `updatedAt`, `country`, `state`, `zipcode`, `city`, `street`, `number`) VALUES (1, DEFAULT, NULL, 'Deutschland', 'Thüringen', '99869', 'Wangenheim', 'Grüne Gasse', '2');
INSERT INTO `Address` (`addressId`, `createdAt`, `updatedAt`, `country`, `state`, `zipcode`, `city`, `street`, `number`) VALUES (2, DEFAULT, NULL, 'Deutschland', 'Thüringen', '99085', 'Erfurt', 'Leipziger Straße', '15b');

COMMIT;

-- -----------------------------------------------------
-- Data for table `Account` Geht
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Account` (`accountid`, `createdAt`, `updatedAt`, `firstname`, `lastname`, `email`, `password`, `role`, `addressId`) VALUES (1, DEFAULT, NULL, 'Lukas', 'Arnold', 'Jan204@t-online.de', 'Lolbob123', 1, 1);
INSERT INTO `Account` (`accountid`, `createdAt`, `updatedAt`, `firstname`, `lastname`, `email`, `password`, `role`, `addressId`) VALUES (2, DEFAULT, NULL, 'Bernd', 'Benod', 'Biobernd@t-online.de', 'Bernand123', 0, 2);

COMMIT;

-- -----------------------------------------------------
-- Data for table `Orders` Status 0 = versendet. Geht
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Orders` (`orderId`, `createdAt`, `updatedAt`, `Status`, `AccountID`, `addressId`, `FirstName`, `LastName`) VALUES (1, DEFAULT, NULL, 0, 2, 2, 'Bernd', 'Benod');
INSERT INTO `Orders` (`orderId`, `createdAt`, `updatedAt`, `Status`, `AccountID`, `addressId`, `FirstName`, `LastName`) VALUES (2, DEFAULT, NULL, 1, 1, 1, 'Lukas', 'Arnold');

COMMIT;
-- -----------------------------------------------------
-- Data for table `Product` prodType 0 = Desktop, 1 = Laptop
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Product` (`productId`, `createdAt`, `updatedAt`, `prodname`, `price`, `prodType`, `onStock`) VALUES (1, DEFAULT, NULL, 'Sony Vaio', 259.99, 1, 30);

COMMIT;

-- -----------------------------------------------------
-- Data for table `Product_to_Order` Geht
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Product_to_Order` (`ptoId`, `createdAt`, `updatedAt`, `productcount`, `orderId`, `productId`) VALUES (1, DEFAULT, NULL, 3, 1, 5);
INSERT INTO `Product_to_Order` (`ptoId`, `createdAt`, `updatedAt`, `productcount`, `orderId`, `productId`) VALUES (2, DEFAULT, NULL, 2, 1, 8);
INSERT INTO `Product_to_Order` (`ptoId`, `createdAt`, `updatedAt`, `productcount`, `orderId`, `productId`) VALUES (3, DEFAULT, NULL, 7, 1, 1);
INSERT INTO `Product_to_Order` (`ptoId`, `createdAt`, `updatedAt`, `productcount`, `orderId`, `productId`) VALUES (4, DEFAULT, NULL, 3, 2, 2);

COMMIT;

-- -----------------------------------------------------
-- Data for table `Property` Geht
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (1, DEFAULT, NULL, 'salty', 'description', 'A cool Sony Laptop from 2008');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (2, DEFAULT, NULL, 'salty', 'cpuname', 'Intel Core i5 3230');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (3, DEFAULT, NULL, 'salty', 'cpuclock', '2,30 ghz');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (4, DEFAULT, NULL, 'salty', 'coreamount', '4');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (5, DEFAULT, NULL, 'salty', 'cputhreadamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (6, DEFAULT, NULL, 'salty', 'gpuname', 'AMD rx560');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (7, DEFAULT, NULL, 'salty', 'vramamount', '4 gb');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (8, DEFAULT, NULL, 'salty', 'ramsize', '16gb');

-- Und so weiter halt

COMMIT;

-- -----------------------------------------------------
-- Data for table `Product_has_Property`
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (1, DEFAULT, NULL, 1, 1);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (1, DEFAULT, NULL, 1, 2);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (1, DEFAULT, NULL, 1, 3);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (1, DEFAULT, NULL, 1, 4);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (1, DEFAULT, NULL, 1, 5);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (1, DEFAULT, NULL, 1, 6);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (1, DEFAULT, NULL, 1, 7);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (1, DEFAULT, NULL, 1, 8);



COMMIT;
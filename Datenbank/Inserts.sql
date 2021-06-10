USE `Tech4Kek` ;

-- -----------------------------------------------------
-- Data for table `Address` Geht
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Address` (`addressId`, `createdAt`, `updatedAt`, `country`, `state`, `zipcode`, `city`, `street`, `number`) VALUES (1, DEFAULT, NULL, 'Deutschland', 'Thüringen', '99869', 'Wangenheim', 'Grüne Gasse', '2');
INSERT INTO `Address` (`addressId`, `createdAt`, `updatedAt`, `country`, `state`, `zipcode`, `city`, `street`, `number`) VALUES (2, DEFAULT, NULL, 'Deutschland', 'Thüringen', '99085', 'Erfurt', 'Leipziger Straße', '15b');
INSERT INTO `Address` (`addressId`, `createdAt`, `updatedAt`, `country`, `state`, `zipcode`, `city`, `street`, `number`) VALUES (3, DEFAULT, NULL, 'Deutschland', 'Thüringen', '99867', 'Gotha', 'Geber Straße', '12');
INSERT INTO `Address` (`addressId`, `createdAt`, `updatedAt`, `country`, `state`, `zipcode`, `city`, `street`, `number`) VALUES (4, DEFAULT, NULL, 'Deutschland', 'Thüringen', '99867', 'Bergenberg', 'Berg Straße', '8');

COMMIT;

-- -----------------------------------------------------
-- Data for table `Account` Geht
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Account` (`accountid`, `createdAt`, `updatedAt`, `firstname`, `lastname`, `email`, `password`, `role`, `addressId`) VALUES (1, DEFAULT, NULL, 'Lukas', 'Arnold', 'Jan204@t-online.de', 'Lolbob123', 1, 1);
INSERT INTO `Account` (`accountid`, `createdAt`, `updatedAt`, `firstname`, `lastname`, `email`, `password`, `role`, `addressId`) VALUES (2, DEFAULT, NULL, 'Bernd', 'Benod', 'Biobernd@t-online.de', 'Bernand123', 0, 2);
INSERT INTO `Account` (`accountid`, `createdAt`, `updatedAt`, `firstname`, `lastname`, `email`, `password`, `role`, `addressId`) VALUES (3, DEFAULT, NULL, 'Jochen', 'Cenold', 'Cachabo@t-online.de', '5155488', 0, 2);
INSERT INTO `Account` (`accountid`, `createdAt`, `updatedAt`, `firstname`, `lastname`, `email`, `password`, `role`, `addressId`) VALUES (4, DEFAULT, NULL, 'Albert', 'Denold', 'dededod@t-online.de', 'Hululord23', 0, 2);


COMMIT;

-- -----------------------------------------------------
-- Data for table `Orders` Status 0 = versendet. Geht
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Orders` (`orderId`, `createdAt`, `updatedAt`, `Status`, `AccountID`, `addressId`, `FirstName`, `LastName`) VALUES (1, DEFAULT, NULL, 0, 2, 2, 'Bernd', 'Benod');
INSERT INTO `Orders` (`orderId`, `createdAt`, `updatedAt`, `Status`, `AccountID`, `addressId`, `FirstName`, `LastName`) VALUES (2, DEFAULT, NULL, 0, 1, 1, 'Lukas', 'Arnold');

COMMIT;
-- -----------------------------------------------------
-- Data for table `Product` prodType 0 = Desktop, 1 = Laptop
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Product` (`productId`, `createdAt`, `updatedAt`, `prodname`, `price`, `prodType`, `onStock`) VALUES (1, DEFAULT, NULL, 'Sony Vaio', 259.99, 1, 30);
INSERT INTO `Product` (`productId`, `createdAt`, `updatedAt`, `prodname`, `price`, `prodType`, `onStock`) VALUES (2, DEFAULT, NULL, 'Dell Xtreme', 899.99, 1, 25);

COMMIT;

-- -----------------------------------------------------
-- Data for table `Product_to_Order`
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Product_to_Order` (`ptoId`, `createdAt`, `updatedAt`, `productcount`, `orderId`, `productId`) VALUES (1, DEFAULT, NULL, 3, 1, 1);
INSERT INTO `Product_to_Order` (`ptoId`, `createdAt`, `updatedAt`, `productcount`, `orderId`, `productId`) VALUES (2, DEFAULT, NULL, 5, 2, 1);

COMMIT;

-- -----------------------------------------------------
-- Data for table `Property` Geht
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (1, DEFAULT, NULL, 'pcinfo', 'detailname', 'Sony Vaio');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (2, DEFAULT, NULL, 'pcinfo', 'description', 'A cool Sony Laptop from 2008');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (3, DEFAULT, NULL, 'pcinfo', 'cpuname', 'Intel Core i5 3230');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (4, DEFAULT, NULL, 'pcinfo', 'cpuclock', '2.30');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (5, DEFAULT, NULL, 'pcinfo', 'coreamount', '4');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (6, DEFAULT, NULL, 'pcinfo', 'cputhreadamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (7, DEFAULT, NULL, 'pcinfo', 'gpuname', 'AMD rx560');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (8, DEFAULT, NULL, 'pcinfo', 'gpuclock', '2100');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (9, DEFAULT, NULL, 'pcinfo', 'vramamount', '4');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (10, DEFAULT, NULL, 'pcinfo', 'ramname', 'Billoram 200');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (11, DEFAULT, NULL, 'pcinfo', 'ramsize', '16');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (12, DEFAULT, NULL, 'pcinfo', 'manufactureraddressID', '3');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (13, DEFAULT, NULL, 'pcinfo', 'price', '259.99');

INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (14, DEFAULT, NULL, 'pcinfo', 'detailname', 'Dell Xtreme');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (15, DEFAULT, NULL, 'pcinfo', 'description', 'A Dell PC for Fortnite Players');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (16, DEFAULT, NULL, 'pcinfo', 'cpuname', 'Intel Core i8,5 6700k');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (17, DEFAULT, NULL, 'pcinfo', 'cpuclock', '3.30');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (18, DEFAULT, NULL, 'pcinfo', 'coreamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (19, DEFAULT, NULL, 'pcinfo', 'cputhreadamount', '16');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (20, DEFAULT, NULL, 'pcinfo', 'gpuname', 'AMD rx590');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (21, DEFAULT, NULL, 'pcinfo', 'gpuclock', '2100');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (22, DEFAULT, NULL, 'pcinfo', 'vramamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (23, DEFAULT, NULL, 'pcinfo', 'ramname', 'Corsair 5000xTREME');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (24, DEFAULT, NULL, 'pcinfo', 'ramsize', '32');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (25, DEFAULT, NULL, 'pcinfo', 'manufactureraddressID', '4');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (26, DEFAULT, NULL, 'pcinfo', 'price', '899.99');

-- Und so weiter halt

COMMIT;

-- -----------------------------------------------------
-- Data for table `Product_has_Property`
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (1, DEFAULT, NULL, 1, 1);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (2, DEFAULT, NULL, 1, 2);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (3, DEFAULT, NULL, 1, 3);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (4, DEFAULT, NULL, 1, 4);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (5, DEFAULT, NULL, 1, 5);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (6, DEFAULT, NULL, 1, 6);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (7, DEFAULT, NULL, 1, 7);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (8, DEFAULT, NULL, 1, 8);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (9, DEFAULT, NULL, 1, 9);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (10, DEFAULT, NULL, 1, 10);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (11, DEFAULT, NULL, 1, 11);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (12, DEFAULT, NULL, 1, 12);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (13, DEFAULT, NULL, 1, 13);

INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (14, DEFAULT, NULL, 2, 14);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (15, DEFAULT, NULL, 2, 15);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (16, DEFAULT, NULL, 2, 16);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (17, DEFAULT, NULL, 2, 17);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (18, DEFAULT, NULL, 2, 18);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (19, DEFAULT, NULL, 2, 19);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (20, DEFAULT, NULL, 2, 20);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (21, DEFAULT, NULL, 2, 21);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (22, DEFAULT, NULL, 2, 22);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (23, DEFAULT, NULL, 2, 23);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (24, DEFAULT, NULL, 2, 24);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (25, DEFAULT, NULL, 2, 25);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (26, DEFAULT, NULL, 2, 26);



COMMIT;
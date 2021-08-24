USE `Tech4Kek` ;

-- -----------------------------------------------------
-- Data for table `Address` Geht
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Address` (`addressId`, `createdAt`, `updatedAt`, `country`, `zipcode`, `city`, `street`, `number`) VALUES (1, DEFAULT, NULL, 'Deutschland', '99869', 'Wangenheim', 'Grüne Gasse', '2');
INSERT INTO `Address` (`addressId`, `createdAt`, `updatedAt`, `country`, `zipcode`, `city`, `street`, `number`) VALUES (2, DEFAULT, NULL, 'Deutschland', '99085', 'Erfurt', 'Leipziger Straße', '15b');
INSERT INTO `Address` (`addressId`, `createdAt`, `updatedAt`, `country`, `zipcode`, `city`, `street`, `number`) VALUES (3, DEFAULT, NULL, 'Deutschland', '99867', 'Gotha', 'Geber Straße', '12');
INSERT INTO `Address` (`addressId`, `createdAt`, `updatedAt`, `country`, `zipcode`, `city`, `street`, `number`) VALUES (4, DEFAULT, NULL, 'Deutschland', '99867', 'Bergenberg', 'Berg Straße', '8');

COMMIT;

-- -----------------------------------------------------
-- Data for table `Account` Geht
-- -----------------------------------------------------
START TRANSACTION;
USE `Tech4Kek`;
INSERT INTO `Account` (`accountid`, `createdAt`, `updatedAt`, `firstname`, `lastname`, `email`, `password`, `role`, `addressId`) VALUES (1, DEFAULT, NULL, 'Lukas', 'Arnold', 'Jan204@t-online.de', 'Lolbob123', 1, 1);
INSERT INTO `Account` (`accountid`, `createdAt`, `updatedAt`, `firstname`, `lastname`, `email`, `password`, `role`, `addressId`) VALUES (2, DEFAULT, NULL, 'Bernd', 'Benod', 'Biobernd@t-online.de', 'Bernand123', 0, 2);
INSERT INTO `Account` (`accountid`, `createdAt`, `updatedAt`, `firstname`, `lastname`, `email`, `password`, `role`, `addressId`) VALUES (3, DEFAULT, NULL, 'Jochen', 'Cenold', 'Cachabo@t-online.de', '5155488', 0, 3);
INSERT INTO `Account` (`accountid`, `createdAt`, `updatedAt`, `firstname`, `lastname`, `email`, `password`, `role`, `addressId`) VALUES (4, DEFAULT, NULL, 'Albert', 'Denold', 'dededod@t-online.de', 'Hululord23', 0, 4);

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
INSERT INTO `Product` (`productId`, `createdAt`, `updatedAt`, `prodname`, `price`, `prodType`, `onStock`) VALUES (1, DEFAULT, NULL, 'Sony Vaio Xtreme', 259.99, 1, 30);
INSERT INTO `Product` (`productId`, `createdAt`, `updatedAt`, `prodname`, `price`, `prodType`, `onStock`) VALUES (2, DEFAULT, NULL, 'Dell Xtreme', 899.99, 1, 10);
INSERT INTO `Product` (`productId`, `createdAt`, `updatedAt`, `prodname`, `price`, `prodType`, `onStock`) VALUES (3, DEFAULT, NULL, 'Razer Blade 15', 1749.99, 1, 12);
INSERT INTO `Product` (`productId`, `createdAt`, `updatedAt`, `prodname`, `price`, `prodType`, `onStock`) VALUES (4, DEFAULT, NULL, 'ASUS ROG Strix G15', 899.00, 1, 3);
INSERT INTO `Product` (`productId`, `createdAt`, `updatedAt`, `prodname`, `price`, `prodType`, `onStock`) VALUES (5, DEFAULT, NULL, 'Abra A5', 749.00, 1, 4);
INSERT INTO `Product` (`productId`, `createdAt`, `updatedAt`, `prodname`, `price`, `prodType`, `onStock`) VALUES (6, DEFAULT, NULL, 'Abra A51', 1200.00, 1, 5);

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
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (12, DEFAULT, NULL, 'pcinfo', 'price', '259.99');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (13, DEFAULT, NULL, 'pcinfo', 'pcmanuaddressid', '3');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (14, DEFAULT, NULL, 'pcinfo', 'pcmanuaccid', '3');

INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (15, DEFAULT, NULL, 'pcinfo', 'detailname', 'Dell Xtreme');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (16, DEFAULT, NULL, 'pcinfo', 'description', 'A Dell PC for Fortnite Players');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (17, DEFAULT, NULL, 'pcinfo', 'cpuname', 'Intel Core i8,5 6700k');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (18, DEFAULT, NULL, 'pcinfo', 'cpuclock', '3.30');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (19, DEFAULT, NULL, 'pcinfo', 'coreamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (20, DEFAULT, NULL, 'pcinfo', 'cputhreadamount', '16');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (21, DEFAULT, NULL, 'pcinfo', 'gpuname', 'AMD rx590');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (22, DEFAULT, NULL, 'pcinfo', 'gpuclock', '2100');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (23, DEFAULT, NULL, 'pcinfo', 'vramamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (24, DEFAULT, NULL, 'pcinfo', 'ramname', 'Corsair 5000xTREME');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (25, DEFAULT, NULL, 'pcinfo', 'ramsize', '32');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (26, DEFAULT, NULL, 'pcinfo', 'price', '899.99');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (27, DEFAULT, NULL, 'pcinfo', 'pcmanuaddressid', '4');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (28, DEFAULT, NULL, 'pcinfo', 'pcmanuaccid', '4');

INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (29, DEFAULT, NULL, 'pcinfo', 'detailname', 'Razer Blade 15 Base model');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (30, DEFAULT, NULL, 'pcinfo', 'description', 'A Razer Laptop for Fortnite Players');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (31, DEFAULT, NULL, 'pcinfo', 'cpuname', 'Intel Core i7-11800H');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (32, DEFAULT, NULL, 'pcinfo', 'cpuclock', '4.30');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (33, DEFAULT, NULL, 'pcinfo', 'coreamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (34, DEFAULT, NULL, 'pcinfo', 'cputhreadamount', '16');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (35, DEFAULT, NULL, 'pcinfo', 'gpuname', 'Nvdia RTX 3060 Max-Q');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (36, DEFAULT, NULL, 'pcinfo', 'gpuclock', '2100');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (37, DEFAULT, NULL, 'pcinfo', 'vramamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (38, DEFAULT, NULL, 'pcinfo', 'ramname', 'Razer 5000xTREME');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (39, DEFAULT, NULL, 'pcinfo', 'ramsize', '16');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (40, DEFAULT, NULL, 'pcinfo', 'price', '1749.99');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (41, DEFAULT, NULL, 'pcinfo', 'pcmanuaddressid', '3');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (42, DEFAULT, NULL, 'pcinfo', 'pcmanuaccid', '3');

INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (43, DEFAULT, NULL, 'pcinfo', 'detailname', 'ASUS ROG Strix G15');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (44, DEFAULT, NULL, 'pcinfo', 'description', 'A Asus Laptop for Fortnite Players');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (45, DEFAULT, NULL, 'pcinfo', 'cpuname', 'AMD Ryzen 7 4800H');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (46, DEFAULT, NULL, 'pcinfo', 'cpuclock', '3.30');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (47, DEFAULT, NULL, 'pcinfo', 'coreamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (48, DEFAULT, NULL, 'pcinfo', 'cputhreadamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (49, DEFAULT, NULL, 'pcinfo', 'gpuname', 'AMD rx590');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (50, DEFAULT, NULL, 'pcinfo', 'gpuclock', '2100');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (51, DEFAULT, NULL, 'pcinfo', 'vramamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (52, DEFAULT, NULL, 'pcinfo', 'ramname', 'Corsair 5000 Vengence xTREME');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (53, DEFAULT, NULL, 'pcinfo', 'ramsize', '16');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (54, DEFAULT, NULL, 'pcinfo', 'price', '899.00');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (55, DEFAULT, NULL, 'pcinfo', 'pcmanuaddressid', '2');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (56, DEFAULT, NULL, 'pcinfo', 'pcmanuaccid', '2');

INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (57, DEFAULT, NULL, 'pcinfo', 'detailname', 'Abra A5');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (58, DEFAULT, NULL, 'pcinfo', 'description', 'A Laptop for Fortnite Players');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (59, DEFAULT, NULL, 'pcinfo', 'cpuname', 'Intel Core i8,5 6700k');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (60, DEFAULT, NULL, 'pcinfo', 'cpuclock', '3.30');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (61, DEFAULT, NULL, 'pcinfo', 'coreamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (62, DEFAULT, NULL, 'pcinfo', 'cputhreadamount', '16');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (63, DEFAULT, NULL, 'pcinfo', 'gpuname', 'Nvidia GTX1650');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (64, DEFAULT, NULL, 'pcinfo', 'gpuclock', '2100');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (65, DEFAULT, NULL, 'pcinfo', 'vramamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (66, DEFAULT, NULL, 'pcinfo', 'ramname', 'Corsair 5000xTREME');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (67, DEFAULT, NULL, 'pcinfo', 'ramsize', '32');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (68, DEFAULT, NULL, 'pcinfo', 'price', '899.99');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (69, DEFAULT, NULL, 'pcinfo', 'pcmanuaddressid', '1');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (70, DEFAULT, NULL, 'pcinfo', 'pcmanuaccid', '1');

INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (71, DEFAULT, NULL, 'pcinfo', 'detailname', 'Abra A51');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (72, DEFAULT, NULL, 'pcinfo', 'description', 'A Laptop for Fortnite Players');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (73, DEFAULT, NULL, 'pcinfo', 'cpuname', 'Intel Core i8,5 6700k');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (74, DEFAULT, NULL, 'pcinfo', 'cpuclock', '3.30');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (75, DEFAULT, NULL, 'pcinfo', 'coreamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (76, DEFAULT, NULL, 'pcinfo', 'cputhreadamount', '16');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (77, DEFAULT, NULL, 'pcinfo', 'gpuname', 'Nvidia GTX11650');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (78, DEFAULT, NULL, 'pcinfo', 'gpuclock', '2100');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (79, DEFAULT, NULL, 'pcinfo', 'vramamount', '8');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (80, DEFAULT, NULL, 'pcinfo', 'ramname', 'Corsair 5000xTREME');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (81, DEFAULT, NULL, 'pcinfo', 'ramsize', '32');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (82, DEFAULT, NULL, 'pcinfo', 'price', '1200.00');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (83, DEFAULT, NULL, 'pcinfo', 'pcmanuaddressid', '3');
INSERT INTO `Property` (`propertyId`, `createdAt`, `updatedAt`, `type`, `name`, `value`) VALUES (84, DEFAULT, NULL, 'pcinfo', 'pcmanuaccid', '3');
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
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (14, DEFAULT, NULL, 1, 14);

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
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (27, DEFAULT, NULL, 2, 27);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (28, DEFAULT, NULL, 2, 28);

INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (29, DEFAULT, NULL, 3, 29);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (30, DEFAULT, NULL, 3, 30);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (31, DEFAULT, NULL, 3, 31);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (32, DEFAULT, NULL, 3, 32);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (33, DEFAULT, NULL, 3, 33);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (34, DEFAULT, NULL, 3, 34);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (35, DEFAULT, NULL, 3, 35);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (36, DEFAULT, NULL, 3, 36);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (37, DEFAULT, NULL, 3, 37);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (38, DEFAULT, NULL, 3, 38);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (39, DEFAULT, NULL, 3, 39);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (40, DEFAULT, NULL, 3, 40);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (41, DEFAULT, NULL, 3, 41);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (42, DEFAULT, NULL, 3, 42);

INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (43, DEFAULT, NULL, 4, 43);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (44, DEFAULT, NULL, 4, 44);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (45, DEFAULT, NULL, 4, 45);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (46, DEFAULT, NULL, 4, 46);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (47, DEFAULT, NULL, 4, 47);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (48, DEFAULT, NULL, 4, 48);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (49, DEFAULT, NULL, 4, 49);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (50, DEFAULT, NULL, 4, 50);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (51, DEFAULT, NULL, 4, 51);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (52, DEFAULT, NULL, 4, 52);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (53, DEFAULT, NULL, 4, 53);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (54, DEFAULT, NULL, 4, 54);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (55, DEFAULT, NULL, 4, 55);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (56, DEFAULT, NULL, 4, 56);

INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (57, DEFAULT, NULL, 5, 57);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (58, DEFAULT, NULL, 5, 58);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (59, DEFAULT, NULL, 5, 59);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (60, DEFAULT, NULL, 5, 60);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (61, DEFAULT, NULL, 5, 61);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (62, DEFAULT, NULL, 5, 62);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (63, DEFAULT, NULL, 5, 63);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (64, DEFAULT, NULL, 5, 64);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (65, DEFAULT, NULL, 5, 65);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (66, DEFAULT, NULL, 5, 66);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (67, DEFAULT, NULL, 5, 67);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (68, DEFAULT, NULL, 5, 68);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (69, DEFAULT, NULL, 5, 69);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (70, DEFAULT, NULL, 5, 70);

INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (71, DEFAULT, NULL, 6, 71);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (72, DEFAULT, NULL, 6, 72);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (73, DEFAULT, NULL, 6, 73);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (74, DEFAULT, NULL, 6, 74);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (75, DEFAULT, NULL, 6, 75);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (76, DEFAULT, NULL, 6, 76);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (77, DEFAULT, NULL, 6, 77);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (78, DEFAULT, NULL, 6, 78);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (79, DEFAULT, NULL, 6, 79);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (80, DEFAULT, NULL, 6, 80);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (81, DEFAULT, NULL, 6, 81);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (82, DEFAULT, NULL, 6, 82);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (83, DEFAULT, NULL, 6, 83);
INSERT INTO `Product_has_Property` (`phpId`, `createdAt`, `updatedAt`, `productId`, `propertyId`) VALUES (84, DEFAULT, NULL, 6, 84);

COMMIT;
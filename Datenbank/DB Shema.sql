-- MySQL Script generated by MySQL Workbench
-- Sun Dec  6 13:44:41 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Tech4Kek
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Tech4Kek
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Tech4Kek` DEFAULT CHARACTER SET utf8 ;
USE `Tech4Kek` ;

-- -----------------------------------------------------
-- Table `Tech4Kek`.`Address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Tech4Kek`.`Address` (
  `addressId` INT NOT NULL AUTO_INCREMENT,
  `CreatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UpdatedAt` TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `Country` VARCHAR(45) NOT NULL,

  `Zipcode` VARCHAR(12) NOT NULL,
  `City` VARCHAR(45) NOT NULL,
  `Street` VARCHAR(45) NOT NULL,
  `Number` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`addressId`));


-- -----------------------------------------------------
-- Table `Tech4Kek`.`Account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Tech4Kek`.`Account` (
  `accountId` INT NOT NULL AUTO_INCREMENT,
  `CreatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UpdatedAt` TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `FirstName` VARCHAR(50) NOT NULL,
  `LastName` VARCHAR(30) NOT NULL,
  `Email` VARCHAR(255) UNIQUE NOT NULL,
  `Password` VARCHAR(100) NOT NULL,
  `Role` INT NOT NULL DEFAULT 0,
  `addressId` INT NULL,
  PRIMARY KEY (`accountId`),
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC),
  INDEX `fk_Account_Address1_idx` (`addressId` ASC),
  CONSTRAINT `fk_Account_Address1`
    FOREIGN KEY (`addressId`)
    REFERENCES `Tech4Kek`.`Address` (`addressId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `Tech4Kek`.`Orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Tech4Kek`.`Orders` (
  `orderId` INT NOT NULL AUTO_INCREMENT,
  `CreatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UpdatedAt` TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `Status` INT NOT NULL DEFAULT 0,
  `accountId` INT NOT NULL,
  `addressId` INT NULL,
  `FirstName` VARCHAR(50) NULL,
  `LastName` VARCHAR(30) NULL,
  PRIMARY KEY (`orderId`),
  INDEX `fk_Orders_Account1_idx` (`accountId` ASC),
  INDEX `fk_Orders_Address1_idx` (`addressId` ASC),
  CONSTRAINT `fk_Orders_Account1`
    FOREIGN KEY (`accountId`)
    REFERENCES `Tech4Kek`.`Account` (`accountId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Orders_Address1`
    FOREIGN KEY (`addressId`)
    REFERENCES `Tech4Kek`.`Address` (`addressId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `Tech4Kek`.`Product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Tech4Kek`.`Product` (
  `productId` INT NOT NULL AUTO_INCREMENT,
  `CreatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UpdatedAt` TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `ProdName` VARCHAR(100) NOT NULL,
  `Price` DECIMAL(10,2) NOT NULL,
  `ProdType` INT NOT NULL,
  `OnStock` INT NOT NULL,
  PRIMARY KEY (`productId`),
  UNIQUE INDEX `ProdName_UNIQUE` (`ProdName` ASC));


-- -----------------------------------------------------
-- Table `Tech4Kek`.`Product_to_Order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Tech4Kek`.`Product_to_Order` (
  `PtoID` INT NOT NULL AUTO_INCREMENT,
  `CreatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UpdatedAt` TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `ProductCount` INT NOT NULL,
  `orderId` INT NOT NULL,
  `productId` INT NOT NULL,
  PRIMARY KEY (`PtoID`),
  INDEX `fk_Product_to_Order_Orders1_idx` (`orderId` ASC),
  INDEX `fk_Product_to_Order_Product1_idx` (`productId` ASC),
  CONSTRAINT `fk_Product_to_Order_Orders1`
    FOREIGN KEY (`orderId`)
    REFERENCES `Tech4Kek`.`Orders` (`orderId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Product_to_Order_Product1`
    FOREIGN KEY (`productId`)
    REFERENCES `Tech4Kek`.`Product` (`productId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `Tech4Kek`.`Property`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Tech4Kek`.`Property` (
  `propertyId` INT NOT NULL AUTO_INCREMENT,
  `CreatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UpdatedAt` TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `Type` VARCHAR(45) NOT NULL,
  `Name` VARCHAR(45) NOT NULL,
  `Value` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`propertyId`));


-- -----------------------------------------------------
-- Table `Tech4Kek`.`Product_has_Property`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Tech4Kek`.`Product_has_Property` (
  `PhpID` INT NOT NULL AUTO_INCREMENT,
  `CreatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UpdatedAt` TIMESTAMP NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `productId` INT NOT NULL,
  `propertyId` INT NOT NULL,
  PRIMARY KEY (`PhpID`),
  INDEX `fk_Product_has_Property_Product1_idx` (`productId` ASC),
  INDEX `fk_Product_has_Property_Property1_idx` (`propertyId` ASC),
  CONSTRAINT `fk_Product_has_Property_Product1`
    FOREIGN KEY (`productId`)
    REFERENCES `Tech4Kek`.`Product` (`productId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Product_has_Property_Property1`
    FOREIGN KEY (`propertyId`)
    REFERENCES `Tech4Kek`.`Property` (`propertyId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
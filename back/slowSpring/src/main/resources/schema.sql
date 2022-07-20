-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema slowdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema slowdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `slowdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `slowdb` ;

-- -----------------------------------------------------
-- Table `slowdb`.`preference`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slowdb`.`preference` (
                                                     `preference_id` BIGINT NOT NULL,
                                                     `kilometrage_etape_moyenne` DOUBLE NULL DEFAULT NULL,
                                                     PRIMARY KEY (`preference_id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `slowdb`.`locomotion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slowdb`.`locomotion` (
                                                     `locomotion_id` BIGINT NOT NULL,
                                                     `libele_loco` VARCHAR(255) NULL DEFAULT NULL,
    PRIMARY KEY (`locomotion_id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `slowdb`.`profil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slowdb`.`profil` (
                                                 `profil_id` BIGINT NOT NULL,
                                                 `devise` VARCHAR(255) NULL DEFAULT NULL,
    `photo_profil` VARCHAR(200) NULL DEFAULT NULL,
    `pseudo` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`profil_id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `slowdb`.`parcours`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slowdb`.`parcours` (
                                                   `parcours_id` BIGINT NOT NULL,
                                                   `date_depart` DATETIME(6) NOT NULL,
    `description` VARCHAR(255) NULL DEFAULT NULL,
    `image` VARCHAR(200) NULL DEFAULT NULL,
    `nom_parcours` VARCHAR(100) NOT NULL,
    `nombre_jour` INT NOT NULL,
    `locomotion_locomotion_id` BIGINT NOT NULL,
    `preference_preference_id` BIGINT NOT NULL,
    `profil_profil_id` BIGINT NOT NULL,
    PRIMARY KEY (`parcours_id`),
    INDEX `FKg9s1wbg7aw6qoggyyrycejp4q` (`locomotion_locomotion_id` ASC) VISIBLE,
    INDEX `FK69wtmcu4gt5q35vjsx5dyvgmm` (`preference_preference_id` ASC) VISIBLE,
    INDEX `FKmo0omgifb9ceaqwsaxdcw05dg` (`profil_profil_id` ASC) VISIBLE,
    CONSTRAINT `FK69wtmcu4gt5q35vjsx5dyvgmm`
    FOREIGN KEY (`preference_preference_id`)
    REFERENCES `slowdb`.`preference` (`preference_id`),
    CONSTRAINT `FKg9s1wbg7aw6qoggyyrycejp4q`
    FOREIGN KEY (`locomotion_locomotion_id`)
    REFERENCES `slowdb`.`locomotion` (`locomotion_id`),
    CONSTRAINT `FKmo0omgifb9ceaqwsaxdcw05dg`
    FOREIGN KEY (`profil_profil_id`)
    REFERENCES `slowdb`.`profil` (`profil_id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `slowdb`.`point`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slowdb`.`point` (
                                                `point_id` INT NOT NULL,
                                                `latitude` VARCHAR(12) NOT NULL,
    `longitude` VARCHAR(12) NOT NULL,
    `etiquette` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`point_id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `slowdb`.`balise`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slowdb`.`balise` (
                                                 `balise_id` BIGINT NOT NULL,
                                                 `date_time` DATETIME(6) NOT NULL,
    `distance` DOUBLE NOT NULL,
    `est_verouille` BIT(1) NOT NULL,
    `nom_balise` VARCHAR(45) NOT NULL,
    `parcours_balise` BIGINT NOT NULL,
    `point_balise` INT NOT NULL,
    PRIMARY KEY (`balise_id`),
    INDEX `FKmmvgjkao6cb4wppuuijiekrxp` (`parcours_balise` ASC) VISIBLE,
    INDEX `FKq77msq0wdjlru2isecdgm2wvd` (`point_balise` ASC) VISIBLE,
    CONSTRAINT `FKmmvgjkao6cb4wppuuijiekrxp`
    FOREIGN KEY (`parcours_balise`)
    REFERENCES `slowdb`.`parcours` (`parcours_id`),
    CONSTRAINT `FKq77msq0wdjlru2isecdgm2wvd`
    FOREIGN KEY (`point_balise`)
    REFERENCES `slowdb`.`point` (`point_id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `slowdb`.`hibernate_sequence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `slowdb`.`hibernate_sequence` (
    `next_val` BIGINT NULL DEFAULT NULL)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

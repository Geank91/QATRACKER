
DROP DATABASE IF EXISTS `qatracker`;

CREATE DATABASE  IF NOT EXISTS `qatracker` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `qatracker`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: qatracker
-- ------------------------------------------------------
-- Server version	5.6.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `qatracker`.`usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `NombreUsuario` VARCHAR(45) NOT NULL,
  `Clave` VARCHAR(45) NOT NULL,
  `EstadoUsuario` INT NOT NULL,
  `Puesto` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE INDEX `idUsuario_UNIQUE` (`idUsuario` ASC),
  UNIQUE INDEX `NombreUsuario_UNIQUE` (`NombreUsuario` ASC),
  UNIQUE INDEX `Clave_UNIQUE` (`Clave` ASC));

--
-- Table structure for table `proyecto`
--  
  
DROP TABLE IF EXISTS `proyecto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */; 
  
 CREATE TABLE `qatracker`.`proyecto` (
  `idproyecto` INT NOT NULL AUTO_INCREMENT,
  `descripcionproy` VARCHAR(45) NOT NULL,
  `estadoproy` INT NOT NULL,
  `fechainicio` DATE NOT NULL,
  `fechafinal` DATE NOT NULL,
  PRIMARY KEY (`idproyecto`),
  UNIQUE INDEX `idproyecto_UNIQUE` (`idproyecto` ASC));
 
--
-- Table structure for table `tarea`
--  
  
DROP TABLE IF EXISTS `tarea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */; 
 
 CREATE TABLE `qatracker`.`tarea` (
  `idtarea` INT NOT NULL AUTO_INCREMENT,
  `descripciontarea` VARCHAR(45) NOT NULL,
  `idusuario` INT NOT NULL,
  `estadotarea` VARCHAR(45) NOT NULL,
  `idproyecto` INT NOT NULL,
  PRIMARY KEY (`idtarea`),
  UNIQUE INDEX `idtarea_UNIQUE` (`idtarea` ASC),
  INDEX `idusuario_idx` (`idusuario` ASC),
  INDEX `idproyecto_idx` (`idproyecto` ASC),
  CONSTRAINT `idusuario`
    FOREIGN KEY (`idusuario`)
    REFERENCES `qatracker`.`usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idproyecto`
    FOREIGN KEY (`idproyecto`)
    REFERENCES `qatracker`.`proyecto` (`idproyecto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
 
--
-- Table structure for table `issue`
--  
  
DROP TABLE IF EXISTS `issue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */; 

CREATE TABLE `qatracker`.`issue` (
  `idissue` INT NOT NULL AUTO_INCREMENT,
  `descripcionissue` VARCHAR(45) NOT NULL,
  `idtarea` INT NOT NULL,
  `estadoissue` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idissue`),
  UNIQUE INDEX `idissue_UNIQUE` (`idissue` ASC),
  INDEX `idtarea_idx` (`idtarea` ASC),
  CONSTRAINT `idtarea`
    FOREIGN KEY (`idtarea`)
    REFERENCES `qatracker`.`tarea` (`idtarea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
-- MySQL Script generated by MySQL Workbench
-- Thu Feb  8 12:27:03 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Rol_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Rol_usuario` (
  `id_rol` VARCHAR(16) NOT NULL,
  `descripcion_rol` VARCHAR(255) NULL,
  PRIMARY KEY (`id_rol`),
  UNIQUE INDEX `id_rol_UNIQUE` (`id_rol` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `id_usuario` VARCHAR(45) NOT NULL,
  `nombre_usuario` VARCHAR(16) NOT NULL,
  `apellido_usuario` VARCHAR(45) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `contrasenha` VARCHAR(32) NOT NULL,
  `fecha_creacion` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Rol_usuario_id_rol` VARCHAR(16) NOT NULL,
  `nombre_empresa` VARCHAR(45) NULL,
  `direccion_empesa` VARCHAR(45) NULL,
  `telefono_empresa` VARCHAR(45) NULL,
  PRIMARY KEY (`id_usuario`),
  INDEX `fk_Usuario_Rol_usuario_idx` (`Rol_usuario_id_rol` ASC) VISIBLE,
  UNIQUE INDEX `id_usuario_UNIQUE` (`id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_Usuario_Rol_usuario`
    FOREIGN KEY (`Rol_usuario_id_rol`)
    REFERENCES `mydb`.`Rol_usuario` (`id_rol`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Region`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Region` (
  `id_region` INT NOT NULL,
  `descripcion_region` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_region`),
  UNIQUE INDEX `id_region_UNIQUE` (`id_region` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Comuna`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Comuna` (
  `id_comuna` INT NOT NULL,
  `descripcion_comuna` VARCHAR(100) NOT NULL,
  `Region_id_region` INT NOT NULL,
  PRIMARY KEY (`id_comuna`),
  INDEX `fk_Comuna_Region1_idx` (`Region_id_region` ASC) VISIBLE,
  UNIQUE INDEX `id_comuna_UNIQUE` (`id_comuna` ASC) VISIBLE,
  CONSTRAINT `fk_Comuna_Region1`
    FOREIGN KEY (`Region_id_region`)
    REFERENCES `mydb`.`Region` (`id_region`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Vigencia_publicacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Vigencia_publicacion` (
  `id_vigencia_publicacion` INT NOT NULL,
  `descripcion_vigencia` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_vigencia_publicacion`),
  UNIQUE INDEX `id_vigencia_publicacion_UNIQUE` (`id_vigencia_publicacion` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Categoria_residuo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Categoria_residuo` (
  `id_categoria_residuo` INT NOT NULL,
  `descripcion_categoria` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_categoria_residuo`),
  UNIQUE INDEX `idCategoria_residuo_UNIQUE` (`id_categoria_residuo` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Estado_residuos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Estado_residuos` (
  `id_estado_residuos` INT NOT NULL,
  `descripcion_estado_residuos` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_estado_residuos`),
  UNIQUE INDEX `idEstado_residuos_UNIQUE` (`id_estado_residuos` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Residuo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Residuo` (
  `id_residuo` INT NOT NULL,
  `Categoria_residuo_id_categoria_residuo` INT NOT NULL,
  `Estado_residuos_id_estado_residuos` INT NOT NULL,
  PRIMARY KEY (`id_residuo`),
  UNIQUE INDEX `idResiduo_UNIQUE` (`id_residuo` ASC) VISIBLE,
  INDEX `fk_Residuo_Categoria_residuo1_idx` (`Categoria_residuo_id_categoria_residuo` ASC) VISIBLE,
  INDEX `fk_Residuo_Estado_residuos1_idx` (`Estado_residuos_id_estado_residuos` ASC) VISIBLE,
  CONSTRAINT `fk_Residuo_Categoria_residuo1`
    FOREIGN KEY (`Categoria_residuo_id_categoria_residuo`)
    REFERENCES `mydb`.`Categoria_residuo` (`id_categoria_residuo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Residuo_Estado_residuos1`
    FOREIGN KEY (`Estado_residuos_id_estado_residuos`)
    REFERENCES `mydb`.`Estado_residuos` (`id_estado_residuos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Publicacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Publicacion` (
  `id_publicacion` INT NOT NULL,
  `Usuario_id_usuario` VARCHAR(45) NOT NULL,
  `titulo_publicacion` VARCHAR(45) NOT NULL,
  `imagen_publicacion` VARCHAR(45) NOT NULL,
  `cuerpo_publicacion` VARCHAR(45) NOT NULL,
  `cantidad` INT NOT NULL,
  `precio` INT NOT NULL,
  `unidad_medida` VARCHAR(45) NOT NULL,
  `Comuna_id_comuna` INT NOT NULL,
  `Vigencia_publicacion_id_vigencia_publicacion` INT NOT NULL,
  `Residuo_id_residuo` INT NOT NULL,
  PRIMARY KEY (`id_publicacion`),
  INDEX `fk_Publicacion_Usuario1_idx` (`Usuario_id_usuario` ASC) VISIBLE,
  INDEX `fk_Publicacion_Comuna1_idx` (`Comuna_id_comuna` ASC) VISIBLE,
  INDEX `fk_Publicacion_Vigencia_publicacion1_idx` (`Vigencia_publicacion_id_vigencia_publicacion` ASC) VISIBLE,
  UNIQUE INDEX `id_publicacion_UNIQUE` (`id_publicacion` ASC) VISIBLE,
  INDEX `fk_Publicacion_Residuo1_idx` (`Residuo_id_residuo` ASC) VISIBLE,
  CONSTRAINT `fk_Publicacion_Usuario1`
    FOREIGN KEY (`Usuario_id_usuario`)
    REFERENCES `mydb`.`Usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Publicacion_Comuna1`
    FOREIGN KEY (`Comuna_id_comuna`)
    REFERENCES `mydb`.`Comuna` (`id_comuna`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Publicacion_Vigencia_publicacion1`
    FOREIGN KEY (`Vigencia_publicacion_id_vigencia_publicacion`)
    REFERENCES `mydb`.`Vigencia_publicacion` (`id_vigencia_publicacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Publicacion_Residuo1`
    FOREIGN KEY (`Residuo_id_residuo`)
    REFERENCES `mydb`.`Residuo` (`id_residuo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
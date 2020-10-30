-- MySQL Script generated by MySQL Workbench
-- 2020年10月29日 星期四 22时20分44秒
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema db_dingding
-- -----------------------------------------------------
-- 仿钉钉项目数据库

-- -----------------------------------------------------
-- Schema db_dingding
--
-- 仿钉钉项目数据库
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_dingding` ;
USE `db_dingding` ;

-- -----------------------------------------------------
-- Table `db_dingding`.`t_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`t_user` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'userId',
  `phone` VARCHAR(45) NULL COMMENT '手机号',
  `email` VARCHAR(200) NULL COMMENT '邮箱',
  `password` VARCHAR(200) NULL COMMENT '密码（密文）',
  `nickname` VARCHAR(80) NULL COMMENT '昵称',
  `status` INT NULL COMMENT '标志位 0 未激活，1激活',
  `icon` VARCHAR(255) NULL COMMENT '头像地址',
  `createtime` DATETIME NULL COMMENT '创建时间',
  `updatetime` DATETIME NULL COMMENT '修改时间',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '用户表';


-- -----------------------------------------------------
-- Table `db_dingding`.`t_document`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`t_document` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `u_id` INT NULL COMMENT '用户id',
  `d_name` VARCHAR(200) NULL COMMENT '文档名',
  `d_address` VARCHAR(200) NULL COMMENT '文档地址',
  `createtime` DATETIME NULL COMMENT '创建时间',
  `updatetime` DATETIME NULL COMMENT '修改时间',
  `status` INT NULL COMMENT '状态：0,文件删除，1.仅自己可见，2所有人可见',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '文档表';


-- -----------------------------------------------------
-- Table `db_dingding`.`t_group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`t_group` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '组id',
  `u_id` INT NULL COMMENT '用户id',
  `g_name` VARCHAR(200) NULL COMMENT '组名',
  `createtime` DATETIME NULL COMMENT '创建时间',
  `updatetime` DATETIME NULL COMMENT '修改时间',
  `status` INT NULL COMMENT '状态： 0删除，1正常',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '群';


-- -----------------------------------------------------
-- Table `db_dingding`.`sign`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`sign` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sp_id` INT NULL COMMENT '打卡计划id',
  `u_id` INT NULL COMMENT '打卡人id',
  `sign_time` DATETIME NULL COMMENT '打卡时间',
  `status` VARCHAR(45) NULL COMMENT '状态（0是删除，1是正常）',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '打卡表';


-- -----------------------------------------------------
-- Table `db_dingding`.`t_organization`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`t_organization` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '组织id',
  `u_id` INT NULL COMMENT '创建者id\n',
  `o_name` VARCHAR(200) NULL COMMENT '组织名',
  `o_address` VARCHAR(200) NULL COMMENT '组织地址',
  `o_description` VARCHAR(200) NULL COMMENT '组织描述',
  `createtime` DATETIME NULL COMMENT '创建时间',
  `updatetime` DATETIME NULL COMMENT '修改时间',
  `status` INT NULL COMMENT '状态：0删除，1正常',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '组织表';


-- -----------------------------------------------------
-- Table `db_dingding`.`sign_plan`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`sign_plan` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `g_id` INT NULL COMMENT '群id(部门群)',
  `u_id` INT NULL COMMENT '用户id(创建者)',
  `sp_name` VARCHAR(200) NULL COMMENT '打卡计划名',
  `start_time` TIME NULL COMMENT '打开卡开始时间',
  `end_time` TIME NULL COMMENT '结束时间',
  `start_date` DATE NULL COMMENT '打卡开始日期',
  `end_date` DATE NULL COMMENT '打卡结束日期',
  `createtime` DATETIME NULL,
  `updatetime` DATETIME NULL,
  `status` INT NULL COMMENT '状态：0删除，1正常',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '打卡计划表';


-- -----------------------------------------------------
-- Table `db_dingding`.`group_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`group_user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `g_id` INT NULL COMMENT '群id',
  `u_id` INT NULL COMMENT '用户id',
  `createtime` DATETIME NULL COMMENT '入群时间\n',
  `status` INT NULL COMMENT '状态(0申请，-1未通过，1正常，2退出群)',
  `updatetime` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '群_用户中间表（群成员表）';


-- -----------------------------------------------------
-- Table `db_dingding`.`t_admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`t_admin` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `u_id` INT NULL COMMENT '用户id',
  `o_id` INT NULL COMMENT '组织id',
  `createtime` DATETIME NULL COMMENT '创建时间',
  `updatetime` DATETIME NULL COMMENT '更新时间',
  `status` INT NULL COMMENT '状态，0取消管理员身份，1,确认身份',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '管理员表';


-- -----------------------------------------------------
-- Table `db_dingding`.`t_employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`t_employee` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `u_id` INT NULL COMMENT '用户id',
  `o_id` INT NULL COMMENT '组织id',
  `createtime` DATETIME NULL COMMENT '创建时间',
  `updatetime` DATETIME NULL COMMENT '更新时间',
  `status` INT NULL COMMENT '状态，0取消员工身份，1,确认员工身份',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '员工表';


-- -----------------------------------------------------
-- Table `db_dingding`.`t_address1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`t_address1` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NULL COMMENT '省名',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '省表';


-- -----------------------------------------------------
-- Table `db_dingding`.`t_address2`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`t_address2` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `p_id` INT NULL COMMENT '省id',
  `name` VARCHAR(200) NULL COMMENT '市名',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '市表';


-- -----------------------------------------------------
-- Table `db_dingding`.`t_address3`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`t_address3` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NULL COMMENT '区名',
  `p_id` INT NULL COMMENT '市id',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '区表';


-- -----------------------------------------------------
-- Table `db_dingding`.`t_department`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`t_department` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `o_id` INT NULL COMMENT '组织id',
  `f_id` INT NULL COMMENT '上级部门id',
  `d_name` VARCHAR(200) NULL COMMENT '部门名',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '部门表';


-- -----------------------------------------------------
-- Table `db_dingding`.`department_employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`department_employee` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `d_id` INT NULL COMMENT '部门id',
  `u_id` INT NULL COMMENT '用户id',
  `createtime` DATETIME NULL COMMENT '创建时间',
  `updatetime` DATETIME NULL COMMENT '更新时间',
  `status` INT NULL COMMENT '状态 :0，离开部门，1加入部门',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '部门员工表';


-- -----------------------------------------------------
-- Table `db_dingding`.`department_admin`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`department_admin` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id\n',
  `d_id` INT NULL COMMENT '部门id',
  `u_id` INT NULL COMMENT '用户id',
  `createtime` DATETIME NULL COMMENT '创建时间',
  `updatetime` DATETIME NULL COMMENT '更新时间',
  `status` INT NULL COMMENT '状态 :0，离开部门，1加入部门',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '部门管理员表';


-- -----------------------------------------------------
-- Table `db_dingding`.`department_group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`department_group` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '部门群表',
  `d_id` INT NULL COMMENT '部门id',
  `d_name` VARCHAR(200) NULL COMMENT '部门群名',
  `createtime` DATETIME NULL COMMENT '创建时间',
  `updatetime` DATETIME NULL COMMENT '更新时间',
  `status` INT NULL COMMENT '状态：0删除1.正常',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '部门群表';


-- -----------------------------------------------------
-- Table `db_dingding`.`organization_group`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`organization_group` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '部门群表',
  `o_id` INT NULL COMMENT '组织id',
  `o_name` VARCHAR(200) NULL COMMENT '组织群名',
  `createtime` DATETIME NULL COMMENT '创建时间',
  `updatetime` DATETIME NULL COMMENT '更新时间',
  `status` INT NULL COMMENT '状态：0删除1.正常',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '组织群表';


-- -----------------------------------------------------
-- Table `db_dingding`.`user_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`user_log` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `u_id` INT NULL COMMENT '用户id',
  `log_type` VARCHAR(45) NULL COMMENT '日志类型',
  `operation` VARCHAR(200) NULL COMMENT '操作描述',
  `createtime` DATETIME NULL COMMENT '创建时间',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '用户日志';


-- -----------------------------------------------------
-- Table `db_dingding`.`document_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`document_log` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `u_id` INT NULL COMMENT '用户id',
  `log_type` VARCHAR(45) NULL COMMENT '日志类型',
  `operation` VARCHAR(200) NULL COMMENT '操作描述',
  `createtime` DATETIME NULL COMMENT '创建时间',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '文档日志';


-- -----------------------------------------------------
-- Table `db_dingding`.`organization_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`organization_log` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `u_id` INT NULL COMMENT '用户id',
  `log_type` VARCHAR(45) NULL COMMENT '日志类型',
  `operation` VARCHAR(200) NULL COMMENT '操作描述',
  `createtime` DATETIME NULL COMMENT '创建时间',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '组织日志';


-- -----------------------------------------------------
-- Table `db_dingding`.`group_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`group_log` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `u_id` INT NULL COMMENT '用户id',
  `log_type` VARCHAR(45) NULL COMMENT '日志类型',
  `operation` VARCHAR(200) NULL COMMENT '操作描述',
  `createtime` DATETIME NULL COMMENT '创建时间',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '群日志';


-- -----------------------------------------------------
-- Table `db_dingding`.`department_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`department_log` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `u_id` INT NULL COMMENT '用户id',
  `log_type` VARCHAR(45) NULL COMMENT '日志类型',
  `operation` VARCHAR(200) NULL COMMENT '操作描述',
  `createtime` DATETIME NULL COMMENT '创建时间',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '部门日志';


-- -----------------------------------------------------
-- Table `db_dingding`.`t_address4`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_dingding`.`t_address4` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(200) NULL COMMENT '区名',
  `status` INT NULL COMMENT '状态（0.删除1.正常）',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '详细地址表';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
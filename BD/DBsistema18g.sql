-- -----------------------------------------------------
-- DATABASE sistema18g
-- -----------------------------------------------------
DROP DATABASE IF EXISTS `sistema18g` ;

-- -----------------------------------------------------
-- DATABASE sistema18g
-- -----------------------------------------------------
CREATE DATABASE IF NOT EXISTS `sistema18g` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `sistema18g` ;

-- -----------------------------------------------------
-- Table `sistema18g`.`categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema18g`.`categoria` ;

CREATE TABLE IF NOT EXISTS `sistema18g`.`categoria` (
  `category_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) CHARACTER SET 'utf8' NOT NULL,
  PRIMARY KEY (`category_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `sistema18g`.`funcionario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema18g`.`funcionario` ;

CREATE TABLE IF NOT EXISTS `sistema18g`.`funcionario` (
  `idfuncionario` INT NOT NULL AUTO_INCREMENT,
  `categoria_category_id` INT NOT NULL,
  `nome` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `sobrenome` VARCHAR(50) NULL,
  `cpf` VARCHAR(14) NOT NULL UNIQUE,
  `email` VARCHAR(100) CHARACTER SET 'utf8' NULL UNIQUE,
  `dt_nasc` DATE NULL, 
  `fone` VARCHAR(15) NOT NULL,
  `senha` VARCHAR(20) CHARACTER SET 'utf8' NOT NULL,
  `taxaDelocamento` DOUBLE NULL,
  `salario` DOUBLE NOT NULL,
  `ativo` VARCHAR(3) CHARACTER SET 'utf8' NULL,
  `cep` VARCHAR(10) NULL,
  `rua` VARCHAR(60) CHARACTER SET 'utf8' NULL,
  `num` INT NULL,
  `bairro` VARCHAR(30) CHARACTER SET 'utf8' NULL,
  `cidade` VARCHAR(30) CHARACTER SET 'utf8' NULL,
  `uf` VARCHAR(2) NULL,
  `complemento` VARCHAR(70) NULL,
  `data_cadastro` DATE NOT NULL,
  PRIMARY KEY (`idfuncionario`),
  CONSTRAINT `fk_funcionario_categoria1`
  FOREIGN KEY (`categoria_category_id`)
  REFERENCES `sistema18g`.`categoria` (`category_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `sistema18g`.`cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema18g`.`cliente` ;

CREATE TABLE IF NOT EXISTS `sistema18g`.`cliente` (
  `idcliente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `sobrenome` VARCHAR(50) NULL,
  `cpf` VARCHAR(14) NOT NULL UNIQUE,
  `email` VARCHAR(100) CHARACTER SET 'utf8' NOT NULL UNIQUE,
  `dt_nasc` DATE NOT NULL,
  `fone` VARCHAR(15) NULL,
  `cell` VARCHAR(15) NULL,
  `senha` VARCHAR(20) CHARACTER SET 'utf8' NOT NULL,
  `cep` VARCHAR(10) NULL,
  `rua` VARCHAR(60) CHARACTER SET 'utf8' NULL,
  `num` INT NULL,
  `bairro` VARCHAR(30) CHARACTER SET 'utf8' NULL,
  `cidade` VARCHAR(30) CHARACTER SET 'utf8' NULL,
  `uf` VARCHAR(2) NULL,
  `complemento` VARCHAR(45) CHARACTER SET 'utf8' NULL,
  `data_cadastro` DATE NOT NULL,
  PRIMARY KEY (`idcliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `sistema18g`.`Servicos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema18g`.`Servicos` ;

CREATE TABLE IF NOT EXISTS `sistema18g`.`Servicos` (
  `idServicos` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(30) NOT NULL,
  `preco` DOUBLE NULL,
  `tempo` TIME NOT NULL,
  PRIMARY KEY (`idServicos`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `sistema18g`.`Contrato`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema18g`.`Contrato` ;

CREATE TABLE IF NOT EXISTS `sistema18g`.`Contrato` (
  `idContrato` INT NOT NULL AUTO_INCREMENT,
  `cliente_idcliente` INT NOT NULL,
  `funcionario_idfuncionario` INT NOT NULL,
  `Servicos_idServicos` INT NOT NULL,
  `dataContrato` DATE NOT NULL,
  `horaInicio` TIME NULL,
  `horaFinal` TIME NULL,
  `dataSolicitacao` DATE NOT NULL,
  `horaSolicitacao` TIME NULL,
  `Descricao` VARCHAR(120) CHARACTER SET 'utf8' NULL,
  `status` VARCHAR(10) NULL,
  `precoTotal` FLOAT NOT NULL,
  `cep` VARCHAR(10) NULL,
  `rua` VARCHAR(60) CHARACTER SET 'utf8' NULL,
  `num` INT NULL,
  `bairro` VARCHAR(60) CHARACTER SET 'utf8' NULL,
  `cidade` VARCHAR(40) CHARACTER SET 'utf8' NULL,
  `uf` VARCHAR(2) NULL,
  `complemeto` VARCHAR(70) NULL,
  PRIMARY KEY (`idContrato`),
  CONSTRAINT `fk_Contrato_cliente`
  FOREIGN KEY (`cliente_idcliente`)
  REFERENCES `sistema18g`.`cliente` (`idcliente`),
  CONSTRAINT `fk_Contrato_funcionario1`
  FOREIGN KEY (`funcionario_idfuncionario`)
  REFERENCES `sistema18g`.`funcionario` (`idfuncionario`),
  CONSTRAINT `fk_Contrato_Serviços1`
  FOREIGN KEY (`Servicos_idServicos`)
  REFERENCES `sistema18g`.`servicos` (`idServicos`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

DROP TRIGGER IF EXISTS setapreco;

DELIMITER //
CREATE TRIGGER setapreco BEFORE INSERT ON `sistema18g`.`contrato`
	FOR EACH ROW
    BEGIN
    
    DECLARE PreServico DOUBLE;
    DECLARE PreDesloca DOUBLE;
    
    SELECT SERV.preco INTO PreServico FROM `sistema18g`.`Servicos` AS SERV
        WHERE SERV.idServicos = NEW.Servicos_idServicos;
        
	SELECT FUNC.taxaDelocamento INTO PreDesloca FROM `sistema18g`.`funcionario` AS FUNC
        WHERE FUNC.idfuncionario = NEW.funcionario_idfuncionario;
    
    SET NEW.precoTotal = PreServico + PreDesloca;
	
    END//
DELIMITER ;

-- -----------------------------------------------------
-- INSERTs da table `sistema18g`.`categoria`
-- -----------------------------------------------------
INSERT INTO `sistema18g`.`categoria` (`category_id`, `name`) VALUES (1, 'Administrador');
INSERT INTO `sistema18g`.`categoria` (`category_id`, `name`) VALUES (2, 'Tecnico');


-- -----------------------------------------------------
-- INSERTs da table `sistema18g`.`funcionario`
-- -----------------------------------------------------
INSERT INTO `sistema18g`.`funcionario` (`idfuncionario`, `categoria_category_id`, `nome`, `sobrenome`, `cpf`, `email`, `dt_nasc`, `fone`, `senha`, `taxaDelocamento`, `salario`, `ativo`, `cep`, `rua`, `num`, `bairro`, `cidade`, `uf`, `complemento`, `data_cadastro`) VALUES (1, 1, 'Philipe', 'Vieira Oliveira', '061.746.973-39', 'philipefilho@hotmail.com', '2000-02-21', '86 3212-0642', '123456789', 20, 700, 'sim', '65636-327', '18', 2624, 'São Benedito', 'Timon', 'MA', 'Próx. ao colégio exemplo', '2018-02-20');
INSERT INTO `sistema18g`.`funcionario` (`idfuncionario`, `categoria_category_id`, `nome`, `sobrenome`, `cpf`, `email`, `dt_nasc`, `fone`, `senha`, `taxaDelocamento`, `salario`, `ativo`, `cep`, `rua`, `num`, `bairro`, `cidade`, `uf`, `complemento`, `data_cadastro`) VALUES (2, 2, 'Francisco', 'Alves de Oliveira Filho', '748.138.463-00', 'filhoalves10@hotmail.com', '1976-01-19', '99 3212-0642', 'filho', 30, 1200, 'sim', '65636327', 'Rua Dezoito', 2624, 'São Benedito', 'Timon', 'MA', '', '2018-02-25');
INSERT INTO `sistema18g`.`funcionario` (`categoria_category_id`, `nome`, `sobrenome`, `cpf`, `email`, `dt_nasc`, `fone`, `senha`, `taxaDelocamento`, `salario`, `ativo`, `cep`, `rua`, `num`, `bairro`, `cidade`, `uf`, `data_cadastro`) VALUES ('2', 'Fabricio', 'Vieira Oliveira', '111.222.333-44', 'fabricio.vieira@18graus.com', '2000-09-16', '99 8823-5567', 'ola', '30', '550.00', 'sim', '65634190', 'Av. circular', '755', 'Formosa', 'Timon', 'MA', '2018-03-03');


-- -----------------------------------------------------
-- INSERTs da table `sistema18g`.`cliente`
-- -----------------------------------------------------
INSERT INTO `sistema18g`.`cliente` (`nome`, `sobrenome`, `cpf`, `email`, `dt_nasc`, `fone`, `cell`, `senha`, `cep`, `rua`, `num`, `bairro`, `cidade`, `uf`, `complemento`, `data_cadastro`) VALUES ('Philipe', 'Vieira Oliveira', '061.746.973-39', 'philipefilho@hotmail.com', '2000-02-21', '86 3212-0642', '86 98826-4075', '12345', '65636-327', '18', 2624, 'São Benedito', 'Timon', 'MA', NULL, '2018-02-18');
INSERT INTO `sistema18g`.`cliente` (`nome`, `sobrenome`, `cpf`, `email`, `dt_nasc`, `fone`, `cell`, `senha`, `cep`, `rua`, `num`, `bairro`, `cidade`, `uf`, `complemento`, `data_cadastro`) VALUES ('LETICIA VIEIRA', 'SILVA', '071.681.883-30', 'leticialety1101@gmail.com', '1999-01-12', '86988050610', '', '123', '65634190', 'Avenida Circular', 755, 'SÃ£o Marcos', 'Timon', 'MA', '', '2018-02-20');
INSERT INTO `sistema18g`.`cliente` (`nome`, `sobrenome`, `cpf`, `email`, `dt_nasc`, `fone`, `cell`, `senha`, `cep`, `rua`, `num`, `bairro`, `cidade`, `uf`, `complemento`, `data_cadastro`) VALUES ('nayran', 'jose de sousa', '', 'nayransousa@hotmail.com', '1998-11-15', '', '86 98804-2554', 'nayran15', '65634340', 'Loteamento Vila AngÃ©lica', 644, 'Vila AngÃ©lica', 'Timon', 'MA', 'kkkk lalala bubu', '2018-02-22');


-- -----------------------------------------------------
-- INSERTs da table `sistema18g`.`Servicos`
-- -----------------------------------------------------
INSERT INTO `sistema18g`.`Servicos` (`idServicos`, `nome`, `preco`, `tempo`) VALUES (1, 'Instalacao', 350, '04:30:00');
INSERT INTO `sistema18g`.`Servicos` (`idServicos`, `nome`, `preco`, `tempo`) VALUES (2, 'Manutencao Preventiva', 20, '01:00:00');
INSERT INTO `sistema18g`.`Servicos` (`idServicos`, `nome`, `preco`, `tempo`) VALUES (3, 'Manutencao Corretiva', 150, '04:00:00');
INSERT INTO `sistema18g`.`Servicos` (`idServicos`, `nome`, `preco`, `tempo`) VALUES (4, 'Conserto', 50, '01:30:00');


-- -----------------------------------------------------
-- INSERTs da table `sistema18g`.`Contrato`
-- -----------------------------------------------------
INSERT INTO `sistema18g`.`Contrato` (`cliente_idcliente`, `funcionario_idfuncionario`, `Servicos_idServicos`, `dataContrato`, `horaInicio`, `horaFinal`, `dataSolicitacao`, `horaSolicitacao`, `Descricao`, `status`, `precoTotal`, `cep`, `rua`, `num`, `bairro`, `cidade`, `uf`, `complemeto`) VALUES (5, 1, 3, '2018-02-20', '13:00:00', '14:00:00', '2018-01-21', '00:00:00', 'split 12000 btus', 'concluído', 111, NULL, NULL, NULL, NULL, NULL, NULL, NULL);


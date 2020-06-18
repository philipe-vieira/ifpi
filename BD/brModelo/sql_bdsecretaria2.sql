CREATE DATABASE secretaria;
USE secretaria;

CREATE TABLE cliente (
nome varchar(30) NOT NULL,
telefone varchar(13) NOT NULL,
email varchar(100),
cep varchar(8)NOT NULL,
rua varchar(50) NOT NULL,
bairro varchar(50) NOT NULL,
cidade varchar(50) NOT NULL,
estado varchar(2) NOT NULL,
numero int NOT NULL,
cpf_cliente int PRIMARY KEY NOT NULL
);

CREATE TABLE igreja (
cod_igreja int PRIMARY KEY NOT NULL,
nome_igreja varchar(30) NOT NULL,
cep varchar(8) NOT NULL,
numero varchar(5) NOT NULL,
bairro varchar(50) NOT NULL,
cidade varchar(50) NOT NULL,
estado varchar(2) NOT NULL,
rua varchar(50) NOT NULL
);

CREATE TABLE celebrante (
cod_celebrante int PRIMARY KEY NOT NULL,
nome varchar(30) NOT NULL,
email varchar(100),
telefone varchar(13) NOT NULL,
cpf int NOT NULL,
cep varchar(8) NOT NULL,
numero varchar(5) NOT NULL,
rua varchar(50) NOT NULL,
bairro varchar(50) NOT NULL,
cidade varchar(50) NOT NULL,
estado varchar(2) NOT NULL
);

CREATE TABLE secretario (
cod_secretario int PRIMARY KEY NOT NULL,
nome varchar(50) NOT NULL,
email varchar(100) NOT NULL,
telefone varchar(13) NOT NULL,
cpf int NOT NULL,
cep varchar(8) NOT NULL,
numero varchar(5) NOT NULL,
rua varchar(50) NOT NULL,
bairro varchar(50) NOT NULL,
cidade varchar(50) NOT NULL,
estado varchar(2) NOT NULL
);

CREATE TABLE celebracao (
cod_igreja int NOT NULL,
cod_celebrante int NOT NULL,
cod_celebracao int PRIMARY KEY NOT NULL,
FOREIGN KEY(cod_igreja) REFERENCES igreja (cod_igreja),
FOREIGN KEY(cod_celebrante) REFERENCES celebrante (cod_celebrante)
);

CREATE TABLE casamento (
nome_noivo varchar(30) NOT NULL,
nome_noiva varchar(30) NOT NULL,
cpf_noivo int NOT NULL,
cpf_noiva int NOT NULL,
data_casamento date NOT NULL,
nome_pad int NOT NULL,
nome_mad varchar(30) NOT NULL,
cpf_pad int NOT NULL,
cpf_mad int NOT NULL,
horario time NOT NULL,
cod_casamento int PRIMARY KEY NOT NULL,
cpf_cliente int FOREIGN KEY REFERENCES cliente(cpf_cliente) NOT NULL,
cod_igreja int FOREIGN KEY REFERENCES igreja(cod_igreja) NOT NULL,
cod_celebrante int FOREIGN KEY REFERENCES celebrante(cod_celebrante) NOT NULL,
cod_celebracao int FOREIGN KEY REFERENCES celebracao(cod_celebracao) NOT NULL,
preco float NOT NULL,
cod_secretario int FOREIGN KEY REFERENCES secretario(cod_secretario) NOT NULL
);

CREATE TABLE batizado (
nome_batizando varchar(30) NOT NULL,
Idade_batizando int NOT NULL,
nome_pai varchar(30) NOT NULL,
nome_mae varchar(30) NOT NULL,
nome_padbat varchar(30) NOT NULL,
nome_madbat varchar(30) NOT NULL,
nome_padcons varchar(30) ,
nome_madcons varchar(30) ,
cpf_pai int NOT NULL,
cpf_mae int NOT NULL,
cpf_padbat int NOT NULL,
cpf_madbat int NOT NULL,
cpf_padcons int,
cpf_madcons int,
cod_batizado int PRIMARY KEY NOT NULL,
data_batizado date NOT NULL,
horario time NOT NULL,
cpf_cliente int FOREIGN KEY REFERENCES cliente(cpf_cliente) NOT NULL,
cod_igreja int FOREIGN KEY REFERENCES igreja(cod_igreja) NOT NULL,
cod_celebrante int FOREIGN KEY REFERENCES celebrante(cod_celebrante) NOT NULL,
cod_celebracao int FOREIGN KEY REFERENCES celebracao(cod_celebracao) NOT NULL,
preco float NOT NULL,
cod_secretario int FOREIGN KEY REFERENCES secretario(cod_secretario) NOT NULL
);

CREATE TABLE missas (
cod_missa int PRIMARY KEY NOT NULL,
horario time NOT NULL,
data_missa date NOT NULL,
tipo varchar(30) NOT NULL,
cpf_cliente int FOREIGN KEY REFERENCES cliente(cpf_cliente) NOT NULL,
cod_igreja int FOREIGN KEY REFERENCES igreja(cod_igreja) NOT NULL,
cod_celebrante int FOREIGN KEY REFERENCES celebrante(cod_celebrante) NOT NULL,
cod_celebracao int FOREIGN KEY REFERENCES celebracao(cod_celebracao) NOT NULL,
preco float NOT NULL,
cod_secretario int FOREIGN KEY REFERENCES secretario(cod_secretario) NOT NULL
);


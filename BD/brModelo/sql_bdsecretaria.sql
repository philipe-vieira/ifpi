-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE cliente (
nome varchar(30),
telefone varchar(13),
email varchar(100),
cep varchar(8),
rua varchar(50),
bairro varchar(50),
cidade varchar(50),
estado varchar(2),
numero int,
cpf_cliente int PRIMARY KEY
)

CREATE TABLE igreja (
cod_igreja int PRIMARY KEY,
nome_igreja varchar(30),
cep varchar(8),
numero varchar(5),
bairro varchar(50),
cidade varchar(50),
estado varchar(2),
rua varchar(50)
)

CREATE TABLE celebrante (
cod_celebrante int PRIMARY KEY,
nome varchar(30),
email varchar(100),
telefone varchar(13),
cpf int,
cep varchar(8),
numero varchar(5),
rua varchar(50),
bairro varchar(50),
cidade varchar(50),
estado varchar(2)
)

CREATE TABLE secretario (
cod_secretario int PRIMARY KEY,
nome varchar(50),
email varchar(100),
telefone varchar(13),
cpf int,
cep varchar(8),
numero varchar(5),
rua varchar(50),
bairro varchar(50),
cidade varchar(50),
estado varchar(2)
)

CREATE TABLE Relação_2+celebracao (
cod_igreja int,
cod_celebrante int,
cod_celebracao int PRIMARY KEY,
FOREIGN KEY(cod_igreja) REFERENCES igreja (cod_igreja),
FOREIGN KEY(cod_celebrante) REFERENCES celebrante (cod_celebrante)
)

CREATE TABLE casamento (
nome_noivo varchar(30),
nome_noiva varchar(30),
cpf_noivo int,
cpf_noiva int,
data date,
nome_pad int,
nome_mad varchar(30),
cpf_pad int,
cpf_mad int,
horario time,
cod_casamento int PRIMARY KEY,
cpf_cliente int,
cod_igreja int,
cod_celebrante int,
cod_celebracao int,
preco money,
cod_secretario int/*falha: chave estrangeira*//*falha: chave estrangeira*//*falha: chave estrangeira*//*falha: chave estrangeira*//*falha: chave estrangeira*/
)

CREATE TABLE batizado (
nome_batizando varchar(30),
Idade_batizando int,
nome_pai varchar(30),
nome_mae varchar(30),
nome-padbat varchar(30),
nome_madbat varchar(30),
nome_padcons varchar(30),
nome_madcons varchar(30),
cpf_pai int,
cpf_mae int,
cpf_padbat int,
cpf_madbat int,
cpf_padcons int,
cpf_madcons int,
cod_batizado int PRIMARY KEY,
data date,
horario time,
cpf_cliente int,
cod_igreja int,
cod_celebrante int,
cod_celebracao int,
preco money,
-- Erro: nome do campo duplicado nesta tabela!
cpf_cliente int,
cod_secretario int/*falha: chave estrangeira*//*falha: chave estrangeira*//*falha: chave estrangeira*//*falha: chave estrangeira*//*falha: chave estrangeira*//*falha: chave estrangeira*/
)

CREATE TABLE missas (
cod_missa int PRIMARY KEY,
horario time,
data date,
tipo varchar(30),
cpf_cliente int,
cod_igreja int,
cod_celebrante int,
cod_celebracao int,
preco money,
-- Erro: nome do campo duplicado nesta tabela!
cpf_cliente int,
cod_secretario int/*falha: chave estrangeira*//*falha: chave estrangeira*//*falha: chave estrangeira*//*falha: chave estrangeira*//*falha: chave estrangeira*//*falha: chave estrangeira*/
)


CREATE DATABASE IF NOT EXISTS locadora;
Use locadora;

DROP TABLE categoria;
CREATE TABLE IF NOT EXISTS categoria (
codigo_categoria int PRIMARY KEY NOT NULL,
nome_categoria varchar(20) NOT NULL
);

DROP TABLE cliente;
CREATE TABLE IF NOT EXISTS cliente (
data_cadastro date NOT NULL,
nome_cliente varchar(30) NOT NULL,
CPF_cliente varchar(15) NOT NULL,
codigo_cliente int PRIMARY KEY NOT NULL,
UF_cliente varchar(2),
cidade_cliente varchar(30)
);

DROP TABLE titulo;
CREATE TABLE IF NOT EXISTS titulo (
ano int NOT NULL,
nome_titulo varchar(30) NOT NULL,
codigo_titulo int PRIMARY KEY NOT NULL,
codigo_categoria int NOT NULL REFERENCES categoria (codigo_categoria),
codigo_classe int NOT NULL REFERENCES classe (codigo_classe)
);

DROP TABLE classe;
CREATE TABLE IF NOT EXISTS classe (
codigo_classe int PRIMARY KEY NOT NULL,
nome_classe varchar(20) NOT NULL,
preco_classe float NOT NULL
);

DROP TABLE filme ;
CREATE TABLE IF NOT EXISTS filme (
nome_distribuidor varchar(30) NOT NULL,
codigo_filme int PRIMARY KEY NOT NULL,
codigo_titulo int NOT NULL REFERENCES titulo (codigo_titulo)
);

DROP TABLE EmprestimoeDevolucao;
CREATE TABLE IF NOT EXISTS EmprestimoeDevolucao(
data_devolucao_prevista date NOT NULL,
data_devolucao_efetiva date,
valor_multa float,
codigo_emprestimo int PRIMARY KEY NOT NULL,
data_emprestimo date NOT NULL,
codigo_filme int NOT NULL REFERENCES filme (codigo_filme),
codigo_cliente int NOT NULL
);

insert into cliente values(
'2017-11-15',
'philipe',
'061.746.973-39',
01,
'MA',
'Timon'
);

insert into categoria values(
01,
'ação'
);
insert into classe values(
01,
'lançamento',
15.00
);
insert into titulo values(
2015,
'Missão impossivel',
01,
01,
01
);
insert into filme values(
'Christopher McQuarrie',
01,
01
);
insert into emprestimoedevolucao values(
'2017-11-22',
'',
0.0,
101,
'2017-11-15',
01,
01
);
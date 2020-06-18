-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE categoria (
codigo_categoria int PRIMARY KEY,
nome_categoria varchar(20)
)

CREATE TABLE cliente (
UF_cliente varchar(2),
data_cadastro date,
nome_cliente varchar(30),
CPF_cliente varchar(15),
codigo_cliente int PRIMARY KEY,
cidade_cliente varchar(30)
)

CREATE TABLE titulo (
ano int,
nome_titulo varchar(30),
codigo_titulo int PRIMARY KEY,
codigo_categoria int,
codigo_classe int,
FOREIGN KEY(codigo_categoria) REFERENCES categoria (codigo_categoria)
)

CREATE TABLE classe (
codigo_classe int PRIMARY KEY,
nome_classe varchar(20),
preco_classe float
)

CREATE TABLE filme (
nome_distribuidor varchar(30),
codigo_filme int PRIMARY KEY,
codigo_titulo int,
FOREIGN KEY(codigo_titulo) REFERENCES titulo (codigo_titulo)
)

CREATE TABLE EmprestimoeDevolucao (
data_devolucao_prevista date,
data_devolucao_efetiva date,
valor_multa float,
codigo_emprestimo int PRIMARY KEY,
data_emprestimo date,
codigo_filme int,
codigo_cliente int,
FOREIGN KEY(codigo_filme) REFERENCES filme (codigo_filme)/*falha: chave estrangeira*/
)

ALTER TABLE titulo ADD FOREIGN KEY(codigo_classe) REFERENCES classe (codigo_classe)

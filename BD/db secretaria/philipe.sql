CREATE DATABASE IF NOT EXISTS secretaria;
USE secretaria;

create table IF NOT EXISTS cliente (
nome_cliente varchar(30) not null,
telefone varchar(13) not null,
email varchar(100),
cep varchar(8) not null,
rua varchar(50) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
estado varchar(2) not null,
numero int not null,
cpf_cliente varchar(11) primary key not null);

create table IF NOT EXISTS igreja (
cod_igreja int primary key not null,
nome_igreja varchar(30) not null,
cep varchar(8) not null,
numero int not null,
rua varchar(50) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
estado varchar(2) not null );

create table IF NOT EXISTS celebrante(
cod_celebrante int primary key not null,
nome_celebrante varchar(30) not null,
cpf_celebrante varchar(11) not null,
telefone varchar(13) not null,
email varchar(100),
cep varchar(8) not null,
numero int not null,
rua varchar(50) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
estado varchar(2) not null);

create table IF NOT EXISTS secretario(
cod_secretario int primary key,
nome_secretario varchar(30) not null,
cpf_secretario varchar(11) not null,
telefone varchar(13) not null,
email varchar(100) not null,
cep varchar(8) not null,
numero int not null,
rua varchar(50) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
estado varchar(2) not null);

create table IF NOT EXISTS celebracao(
cod_igreja int not null,
cod_celebrante int not null,
cod_celebracao int primary key not null,
CONSTRAINT cod_igreja foreign key(cod_igreja) references igreja(cod_igreja),
CONSTRAINT cod_celebrante foreign key(cod_celebrante) references celebrante(cod_celebrante));

create table IF NOT EXISTS casamento(
cod_casamento int primary key not null,
nome_noivo varchar(30) not null,
cpf_noivo varchar(11) not null,
nome_noiva varchar(30) not null,
cpf_noiva varchar(11) not null,
data_casamento date not null,
nome_pad varchar(30) not null,
nome_mad varchar(30) not null,
cpf_pad varchar(11) not null,
cpf_mad varchar(11) not null,
horario time not null,
preco float not null,
cod_secretario int not null references secretario(cod_secretario),
-- CONSTRAINT cod_secretario foreign key(cod_secretario) references secretario(cod_secretario),
cod_celebracao int not null references celebracao(cod_celebracao),
-- CONSTRAINT cod_celebracao foreign key(cod_celebracao) references celebracao(cod_celebracao),
cpf_cliente varchar(11) not null references cliente(cpf_cliente)
-- CONSTRAINT cpf_cliente foreign key(cpf_cliente) references cliente(cpf_cliente)
);

create table IF NOT EXISTS batizado(
cod_batizado int primary key not null,
data_batizado date not null,
horario_batizado time not null,
nome_batizando varchar(30) not null,
idade_batizando int not null,
nome_pai varchar(30) not null,
nome_mae varchar(30) not null,
nome_padbat varchar(30) not null,
nome_madbat varchar(30) not null,
nome_padcons varchar(30),
nome_madcons varchar(30),
cpf_pai varchar(11) not null,
cpf_mae varchar(11) not null,
cpf_padbat varchar(11) not null,
cpf_madbat varchar(11) not null,
cpf_padcons varchar(11),
cpf_madcons varchar(11),
preco float not null,
cod_secretario int not null REFERENCES secretario(cod_secretario),
-- CONSTRAINT cod_secretario foreign key(cod_secretario) references secretario(cod_secretario),
cod_celebracao int not null REFERENCES celebracao(cod_celebracao),
-- CONSTRAINT cod_celebracao foreign key(cod_celebracao) references celebracao(cod_celebracao),
cpf_cliente varchar(11) not null REFERENCES cliente(cpf_cliente)
-- CONSTRAINT cpf_cliente foreign key(cpf_cliente) references cliente(cpf_cliente)
);

create table IF NOT EXISTS missa(
cod_missa int primary key not null,
data_missa date not null,
horario_missa time not null,
tipo varchar(30) not null,
preco float not null,
cod_secretario int not null REFERENCES secretario(cod_secretario),
-- CONSTRAINT cod_secretario foreign key(cod_secretario) references secretario(cod_secretario),
cod_celebracao int not null REFERENCES celebracao(cod_celebracao),
-- CONSTRAINT cod_celebracao foreign key(cod_celebracao) references celebracao(cod_celebracao),
cpf_cliente varchar(11) not null REFERENCES cliente(cpf_cliente)
-- CONSTRAINT cpf_cliente foreign key(cpf_cliente) references cliente(cpf_cliente)
);


-- insert cliente philipe
insert into cliente values(
'philipe',
86988264075,
'philipe@hotmail.com',
'65636470',
'frei serafim',
'centro',
'teresina',
'pi',
100,
'12345678912');
-- insert cliente pedro
insert into cliente values(
'pedro',
86988318631,
'pedro@hotmail.com',
'65639240',
'cangalha de jegue',
'Santa fe',
'teresina',
'pi',
100,
'12345678913');
-- insert cliente joao
insert into cliente values(
'joao',
86988846975,
'joao@hotmail.com',
'65637534',
'fancisoc magnolia',
'santa maria',
'teresina',
'pi',
100,
'12345678914');
-- insert cliente junior
insert into cliente values(
'junior',
86999468275,
'junior@hotmail.com',
'65638752',
'pedro II',
'centro',
'teresina',
'pi',
100,
'12345678915');
-- insert cliente rafael
insert into cliente values(
'rafael',
86961783549,
'rafael@hotmail.com',
'65630479',
'luziamia',
'santafe',
'teresina',
'pi',
2508,
'12345678916');


-- insert igreja Sao Jose
insert into igreja values(
01,
'Sao Jose',
'65636430',
65,
'Sao jose',
'centro',
'timon',
'ma');
-- insert igreja Sao Joao
insert into igreja values(
02,
'Sao Joao',
'65636450',
40,
'Sao Joao',
'Sao Joao',
'timon',
'ma');
-- insert igreja Sao Francisco
insert into igreja values(
03,
'Sao Francisco',
'65636590',
40,
'100',
'Sao Francisco',
'timon',
'ma');
-- insert igreja Santo Antonio
insert into igreja values(
04,
'Santo Antonio',
'65637023',
123,
'brasil',
'Santo Antonio',
'timon',
'ma');
-- insert igreja Sao benedito
insert into igreja values(
05,
'Sao benedito',
'65646852',
753,
'frei serafim',
'centro',
'teresina',
'pi');


-- insert celebrante francisco
insert into celebrante values(
1001,
'francisco',
123456789,
'86 988407565',
'francisco@saojose.com',
'65636435',
40,
'Sao jose',
'centro',
'timon',
'ma');
-- insert celebrante rafael
insert into celebrante values(
1002,
'rafael',
127,
86961783549,
'rafael@hotmail.com',
'65630479',
127,
'luziamia',
'santafe',
'teresina',
'pi');
-- insert celebrante junior
insert into celebrante values(
1003,
'junior',
617469739,
'86999468275',
'junior@saojose.com',
'65638752',
123,
'pedro II',
'centro',
'teresina',
'pi');
-- insert celebrante fernando
insert into celebrante values(
1004,
'fernando',
123864925,
'86 988951753',
'fernando@saojose.com',
'65639842',
408,
'18',
'sao benedito',
'timon',
'ma');
-- insert celebrante roberto
insert into celebrante values(
1005,
'roberto',
1951456852,
'86 988050613',
'roberto@saojose.com',
'65637812',
486,
'16',
'sao benedito',
'timon',
'ma');
-- insert celebrante roberto
insert into celebrante values(
1006,
'roberto',
'1951456852',
'86 988050613',
'roberto@saojose.com',
'65637812',
486,
'16',
'sao benedito',
'timon',
'ma');


-- insert celebração na igreja 01
insert into celebracao values(
01,
1001,
5001);
-- insert celebração na igreja 02
insert into celebracao values(
02,
1002,
5002);
-- insert celebração na igreja 03
insert into celebracao values(
03,
1003,
5003);
-- insert celebração na igreja 04
insert into celebracao values(
04,
1004,
5004);
-- insert celebração na igreja 05
insert into celebracao values(
05,
1005,
5005);


-- insert secretario roberto
insert into secretario values(
501,
'roberto',
'1951456852',
'86 988050613',
'roberto@saojose.com',
'65637812',
486,
'16',
'sao benedito',
'timon',
'ma');
-- insert secretario raimundo
insert into secretario values(
502,
'raimundo',
'15975346',
'86 988404040',
'raimundo@saojose.com',
'65636498',
56,
'Sao jose',
'centro',
'timon',
'ma');
-- insert secretario fernando
insert into secretario values(
503,
'fernando',
'123864925',
'86 988951753',
'fernando@saojose.com',
'65639842',
408,
'18',
'sao benedito',
'timon',
'ma');
-- insert secretario francieric
insert into secretario values(
504,
'francieric',
'456789156',
'86 988564543',
'francieric@saojose.com',
'65684951',
4898,
'frei serafim',
'centro',
'teresina',
'pi');
-- insert secretario pou
insert into secretario values(
505,
'pou',
'740740747',
'86 988010110',
'pou@outlook.com',
'65686429',
48159,
'nula',
'santa maria',
'teresina',
'pi');


insert into batizado values(
105201701,
'2017-08-29',
'20:00:00',
'leonardo', 
14,
'francisco',
'raimunda',
'francisco',
'raimunda',
'renato',
'ariel',
'123',
'234',
'345',
'456',
'567',
'678',
40,
502,
3,
'12345678914');
insert into batizado values(
105201702,
'2017-08-30',
'20:00:00',
'caio', 
8,
'chico',
'rainara',
'francisco',
'raimunda',
'jose',
'maria',
'123',
'234',
'345',
'456',
'567',
'678',
40,
501,
3,
'12345678912');
insert into batizado values(
105201703,
'2017-09-01',
'08:30:00',
'daniel', 
11,
'denilson',
'Lara',
'Matheus',
'Luna',
'pedro',
'maria',
'123',
'234',
'345',
'456',
'567',
'678',
40,
501,
4,
'12345678913');
insert into batizado values(
105201704,
'2017-09-05',
'19:30:00',
'tereza', 
9,
'danilo',
'tamara',
'marcos',
'arlene',
'nilson',
'nina',
'123',
'234',
'345',
'456',
'567',
'678',
40,
505,
1,
'12345678915');
insert into batizado values(
105201705,
'2017-10-05',
'19:30:00',
'talia', 
16,
'thony',
'tonia',
'mario',
'amanda',
'noga',
'cintia',
'123',
'234',
'345',
'456',
'567',
'678',
40,
504,
5,
'12345678916');


insert into casamento values(
2017101841,
'flavio',
'123',
'talia', 
'234',
'2017-10-18',
'thony',
'tamara',
'345',
'456',
'19:30:00',
150,
504,
2,
'12345678916');
insert into casamento values(
2017101842,
'fernando',
'123',
'nara', 
'234',
'2017-10-18',
'ronaldo',
'tereza',
'345',
'456',
'19:30:00',
150,
501,
5,
'12345678915');
insert into casamento values(
2017101843,
'francisco',
'123',
'raimunda', 
'234',
'2017-10-25',
'jose',
'maria',
'345',
'456',
'08:00:00',
150,
505,
1,
'12345678915');
insert into casamento values(
2017101844,
'rogerio',
'123',
'kely patricia', 
'234',
'2017-10-18',
'ferreira',
'maria raimunda',
'345',
'456',
'20:00:00',
150,
502,
3,
'12345678912');
insert into casamento values(
2017101845,
'francys',
'123',
'juliana', 
'234',
'2017-11-11',
'ocilio',
'tereza',
'345',
'456',
'19:00:00',
150,
501,
5,
'12345678913');


insert into missa values(
1111111111,
'2017-10-20',
'19:00:00',
'especial',
100,
501,
5001,
12345678912
);
insert into missa values(
1111111112,
'2017-11-20',
'17:00:00',
'formatura',
100,
502,
5002,
12345678913
);
insert into missa values(
1111111113,
'2017-10-05',
'12:00:00',
'intencao',
100,
503,
5003,
12345678914
);
insert into missa values(
1111111114,
'2017-09-13',
'08:30:00',
'intencao',
100,
504,
5004,
12345678915
);
insert into missa values(
1111111115,
'2017-10-05',
'15:30:00',
'da comunidade',
00,
505,
5005,
12345678916
);

-- DROP DATABASE secretaria;


SELECT * FROM SECRETARIA.batizado;
SELECT * FROM secretaria.batizado where data_batizado between '2017-09-01' and '2017-09-30';
SELECT * FROM SECRETARIA.batizado where cod_secretario in (select cod_secretario from secretaria.secretario where nome_secretario = 'pou');
SELECT * FROM SECRETARIA.batizado where cpf_cliente in (select cpf_cliente from secretaria.cliente where nome_cliente = 'joao');
SELECT min(data_batizado) FROM secretaria.batizado; 
SELECT max(idade_batizando) FROM secretaria.batizado; 

SELECT * FROM secretaria.casamento;
SELECT * FROM secretaria.casamento where cod_casamento = 2017101842;
SELECT * FROM secretaria.casamento where nome_mad = 'maria';
SELECT * FROM secretaria.casamento where horario = '19:00:00'; 
SELECT avg(preco) FROM secretaria.casamento;
SELECT count(data_casamento) FROM secretaria.casamento where data_casamento between '2017-10-01' and '2017-10-31';

SELECT * FROM secretaria.celebracao;
SELECT * FROM secretaria.celebracao where cod_celebracao = 5004;
SELECT * FROM secretaria.celebracao where cod_celebrante in (select cod_celebrante from secretaria.celebrante where nome_celebrante = 'rafael');
SELECT cod_celebracao FROM secretaria.celebracao where cod_igreja = 1;

SELECT * FROM secretaria.celebrante;
SELECT cod_celebrante FROM secretaria.celebrante where nome_celebrante = 'fernando';
SELECT * FROM secretaria.celebrante where cidade = 'teresina';
SELECT email FROM secretaria.celebrante where nome_celebrante = 'francisco';
SELECT cep, rua, numero, bairro, cidade, estado FROM secretaria.celebrante where cod_celebrante = '1003';
SELECT count(*) FROM secretaria.celebrante where bairro = 'sao benedito';

SELECT * FROM secretaria.cliente;
SELECT * FROM secretaria.cliente where bairro = 'centro';
SELECT * FROM secretaria.cliente where nome_cliente like 'j%';
SELECT nome_cliente FROM secretaria.cliente limit 3;
SELECT min(nome_cliente) FROM secretaria.cliente;
SELECT * FROM secretaria.cliente where cpf_cliente = '12345678915';

SELECT * FROM secretaria.igreja;
SELECT cod_igreja FROM secretaria.igreja where nome_igreja = 'Santo Antonio';
SELECT nome_igreja FROM secretaria.igreja where nome_igreja like '%fran%';
SELECT cep, rua, numero, bairro, cidade, estado FROM secretaria.igreja where nome_igreja = 'sao jose';
SELECT count(*) FROM secretaria.igreja where estado = 'pi';
SELECT max(nome_igreja) FROM secretaria.igreja;

SELECT * FROM secretaria.missa;
SELECT cpf_cliente FROM secretaria.missa limit 3;
SELECT cod_missa FROM secretaria.missa where data_missa between '2017-10-01' and '2017-10-31';
SELECT * FROM secretaria.missa where cod_secretario in (select cod_secretario from secretaria.secretario where nome_secretario = 'raimundo');
SELECT avg(preco) FROM secretaria.missa;
SELECT * FROM secretaria.missa where cod_missa = '2147483647';

SELECT * FROM secretaria.secretario;
SELECT email FROM secretaria.secretario where cep like '%498';
SELECT cep, rua, numero, bairro, cidade, estado FROM secretaria.secretario where nome_secretario = 'fernando';
SELECT cod_secretario, email FROM secretaria.secretario where nome_secretario like 'f%';
SELECT * FROM secretaria.secretario where cod_secretario = '504';
SELECT cod_secretario, nome_secretario FROM secretaria.secretario where estado = 'pi';
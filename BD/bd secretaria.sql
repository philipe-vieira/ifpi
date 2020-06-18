CREATE DATABASE secretaria;
USE secretaria;

create table cliente (
nome_cliente varchar(30) not null,
telefone varchar(13) not null,
email varchar(100),
cep varchar(8) not null,
rua varchar(50) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
estado varchar(2) not null,
numero int not null,
cpf_cliente int primary key not null);

create table igreja (
cod_igreja int primary key not null,
nome_igreja varchar(30) not null,
cep varchar(8) not null,
numero int not null,
rua varchar(50) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
estado varchar(2) not null );

create table celebrante(
cod_celebrante int primary key not null,
nome_celebrante varchar(30) not null,
cpf_celebrante int not null,
telefone varchar(13) not null,
email varchar(100),
cep varchar(8) not null,
numero int not null,
rua varchar(50) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
estado varchar(2) not null);

create table secretario(
cod_secretario int primary key not null,
nome_secretario varchar(30) not null,
cpf_secretario int not null,
telefone varchar(13) not null,
email varchar(100) not null,
cep varchar(8) not null,
numero int not null,
rua varchar(50) not null,
bairro varchar(50) not null,
cidade varchar(50) not null,
estado varchar(2) not null);

create table celebracao(
cod_igreja int not null,
cod_celebrante int not null,
cod_celebracao int primary key not null,
foreign key(cod_igreja) references igreja(cod_igreja),
foreign key(cod_celebrante) references celebrante(cod_celebrante));

create table casamento(
cod_casamento int primary key not null,
nome_noivo varchar(30) not null,
cpf_noivo int not null,
nome_noiva varchar(30) not null,
cpf_noiva int not null,
data_casamento date not null,
nome_pad varchar(30) not null,
nome_mad varchar(30) not null,
cpf_pad int not null,
cpf_mad int not null,
horario time not null,
preco float not null,
cod_secretario int not null,
foreign key(cod_secretario) references secretario(cod_secretario),
cod_celebracao int not null,
foreign key(cod_celebracao) references celebracao(cod_celebracao),
cpf_cliente int not null,
foreign key(cpf_cliente) references cliente(cpf_cliente));

create table batizado(
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
cpf_pai int not null,
cpf_mae int not null,
cpf_padbat int not null,
cpf_madbat int not null,
cpf_padcons int,
cpf_madcons int,
preco float not null,
cod_secretario int not null,
foreign key(cod_secretario) references secretario(cod_secretario),
cod_celebracao int not null,
foreign key(cod_celebracao) references celebracao(cod_celebracao),
cpf_cliente int not null,
foreign key(cpf_cliente) references cliente(cpf_cliente));

create table missa(
cod_missa int primary key not null,
data_missa date not null,
horario_missa time not null,
tipo varchar(30) not null,
preco float not null,
cod_secretario int not null,
foreign key(cod_secretario) references secretario(cod_secretario),
cod_celebracao int not null,
foreign key(cod_celebracao) references celebracao(cod_celebracao),
cpf_cliente int not null,
foreign key(cpf_cliente) references cliente(cpf_cliente));

insert into cliente values(
'philipe',
86988264075,
'philipe@hotmail.com',
'65636470',
'freserafim',
'centro',
'teresina',
'pi',
100,
123);

insert into cliente values(
'joao',
86318684075,
'joao@hotmail.com',
'65634065',
'1',
'flores',
'teresina',
'pi',
100,
124);

insert into igreja values(
01,
'Sao Jose',
'65636430',
65,
'Sao jose',
'centro',
'timon',
'ma');

insert into celebrante values(
01,
'francisco',
123456789,
'86 988407565',
'frnacisco@saojose.com',
'65636435',
40,
'Sao jose',
'centro',
'timon',
'ma');

insert into secretario values(
123,
'raimundo',
15975346,
'86 988404040',
'raimundo@saojose.com',
'65636498',
56,
'Sao jose',
'centro',
'timon',
'ma');

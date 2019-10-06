create database ProjetoWeb;

create table cliente(
nome varchar2(50),
email varchar2(50),
cpf varchar2(15) primary key
);

create table cursos(
nome varchar2(50),
curso varchar2(50) primary key,
valor number(8,2),
site varchar2(50)
);

create table pagamento(
cpf varchar2(50) primary key,
curso varchar2(50),
data_insc date
);

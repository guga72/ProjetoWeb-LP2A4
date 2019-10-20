create database ProjetoWeb;
use ProjetoWeb;
create table cliente(
nome varchar(50),
email varchar(50),
cpf varchar(15) primary key
);

create table cursos(
nome varchar(50),
curso varchar(50) primary key,
valor decimal(8,2),
site varchar(50)
);

create table pagamento(
cpf varchar(50) primary key,
curso varchar(50),
data_insc date
);

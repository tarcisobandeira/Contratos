CREATE DATABASE Contratos;

USE Contratos;

CREATE TABLE Empresa(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50),
    tipo INT,
    ativo INT
);

CREATE TABLE Contrato(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_empresa INT,
	nome VARCHAR(50),
	descricao VARCHAR(500),
	inicio VARCHAR(50),
	fim VARCHAR(50),
    arquivo VARCHAR(100),
    ativo INT,
    FOREIGN KEY (id_empresa) REFERENCES Empresa(id)
);

CREATE TABLE Conta(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_empresa INT,
    contador INT,
    nome VARCHAR(50),
    mes_ano VARCHAR(50),
    dia_emissao VARCHAR(50),
    dia_vencimento VARCHAR(50),
    valor VARCHAR(50),
	obs VARCHAR(500),
    ativo INT,
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id)
);

CREATE TABLE AnexoConta(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_conta INT,
    arquivo VARCHAR(100),
    FOREIGN KEY (id_conta) REFERENCES Conta(id)
);

CREATE TABLE Usuario(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nome VARCHAR(50),
	login VARCHAR(50),
	senha VARCHAR(50),
    ativo INT
);

CREATE TABLE Site(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_empresa INT,
	site VARCHAR(500),
	usuario VARCHAR(500),
	senha VARCHAR (500),
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id)
);

CREATE TABLE Telefone(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_empresa INT,
	telefone VARCHAR(500),
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id)
);

CREATE TABLE Email(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_empresa INT,
	email VARCHAR(500),
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id)
);

CREATE TABLE Financeiro(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_empresa INT,
	debito_auto INT,
	entrega VARCHAR(50),
	FOREIGN KEY (id_empresa) REFERENCES Empresa(id)
);

CREATE TABLE linkEmpresaUsuario(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_empresa INT,
    id_usuario INT,
    FOREIGN KEY (id_empresa) REFERENCES Empresa(id),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id)
);

CREATE TABLE linkContratoUsuario(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_contrato INT,
    id_usuario INT,
    FOREIGN KEY (id_contrato) REFERENCES Contrato(id),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id)
);

CREATE TABLE linkContaUsuario(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_conta INT,
    id_usuario INT,
    FOREIGN KEY (id_conta) REFERENCES Conta(id),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id)
);

INSERT INTO Usuario (nome, login, senha, ativo)
VALUES  ("Tarciso", "tjbandeira", "123", 1);
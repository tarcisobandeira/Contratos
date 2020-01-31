CREATE DATABASE Contratos;

USE Contratos;

CREATE TABLE Empresa(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nome VARCHAR(50),
    ativo INT
);

CREATE TABLE Contrato(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_empresa INT,
	nome VARCHAR(50),
	descricao VARCHAR(50),
	inicio_c VARCHAR(50),
	fim_c VARCHAR(50),
    dia_emissao_conta VARCHAR(50),
	dia_vencimento_conta VARCHAR(50),
    valor_mensal VARCHAR(15),
    arquivo VARCHAR(100),
    ativo INT,
    FOREIGN KEY (id_empresa) REFERENCES Empresa(id)
);

CREATE TABLE Conta(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_contrato INT,
	valor_pago VARCHAR(15),
    dia_criado VARCHAR(50),
	dia_emitido VARCHAR(50),
	dia_pagamento VARCHAR(50),
	status_conta INT,
    nota_fiscal VARCHAR(100),
	obs VARCHAR(500),
    ativo INT,
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id)
);

CREATE TABLE AnexoConta(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_conta INT,
    arquivo VARCHAR(100),
    FOREIGN KEY (id_conta) REFERENCES Conta(id)
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

CREATE TABLE Usuario(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nome VARCHAR(50),
	login VARCHAR(50),
	senha VARCHAR(50),
    ativo INT
);

CREATE TABLE UsuarioConta(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_usuario INT,
    id_conta INT,
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id),
    FOREIGN KEY (id_conta) REFERENCES Conta(id)
);

CREATE TABLE ContaSemContrato(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50),
    descricao VARCHAR(50),
	valor FLOAT,
	valor_pago FLOAT,
	dia_emitido VARCHAR(50),
	dia_vencimento VARCHAR(50),
	dia_pagamento VARCHAR(50),
	status_conta INT,
	obs VARCHAR(500),
    nota_fiscal VARCHAR(50),
    ativo INT
);

CREATE TABLE AnexoContaSC(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_conta_sc INT,
    arquivo VARCHAR(100),
    FOREIGN KEY (id_conta_sc) REFERENCES ContaSemContrato(id)
);

CREATE TABLE UsuarioContaSC(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_usuario INT,
    id_conta_sc INT,
    FOREIGN KEY (id_usuario) REFERENCES Usuario(id),
    FOREIGN KEY (id_conta_sc) REFERENCES ContaSemContrato(id)
);

INSERT INTO Usuario (nome, login, senha, ativo)
VALUES  ("Tarciso", "tjbandeira", "123", 1);
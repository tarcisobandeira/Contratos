CREATE DATABASE Contratos;

USE Contratos;

CREATE TABLE Empresa(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nome VARCHAR(50),
    ativo INT,
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
    valor_mensal FLOAT,
    arquivo VARCHAR(13),
    formato VARCHAR(5),
    ativo INT,
    FOREIGN KEY (id_empresa) REFERENCES Empresa(id)
);

CREATE TABLE Conta(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_contrato INT,
	valor_pago FLOAT,
	dia_emitido VARCHAR(50),
	dia_vencimento VARCHAR(50),
	dia_pagamento VARCHAR(50),
	status_conta INT,
    nota_fiscal VARCHAR(50),
	obs VARCHAR(500),
    ativo INT,
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id)
);

CREATE TABLE Site(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_contrato INT,
	site VARCHAR(500),
	usuario VARCHAR(500),
	senha VARCHAR (500),
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id)
);

CREATE TABLE Telefone(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_contrato INT,
	telefone VARCHAR(500),
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id)
);

CREATE TABLE Email(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_contrato INT,
	email VARCHAR(500),
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id)
);

CREATE TABLE Financeiro(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_contrato INT,
	debito_auto INT,
	entrega VARCHAR(50),
	FOREIGN KEY (id_contrato) REFERENCES Contrato(id)
);

CREATE TABLE AnexoConta(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_conta INT,
    arquivo VARCHAR(13),
    formato VARCHAR(5),
    FOREIGN KEY (id_conta) REFERENCES Conta(id)
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
	valor FLOAT,
	valor_pago FLOAT,
	dia_emitido VARCHAR(50),
	dia_vencimento VARCHAR(50),
	dia_pagamento VARCHAR(50),
	status_conta INT,
	obs VARCHAR(500),
    nota_fiscal VARCHAR(50),
    ativo INT,
);

CREATE TABLE AnexoContaSemContrato(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_conta_sem_contrato INT,
    arquivo VARCHAR(13),
    formato VARCHAR(5),
    FOREIGN KEY (id_conta) REFERENCES ContaSemContrato(id)
);
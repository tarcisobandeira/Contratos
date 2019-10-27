CREATE DATABASE ContratoPagamento;

USE ContratoPagamento;

CREATE TABLE Contrato(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nome VARCHAR(50),
	empresa VARCHAR(50),
	descricao VARCHAR(50),
	inicio_c VARCHAR(50),
	fim_c VARCHAR(50),
	valor_mensal FLOAT
);

CREATE TABLE Pagamento(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_contrato INT,
	valor FLOAT,
	valor_pago FLOAT,
	dia_emissao VARCHAR(50),
	dia_vencimento VARCHAR(50),
	dia_pagamento VARCHAR(50),
	status INT,
	obs VARCHAR(500),
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
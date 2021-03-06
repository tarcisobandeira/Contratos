CREATE DATABASE Contratos;

USE Contratos;

CREATE TABLE Status_conta(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    descricao VARCHAR(30)
);

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
    ativo INT,
    FOREIGN KEY (id_empresa) REFERENCES Empresa(id)
);

CREATE TABLE Conta(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_empresa INT,
    nome VARCHAR(50),
    dia_emissao VARCHAR(50),
    dia_vencimento VARCHAR(50),
    ativo INT,
    FOREIGN KEY (id_empresa) REFERENCES Empresa(id)
);

CREATE TABLE GerarConta(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_conta INT,
    contador INT,
    mes_ano VARCHAR(50),
    dia_pagamento  VARCHAR(50),
    valor VARCHAR(50),
	obs VARCHAR(500),
    referencia BOOLEAN,
    id_status_conta INT,
	FOREIGN KEY (id_conta) REFERENCES Conta(id),
    FOREIGN KEY (id_status_conta) REFERENCES Status_conta(id)
);

CREATE TABLE AnexoConta(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_conta INT,
    arquivo VARCHAR(100),
    FOREIGN KEY (id_conta) REFERENCES Conta(id)
);

CREATE TABLE AnexoContrato(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_contrato INT,
    arquivo VARCHAR(100),
    FOREIGN KEY (id_contrato) REFERENCES Contrato(id)
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

INSERT INTO Status_conta (id, descricao)
VALUES  (1, "Aberto"),
        (2, "Próximo do vencimento"),
        (3, "Fechado"),
        (4, "Atrasado"),
        (5, "Solicitada"),
        (6, "Impressa"),
        (7, "Entregue"),
        (8, "Aprovação")
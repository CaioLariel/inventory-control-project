CREATE DATABASE ControleDeEstoque;
USE ControleDeEstoque; 


CREATE TABLE cliente( 
cpf                 BIGINT                  NOT NULL,  
nome                VARCHAR(255)            NOT NULL,
data_nascimento     CHAR(8)               NOT NULL,
PRIMARY KEY(cpf)
);


CREATE TABLE produto (
id              INT             AUTO_INCREMENT,
nome            VARCHAR(255)    NOT NULL,
quantidade      INT             NOT NULL,
valor_unidade   REAL            NOT NULL,
PRIMARY KEY(id)
);


CREATE TABLE venda (
id                         INT             AUTO_INCREMENT,  
cpf                        BIGINT          NOT NULL,
id_produto                 INT             NOT NULL,
quantidade				   INT			   NOT NULL,
total					   REAL		       NOT NULL,
FOREIGN KEY(cpf)           REFERENCES      cliente(cpf),
FOREIGN KEY(id_produto)    REFERENCES      produto(id),
PRIMARY KEY(id)
);


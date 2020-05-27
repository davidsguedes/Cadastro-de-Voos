CREATE DATABASE projetoVoo1;

USE projetoVoo1;

create table AERONAVE(

aeroId int NOT NULL auto_increment, 
aeroCod varchar(128) NOT NULL,
aeroCapacidade int NOT NULL,
aeroModelo varchar(128) NULL,
idEmpresa int NOT NULL,

constraint PK_AVIAO primary key(aeroId)
);


create table EMPRESA(

idEmpresa int NOT NULL auto_increment, 
EMPCOD varchar(128) NOT NULL,
empNome varchar(128) NOT NULL,
EMPRAZAOSOCIAL varchar(128) NOT NULL,
EMPCNPJ int NOT NULL,

constraint PK_EMPRESA primary key(idEmpresa)
);

	


CREATE TABLE CLIENTE(

idCliente INT NOT NULL auto_increment,
nome VARCHAR(50) NOT NULL,
idade int NOT NULL,
cpf VARCHAR(14) NOT NULL,
email VARCHAR (100) NOT NULL,
telefone VARCHAR(20) NOT NULL,
cidade VARCHAR(120) NOT NULL,
estado VARCHAR(2) NOT NULL,
pais VARCHAR(120) NOT NULL,

CONSTRAINT PK_CLIENTE PRIMARY KEY (idCliente)
);


create table AEROPORTO(

idAeroporto int not null auto_increment, 
AERCOD VARCHAR(120) NOT NULL,
AERSIGLA varchar(16) NOT NULL,
AERLOCALIZACAO VARCHAR (120) NOT NULL,

constraint PK_AEROPORTO primary key(idAeroporto)
);

CREATE TABLE PASSAGEM(

idPassagem INT NOT NULL auto_increment,
numeroPassagem int NOT NULL,
valorPassagem double,
passagemSituacao VARCHAR(50) NOT NULL,

CONSTRAINT PK_PASSAGEM PRIMARY KEY (idPassagem)
);

create table ITINERARIO(

idItinerario int NOT NULL auto_increment,
ITICOD VARCHAR(50) NOT NULL,
ITIORIGEM varchar(50) NOT NULL,
ITIDESTINO varchar(50) NOT NULL,

constraint PK_ITINERARIO primary key(idItinerario)
);


CREATE TABLE VOO (
idVoo INT NOT NULL AUTO_INCREMENT,
codigoVoo VARCHAR(30) NOT NULL,
idItinerario int NOT NULL,
aeroId int NOT NULL,
idAeroporto int not null, 
estadoVoo VARCHAR(50) NOT NULL DEFAULT 'Cadastrado',


    CONSTRAINT PK_VOO PRIMARY KEY (idVoo)
);


CREATE TABLE  RESERVA(
idReserva int not null auto_increment,
idCliente int not null, 
idPassagem int not null,

CONSTRAINT PK_RESERVA PRIMARY KEY (idReserva)
);


CREATE TABLE VENDA(
idVenda int not null auto_increment,
idPassagem int,
idCliente int,
idVoo int,
valorVenda double,
promocaoSelecionada varchar(50) NOT NULL,

CONSTRAINT PK_VENDA PRIMARY KEY (idVenda)

);


CREATE TABLE OPERADOR(
idOperador int not null auto_increment,
nomeOperador varchar(100),
permissaoOperador varchar(100),
nivelOperador varchar(100),
diasUteisTrabalhados int,
valorDiaTrabalhado double,
valorValeTransporteDia double,

CONSTRAINT PK_OPERADOR PRIMARY KEY (idOperador)

);


ALTER TABLE VENDA
  ADD CONSTRAINT FK_VENDA_VOO FOREIGN KEY (idVoo) REFERENCES VOO (idVoo),
	ADD CONSTRAINT FK_VENDA_CLIENTE FOREIGN KEY (idCliente) REFERENCES CLIENTE (idCliente),
		ADD CONSTRAINT FK_VENDA_PASSAGEM FOREIGN KEY (idPassagem) REFERENCES PASSAGEM (idPassagem);


ALTER TABLE RESERVA
	  ADD CONSTRAINT FK_RESERVA_CLIENTE FOREIGN KEY (idCliente) REFERENCES CLIENTE (idCliente),	
	  ADD CONSTRAINT FK_RESERVA_PASSAGEM FOREIGN KEY (idPassagem) REFERENCES PASSAGEM (idPassagem);



ALTER TABLE VOO
	  ADD CONSTRAINT FK_VOO_ITINERARIO FOREIGN KEY (idItinerario) REFERENCES ITINERARIO (idItinerario),	
	  ADD CONSTRAINT FK_VOO_AERONAVE FOREIGN KEY (aeroId) REFERENCES AERONAVE (aeroId),
      ADD CONSTRAINT FK_VOO_AEROPORTO FOREIGN KEY (idAeroporto) REFERENCES AEROPORTO (idAeroporto);


ALTER TABLE AERONAVE
	  ADD CONSTRAINT FK_AERONAVE_EMPRESA FOREIGN KEY (idEmpresa) REFERENCES EMPRESA (idEmpresa);



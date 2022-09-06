create database viagem;
use viagem;

CREATE TABLE Usuario (
    id_permissao INTEGER PRIMARY KEY auto_increment,
    nome_cliente VARCHAR (30),
    cpf_cliente int,
    email_cliente VARCHAR (30)
);

CREATE TABLE Itens_compra (
      Qtda_itens decimal,
    preco_itens REAL,
    fk_Usuario_id_permissao INTEGER,
    PRIMARY KEY (id_permissao, id_itens)
);

CREATE TABLE Viagem (
    id_permissao INTEGER PRIMARY KEY auto_increment,
    id_itens INTEGER,
    qtda_viagem DOUBLE,
    destino_viagem VARCHAR (30),
    origem_viagem VARCHAR (30)
);

CREATE TABLE compra (
    fk_Itens_compra_id_permissao INTEGER,
    fk_Itens_compra_id_itens INTEGER,
    fk_Viagem_id_permissao INTEGER
);
 
ALTER TABLE Itens_compra ADD CONSTRAINT FK_Itens_compra_2
    FOREIGN KEY (fk_Usuario_id_permissao)
    REFERENCES Usuario (id_permissao)
    ON DELETE CASCADE;
 
ALTER TABLE compra ADD CONSTRAINT FK_compra_1
    FOREIGN KEY (fk_Itens_compra_id_permissao, fk_Itens_compra_id_itens)
    REFERENCES Itens_compra (id_permissao, id_itens)
    ON DELETE RESTRICT;
 
ALTER TABLE compra ADD CONSTRAINT FK_compra_2
    FOREIGN KEY (fk_Viagem_id_permissao)
    REFERENCES Viagem (id_permissao)
    ON DELETE RESTRICT;
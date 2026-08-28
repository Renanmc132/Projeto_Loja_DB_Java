CREATE TABLE Loja 
    ( 
     id_loja VARCHAR (10)  NOT NULL , 
     filial  VARCHAR (50)  NOT NULL , 
     nome    VARCHAR (50) NOT NULL

    ) 
;

ALTER TABLE Loja 
    ADD CONSTRAINT Loja_PK PRIMARY KEY ( id_loja ) ;

CREATE TABLE LOJA_TENIS 
    ( 
     Tenis_id_tenis       VARCHAR (10)  NOT NULL , 
     Tenis_Marca_id_marca VARCHAR (10)  NOT NULL , 
     Loja_id_loja         VARCHAR(10)  NOT NULL , 
     preco                VARCHAR (10)  NOT NULL , 
     quantidade_estoque   VARCHAR (50)  NOT NULL 
    ) 
;

CREATE TABLE Marca 
    ( 
     id_marca VARCHAR (10)  NOT NULL , 
     nome     VARCHAR (50)  NOT NULL 
    ) 
;

ALTER TABLE Marca 
    ADD CONSTRAINT Marca_PK PRIMARY KEY ( id_marca ) ;

CREATE TABLE Tenis 
    ( 
     id_tenis       VARCHAR (10)  NOT NULL , 
     nome           VARCHAR (50)  NOT NULL , 
     cor            VARCHAR (50)  NOT NULL , 
     Marca_id_marca VARCHAR (10)  NOT NULL 
    ) 
;

ALTER TABLE Tenis 
    ADD CONSTRAINT Tenis_PK PRIMARY KEY ( id_tenis, Marca_id_marca ) ;

ALTER TABLE LOJA_TENIS 
    ADD CONSTRAINT LOJA_TENIS_Loja_FK FOREIGN KEY 
    ( 
     Loja_id_loja
    ) 
    REFERENCES Loja 
    ( 
     id_loja
    ) 
;

ALTER TABLE LOJA_TENIS 
    ADD CONSTRAINT LOJA_TENIS_Tenis_FK FOREIGN KEY 
    ( 
     Tenis_id_tenis,
     Tenis_Marca_id_marca
    ) 
    REFERENCES Tenis 
    ( 
     id_tenis,
     Marca_id_marca
    ) 
;

ALTER TABLE Tenis 
    ADD CONSTRAINT Tenis_Marca_FK FOREIGN KEY 
    ( 
     Marca_id_marca
    ) 
    REFERENCES Marca 
    ( 
     id_marca
    ) 
;


SELECT * FROM LOJA;
SELECT * FROM MARCA;
SELECT * FROM LOJA_TENIS;
SELECT * FROM TENIS; 

INSERT INTO MARCA (id_marca, nome) VALUES (1, 'VANS');

INSERT INTO TENIS (id_tenis, nome, cor, marca_id_marca) VALUES (1, 'VANS SUEDE', 'BLACK', '1');

INSERT INTO LOJA (id_loja, filial, nome) VALUES (1, 'São Paulo 01', 'VANS');

INSERT INTO LOJA_TENIS (tenis_id_tenis, tenis_marca_id_marca, loja_id_loja, preco, quantidade_estoque) VALUES (1, 1, 1, 'R$100,50', 1);

TRUNCATE TABLE LOJA_TENIS;
TRUNCATE TABLE TENIS;
TRUNCATE TABLE MARCA;
TRUNCATE TABLE LOJA;




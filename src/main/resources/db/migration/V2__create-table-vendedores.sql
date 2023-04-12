create table vendedores(

    id bigint not null auto_increment,
    nomeFantasia varchar(100) not null,
    setor varchar(100) not null,
    telefone varchar(100) not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20),
    estado char(2) not null,
    cidade varchar(100) not null,

    primary key(id)

);
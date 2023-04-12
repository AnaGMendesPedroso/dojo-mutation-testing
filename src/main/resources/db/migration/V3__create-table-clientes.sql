create table clientes(

    id bigint not null auto_increment,
    nomeCliente varchar(100) not null,
    telefone varchar(20) not null,
    primary key(id)
);
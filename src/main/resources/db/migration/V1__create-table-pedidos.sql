create table pedidos(

    id bigint not null auto_increment,
    nomeFantasia varchar(100) not null,
    setorVendedor varchar(100) not null,
    telefoneVendedor varchar(100) not null,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20),
    estado char(2) not null,
    cidade varchar(100) not null,
    nomeCliente varchar(100) not null,
    telefoneCliente varchar(20) not null,
    valorTotal DECIMAL not null,
    quantidadeItem varchar(9) not null,
    nomeProduto varchar(100) not null,
    precoUnitario DECIMAL not null,
    fornecedor varchar(100) not null,
    categoria varchar(100) not null,
    primary key(id)
);
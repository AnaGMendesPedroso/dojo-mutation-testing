create table pedidos(

    id bigint not null auto_increment,
    nome_fantasia_vendedor varchar(100) not null,
    telefone_vendedor varchar(100) not null,
    endereco_vendedor varchar(100) not null,
    setor_vendas_vendedor varchar(100) not null,
    nome_cliente varchar(100) not null,
    telefone_cliente varchar(50),
    valor_total DECIMAL not null,
    nome_produto varchar(100) not null,
    categoria varchar(100) not null,
    fornecedor varchar(100) not null,
    preco DECIMAL not null,
    quantidade SMALLINT not null,
    primary key(id)
);
CREATE TABLE pessoa(
    id BIGINT primary key,
    nome varchar(100) not null,
    sobrenome varchar(100) not null,
    data_nascimento date not null,
    cpf varchar(20) not null
)
#SQL 2.8
create table tabela_telefone(
	id int not null auto_increment primary key,
    telefone varchar(200),
    pessoa_id int,
    constraint fk_pessoa_telefone foreign key(pessoa_id)
    references pessoas(id)
);

select * from tabela_telefone
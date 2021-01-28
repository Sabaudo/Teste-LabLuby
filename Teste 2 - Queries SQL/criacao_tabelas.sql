select * from pessoas;
desc pessoas;

#Aqui eu criei as 2 tabelas e as relacionei

create table pessoas(
	id int not null auto_increment primary key,
    nome varchar(30) not null
);

insert into pessoas values
(default, 'John Doe'),
(default, 'Jane Doe'),
(default, 'Alice Jones'),
(default, 'Bobby Louis'),
(default, 'Lisa Romero');

select * from pessoas;

create table eventos(
	id int not null auto_increment primary key,
    evento varchar(30) not null,
    pessoa_id int,
    constraint fk_pessoa_evento foreign key(pessoa_id)
    references pessoas(id)
);

insert into eventos values
(default, 'Evento A', 2),
(default, 'Evento B', 3),
(default, 'Evento C', 2),
(default, 'Evento D', null);

select * from eventos;
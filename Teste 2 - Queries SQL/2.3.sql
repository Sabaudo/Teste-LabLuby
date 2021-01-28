#SQL 2.3
insert into eventos values
(default, 'Evento E', 5);

select * from eventos;

select pessoas.nome, eventos.evento, eventos.pessoa_id
from pessoas join eventos
on eventos.pessoa_id = pessoas.id; 


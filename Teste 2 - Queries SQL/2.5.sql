#SQL 2.5
select * from eventos;
select * from pessoas;

delete from eventos where id = '2';
select pessoas.nome, eventos.evento, eventos.pessoa_id
from pessoas join eventos
on eventos.pessoa_id = pessoas.id; 


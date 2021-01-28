#SQL 2.6

select pessoas.id
from pessoas left join eventos
on eventos.pessoa_id = pessoas.id
where eventos.evento is null;

delete pessoas from pessoas
left join eventos on eventos.pessoa_id = pessoas.id
where eventos.evento is null;

select * from pessoas;

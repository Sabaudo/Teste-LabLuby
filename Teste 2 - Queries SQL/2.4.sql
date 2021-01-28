#SQL 2.4
update pessoas set participantes = '4' where id = '1';

select pessoas.nome, eventos.evento, eventos.pessoa_id
from pessoas join eventos
on eventos.pessoa_id = pessoas.id; 

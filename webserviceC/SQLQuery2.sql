create table materia(
	ci int primary key,
	materiaUno varchar(20),
	materiaDos varchar(20),
	materiaTres varchar(20),
)

insert into materia(ci, materiaUno, materiaDos, materiaTres) 
values (9064877, 'INF-123', 'INF-313', 'INF-111')
insert into materia(ci, materiaUno, materiaDos, materiaTres) 
values (7082735, 'INF-333', 'INF-313', 'INF-328')
insert into materia(ci, materiaUno, materiaDos, materiaTres) 
values (1000424, 'INF-123', 'INF-324', 'INF-114')
insert into materia(ci, materiaUno, materiaDos, materiaTres) 
values (9075632, 'INF-123', 'INF-323', 'INF-111')

select * from materia
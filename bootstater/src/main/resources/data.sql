create table IF not exists person(
	id INTEGER primary key AUTO_INCREMENT,
	name varchar,
	last_name varchar,
	dob timestamp
);

insert into person (dob, last_name, name, id) values (TIMESTAMP '1999-01-31 10:00:00', 'Aru', 'dinesh', 1);
insert into person (dob, last_name, name, id) values (TIMESTAMP '2018-09-11 10:00:00', 'Ar231u', 'di123nesh', 2);
insert into person (dob, last_name, name, id) values (TIMESTAMP '1997-01-31 10:00:00', 'A123123ru', 'di123123nesh', 3);
insert into person (dob, last_name, name, id) values (TIMESTAMP '2002-07-31 10:00:00', '00u', 'vgesh', 4);
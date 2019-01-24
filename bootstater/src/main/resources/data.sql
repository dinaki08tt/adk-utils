create table IF not exists person(
	id INTEGER primary key AUTO_INCREMENT,
	name varchar,
	last_name varchar,
	dob timestamp,
	is_Record_Active varchar(1)
);

insert into person (dob, last_name, name, id, is_Record_Active) values (TIMESTAMP '1999-01-31 10:00:00', 'jummba', 'lancha', 1, 'Y');
insert into person (dob, last_name, name, id, is_Record_Active) values (TIMESTAMP '2018-09-11 10:00:00', 'kummba', 'gicha', 2, 'Y');
insert into person (dob, last_name, name, id, is_Record_Active) values (TIMESTAMP '1997-01-31 10:00:00', 'pummbha', 'sucha', 3, 'Y');
insert into person (dob, last_name, name, id, is_Record_Active) values (TIMESTAMP '2002-07-31 10:00:00', 'kadambha', 'lucha', 4, 'Y');
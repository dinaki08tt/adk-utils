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


insert into ADDRESS (ID,CITY,DELETED,STATE,STREET,ZIP) values (001,'Kochi',0,'Kerala','Alagar st',741103);
insert into ADDRESS (ID,CITY,DELETED,STATE,STREET,ZIP) values (002,'Renugunda',0,'Andhra','Thillai st',541103);
insert into ADDRESS (ID,CITY,DELETED,STATE,STREET,ZIP) values (003,'Aurangabad',0,'Maharashtra','Thakre st',241103);
insert into ADDRESS (ID,CITY,DELETED,STATE,STREET,ZIP) values (004,'Silluguri',0,'West Bengal','Nanasab st',331103);
insert into ADDRESS (ID,CITY,DELETED,STATE,STREET,ZIP) values (005,'Jaipur',0,'Rajesthan','kanup st',554103);
insert into ADDRESS (ID,CITY,DELETED,STATE,STREET,ZIP) values (006,'Sillong',0,'Assam','Ruble st', 84103);
insert into ADDRESS (ID,CITY,DELETED,STATE,STREET,ZIP) values (007,'Jamsedpur',0,'Bihar','Kaur st', 86703);


insert into PROFESSOR (ID,DELETED,NAME,SALARY,START_DATE,ADDRESS_ID,DEPARTMENT_ID,MANAGER_ID) values (001, 0,'kila',5000,'2019-02-01',1,null,null);
insert into PROFESSOR (ID,DELETED,NAME,SALARY,START_DATE,ADDRESS_ID,DEPARTMENT_ID,MANAGER_ID) values (002, 0,'jila',8000,'2019-03-01',2,null,null);
insert into PROFESSOR (ID,DELETED,NAME,SALARY,START_DATE,ADDRESS_ID,DEPARTMENT_ID,MANAGER_ID) values (003, 0,'kulla',8500,'2019-03-01',3,null,null);
insert into PROFESSOR (ID,DELETED,NAME,SALARY,START_DATE,ADDRESS_ID,DEPARTMENT_ID,MANAGER_ID) values (004, 0,'kachi',5600,'2019-03-01',4,null,null);
insert into PROFESSOR (ID,DELETED,NAME,SALARY,START_DATE,ADDRESS_ID,DEPARTMENT_ID,MANAGER_ID) values (005, 0,'banchi',9000,'2019-03-01',5,null,null);
insert into PROFESSOR (ID,DELETED,NAME,SALARY,START_DATE,ADDRESS_ID,DEPARTMENT_ID,MANAGER_ID) values (006, 0,'lonchi',12000,'2019-03-01',6,null,null);
insert into PROFESSOR (ID,DELETED,NAME,SALARY,START_DATE,ADDRESS_ID,DEPARTMENT_ID,MANAGER_ID) values (007, 0,'banga',12000,'2019-05-09',null,null,null);

insert into PHONE (ID,NUMBER,TYPE,EMPLOYEE_ID) values (001,987563482,'Home',1);
insert into PHONE (ID,NUMBER,TYPE,EMPLOYEE_ID) values (002,987233482,'Work',1);
insert into PHONE (ID,NUMBER,TYPE,EMPLOYEE_ID) values (003,6787233482,'Guest House',1);

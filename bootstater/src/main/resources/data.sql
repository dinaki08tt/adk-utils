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

insert into project (id,name) values (001,'HDFC BANK');
insert into project (id,name) values (002,'ICICI BANK');
insert into project (id,name) values (003,'INDIAN BANK');
insert into project (id,name) values (004,'SBI Bank');
insert into project (id,name) values (005,'KVB');
insert into project (id,name) values (006,'IOB');
insert into project (id,name) values (007,'Bank of Baroda');

insert into address (ID,CITY,DELETED,STATE,STREET,ZIP) values (1,'Coimbatore',0,'TN','thoonga street',641103);
insert into address (ID,CITY,DELETED,STATE,STREET,ZIP) values (2,'Chennai',0,'TN','POONGA street',600234);
insert into address (ID,CITY,DELETED,STATE,STREET,ZIP) values (3,'mumbai',0,'MH','Raja street',234567);
insert into address (ID,CITY,DELETED,STATE,STREET,ZIP) values (4,'kochi',0,'KL','Roj street',125678);
insert into address (ID,CITY,DELETED,STATE,STREET,ZIP) values (5,'Coimbatore',0,'TN','krishna street',641103);

insert into department (id,name) values (01,'CLERICAL');
insert into department (id,name) values (02,'LOAN');
insert into department (id,name) values (03,'NRI');
insert into department (id,name) values (04,'DEPOSIT');
insert into department (id,name) values (05,'INSURANCE');

insert into professor (ID,DELETED,NAME,SALARY,START_DATE,ADDRESS_ID,DEPARTMENT_ID,MANAGER_ID) values(01,0,'Spider Dragon',10000,'2016-10-25',1,1,null);
insert into professor (ID,DELETED,NAME,SALARY,START_DATE,ADDRESS_ID,DEPARTMENT_ID,MANAGER_ID) values(04,0,'lummbha',10000,'2016-10-25',1,1,01);
insert into professor (ID,DELETED,NAME,SALARY,START_DATE,ADDRESS_ID,DEPARTMENT_ID,MANAGER_ID) values(02,0,'mummbha',20000,'2016-07-12',2,2,01);
insert into professor (ID,DELETED,NAME,SALARY,START_DATE,ADDRESS_ID,DEPARTMENT_ID,MANAGER_ID) values(03,0,'kummbha',30000,'2016-09-27',3,3,01);


insert into phone (ID,NUMBER,TYPE,EMPLOYEE_ID) values (1,9098988345,'Work',01);
insert into phone (ID,NUMBER,TYPE,EMPLOYEE_ID) values (2,8998988376,'Home',01);
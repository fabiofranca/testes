create schema teste_fabio;
create table teste_fabio.usuarios (
	id bigint serial not null,
	username varchar(20),
	password varchar(255),
	is_enabled boolean,
	register_date timestamp,
	name varchar (100),
	surname varchar (100),
	email varchar (50),
	phone varchar (15)
);

insert into teste_fabio.usuarios (username, password, is_enabled, name, surname, email, phone) values 
	('user1', 'pwd', true, 'user1', 'one', 'user1@foo', '1234567891'), 
	('user2', 'pwd', true, 'user2', 'two', 'user1@foo', '1234567892'), 
	('user3', 'pwd', true, 'user3', 'three', 'user3@foo', '1234567893') ;
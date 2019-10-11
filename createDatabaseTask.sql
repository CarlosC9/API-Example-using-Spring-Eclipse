drop database if exists db_task;

create database db_task;

use db_task;

create table task (
id int auto_increment primary key,
descripcion varchar(50) not null,
estado enum("To do","In progress","Done")
);

insert into task values (null,"Terminar proyecto Spring","In progress"),
(null,"Llevar el perro al veterinario","Done");

select * from task;
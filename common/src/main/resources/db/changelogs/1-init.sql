--liquibase formatted sql

--changeset fertigi:1

create table user_authorization
(
  id int auto_increment primary key,
  login varchar(255) not null,
  password varchar(255) not null,
  email varchar(255) not null,
  constraint user_login_index
  unique (login)
)
;

create table user_info
(
  id int auto_increment primary key,
  name varchar(255) not null,
  surname varchar(255) not null
)
;


--rollback drop schema spring_security_stady_project;
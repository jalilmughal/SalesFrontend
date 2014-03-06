drop table Persons_have_Skills;
drop table Persons;
drop table Gifts;
drop table Skills;

create table Skills (
code varchar(6) primary key,
name varchar(30) not null
);

create table Gifts (
id int primary key,
name varchar(30)
);

create table Persons (
email varchar(80) primary key,
first_name varchar(40) not null,
last_name varchar(40) not null,
gift_id int references Gifts(id)
);

create table Persons_have_Skills (
person_email varchar(80) references Persons(email) not null,
skill_code varchar(6) references Skills(code) not null,
primary key (person_email, skill_code)
);


delete from Persons_have_Skills;
delete from Persons;
delete from Skills;
delete from Gifts;
--------------------------

insert into Gifts (id, name)
values 
(1, 'Sports car'),
(2, 'Bicycle'),
(3, 'Orange');

insert into Skills(code, name)
values 
('smart', 'Smart'),
('witty', 'Witty'),
('wise', 'Wise'),
('awe', 'Awesome');

insert into Persons(email, first_name, last_name, gift_id)
values
('kurt@mail.dk', 'Kurt', 'Hansen', 1),
('sonja@jensen.dk', 'Sonja', 'Jensen', 3);

insert into Persons_have_Skills (person_email, skill_code)
values
('kurt@mail.dk', 'smart'),
('kurt@mail.dk', 'awe'),
('sonja@jensen.dk', 'witty');
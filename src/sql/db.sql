CREATE TABLE teachers(
                         name varchar(10),
                         id int NOT NULL,
                         dept varchar(3),
                         salary int
);

ALTER TABLE teachers ADD subject varchar(10);
ALTER TABLE teachers RENAME COLUMN id to teacher_id;
ALTER TABLE teachers MODIFY salary bigint;
ALTER TABLE teachers DROP column dept;
ALTER TABLE teachers RENAME students;

show tables; -- displays all tables within a schema
desc teachers; -- describes all columns of the table
desc students;

ALTER TABLE students RENAME COLUMN teacher_id to student_id; -- alter is used to update table structure
ALTER TABLE teachers RENAME COLUMN id to teacher_id;

INSERT INTO teachers values ('Sanjay',101,'ECE',10000);
INSERT INTO teachers values ('Sanjeev',101,'ECE',10000);

INSERT INTO teachers values ('Sanju',103,'CSE',15000);

DELETE from teachers where name='Sanjay';

INSERT INTO students values ('Rajesh',100,'ECE',100);
INSERT INTO students values ('sanjay',110,'CSE',90);
INSERT INTO students values ('','',10);
INSERT INTO students values ('Rakesh','ME',33);


UPDATE teachers set teacher_id = 102 where name= 'Sanjeev';  -- update is used to change data present in column

ALTER TABLE teachers MODIFY teacher_id int PRIMARY KEY; -- PK : can not be duplicated.



ALTER TABLE students MODIFY student_id int PRIMARY KEY;
ALTER TABLE students rename COLUMN salary to marks;

ALTER TABLE students MODIFY name varchar(10) NOT NULL;

delete from students; -- deletes only data present in table
drop table students; -- deletes all data and removes the table itself from schema
truncate table students; -- deletes only data from the table

CREATE TABLE students(
                         name varchar(10) NOT NULL UNIQUE,
                         id int PRIMARY KEY auto_increment,
                         dept varchar(3) NOT NULL,
                         marks int
);

desc students;
desc teachers;
select * from students;
SELECT * from teachers;

INSERT INTO students values ('Ram',108,'EE',78); -- varchar type in DB can take any data type(string,int,bigint...etc) but it will follow the constraints imposed on that column
INSERT INTO students (dept,name,marks) values ('ME','Rekha',88);
INSERT INTO students (dept,name,marks) values ('ECE','saransh',88);

ALTER TABLE students modify marks int NULL;
alter table students modify id int primary key auto_increment;
desc students;
INSERT INTO students (dept,id,name,marks) values ('ME',110,'Reshma','');
select name from students;
select * from students where id = 101;
select * from students where id = 110;

delete from students;
alter table students auto_increment=1000;

------------------------------------------
select * from students;
SELECT name from students where marks = 88;
SELECT count(*) from students where marks > 90;
SELECT name,marks from students where marks > 85 AND marks < 90;
SELECT name,marks from students where marks between 85 AND 90; -- inclusive operator(includes edge values)

SELECT name from students where name like 'Ra%';
SELECT name from students where name like '%sh';
SELECT name from students where name like '%an%';
SELECT name from students where name like '__r%';
SELECT name from students where name like '%j__';
SELECT name from students where name like '_a%s_';
SELECT name from students where name not like '_a%s_';
SELECT name from students where name like '__k%'; -- 3 or more than 3 characters
SELECT name from students where name like '__m___'; -- exactly 3 characters
SELECT name from students where name like 'R____%';
-- 89,90,91,92
SELECT name,marks from students where marks IN (89,90,91,92); -- comparision without AND /OR
SELECT name,marks from students where marks NOT IN (89,90,91,92);
-- 88,90 less than 100
SELECT name,marks from students where marks not in (88,90) and marks < 100;









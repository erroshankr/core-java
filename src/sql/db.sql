CREATE TABLE teachers(
                         name varchar(10),
                         id int primary key unique auto_increment,
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

-- SELECT table_name from dba_tables;

ALTER TABLE students RENAME COLUMN teacher_id to student_id; -- alter is used to update table structure
ALTER TABLE teachers RENAME COLUMN id to teacher_id;

INSERT INTO teachers values ('',5001,'ECE',10000);
INSERT INTO teachers values (null,5002,'ECE',10000);
INSERT INTO teachers values ('Sanjeev',101,'ECE',10000);
select * from teachers;

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

ALTER TABLE teachers rename COLUMN teacher_id to id;


delete from students; -- deletes only data present in table
drop table students; -- deletes all data and removes the table itself from schema
truncate table students; -- deletes only data from the table

CREATE TABLE students(
                         name varchar(10) NOT NULL,
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
alter table teachers modify id int primary key auto_increment;

desc students;
INSERT INTO students (dept,id,name,marks) values ('ME',110,'Reshma','');
select name from students;
select * from students where id = 101;
select * from students where id = 110;

delete from students;
delete from teachers;

alter table students auto_increment=1000;
alter table teachers auto_increment=5000;

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


drop table students;
drop table teachers;
desc teachers;
desc students;
delete from teachers;

ALTER TABLE teachers modify dept varchar(3) NOT NULL;
ALTER TABLE teachers modify name varchar(10) NOT NULL;
ALTER TABLE teachers modify salary int NOT NULL;


INSERT INTO students (dept,name,marks) values ('ME','Reshma',80);
INSERT INTO students (dept,name,marks) values ('ECE','Rahul',82);
INSERT INTO students (dept,name,marks) values ('CSE','Rakesh',79);
INSERT INTO students (dept,name,marks) values ('CSE','Mohit',87);
INSERT INTO students (dept,name,marks) values ('CSE','Mukesh',73);
INSERT INTO students (dept,name,marks) values ('EE','Rajesh',80);
INSERT INTO students (dept,name,marks) values ('ECE','Suresh',98);

INSERT INTO teachers (dept,salary,name) values
                                            ('ECE',2000,'Sanju'),
                                            ('CSE',5686,'Sanajana'),
                                            ('CSE',8769,'Sharma'),
                                            ('ME',5423,'Manjeet'),
                                            ('EE',78687,'Rahul');

SELECT count(*) from teachers;

select distinct dept from students;
SELECT count(distinct dept) as result from students;
SELECT name as naam, dept as branch from students;
desc students;

SELECT name,marks from students order by name asc;
SELECT name,salary from teachers order by salary desc;

select dept, count(id) from students group by dept;

SELECT count(*) from students;

select dept, count(id) from students group by dept order by count(id) ;
select dept, count(id) from students group by dept ;
select dept, count(id) from students group by dept having count(id)>1  order by count(id) desc;

-- order by : if we need results in specific order based on a column condition
-- if nothing is mentioned : asc , asc : ascending, desc: descending

-- group by: if we want results to be grouped in a specific way
-- having : if we want to put condition on grouping
-- ordering always happens after grouping

SELECT ALL name from students;

SELECT * from students where marks > 80;
SELECT name,marks from students where marks in (80,82,73,80);

SELECT name,marks from students where marks in (SELECT marks from students where name like 'R%');

SELECT marks from students where name like 'R%';
SELECT AVG(marks) from students; -- 81.8571
SELECT MAX(marks) from students;
SELECT MIN(marks) from students;
select name,marks from students where marks in (SELECT MAX(marks) from students);
select name,marks from students order by marks desc limit 1;
select name,marks from students where marks not in (SELECT MAX(marks) from students) order by marks desc limit 1;
SELECT name ,marks from students where marks > (SELECT AVG(marks) from students);

SELECT dept,AVG(marks) from students group by dept order by AVG(marks) desc;


SELECT dept,AVG(marks) from students group by dept having AVG(marks) > (SELECT AVG(marks) from students)  order by AVG(marks) desc;

-- find student having 3rd max marks
-- find student having 3rd min marks

-- SELECT marks in (SELECT * from students order by marks desc) from students where row_number = 3;

-- select marks from students order by marks desc limit 2,1;
select * from students;

select MIN(marks) from students where marks in (select marks from students order by marks desc limit 3);
select max(marks) from students where marks in (select marks from students order by marks asc limit 3);

-- 3rd highest
select marks from students order by marks desc limit 2,1; -- skips 1st 2 rows and then filter 1st from remaining rows

select marks from students order by marks desc limit 3,1; -- 4th maximum
select marks from students order by marks asc limit 3,1; -- 4th minimum

select distinct marks from students order by marks asc limit 3,1; -- 4th minimum
select distinct marks from students order by marks desc limit 3,1; -- 4th maximum

SELECT MAX(marks) from students; -- == x
SELECT * from students where marks  in (SELECT MAX(marks) from students);

SELECT distinct marks from students order by marks desc limit 1,1;
SELECT distinct marks from students order by marks asc limit 1,1;

SELECT  marks from students order by marks desc limit 1,1;
SELECT  marks from students order by marks asc limit 1,1;

SELECT dept,MAX(marks) from students group by dept order by MAX(marks) desc;
SELECT NOW();
SELECt * from students;
ALTER TABLE students ADD dob date;
ALTER table students MODIFY dob timestamp;
UPDATE students set dob='1990-11-12 09:30:15' where id = 1000;
UPDATE students set dob='1994-10-13 08:30:15' where id = 1001;
UPDATE students set dob='1995-09-13 08:36:15' where id = 1002;
UPDATE students set dob='1996-09-13 07:30:15' where id = 1003;
UPDATE students set dob='1996-09-14 06:30:15' where id = 1004;
UPDATE students set dob='1995-05-15 05:30:15' where id = 1005;
UPDATE students set dob='1993-12-16 05:35:15' where id = 1006;
-- DATE(YYYY-MM-DD), DATETIME(YYYY-MM-DD HH:MI:SS), TIMESTAMP(YYYY-MM-DD HH:MI:SS.ssss),YEAR (YYYY or YY)
-- INSERT: always creates a new row
-- UPDATE: always updated existing row
SELECT current_timestamp(3);
SELECT * from students where dob < '1995-01-01 00:00:00';
SELECT * from students where YEAR(dob) < 1995;

SELECT * from students where dob BETWEEN '1995-01-01 00:00:00' AND '1998-01-01 00:00:00';
SELECT * from students where MONTH(dob) = 9;
SELECT * from students where YEAR(dob) = 1996;
SELECT * from students where DAY(dob) = 13;
SELECT * from students where dob <= '1996-09-13 23:59:59';

SELECT name,(NOW()-dob) from students;
SELECT name,DATEDIFF(now(),dob) from students;
SELECT name,YEAR(now())-YEAR(dob),dob from students;

SELECT * from students where dob >= CURDATE() - INTERVAL 30 YEAR;

SELECT * from students where char_length(name) = 6;
SELECT CHAR('h','RAKESH') AS MatchPosition;
SELECT CONCAT(name,dept) from students;
SELECT REPLACE(name,'R','r') from students;
SELECT upper(name) from students;
SELECT REVERSE(name),REVERSE(marks) from students;


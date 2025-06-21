-- create database stud_DB;
-- use stud_DB;
-- create table student (stdud_id int primary key, name varchar(100), age int, course varchar(100));

-- alter table student rename column stdud_id to stud_id;

-- insert into  student
-- (stud_id,name, Age, course) values
-- (001,"Piyush", 19, "java"),
-- (002,"Raju", 20, "python");

-- insert into  student
-- (stud_id,name, Age, course) values
-- (003,"Ramesh", 21, "c");

-- update student
-- set course = "mern"
-- where stud_id = 003;

-- alter table student modify age smallint;  -- range the data ti be stored min , small , big;

-- alter table student add stud_email varchar(100);

-- alter table student drop column stud_email;

-- -- truncate table student;
-- -- rollback;

-- delete from student where stud_id = 003;



-- show tables;
-- SELECT * FROM student;




-- joins


create database department; 
use department;
create table emmployee (emp_id int primary key, emp_name varchar(100), dept_id int);

insert into  emmployee
(emp_id, emp_name, dept_id) values
(001,"Piyush Bhadade", 11),
(002,"Raju rastogi", 12),
(003,"Frrahan qureshi", 13),
(004,"Ranchodas chanchad", 13),
(005,"Silenser", 14);


create table department (dept_name varchar(100), dept_id int);
insert into  department
(dept_name, dept_id) values
("HR", 11),
("Manager", 12),
("Consultant", 13),
("Employee", 13),
("Research", 14);

SELECT e.emp_name, d.dept_name FROM emmployee e INNER JOIN department d ON e.dept_id = d.dept_id;
SELECT e.emp_name, d.dept_name FROM emmployee e LEFT JOIN department d ON e.dept_id = d.dept_id;
SELECT e.emp_name, d.dept_name FROM emmployee e RIGHT JOIN department d ON e.dept_id = d.dept_id;


select *from emmployee;

select *from department;



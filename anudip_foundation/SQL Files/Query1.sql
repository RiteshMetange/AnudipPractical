CREATE DATABASE Student; 
use Student;

CREATE TABLE Stud(
id INT PRIMARY KEY auto_increment,
name varchar(10),
age int
);

insert into stud (name , age) values  ('ritesh',20), ('Prithviraj',20), ('yash',20), ('venshu',20);
select * from stud;

use Student;

SET SQL_SAFE_UPDATES = 0;
UPDATE Stud set name ="King" WHERE name="venshu";

select * from stud;

 

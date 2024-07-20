-- 2. Employee & Incentive Table

create table EMPLOYEE(
EMPLOYEE_ID INT,
FIRST_NAME TEXT,
LAST_NAME TEXT,
SALARY INT,
JOINING_DATE TEXT,
DEPARTMENT TEXT
);

insert into EMPLOYEE values
(1,"John","Abraham","1000000","1-Jan-13 12.00.00 AM","Banking"),
(2,"Michel","Clarke","800000","1-Jan-13 12.00.00 AM","Insurance"),
(3,"Roy","Thomas","700000","1-Jan-13 12.00.00 AM","Banking"),
(4,"Tom","Jose","600000","1-Jan-13 12.00.00 AM","Insurance"),
(5,"Jerry","Pinto","650000","1-Jan-13 12.00.00 AM","Insurance"),
(6,"Philip","Mathew","750000","1-Jan-13 12.00.00 AM","Services");

create table INCENTIVE(
Employee_ref_id int,
Incentive_date varchar(100),
Incentive_amount varchar(10),
foreign key Incentive(Employee_ref_id) references Employee(Employee_id)
);

insert into INCENTIVE values
(1,"01-FEB-13","5000"),
(2,"01-FEB-13","3000"),
(3,"01-FEB-13","4000"),
(1,"01-Jan-13","4500"),
(2,"01-FEB-13","3500");

-- 3.Get First_Name from employee table using Tom name “Employee Name”.
select FIRST_NAME from EMPLOYEE where FIRST_NAME = "Tom";

-- 4.Get FIRST_NAME, Joining Date, and Salary from employee table.
select FIRST_NAME, JOINING_DATE, SALARY from EMPLOYEE;

-- 5.Get all employee details from the employee table order by First_Name Ascending and Salary descending?
select * from EMPLOYEE
order by FIRST_NAME asc;

select * from EMPLOYEE
order by SALARY desc;


-- 6.Get employee details from employee table whose first name contains ‘J’
select * from EMPLOYEE
where FIRST_NAME like '%j%';

-- 7.Get department wise maximum salary from employee table order by
-- 8. salaryascending?
select DEPARTMENT, SALARY from EMPLOYEE
Order by SALARY desc; 

-- 9.Select first_name, incentive amount from employee and incentives table forthose employees who have incentives and incentive amount greater than 3000
select EMPLOYEE.FIRST_NAME, INCENTIVE.Incentive_amount from EMPLOYEE inner join INCENTIVE on Employee_id = Employee_ref_id where Incentive_amount > 3000;

-- 10.Create After Insert trigger on Employee table which insert records in viewtable
create table viewtable(
EMPLOYEE_ID INT,
FIRST_NAME TEXT,
LAST_NAME TEXT,
SALARY INT,
JOINING_DATE TEXT,
DEPARTMENT TEXT
);

create trigger insertTrigger 
after insert on EMPLOYEE for each row 
insert into viewtable values (new.EMPLOYEE_ID, new.FIRST_NAME, new.LAST_NAME, new.SALARY, new.JOINING_DATE, new.DEPARTMENT);

// 1 Find the duplicate record in Table
// Amazon
select column_1 , column_2 , count(*) from table GROUP BY column_1,column_2 HAVING COUNT(*) > 1;

// 2 Retrieve the second highest salary from the Employee table
// Microsoft
select MAX(salary) as secondHighestSalary from Employee where salary < ( select MAX(salary) from Employee);

// 3 Find employees without department
// Uber

select e.* from employee e LEFT JOIN Department d ON e.department_id = d.department_id where d.department_id is null
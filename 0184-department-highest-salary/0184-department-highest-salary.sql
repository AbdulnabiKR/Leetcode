# Write your MySQL query statement below
SELECT Department.name as Department,
Employee.name as Employee,Employee.salary as Salary
FROM Employee,Department
WHERE Employee.departmentid=Department.id AND (departmentId,salary) IN
(SELECT departmentId,MAX(salary) FROM Employee GROUP BY departmentId)
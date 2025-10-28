# Write your MySQL query statement below
SELECT DISTINCT l1.num as ConsecutiveNums FROM 
LOGS l1 JOIN LOGS l2
ON l2.id=l1.id+1
JOIN LOGS l3
ON l3.id=l1.id+2
WHERE l1.num=l2.num AND l2.num=l3.num;

# Write your MySQL query statement below
select name from employee e
join 
(select managerId,count(managerId) as repo from employee
where managerId is not null
group by managerId
) w on
w.managerId=e.id 
where w.repo>=5

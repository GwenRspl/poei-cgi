select emp1.ename, emp1.sal
from emp emp1
where 3 > (select count(*)
           from emp emp2
           where emp2.sal > emp1.sal)
order by emp1.sal desc
/

select empno, ename
from emp
where sal > (select avg(sal)
             from emp)
order by sal desc
/

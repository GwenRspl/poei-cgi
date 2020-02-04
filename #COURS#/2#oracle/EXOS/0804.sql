select ename, job, sal
from emp
where sal > all (select sal
                 from emp
								 where job = 'CLERK')
order by sal desc
/
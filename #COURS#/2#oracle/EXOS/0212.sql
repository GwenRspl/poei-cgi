select ename, job, sal
from emp
where job in ('ANALYST', 'CLERK')
and sal not in (1000, 3000, 5000)
/

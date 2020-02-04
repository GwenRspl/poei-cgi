select ename, deptno, job
from emp
where deptno in (select deptno
                 from dept
								 where loc = 'DALLAS')
/

select empno, ename, sal
from emp
where sal > (select avg(sal)
             from emp)
and deptno in (select deptno
               from emp
							 where ename like '%T%')
/
save "p6q7.sql"
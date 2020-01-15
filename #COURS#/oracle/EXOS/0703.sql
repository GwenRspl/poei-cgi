select empno, ename
from emp
where deptno in (select deptno
                 from emp
								 where ename like '%T%')
/

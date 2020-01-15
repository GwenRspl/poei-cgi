select deptno, ename, job
from emp
where deptno = (select deptno 
                from dept
								where dname = 'SALES')
/
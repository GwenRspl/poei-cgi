select ename, hiredate
from emp
where deptno = (select deptno
                from emp
								where ename = 'BLAKE')
and ename <>'BLAKE'
/

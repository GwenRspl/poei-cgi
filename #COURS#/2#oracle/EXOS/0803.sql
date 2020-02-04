select ename, dname, sal
from emp inner join dept on emp.deptno = dept.deptno
where (sal, nvl(comm, 0)) in (select sal, nvl(comm, 0)
                              from emp
															where ename = 'SCOTT')
and ename <> 'SCOTT'
/
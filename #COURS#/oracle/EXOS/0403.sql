select emp.ename, dept.dname, dept.loc
from emp, dept
where emp.deptno = dept.deptno
and emp.comm is not null
/
select emp.ename, dept.dname, dept.loc
from emp inner join dept on emp.deptno = dept.deptno
where emp.comm is not null
/

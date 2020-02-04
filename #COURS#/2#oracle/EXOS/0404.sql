select emp.ename, dept.dname
from emp, dept
where emp.deptno = dept.deptno
and emp.ename like '%A%'
/
select emp.ename, dept.dname
from emp inner join dept on emp.deptno = dept.deptno
where emp.ename like '%A%'
/

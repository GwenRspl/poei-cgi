select emp.ename, emp.deptno, dept.dname
from emp, dept
where emp.deptno = dept.deptno
/
select emp.ename, emp.deptno, dept.dname
from emp inner join dept on emp.deptno = dept.deptno
/
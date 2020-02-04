select emp.ename, emp.job, emp.deptno, dept.dname
from emp, dept
where emp.deptno = dept.deptno
and dept.loc = 'DALLAS'
/
select emp.ename, emp.job, emp.deptno, dept.dname
from emp inner join dept on emp.deptno = dept.deptno
where dept.loc = 'DALLAS'
/

describe salgrade
select emp.ename, emp.job, dept.dname, emp.sal, salgrade.grade
from emp, dept, salgrade
where emp.deptno = dept.deptno
and emp.sal between salgrade.losal and salgrade.hisal
/
select emp.ename, emp.job, dept.dname, emp.sal, salgrade.grade
from emp inner join dept on emp.deptno = dept.deptno
         inner join salgrade on emp.sal between salgrade.losal and salgrade.hisal
/

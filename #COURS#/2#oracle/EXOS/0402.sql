select distinct emp.job, dept.loc
from emp, dept
where emp.deptno = dept.deptno
and emp.deptno = 30 
/
select distinct emp.job, dept.loc
from emp inner join dept on emp.deptno = dept.deptno
where emp.deptno = 30
/

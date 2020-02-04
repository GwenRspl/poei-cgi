select deptno, dname
from dept
minus
select emp.deptno, dept.dname
from emp, dept
where emp.deptno = dept.deptno
/
select deptno, dname
from dept
minus
select emp.deptno, dept.dname
from dept inner join emp on dept.deptno = emp.deptno
/
select dept.deptno, dept.dname
from dept left join emp on emp.deptno = dept.deptno
having count(emp.empno) = 0
group by dept.deptno, dept.dname
/
select dept.deptno, dept.dname
from dept left join emp on dept.deptno = emp.deptno
where emp.deptno is null
/
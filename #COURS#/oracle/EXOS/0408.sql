select e.deptno department, e.ename employee, c.ename colleague
from emp e, emp c
where e.deptno = c.deptno
and e.empno <> c.empno
order by e.deptno, e.ename, c.ename
/
select e.deptno department, e.ename employee, c.ename colleague
from emp e inner join emp c on e.deptno = c.deptno and e.empno <> c.empno
order by e.deptno, e.ename, c.ename
/

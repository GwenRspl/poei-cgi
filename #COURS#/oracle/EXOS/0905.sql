select e.ename
from emp e
where exists (select c.empno
              from emp c
							where e.deptno = c.deptno
							and c.hiredate > e.hiredate
							and c.sal > e.sal)
/
select distinct e.ename
from emp e join emp c on e.deptno = c.deptno
where c.hiredate > e.hiredate
and c.sal > e.sal
/
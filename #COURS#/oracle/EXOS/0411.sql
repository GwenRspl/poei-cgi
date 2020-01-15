select e.ename "Employee", e.hiredate "Emp Hiredate", m.ename "Manager", m.hiredate "Mgr Hiredate"
from emp e, emp m
where e.mgr = m.empno
and e.hiredate < m.hiredate
/
select e.ename "Employee", e.hiredate "Emp Hiredate", m.ename "Manager", m.hiredate "Mgr Hiredate"
from emp e inner join emp m on e.mgr = m.empno and e.hiredate < m.hiredate
/

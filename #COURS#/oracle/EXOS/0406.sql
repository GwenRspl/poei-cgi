select e.ename "Employee", e.empno "Emp#", m.ename "Manager", m.empno "Mgr#"
from emp e, emp m
where e.mgr = m.empno
/
select e.ename "Employee", e.empno "Emp#", m.ename "Manager", m.empno "Mgr#"
from emp e inner join emp m on e.mgr = m.empno
/
save "p4q6.sql"
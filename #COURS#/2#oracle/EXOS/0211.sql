select ename
from emp
where ename like '%LL%'
and (deptno = 30
or mgr = 7782)
/

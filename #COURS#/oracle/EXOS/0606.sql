select job
from emp
where deptno in (10, 20)
minus
(
select job
from emp
where deptno = 10
intersect
select job
from emp
where deptno = 20
)
/

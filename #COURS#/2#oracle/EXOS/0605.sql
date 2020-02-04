select deptno
from dept
minus
select deptno
from emp
where job = 'ANALYST'
/

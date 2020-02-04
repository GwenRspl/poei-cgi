select ename as "Employee", sal as "Salaire Mensuel"
from emp
where sal > 1500 and (deptno = 30
or deptno = 10)
/

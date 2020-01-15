select distinct job
from emp
where hiredate between '01/07/1981' and '31/12/1981'
intersect
select job
from emp
where hiredate between '01/07/1982' and '31/12/1982'
/

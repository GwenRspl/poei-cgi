select ename, sal, comm
from emp
where comm is not null
order by sal desc, comm desc
/

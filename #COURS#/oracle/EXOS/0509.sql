select mgr, min(sal)
from emp
where mgr is not null
having min(sal) > 1000
group by mgr
order by min(sal) desc
/

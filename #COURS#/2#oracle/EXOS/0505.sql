select job, max(sal) "Maximum", min(sal) "Minimum", sum(sal) "Somme", round(avg(sal)) "Moyenne"
from emp
group by job
/

select job "Job",
sum(decode(deptno, 10, sal)) "Dept 10",
sum(decode(deptno, 20, sal)) "Dept 20",
sum(decode(deptno, 30, sal)) "Dept 30",
sum(decode(deptno, 40, sal)) "Dept 40",
sum(decode(deptno, null, sal)) "No Dept",
sum (sal) "Total"
from emp
group by job
/

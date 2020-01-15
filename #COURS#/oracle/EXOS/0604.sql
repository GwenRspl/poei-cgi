col dummy noprint
select job, deptno, 'x' dummy
from emp
where deptno = 10
union
select job, deptno, 'y' dummy
from emp
where deptno = 30
union
select job, deptno, 'z' dummy
from emp
where deptno = 20
order by dummy
/
col dummy print
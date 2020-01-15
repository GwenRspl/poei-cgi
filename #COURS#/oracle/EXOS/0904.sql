select ename
from emp e
where e.sal < (select avg(a.sal)/2
               from emp a
							 where a.deptno = e.deptno)
/
select e.ename, a.moyenne from emp e join
(select deptno, avg(sal)/2 moyenne from emp group by deptno) a
on e.deptno=a.deptno
where e.sal < a.moyenne
/
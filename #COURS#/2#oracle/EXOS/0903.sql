select e.ename, e.sal salary, e.deptno, avg(a.sal)
from emp e, emp a
where e.deptno = a.deptno
and e.sal > (select avg(b.sal)
             from emp b 
             where b.deptno = e.deptno)     
group by e.ename, e.sal, e.deptno
order by avg(a.sal)
/
select e.ename, e.sal salary, e.deptno, avg(a.sal)
from emp e inner join emp a on e.deptno = a.deptno
where e.sal > (select avg(b.sal)
             from emp b 
             where b.deptno = e.deptno)     
group by e.ename, e.sal, e.deptno
order by avg(a.sal)
/
select ename, deptno, sal
from emp
where (sal, deptno) in (select sal, deptno
                        from emp
												where comm is not null)
/
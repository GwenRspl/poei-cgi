select ename, hiredate from emp where ename <> 'BLAKE' and deptno = (select deptno from emp where ename='BLAKE');
select empno, ename from emp where sal > (select avg(sal) from emp) order by sal desc;
select empno, ename from emp where deptno in(select deptno from emp where ename like '%T%');
select ename, deptno, job from emp where deptno in(select deptno from dept where loc='DALLAS');
select ename, sal from emp where mgr=(select empno from emp where ename='KING');
select deptno, ename, job from emp where deptno = (select deptno from dept where dname='SALES');
select empno, ename, sal from emp where deptno in(select deptno from emp where ename like '%T%') and sal > (select avg(sal) from emp);
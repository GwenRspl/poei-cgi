select max(sal) "Maximum", min(sal) "Minimum", sum(sal) "Sum", round(avg(sal)) "Average" from emp;
select job, max(sal) "Maximum", min(sal) "Minimum", sum(sal) "Sum", round(avg(sal)) "Average" from emp group by job;
select job, count(*) from emp group by job;
select count(distinct(mgr)) "Number of Managers" from emp;
select max(sal)-min(sal) "DIFFERENCE" from emp;
select mgr, min(sal) from emp  where mgr is not null group by mgr having min(sal)>1000 order by min(sal) desc;
select dname, loc, count(ename) "Number of People", round(avg(sal),2) "Salary" from emp inner join dept on emp.deptno = dept.deptno group by dname, loc;
select count(ename) "TOTAL", count(ename) from emp group by hiredate having hiredate between '01/01/1980' and '31/12/1980';


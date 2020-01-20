select empno, ename, job, hiredate from emp;
select distinct job from emp;
select empno as "Emp #", ename as "Employee", job as "Job", hiredate as "Hire Date" from emp;
select ename||', '||job as "Employee and Title" from emp;
select empno||','||ename||','||job||','||mgr||','||hiredate||','||sal||','||comm||','||deptno as "THE_OUTPUT" from emp;
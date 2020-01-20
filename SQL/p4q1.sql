select ename, emp.deptno, dname from emp, dept where emp.deptno = dept.deptno;
select distinct job, loc from emp, dept where emp.deptno=dept.deptno and emp.deptno=30;
select ename, dname, loc from emp inner join dept on emp.deptno=dept.deptno where comm is not null;
select ename, dname from emp, dept where emp.deptno=dept.deptno and ename like '%A%';
select ename, job, emp.deptno, dname from emp, dept where emp.deptno=dept.deptno and loc='DALLAS';
select w.ename "Employee", w.empno "Emp#", m.ename "Manager", m.empno "Mgr#" from emp w, emp m where w.mgr=m.empno;
select w.ename "Employee", w.empno "Emp#", m.ename "Manager", m.empno "Mgr#" from emp w left outer join emp m on w.mgr=m.empno;
select w.deptno "DEPARTEMENT", w.ename "EMPLOYEE", c.ename "COLLEAGUE" from emp w, emp c where w.deptno = c.deptno and w.ename <> c.ename;
select ename, job, dname, sal, grade from emp, dept, salgrade where emp.deptno = dept.deptno and sal between losal and hisal;
select ename, hiredate from emp where hiredate < (select hiredate from emp  where ename='BLAKE');
select w.ename, w.hiredate, m.ename, m.hiredate from emp w, emp m where w.mgr=m.empno and w.hiredate < m.hiredate; 


select a.ename, a.hiredate from emp a inner join emp b on a.hiredate < b.hiredate where b.ename = 'BLAKE';


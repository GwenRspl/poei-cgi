select dept.dname, dept.loc, count(*) "Nombre de personnes", avg(emp.sal) "Salaire"
from emp, dept
where emp.deptno = dept.deptno
group by dept.dname, dept.loc
order by dept.dname
/
select dept.dname, dept.loc, count(emp.*) "Nombre de personnes", avg(emp.sal) "Salaire"
from emp inner join dept on emp.deptno = dept.deptno
group by dept.dname, dept.loc
order by dept.dname
/

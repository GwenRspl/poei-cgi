select emp.ename, emp.hiredate
from emp, emp blake 
where emp.hiredate < blake.hiredate
and blake.ename = 'BLAKE'
/
select emp.ename, emp.hiredate
from emp inner join emp b on emp.hiredate < b.hiredate
where b.ename = 'BLAKE'
/

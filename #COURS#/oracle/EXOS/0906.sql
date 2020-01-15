select emp_1.ename "Nom", emp_1.hiredate "Embauche", sum(emp_2.sal) as "Masse salariale"
from emp emp_1, emp emp_2
where emp_2.hiredate <= emp_1.hiredate
group by emp_1.ename, emp_1.hiredate
order by emp_1.hiredate
/

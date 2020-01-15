select ename, hiredate, to_char(hiredate, 'DAY') "Jour"
from emp
order by to_char(hiredate, 'D')
/

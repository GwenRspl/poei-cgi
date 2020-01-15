select ename, months_between(sysdate, hiredate) "Mois travailles"
from emp
--
order by months_between(sysdate, hiredate)
/

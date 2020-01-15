select rpad(ename,8) || rpad(' ', sal/100, 'Û') || sal "Employ‚s et leur salaire"
from emp
order by sal desc
/

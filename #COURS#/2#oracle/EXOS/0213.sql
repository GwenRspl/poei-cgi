select ename, sal, comm
from emp
where comm > sal * (1 + (10 / 100))
/
save "c:/sql/p2q13.sql"
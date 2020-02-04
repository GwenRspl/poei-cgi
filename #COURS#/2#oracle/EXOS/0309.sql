select initcap(ename) "Name", length(ename) "Longueur"
from emp
where substr(ename, 1, 1) in ('J', 'A', 'M')
/

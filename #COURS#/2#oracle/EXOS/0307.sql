select ename || ' gagne ' || trim(to_char(sal, 'L9,999.99')) || ' par mois mais veut ' || trim(to_char((sal * 3), 'L999,999.00')) "Salaire de reve"
from emp
/

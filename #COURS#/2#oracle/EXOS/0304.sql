select empno, ename, sal, round (sal * (1 + 15 / 100)) "Nouveau salaire", (round (sal * (1 + 15 / 100))) - sal "Augmentation"
from emp
/

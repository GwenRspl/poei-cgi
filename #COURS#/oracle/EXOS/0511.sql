select count(*) as total,
sum(decode(to_char(hiredate, 'YYYY'), '1980', 1, 0)) as "1980",
sum(decode(to_char(hiredate, 'YYYY'), '1981', 1, 0)) as "1981",
sum(decode(to_char(hiredate, 'YYYY'), '1982', 1, 0)) as "1982",
sum(decode(to_char(hiredate, 'YYYY'), '1983', 1, 0)) as "1983"
from emp
/

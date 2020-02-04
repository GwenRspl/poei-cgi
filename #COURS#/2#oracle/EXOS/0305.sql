select ename, hiredate,
       to_char(
         next_day(
			     add_months(
					   hiredate, 6),
			     'LUNDI'),
			   'Day,  Ddsp  Month, YYYY')
			 "Revision"
from emp
/

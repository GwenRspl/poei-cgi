select e.ename
from emp e
where not exists (select r.empno
             from emp r
						 where r.mgr = e.empno)
/
select e.ename
from emp e
where e.empno not in (select r.mgr
                      from emp r)
/
select 'NOT IN renvoie une valeur nulle donc rien ne sortira' reponse
from dual
/
select sysdate "Date" from dual;
select empno, ename, sal, round(sal+*1.15)) "New Salary" from emp;
select empno, ename, sal, round(sal+*1.15)) "New Salary", round(sal*1.15))-sal "Increase" from emp;
select ename, hiredate, to_char(next_day(add_months(hiredate,6),1),'day DD monthYYYY') "REVIEW" from emp;
select ename, round(months_between(sysdate, hiredate)) "MONTHS_WORKED" from emp order by months_between(sysdate, hiredate) desc;
select ename||' earns '||to_char(sal,'fm$99,999.00')||' monthly but wants '||to_char(sal*3,'fm$99,999.00')||'.' "Dream Salaries" from emp;
select ename, lpad(sal,15,'$') "SALARY" from emp; 
select initcap(ename) "Name", length(ename) "Length" from emp where ename like 'J%' or ename like 'A%' or ename like 'M%' ;
select ename, hiredate, to_char(hiredate,'DAY') "Day" from emp order by to_number(to_char(hiredate,'d')) ;
select ename, nvl(to_char(comm),'No Commission') "COMM" from emp;
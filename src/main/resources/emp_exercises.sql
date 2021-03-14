# 1. Să se selecteze deptno, enume, job și sal pentru angajatii care au sef-ul cu
# id-ul 7902.
SELECT DEPTNO, ENAME, JOB,SAL
FROM emp
WHERE MGR = 7902;


# 2. Să se selecteze numele, funcția și salariu pentru angajații care au aceași funcție.
SELECT DEPTNO,JOB,SAL
FROM emp
WHERE JOB = 'MANAGER';


# 3. Să se selecteze numele, funcția și salariul anual pentru toți angajații
# din același departament.
SELECT EMPNO,JOB,SAL*12 AS ANUAL_SALARY
FROM emp
WHERE DEPTNO =  10;


#4. Să se selecteze numele, funcția și venitul lunar pentru toți angajații care au venitul lunar
# mai mare de 2000. Venitul lunar este o funcție care are formula salariu + ifnull(comision, 0)
SELECT EMPNO,JOB,SAL
FROM emp
WHERE SAL>2000;


#5.Să se selecteze id-ul angajatului, numele, funcția și data angajării pentru toți angajații
# care au aceași funcție și au venit în firmă după o anumită dată.
SELECT EMPNO,ENAME,JOB,HIREDATE
FROM emp
WHERE JOB = 'ANALYST' AND  HIREDATE >'1980-12-17';


#6. Să se adauge 10 noi angajati.
INSERT INTO emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
    VALUE (7855, 'FANE', 'MANAGER', 6666, '2015-10-02', 3300, 100, 10);
INSERT INTO emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
    VALUE (7775, 'DAN', 'MANAGER', 6667, '2020-10-02', 5000, 100, 20);
INSERT INTO emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
    VALUE (8085, 'ALEX', 'MANAGER', 6647, '2019-01-02', 4040, 300, 10);
INSERT INTO emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
    VALUE (7785, 'CHELUTU', 'CLERK', 3366, '2021-01-01', 1000, 100, 20);
INSERT INTO emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
    VALUE (7985, 'CEZAR', 'CLERK', 3166, '2020-06-05', 3900, 100, 10);
INSERT INTO emp(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
    VALUE (7995, 'MAXIM', 'PRESIDENT', 8966, '2020-05-05', 8000, 100, 20);


#7. Să se calculeze o primă de 15% pentur toți angajații din departamentul 20.
SELECT ENAME,SAL*0.15 AS BONUS
FROM emp
WHERE DEPTNO =  20;


#8. Să se selecteze id-ul și numele departamentului din tabela departamente.
SELECT DEPTNO,DNAME
FROM dept;


#9. Să se selecteze id-ul, numele, funcția și data angajării pentru toți angajații din firmă.
# Ordonați descrescător în funcție de id. Concatenați id-ul cu numele.
SELECT CONCAT(EMPNO,ENAME) AS CONCATENATE,JOB,HIREDATE
FROM emp
  ORDER BY EMPNO DESC;


#10. Să se selecteze id-ul, numele, fucția și venitul lunar pentru toți angajatii din firmă.
# Să se adauge la select o coloană goală care să se numească semnătura.
# Concatenați id-ul cu numele. Ordonați după departament.
ALTER TABLE emp
    ADD SEMNATURA varchar(10);
SELECT CONCAT(EMPNO,ENAME)
           AS CONCAT,JOB,SAL
FROM emp
ORDER BY DEPTNO;


#11. Să se selecteze numele și funcția angajaților.
SELECT ENAME,JOB
FROM emp;


#12 Să se facă o listă cu numele departamentului și codul acestuia. Ordonați după numele departamentului.
SELECT DNAME , DEPTNO
FROM dept
ORDER BY DNAME ASC ;


#13. Să se selecteze toți angajații care au funcția manager. Ordonați după id-ul departamentulu
SELECT ENAME,DEPTNO
FROM emp
WHERE JOB = 'MANAGER'
ORDER BY DEPTNO;


#14 Selectați toate persoanele care s-au angajat intr-o anumită perioadă aleasa de voi.
SELECT ENAME,HIREDATE
FROM emp
WHERE HIREDATE BETWEEN '1980-10-01' AND '2015-01-02';


#15Să se listeze id-ul, numele, funcția, venitul lunar pentru angajații care au următoarele id-uri: 7499,7902, 7876
SELECT EMPNO,ENAME,JOB,SAL
FROM emp
WHERE EMPNO IN (7499,7902,7876)
ORDER BY ENAME;


#16. Să se selecteze toate persoanele care au fost angajate în anul 1980
SELECT EMPNO, ENAME, JOB, MGR, HIREDATE,
       EXTRACT(YEAR FROM HIREDATE )
FROM emp
GROUP BY EXTRACT(YEAR FROM HIREDATE = 1980);

#17. Să se selecteze toate persoanele al căror nume începe cu litera F și numele funcției are 7 caractere.
SELECT ENAME AS "INCEPE CU F" , JOB
FROM emp
WHERE ENAME LIKE 'F%' AND JOB LIKE '_______';


#18. Să se listeze angajații din departamentul 20 care nu au primit comision.
SELECT ENAME,COMM,DEPTNO
FROM emp
WHERE COMM = 0 OR COMM IS NULL AND DEPTNO =20;


#19. Să se listeze angajații care au primit comision și au funcția SALESMAN
SELECT ENAME,COMM,JOB
FROM emp
WHERE JOB ='SALESMAN'AND COMM IS NOT NULL;

#20. Să se selecteze toți angajații care au funcția MANAGER și salariul peste 1500 și
# toți angajații care au funcția ANALYST.
SELECT ENAME,JOB,SAL
FROM emp
WHERE (JOB = 'MANAGER' AND SAL>1500) OR JOB='ANALYST';

#21. Selectați toți angajații care s-au angajat înainte de anul 1982 și nu au primit comision.
SELECT EMPNO, ENAME, JOB, MGR,  EXTRACT(YEAR FROM HIREDATE ),COMM
FROM emp
WHERE EXTRACT(YEAR FROM HIREDATE )<=1982 AND COMM IS NULL OR COMM =0;

#22. Selectați toți angajații care au salariul peste 3000 și nu au șefi, ordonați după departament.
SELECT ENAME, SAL,DEPTNO
FROM emp
WHERE SAL > 3000
 ORDER BY DEPTNO ASC ;

#23. Selectați numele, funcția și venitul anual al angajaților care nu au
# funcția MANAGER pentru un departament ales de voi.
SELECT ENAME,JOB,SAL,JOB
FROM emp
WHERE JOB !='MANAGER' AND DEPTNO = 20;


#24. Selectați departamentul, numele, data angajării și salariul tuturor persoanelor
# angajate în anul 1981 din două departamente alese de voi.

SELECT DEPTNO,ENAME,EXTRACT(YEAR FROM HIREDATE),SAL
FROM emp
WHERE (DEPTNO = 10 OR DEPTNO= 20)
  AND EXTRACT(YEAR FROM HIREDATE)=1981;

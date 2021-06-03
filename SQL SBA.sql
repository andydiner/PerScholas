#-----------------------2.3A
SELECT d.name, count(c.id) as countCourse
FROM department d JOIN course c ON d.id = c.deptID WHERE d.id = c.deptID
GROUP BY d.id
ORDER BY countCourse, d.name ASC;

#-----------------------3.3B
SELECT c.name as courseName, COUNT(sc.studentID) as studentCount
FROM course c JOIN studentCourse sc ON sc.courseID = c.id
GROUP BY c.name
ORDER BY studentCount DESC, courseName ASC;

#-----------------------4.3C1
SELECT c.name
FROM course c LEFT JOIN facultyCourse fc ON c.id = fc.courseID
WHERE fc.courseID IS NULL
ORDER BY c.name ASC;

#-----------------------5.3C2
SELECT c.name, COUNT(sc.studentid) as studentCount
FROM course c LEFT JOIN facultyCourse fc ON c.id = fc.courseID
JOIN studentcourse sc on sc.courseID = c.id
WHERE fc.courseid IS NULL
GROUP BY name
ORDER BY studentcount DESC, c.name ASC;

#-----------------------6.3D
SELECT COUNT(DISTINCT(s.id)) AS "Students", YEAR(sc.startDate) AS Year
FROM studentCourse sc LEFT JOIN student s ON sc.studentID = s.id
GROUP BY Year
ORDER BY 2 ASC, 1 DESC;

#-----------------------7.3E
SELECT studc.startDate, COUNT(DISTINCT(studc.studentID))
FROM studentCourse studc WHERE DATE_FORMAT(studc.startDate, '%m') = 8
GROUP BY DATE_FORMAT(studc.startDate, '%Y'), studc.startDate ORDER BY 1 ASC, 2 ASC;

#-----------------------8.3F
SELECT s.firstname, s.lastname, COUNT(sc.courseid) as coursenumber
FROM student s LEFT JOIN studentCourse sc ON s.id = sc.studentId 
JOIN department d ON d.id = s.majorid
JOIN course c ON c.id = sc.courseid
WHERE c.deptid = d.id AND sc.courseid = c.id
GROUP BY s.id
ORDER by courseNumber DESC, s.firstname ASC, s.lastname ASC;

#------------------------9.3G
SELECT s.firstname, s.lastname, ROUND(AVG(sc.progress), 1) AS averageScore
FROM student s JOIN studentCourse sc on s.id = sc.studentID
GROUP BY sc.studentID
HAVING averageScore < 50
ORDER BY 3 DESC, 1 ASC, 2 ASC;

#-----------------------10.3H
SELECT c.name, ROUND(avg(sc.progress),1) as averCourse
FROM studentCourse sc JOIN course c ON sc.courseID = c.id
GROUP BY sc.courseID
ORDER BY averCourse DESC, c.name ASC

#----------------------11.3H2
SELECT c.name, ROUND(AVG(sc.progress), 1) as averCourse
FROM studentcourse sc JOIN course c ON sc.courseID = c.id   
GROUP BY sc.courseid
ORDER BY averCourse DESC, c.name ASC
LIMIT 1

#----------------------12.3H3
SELECT f.firstName, f.lastName, ROUND(avg(progress), 1) as ave
FROM faculty f LEFT JOIN facultyCourse fc ON f.id = fc.facultyID
LEFT JOIN course c ON fc.courseID = c.id
LEFT JOIN studentCourse sc ON sc.courseID = c.id
GROUP BY f.id
ORDER BY ave DESC, f.firstName asc, f.lastname ASC

#---------------------13.3H4
SELECT f.firstName, f.lastName, ROUND(avg(sc.progress), 1) as ave
FROM faculty f LEFT JOIN facultyCourse fc ON f.id = fc.facultyID
LEFT JOIN course c ON fc.courseID = c.id
LEFT JOIN studentCourse sc ON sc.courseID = c.id
GROUP BY f.id
HAVING ave > (.9 * (SELECT ROUND(AVG(progress), 1) from studentcourse GROUP BY courseid order by 1 DESC LIMIT 1))
ORDER BY 3 DESC, 1 asc, 2 ASC;

#-------------------14.3I
SELECT s.firstname, s.lastname, 
CASE 
    WHEN MIN(sc.progress) < 40 THEN 'F'
    WHEN MIN(sc.progress) < 50 THEN 'D'
    WHEN MIN(sc.progress) < 60 THEN 'C'
    WHEN MIN(sc.progress) < 70 THEN 'B'
    ELSE 'A' END AS minGrade,
    
CASE 
    WHEN MAX(sc.progress) < 40 THEN 'F'
    WHEN MAX(sc.progress) < 50 THEN 'D'
    WHEN MAX(sc.progress) < 60 THEN 'C'
    WHEN MAX(sc.progress) < 70 THEN 'B'
    ELSE 'A' END AS maxGrade
FROM student s JOIN studentcourse sc ON s.id = sc.studentID
GROUP BY s.id
ORDER BY 3 DESC, 4 DESC, 1 ASC, 2 ASC
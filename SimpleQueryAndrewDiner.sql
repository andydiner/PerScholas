/*Part One */

SELECT cust.customerName AS 'Name',
prod.productLine AS 'Product Line', prod.buyPrice AS 'Buy Price'
FROM customers cust, products prod
ORDER BY prod.buyPrice DESC;

/*Part Two */

SELECT cust.contactFirstName AS 'First Name',
cust.contactLastName AS 'Last Name', cust.city AS 'City'
FROM customers cust
WHERE cust.country = 'Germany'
ORDER BY cust.contactLastName ASC;

/*Part Three */

SELECT DISTINCT orders.status
FROM orders
ORDER BY orders.status;

/*Part Four */

SELECT *
FROM payments pay
WHERE pay.paymentDate >= '2005-01-01';

/*Part FIve */

SELECT emp.lastName AS 'Last Name', emp.firstName AS 'First Name',
 emp.email AS 'Email', emp.jobTitle AS 'Job Title'
FROM employees emp, offices off
WHERE emp.officeCode = off.officeCode
AND off.city = 'San Francisco'
ORDER BY emp.lastName;

/*Part Six */

SELECT prod.productName AS 'Name', prod.productLine AS 'Product Line',
prod.productScale AS 'Scale', prod.productVendor AS 'Vendor'
FROM products prod
WHERE prod.productLine = 'Vintage Cars' OR prod.productLine = 'Classic Cars'
ORDER BY prod.productNAme ASC;
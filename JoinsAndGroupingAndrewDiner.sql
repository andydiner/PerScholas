#1. Write a query to display each customer’s name (as “Customer Name”)
# alongside the name of the employee who is responsible for 
#that customer’s orders. The employee name should be in a
# single “Sales Rep” column formatted as “lastName, firstName”.
# The output should be sorted alphabetically by customer name.

SELECT c.customerName AS 'Customer Name',
CONCAT(e.lastName, ', ', e.firstName) AS 'Sales Rep'
FROM customers c JOIN employees e
ON c.salesRepEmployeeNumber = e.employeeNumber
ORDER BY c.customerName;

#2. Determine which products are most popular with our customers. 
#For each product, list the total quantity ordered along with
# the total sale generated (total quantity ordered * priceEach)
# for that product. The column headers should be “Product Name”,
# “Total # Ordered” and “Total Sale”. List the products 
#by Total Sale descending.

SELECT p.productName AS 'Product Name',
(od.priceEach * od.quantityOrdered) AS 'Total Sale',
od.quantityOrdered AS 'Total # Ordered'
FROM products p JOIN orderdetails od ON p.productCode = od.productCode
GROUP BY p.productName
ORDER BY (od.priceEach* od.quantityOrdered) DESC;

#3. Write a query which lists order status and the # of orders with that
# status. Column headers should be “Order Status” and “# Orders”.
# Sort alphabetically by status.

SELECT o.`status` AS 'Order Status',  COUNT(o.orderNumber) AS '# Orders'
FROM orders o
GROUP BY o.`status`
ORDER BY o.`status` ASC;

#4. Write a query to list, for each product line, the total # of products sold
# from that product line. The first column should be “Product Line” and 
#the second should be “# Sold”. Order by the second column descending.

SELECT p.productLine, COUNT(od.quantityOrdered) AS '# Sold'
FROM products p JOIN  orderdetails od ON p.productCode = od.productCode 
GROUP BY p.productLine
ORDER BY COUNT(od.quantityOrdered) DESC;

#5. For each employee who represents customers, output the total # of orders
# that employee’s customers have placed alongside the total sale amount
# of those orders. The employee name should be output as a single column named
# “Sales Rep” formatted as “lastName, firstName”. 
#The second column should be titled “# Orders” and the third should be
#“Total Sales”. Sort the output by Total Sales descending. 
#Only (and all) employees with the job title ‘Sales Rep’ should be included 
#in the output, and if the employee made no sales the Total Sales should
# display as “0.00”.

SELECT 
CONCAT(e.lastName, ', ', e.firstName) AS 'Sales Rep',
COUNT(od.quantityOrdered) AS '# Orders',
#SUM(od.quantityOrdered * od.priceEach) AS 'Total Sales'
case
	when count(o.orderNumber)=0 then 0.00
    else sum(od.quantityOrdered * od.priceEach)
end as 'Total Sales'
FROM employees e left JOIN customers c
ON c.salesRepEmployeeNumber = e.employeeNumber
left JOIN orders o ON o.customerNumber = c.customerNumber
left JOIN orderdetails od ON od.orderNumber = o.orderNumber
WHERE e.jobTitle = 'Sales Rep'
GROUP BY e.lastName, e.firstName
ORDER BY 3 DESC;
 
#6. Your product team is requesting data to help them create a bar-chart 
#of monthly sales since the company’s inception. Write a query to output
# the month (January, February, etc.), 4-digit year, and total sales for 
#that month. The first column should be labeled ‘Month’, the second ‘Year’,
# and the third should be ‘Payments Received’. Values in the third column 
#should be formatted as numbers with two decimals – for example: 694,292.68.

SELECT DATE_FORMAT(p.paymentDate, "%M") AS 'Month', YEAR(p.paymentDate) AS 'Year',
SUM(p.amount) AS 'Payments Received'
FROM payments p
Group BY 1, 2
ORDER BY YEAR(p.paymentDate), MONTH(p.paymentDate);

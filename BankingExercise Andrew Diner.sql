#1. For each product, show the product name "Product" and the product type name "Type".
SELECT p.NAME AS 'Product', pt.PRODUCT_TYPE_CD AS 'Type'
FROM product p, product_type pt;

#2. For each branch, list the branch name and city,
# plus last name and title of each employee who works in that branch.
SELECT b.NAME AS 'Branch Name', b.CITY AS 'City', e.LAST_NAME AS 'Last Name',
e.TITLE AS 'Title'
FROM branch b JOIN employee e ON b.BRANCH_ID = e.ASSIGNED_BRANCH_ID;

#3. Show a list of each unique employee title.
SELECT DISTINCT e.TITLE
FROM employee e;

#4. Show the last name and title of each employee,
# along with the last name and title of that employee's boss.
SELECT e.LAST_NAME AS 'Emp LName', e.TITLE AS 'Emp Title',
m.LAST_NAME AS 'Boss LName', m.TITLE AS 'Boss Title'
FROM employee e JOIN employee m ON e.SUPERIOR_EMP_ID = m.EMP_ID
ORDER BY e.LAST_NAME;

#5. For each account, show the name of the account's product,
# the available balance, and the customer's last name.
SELECT p.NAME, a.AVAIL_BALANCE, i.LAST_NAME 
FROM customer c JOIN account a ON c.CUST_ID = a.CUST_ID
JOIN product p ON p.PRODUCT_CD = a.PRODUCT_CD
JOIN individual i ON i.CUST_ID = c.CUST_ID
ORDER BY i.LAST_NAME;

#6. List all account transaction details for
# individual customers whose last name starts with 'T'.

SELECT i.LAST_NAME, AT.*, a.*
FROM individual i JOIN customer c ON i.CUST_ID = c.CUST_ID
JOIN account a ON a.CUST_ID = c.CUST_ID
JOIN acc_transaction AT ON AT.ACCOUNT_ID = a.ACCOUNT_ID
WHERE i.LAST_NAME LIKE 'T%'


#1. Create a query to return all orders made by users with the first name of “Marion”
SELECT DISTINCT * FROM orders o JOIN users u USING(USER_ID)
WHERE u.FIRST_NAME = 'Marion';

#2. Create a query to select all users that have not made an order

SELECT * FROM users LEFT JOIN orders USING(user_ID) WHERE order_ID IS NULL ;

#3. Create a Query to select the names and prices of all items that
#have been part of 2 or more separate orders

SELECT i.ITEM_ID, i.NAME, i.PRICE
FROM items i LEFT JOIN order_items oi USING(item_id) 
 WHERE 1 < (SELECT count(oi.ORDER_ID) FROM order_items o)
GROUP BY i.item_id;

#4. Create a query to return the Order Id, Item name, Item Price, and Quantity from
# orders made at stores in the city “New York”. Order by Order Id in ascending order

SELECT o.ORDER_ID, NAME, price, quantity, city
FROM orders o, (SELECT i.NAME, i.PRICE FROM items i GROUP BY NAME) AS itemsalias,
(SELECT quantity FROM order_items oi GROUP BY item_id) AS oialias,
(SELECT store_id as validStore, s.city AS city FROM stores s WHERE s.city = 'New York') AS sAlias
ORDER BY order_id ASC;


#5. Your boss would like you to create a query that calculates the total
# revenue generated
#by each item. Revenue for an item can be found as (Item Price * Total Quantity
#Ordered). Please return the first column as ‘ITEM_NAME’ and the second column as
#‘REVENUE’.

SELECT i.NAME AS ITEM_NAME, sum(oi.QUANTITY * i.PRICE) AS REVENUE
FROM order_items oi JOIN items i
GROUP BY i.NAME
ORDER BY Revenue DESC;

#6. Create a query with the following output:
#a. Column 1 - Store Name
#i. The name of each store
#b. Column 2 - Order Quantity
#i. The number of times an order has been made in this store
#c. Column 3 - Sales Figure
#i. If the store has been involved in more than 3 orders, mark as ‘High’
#ii. If the store has been involved in less than 3 orders but more than 1 order,
#mark as ‘Medium’
#iii. If the store has been involved with 1 or less orders, mark as ‘Low’
#d. Should be ordered by the Order Quantity in Descending Order

SELECT  st.NAME, COUNT(st.NAME) AS ORDER_QUANTITY, 
	case	when COUNT(st.NAME) > 3 then 'HIGH'
			when COUNT(st.NAME) BETWEEN 2 AND 3 then 'MEDIUM'
			ELSE 'LOW'
		END AS SALES_FIGURE													
FROM stores st JOIN orders o ON st.STORE_ID=o.STORE_ID
GROUP BY st.name
ORDER BY 2 DESC;

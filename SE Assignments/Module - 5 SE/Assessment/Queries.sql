-- Create table product containing id, name, price and product code

CREATE TABLE product (
    PRO_ID INT PRIMARY KEY, 
    PRO_NAME VARCHAR(20), 
    PRO_PRICE INT, 
    PRO_CODE INT
);

INSERT INTO product VALUES 
(101, 'Mother Board', 3200, 15), 
(102, 'Key Board', 450, 16), 
(103, 'ZIP Drive', 250, 14), 
(104, 'Speaker', 550, 16)
(105, 'Monitor', 5000, 11)
(106, 'DVD Drive', 900, 12)
(107, 'CD Drive', 800, 12)
(108, 'Printer', 2600, 13)
(109, 'Refill Cartridge', 350, 13)
(110, 'Mouse', 250, 12);


-- Write sql query to find the items whose prices are higher than or equal 250rs. Order the result by product price in descending, then product name in ascending. Return pro_name and pro_price 

SELECT pro_name, pro_price FROM product WHERE pro_price >= 250 ORDER BY pro_price DESC, pro_name ASC;


-- Write a sql query to find the cheapest item. Return pro_name and pro_price.

SELECT pro_name, pro_price FROM product WHERE pro_price = (SELECT MIN(pro_price) FROM product);


-- Write the sql query to calculate the average price of the items for each company. Return average price and company code.

SELECT AVG(pro_price), pro_code FROM product GROUP BY pro_code;


-- Write the sql query to find the average total for all the product mention in the table 

SELECT AVG(pro_price) FROM product;
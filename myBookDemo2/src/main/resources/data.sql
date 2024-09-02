INSERT INTO BOOKS (NAME, PRICE, PAGE_COUNT, AUTHOR) VALUES
('INGILAB', 2000, 500, 'ALI'),
('SEHRA', 1500, 300, 'MEHMET'),
('GUNESIN OTESINDE', 2200, 450, 'AYSEL'),
('KARANLIK', 1800, 600, 'DENIZ'),
('HAYATIN ICINDEN', 2500, 350, 'ZEYNEP'),
('UZAK DIYARLAR', 1700, 400, 'ORHAN'),
('GECE VE GUNDUZ', 2100, 520, 'ELIF'),
('YENI DUNYA', 2300, 480, 'BURAK'),
('GIZLI BAHCE', 1600, 310, 'FATMA'),
('SONBAHAR', 2000, 420, 'MURAT');
-- Insert sample data into the products table
INSERT INTO products (name, price) VALUES ('Product A', 10.50);
INSERT INTO products (name, price) VALUES ('Product B', 20.75);
INSERT INTO products (name, price) VALUES ('Product C', 15.00);

-- Insert sample data into the costumer table
INSERT INTO costumer (name, phone) VALUES ('John Doe', 1234567890);
INSERT INTO costumer (name, phone) VALUES ('Jane Smith', 9876543210);

-- Insert sample data into the orders table
INSERT INTO orders (price, costumer_id) VALUES (30.00, 1); -- Assuming John Doe with id 1
INSERT INTO orders (price, costumer_id) VALUES (50.00, 2); -- Assuming Jane Smith with id 2

-- Insert sample data into the order_detail table
INSERT INTO order_detail (quantity, product_id, order_id) VALUES (2, 1, 1); -- 2 of Product A in order 1
INSERT INTO order_detail (quantity, product_id, order_id) VALUES (1, 2, 1); -- 1 of Product B in order 1
INSERT INTO order_detail (quantity, product_id, order_id) VALUES (3, 3, 2); -- 3 of Product C in order 2

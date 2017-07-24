INSERT INTO PRODUCT (title, description, price, image) VALUES ('Meat grinder','Grinds whatever and whoever you like!','10.99','https://images-na.ssl-images-amazon.com/images/I/81Newxu%2BV0L._SL1500_.jpg');

INSERT INTO SHOP_ORDER (total_amount, currency, address_id) VALUES ('123.45','EUR','1');

INSERT INTO ORDER_ITEM (order_id, product_id, quantity) VALUES ('1', '1', '11');

INSERT INTO ADDRESS (name, street, city, zip_code, country) VALUES ('Max Mustermann', 'Sonnenstr. 15', 'München', '80331', 'Deutschland');

INSERT INTO PRODUCT (title, description, price, image) VALUES ('Meat grinder','Grinds whatever and whoever you like!','10.99','https://images-na.ssl-images-amazon.com/images/I/81Newxu%2BV0L._SL1500_.jpg');
INSERT INTO PRODUCT (title, description, price, image) VALUES ('Cat carrier','Carry your cat with you everywhere','24.99','https://data.motor-talk.de/data/galleries/0/30/457/37503639/cat-carrier-8506385751080878166.jpg');
INSERT INTO PRODUCT (title, description, price, image) VALUES ('Fox tail','Feel foxy','4.99','http://www.dhresource.com/webp/m/0x0s/f2-albu-g5-M00-CE-60-rBVaI1kmjAaATDfFAAHOk-F6EZk006.jpg/big-fox-tail-metal-anal-plug-sex-anal-toys-butt-plug-cosplay-3-size-for-choice.jpg');
INSERT INTO PRODUCT (title, description, price, image) VALUES ('Horse head','No need to be shy','8.99','https://images-na.ssl-images-amazon.com/images/I/51NhtW9exnL._SX355_.jpg');


INSERT INTO SHOP_ORDER (total_amount, currency, address_id) VALUES ('123.45','EUR','1');

INSERT INTO ORDER_ITEM (order_id, product_id, quantity) VALUES ('1', '1', '11');

INSERT INTO ADDRESS (name, street, city, zip_code, country) VALUES ('Max Mustermann', 'Sonnenstr. 15', 'München', '80331', 'Deutschland');

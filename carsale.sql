CREATE DATABASE carsale CHARACTER SET utf8 COLLATE utf8_general_ci;
use carsale;
CREATE TABLE description(
	des_id INT AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	content VARCHAR(500) NOT NULL,
	type_des VARCHAR(50) NOT NULL,
	PRIMARY KEY(des_id)
);
CREATE TABLE image(
	image_id INT AUTO_INCREMENT,
	url VARCHAR(100) NOT NULL,
	type_image VARCHAR(50) NOT NULL, -- loai image: post, car, spec
	PRIMARY KEY(image_id)
);
CREATE TABLE car(
	car_id INT AUTO_INCREMENT,
	car_name VARCHAR(50) NOT null,
	category VARCHAR(50) NOT NULL,
	status VARCHAR(50) NOT NULL,
	des VARCHAR(200) NOT NULL,
	image_id INT NOT NULL, -- avatar image
	des_id INT NOT NULL,
	PRIMARY KEY(car_id),
	FOREIGN KEY (des_id) REFERENCES description(des_id),
	FOREIGN KEY(image_id) REFERENCES image(image_id)
	
);
CREATE TABLE user(
	user_id INT AUTO_INCREMENT,
	full_name VARCHAR(100) NOT null,
	age INT NOT NULL,
	phone VARCHAR(20) NOT NULL,
	email VARCHAR(50) NOT NULL,
	address VARCHAR(50) NOT NULL,
	username VARCHAR(50),
	pass VARCHAR(50),
	role VARCHAR(20) NOT NULL,
	PRIMARY KEY(user_id)
);
CREATE TABLE comment(
	comment_id INT AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	content VARCHAR(500) NOT NULL,
	time_comment DATE NOT NULL,
	user_id INT NOT NULL,
	PRIMARY KEY(comment_id),
	FOREIGN KEY (user_id) REFERENCES user(user_id)
);
CREATE TABLE post(
	post_id INT AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	content VARCHAR(500) NOT NULL,
	time_update DATE NOT NULL,
	comment_id INT ,
	user_id INT NOT NULL,
	TYPE VARCHAR(50) NOT NULL,
	PRIMARY KEY (post_id),
	FOREIGN KEY (user_id) REFERENCES user(user_id),
	FOREIGN KEY (comment_id) REFERENCES comment(comment_id)
);
CREATE TABLE spec(
	spec_id INT AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	spec_name VARCHAR(50) NOT NULL,
	des VARCHAR(200) NOT NULL,
	dram VARCHAR(20) NOT NULL,
	detail VARCHAR(50) NOT NULL,
	car_id INT NOT NULL,
	image_id INT NOT NULL,
	PRIMARY KEY (spec_id),
	FOREIGN KEY(car_id) REFERENCES car(car_id),
	FOREIGN KEY(image_id) REFERENCES image(image_id)
);
CREATE TABLE city_fee(
	city_fee_id INT AUTO_INCREMENT,
 	city_name VARCHAR(50) NOT NULL,
 	tax DOUBLE  NOT NULL,
 	registration DOUBLE  NOT NULL,
 	insurrance DOUBLE  NOT NULL,
 	license_plate DOUBLE  NOT NULL,
 	PRIMARY KEY(city_fee_id)
);
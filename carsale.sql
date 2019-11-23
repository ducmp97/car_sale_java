CREATE TABLE description(
	des_id INT AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	content VARCHAR(500) NOT NULL,
	type_des VARCHAR(50) NOT NULL,
	image_id INT,
	PRIMARY KEY(des_id),
	FOREIGN KEY(image_id) REFERENCES image(image_id)
);
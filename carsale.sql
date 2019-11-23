CREATE TABLE spec(
	spec_id INT AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	spec_name VARCHAR(50) NOT NULL,
	des VARCHAR(200) NOT NULL,
	dram VARCHAR(20) NOT NULL,
	detail VARCHAR(50) NOT NULL,
	car_id INT NOT NULL,
	PRIMARY KEY (spec_id),
	FOREIGN KEY(car_id) REFERENCES car(car_id)
);
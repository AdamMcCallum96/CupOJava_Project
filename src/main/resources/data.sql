DROP TABLE IF EXISTS transitUsers;

CREATE TABLE transitUsers (
	id INT AUTO_INCREMENT PRIMARY KEY,
	username varchar(250) NOT NULL,
	password varchar(250) NOT NULL,
	firstName varchar(250) NOT NULL,
	lastName varchar(250) NOT NULL,
	UNIQUE (username)
);


insert into transitUsers (username, password, firstName, lastName) VALUES
('whatUsername','thisIsMyPassword','Adam','McCallum'),
('JohnIsFire','john618811','John','Deets'),
('MrAwesome','250geoleo','Peter','Smith');


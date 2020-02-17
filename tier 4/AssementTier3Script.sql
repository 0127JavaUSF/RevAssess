CREATE TABLE USER_ROLE( 
	role_id serial PRIMARY KEY,
	name varchar(50) UNIQUE NOT null
);

CREATE TABLE CATEGORY(
	category_id serial PRIMARY KEY,
	name varchar(50) UNIQUE NOT null
);

CREATE TABLE FLASHCARD( 
	flashcard_id serial PRIMARY KEY,
	question varchar(250) UNIQUE NOT NULL,
	answer varchar(25) NOT NULL,
	category_id int REFERENCES Category(category_id)
);

CREATE TABLE APP_USER( 
	user_id serial PRIMARY KEY,
	username varchar(50) UNIQUE NOT NULL,
	password varchar(50) NOT NULL,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NOT NULL,
	role_id int REFERENCES USER_ROLE(role_id)
);

CREATE TABLE STUDY_SET( 
	study_set_id serial PRIMARY KEY,
	name varchar(50) UNIQUE NOT NULL,
	owner_id int REFERENCES APP_USER(user_id)
);

CREATE TABLE STUDY_SET_CARD( 
	study_set_id int REFERENCES STUDY_SET(study_set_id),
	flashcard_id int REFERENCES FLASHCARD(flashcard_id),
	PRIMARY KEY(study_set_id, flashcard_id)
);

SELECT user_id, first_name, last_name, username, password, USER_ROLE.name FROM APP_USER 
	LEFT JOIN USER_ROLE ON USER_ROLE.role_id = APP_USER.role_id 
	WHERE user_id = 0;

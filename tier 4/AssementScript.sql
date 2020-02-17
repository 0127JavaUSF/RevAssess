-- question a
SELECT * FROM APP_USER 
	LEFT JOIN APP_USER ON APP_USER.ROLE_ID = USER_ROLE.ROLE_ID
	WHERE USER_ROLE.name = BASIC_USER;
-- quesiton b
INSERT INTO APP_USER (user_id, username, password, first_name, last_name, role_id) 
SELECT name FROM USER_ROLE AS newUserRole WHERE name = PREMIUM_USER;
VALUES (1,revature,floridaiscool,john,doe, newUserRole);

-- question c
SELECT app_user.user_id, app_user.username, app_user.password, app_user.first_name, app_user.last_name, study_set.study_set_id, study_set.name, study_set.owner_id FROM APP_USER
	LEFT JOIN APP_USER ON APP_USER.USER_ID = STUDY_SET.OWNER_ID
	WHERE APP_USER.USER_ID = 4;
--question d
SELECT user_role.name, app_user.username, category.name, flashcard.question, flashcard.answer FROM flashcard
	INNER JOIN flashcard.category_id = category.category_id
	INNER JOIN study_set ON flashcard.flashcard_id = study_set.study_set_id
	INNER JOIN app_user ON app_user.user_id = study_set.owner_id
	INNER JOIN user_role ON user_role.id = app_user.role_id
	WHERE study_set_id = 1;


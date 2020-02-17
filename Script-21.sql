1)
SELECT * FROM APP_USER
INNER JOIN USER_ROLE
ON USER_ROLE.role_id = APP_USER.role_id
WHERE USER_ROLE.role_id = BASIC_USER

2)
INSERT INTO APP_USER (user_id, username, PASSWORD, first_name, last_name, role_id)
VALUES (5, 'user', 'pass', 'josh', 'vent', '2');
INSERT INTO USER_ROLE (role_id, name)
VALUES (2, PREMIUM_USER);

3) 
SELECT * FROM APP_USER
INNER JOIN USER_ROLE
ON USER_ROLE.role_id = APP_USER.role_id
INNER JOIN STUDY_SET
ON STUDY_SET.owner_id = user_id
where user_id = 4
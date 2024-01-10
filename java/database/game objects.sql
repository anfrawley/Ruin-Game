START TRANSACTION;
--ROLLBACK;

INSERT INTO armor_type (armor_type_id, armor_type) VALUES
	(1, 'Light'),
	(2, 'Medium'),
	(3, 'Heavy');
	
INSERT INTO weapon_type (weapon_type_id, weapon_type) VALUES
	(1, 'Dagger'),
	(2, 'Sword'),
	(3, 'Great Sword')
	(4, 'War Hammer')
	(5, 'Great Hammer'),
	(6, 'Battle Axe'),
	(7, 'Great Axe'),
	(8, 'Knuckles'),
	(9, 'Short Bow'),
	(10, 'Long Bow'),
	(11, 'Great Bow'),
	(12, 'Crossbow'),
	(13, 'Slingshot'),
	

INSERT INTO character_class (class_name, class_type) VALUES
	('Barbarian', 'Heavy');

INSERT INTO weapon (weapon_name, attack_value, weapon_type, class_bonus) VALUES
	('Sturdy stick', 5, 'Sword', 1);
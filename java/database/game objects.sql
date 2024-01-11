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
	(14, 'Wand'),
	(15, 'Scepter'),
	(16, 'Staff'),
	(17, 'Source Orb');
	
INSERT INTO potion_type (potion_type_id, potion_type) VALUES
	(1, 'Health'),
	(2, 'Stamina'),
	(3, 'Willpower');
	
INSERT INTO crafting_item_type (crafting_item_type_id, crafting_item_type) VALUES
	(1, 'Weapons and Armor'),
	(2, 'Potion'),
	(3, 'Soul Jar');

INSERT INTO soul_jar_size (soul_jar_size_id, soul_jar_size) VALUES
	(1, 'Small'),
	(2, 'Medium'),
	(3, 'Large'),
	(4, 'Massive');

INSERT INTO class_type (class_type_id, class_type) VALUES
	(1, 'Light'),
	(2, 'Medium'),
	(3, 'Heavy'),
	(4, 'Magic');
	
INSERT INTO character_class (class_name, class_type_id) VALUES
	('Marksman', 1),
	('Rogue', 1),
	('Warrior', 2),
	('Hunter', 2),
	('Barbarian', 3),
	('Knight', 3),
	('Sorcerer', 4),
	('Priest', 4);

INSERT INTO weapon (weapon_name, attack_value, weapon_type, class_type_bonus) VALUES
	('Sturdy stick', 5, 'Sword', 2),
	('Wooden Sword', 8 'Sword', 2),
	
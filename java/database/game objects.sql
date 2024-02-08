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
	(11, 'Crossbow'),
	(12, 'Wand'),
	(13, 'Source Orb');
	
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

--Daggers
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id, class_type_bonus) VALUES
	('Rusty Kitchen Knife', 3, 1, 1),
	('Bronze Dagger', 5, 1, 1),
	('Iron Dagger', 8, 1, 1),
	('Steel Dagger', 12, 1, 1),
	('Twin Bronze Daggers', 10, 1, 1),
	('Twin Iron Daggers', 16, 1, 1),
	('Twin Steel Daggers', 24, 1, 1),
	('Strohms Daggers', 35, 1, 1);

--Swords
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id, class_type_bonus) VALUES
	('Rusty Damaged Sword', 5, 2, 2),
	('Bronze Sword', 10, 2, 2),
	('Iron Sword', 15, 2, 2),
	('Steel Sword', 20, 2, 2),
	('Hardened Steel Sword', 25, 2, 2),
	('Onyx Sword', 30, 2, 2),
	('Maldreds Sword', 42, 2, 2);

--Great Swords
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id, class_type_bonus) VALUES
	('Rusty Damaged Great Sword', 8, 3, 2),
	('Bronze Sword Great', 12, 3, 2),
	('Iron Great Sword', 18, 3, 2),
	('Steel Great Sword', 25, 3, 2),
	('Hardened Great Steel Sword', 32, 3, 2),
	('Onyx Great Sword', 37, 3, 2),
	('Brocks Great Sword', 50, 3, 2);

--War Hammers
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id) VALUES
	('Rusty Carpenters Hammer', 4, 4),
	('Bronze War Hammer', 10, 4),
	('Iron War Hammer', 15, 4),
	('Steel War Hammer', 20, 4),
	('Hardened Steel War Hammer', 25, 4),
	('Onyx War Hammer', 30, 4),
	('Kreets War Hammer', 42, 4);
	
--Great Hammers
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id) VALUES
	('Rusty Damaged Great Hammer', 8, 5);
	

--Battle Axe
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id) VALUES
	('Rusty Tomahawk', 4, 6);
	
--Great Axe
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id) VALUES
	('Rusty Wood Axe', 8, 7);
	
--Knuckles
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id) VALUES
	('Damaged Brass Knuckles', 3, 8);

--Short Bow
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id) VALUES
	('SlingShot', 4, 9);
	
--Long Bow
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id) VALUES
	('Old Hunting Bow', 6, 10);

--Cross Bow
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id) VALUES
	('Old Rusty Crossbow', 5, 11);

--Wand
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id) VALUES
	('Cheap Wand', 6, 12);

--Source Orb
INSERT INTO weapon (weapon_name, attack_value, weapon_type_id) VALUES
	('Unstable Source', 10, 12);
	





INSERT INTO race (race_name, description, attribute_bonus) VALUES
	('Big, slow tank race', 'The ___ are a proud, and honorable people. The have spent generations building large and towering buildings in their
	homeland. And as such, have become strong and hardy. Albeit, quite slow', 'Strength, Constitution'),
	('Big, fast damage race', 'The ___ are a fierce and agile group. They live in the jungle as such, have developed many skills to easily 
	travel amongst the trees and learned to fight many dangerous animals', 'Strength, agility'),
	('Small, fast, ranged focused race', '___ are often times mistaken for elves. And although they do share many characteristics, like being 
	 quick and masters of ranged weaponry, they assert they are definitely different (They are just missing the pointy ears, really)', 'Agility, 
	 Dexterity'),
	 ('The smart and wise race', 'Through generations of dedicated study and experimentation, the __ have developed the ability to wield 
	  magic, and use it in many facets of their life. For everything from creation magic to offensive and defensive magic', 'Intelligence');
START TRANSACTION;
--ROLLBACK;

DROP TABLE IF EXISTS game_details, character_inventory, game_details_game_user, game_user, player_character, 
					enemy_scene, class_type, armor_type, weapon_type, potion_type, crafting_item_type, soul_jar_size, 
					armor_inventory, inventory_weapon, inventory_potion, crafting_item_inventory, inventory_soul_jar, 
					inventory_key_item, scene, enemy, ruin_user, character_class, race, armor, weapon, potion, 
					key_item, crafting_item, soul_jar; 
DROP SEQUENCE IF EXISTS game_details_serial, game_user_serial, player_character_serial, soul_jar_serial, crafting_item_serial, 
						scene_serial, enemy_serial, ruin_user_serial, character_class_serial, race_serial, 
						armor_serial, weapon_serial, potion_serial, key_item_serial;
											

CREATE SEQUENCE ruin_user_serial;
CREATE TABLE ruin_user (
	user_id int NOT NULL DEFAULT nextval ('ruin_user_serial'),
	username VARCHAR(50) NOT NULL UNIQUE,
	password_hash VARCHAR(200) NOT NULL,
	role VARCHAR(50),
	is_active BOOLEAN NOT NULL,
	is_suspended BOOLEAN NOT NULL,
	CONSTRAINT PK_ruin_user PRIMARY KEY (user_id)
);


CREATE TABLE armor_type (
	armor_type_id int NOT NULL,
	armor_type VARCHAR(50) NOT NULL,
	CONSTRAINT PK_armor_type_id PRIMARY KEY (armor_type_id)
);

CREATE TABLE weapon_type (
	weapon_type_id int NOT NULL,
	weapon_type VARCHAR(50) NOT NULL,
	CONSTRAINT PK_weapon_type_id PRIMARY KEY (weapon_type_id)
);

CREATE TABLE potion_type (
	potion_type_id int NOT NULL,
	potion_type VARCHAR(50) NOT NULL,
	CONSTRAINT PK_potion_type_id PRIMARY KEY (potion_type_id)
);

CREATE TABLE crafting_item_type (
	crafting_item_type_id int NOT NULL,
	crafting_item_type VARCHAR(50) NOT NULL,
	CONSTRAINT PK_crafting_item_type_id PRIMARY KEY (crafting_item_type_id)
);

CREATE TABLE soul_jar_size (
	soul_jar_size_id int NOT NULL,
	soul_jar_size VARCHAR(50) NOT NULL,
	CONSTRAINT PK_soul_jar_size_id PRIMARY KEY (soul_jar_size_id)
);


CREATE TABLE class_type (
	class_type_id int NOT NULL,
	class_type VARCHAR(50) NOT NULL,
	CONSTRAINT PK_class_type_id PRIMARY KEY (class_type_id)
);

CREATE SEQUENCE character_class_serial;
CREATE TABLE character_class (
	class_id int NOT NULL DEFAULT nextval ('character_class_serial'),
	class_type_id int NOT NULL,
	class_name VARCHAR(100) NOT NULL,
	CONSTRAINT PK_character_class_id PRIMARY KEY (class_id),
	CONSTRAINT FK_class_type_id FOREIGN KEY (class_type_id) REFERENCES class_type (class_type_id)
);

CREATE SEQUENCE armor_serial;
CREATE TABLE armor (
	armor_id int NOT NULL DEFAULT nextval ('armor_serial'),
	armor_type_id int NOT NULL,
	class_type_bonus int NULL,
	armor_name VARCHAR(50) NOT NULL,
	defence_value int NOT NULL,
	block_value int NULL,
	CONSTRAINT PK_armor_id PRIMARY KEY (armor_id),
	CONSTRAINT FK_class_type_bonus FOREIGN KEY (class_type_bonus) REFERENCES class_type (class_type_id),
	CONSTRAINT FK_armor_type_id FOREIGN KEY (armor_type_id) REFERENCES armor_type (armor_type_id)
);

CREATE SEQUENCE weapon_serial;
CREATE TABLE weapon (
	weapon_id int NOT NULL DEFAULT nextval ('weapon_serial'),
	class_type_bonus int NULL,
	weapon_type_id int NOT NULL,
	weapon_name VARCHAR(50) NOT NULL,
	attack_value int NOT NULL,	
	CONSTRAINT PK_weapon_id PRIMARY KEY (weapon_id),
	CONSTRAINT FK_class_type_bonus FOREIGN KEY (class_type_bonus) REFERENCES class_type (class_type_id),
	CONSTRAINT FK_weapon_type_id FOREIGN KEY (weapon_type_id) REFERENCES weapon_type (weapon_type_id)
);

CREATE SEQUENCE potion_serial;
CREATE TABLE potion (
	potion_id int NOT NULL DEFAULT nextval ('potion_serial'),
	potion_type_id int NOT NULL,
	potion_name VARCHAR(50) NOT NULL,
	potion_value int NOT NULL,
	CONSTRAINT PK_potion_id PRIMARY KEY (potion_id),
	CONSTRAINT FK_potion_type_id FOREIGN KEY (potion_type_id) REFERENCES potion_type (potion_type_id)
);

CREATE SEQUENCE crafting_item_serial;
CREATE TABLE crafting_item (
	crafting_item_id int NOT NULL DEFAULT nextval ('crafting_item_serial'),
	crafting_item_name VARCHAR(50) NOT NULL,
	crafting_item_desc VARCHAR(200) NOT NULL,
	crafting_item_type VARCHAR(20) NOT NULL,
	CONSTRAINT PK_crafting_item_id PRIMARY KEY (crafting_item_id)
);


CREATE SEQUENCE key_item_serial;
CREATE TABLE key_item (
	key_item_id int NOT NULL DEFAULT nextval ('key_item_serial'),
	key_item_name VARCHAR(50) NOT NULL,
	quantity int NULL,
	CONSTRAINT PK_key_item_id PRIMARY KEY (key_item_id)
);

CREATE SEQUENCE scene_serial;
CREATE TABLE scene (
	scene_id int NOT NULL DEFAULT nextval ('scene_serial'),
	scene_name VARCHAR(100) NOT NULL,
	CONSTRAINT PK_scene_id PRIMARY KEY (scene_id)
);

CREATE SEQUENCE enemy_serial;
CREATE TABLE enemy (
	enemy_id int NOT NULL DEFAULT nextval ('enemy_serial'),
	enemy_name VARCHAR(100) NOT NULL,
	enemy_attack int NOT NULL,
	enemy_defense int NOT NULL,
	enemy_willpower int NOT NULL,
	enemy_health int NOT NULL,
	enemy_stamina int NOT NULL,
	is_alive BOOLEAN NOT NULL,
	level int NOT NULL,
	experience int NOT NULL, 
	CONSTRAINT PK_enemy_id PRIMARY KEY (enemy_id)
);

CREATE SEQUENCE soul_jar_serial;
CREATE TABLE soul_jar (
	soul_jar_id int NOT NULL DEFAULT nextval ('soul_jar_serial'),
	enemy_id int NULL,
	soul_jar_size_id int NOT NULL,
	is_full BOOLEAN NOT NULL,
	CONSTRAINT PK_soul_jar_id PRIMARY KEY (soul_jar_id),
	CONSTRAINT FK_enemy_id FOREIGN KEY (enemy_id) REFERENCES enemy (enemy_id),
	CONSTRAINT FK_soul_jar_size_id FOREIGN KEY (soul_jar_size_id) REFERENCES soul_jar_size (soul_jar_size_id)
);

CREATE SEQUENCE race_serial;
CREATE TABLE race (
	race_id int NOT NULL DEFAULT nextval ('race_serial'),
	race_name VARCHAR(50) NOT NULL,
	description VARCHAR(200) NOT NULL,
	attribute_bonus VARCHAR(100) NOT NULL,
	CONSTRAINT PK_race_id PRIMARY KEY (race_id)
);


CREATE SEQUENCE player_character_serial;
CREATE TABLE player_character (
	character_id int NOT NULL DEFAULT nextval ('player_character_serial'),
	class_id int NOT NULL,
	race_id int NOT NULL,
	equipped_armor_id int NULL,
	equipped_weapon_id int NULL,
	character_name VARCHAR(100) NOT NULL,
	strength int NOT NULL,
	agility int NOT NULL,
	dexterity int NOT NULL,
	constitution int NOT NULL,
	intelligence int NOT NULL,
	base_health int NOT NULL,
	base_stamina int NOT NULL,
	base_defense int NOT NULL,
	base_attack int NOT NULL,
	base_willpower int NOT NULL,
	total_attack int NOT NULL,
	total_defense int NOT NULL,
	total_willpower int NOT NULL,
	experience int NOT NULL,
	level int NOT NULL,
	is_alive boolean NOT NULL,
	save_date_time TIMESTAMP NOT NULL,
	CONSTRAINT PK_character_id PRIMARY KEY (character_id),
	CONSTRAINT FK_class_id FOREIGN KEY (class_id) REFERENCES character_class (class_id),
	CONSTRAINT FK_race_id FOREIGN KEY (race_id) REFERENCES race (race_id)
);

CREATE TABLE enemy_scene (
	enemy_id int NOT NULL,
	scene_id int NOT NULL,
	quantity int NULL,
	CONSTRAINT PK_enemy_scene PRIMARY KEY (enemy_id, scene_id),
	CONSTRAINT FK_enemy_id FOREIGN KEY (enemy_id) REFERENCES enemy (enemy_id),
	CONSTRAINT FK_scene_id FOREIGN KEY (scene_id) REFERENCES scene (scene_id)
);

CREATE SEQUENCE game_user_serial;
CREATE TABLE game_user (
	game_user_id int NOT NULL DEFAULT nextval ('game_user_serial'),
	user_id int NOT NULL,
	date_created TIMESTAMP NOT NULL,
	date_ended TIMESTAMP NULL,
	CONSTRAINT PK_game_user PRIMARY KEY (game_user_id),
	CONSTRAINT FK_user_id FOREIGN KEY (user_id) REFERENCES ruin_user (user_id)
);

CREATE TABLE character_inventory (
	inventory_id int NOT NULL,
	character_id int NOT NULL,
	CONSTRAINT PK_inventory PRIMARY KEY (inventory_id),
	CONSTRAINT FK_character_id FOREIGN KEY (character_id) REFERENCES player_character (character_id)

);

CREATE SEQUENCE game_details_serial;
CREATE TABLE game_details (
	game_details_id int NOT NULL DEFAULT nextval ('game_details_serial'),
	scene_id int NOT NULL,
	character_id int NOT NULL,
	save_date_time TIMESTAMP NOT NULL,
	CONSTRAINT PK_game_details PRIMARY KEY (game_details_id),
	CONSTRAINT FK_scene_id FOREIGN KEY (scene_id) REFERENCES scene (scene_id),
	CONSTRAINT FK_character_id FOREIGN KEY (character_id) REFERENCES player_character (character_id)
);

CREATE TABLE game_details_game_user (
	game_details_id int NOT NULL,
	game_user_id int NOT NULL,
	CONSTRAINT PK_game_details_game_user PRIMARY KEY (game_details_id, game_user_id),
	CONSTRAINT FK_game_details_id FOREIGN KEY (game_details_id) REFERENCES game_details (game_details_id),
	CONSTRAINT FK_game_user_id FOREIGN KEY (game_user_id) REFERENCES game_user (game_user_id)
);


CREATE TABLE inventory_key_item (
	key_item_id int NOT NULL,
	inventory_id int NOT NULL,
	quantity int null,
	CONSTRAINT PK_inventory_key_item PRIMARY KEY (key_item_id, inventory_id),
	CONSTRAINT FK_key_item_id FOREIGN KEY (key_item_id) REFERENCES key_item (key_item_id),
	CONSTRAINT FK_inventory_id FOREIGN KEY (inventory_id) REFERENCES character_inventory (inventory_id)
);

CREATE TABLE inventory_potion (
	potion_id int NOT NULL,
	inventory_id int NOT NULL,
	quantity int null,
	CONSTRAINT PK_inventory_potion PRIMARY KEY (potion_id, inventory_id),
	CONSTRAINT FK_potion_id FOREIGN KEY (potion_id) REFERENCES potion (potion_id),
	CONSTRAINT FK_inventory_id FOREIGN KEY (inventory_id) REFERENCES character_inventory (inventory_id)
);

CREATE TABLE inventory_weapon (
	weapon_id int NOT NULL,
	inventory_id int NOT NULL,
	quantity int null,
	CONSTRAINT PK_inventory_weapon PRIMARY KEY (weapon_id, inventory_id),
	CONSTRAINT FK_weapon_id FOREIGN KEY (weapon_id) REFERENCES weapon (weapon_id),
	CONSTRAINT FK_inventory_id FOREIGN KEY (inventory_id) REFERENCES character_inventory (inventory_id)
);

CREATE TABLE armor_inventory (
	armor_id int NOT NULL,
	inventory_id int NOT NULL,
	quantity int null,
	CONSTRAINT PK_inventory_armor PRIMARY KEY (armor_id, inventory_id),
	CONSTRAINT FK_armor_id FOREIGN KEY (armor_id) REFERENCES armor (armor_id),
	CONSTRAINT FK_inventory_id FOREIGN KEY (inventory_id) REFERENCES character_inventory (inventory_id)
);

CREATE TABLE crafting_item_inventory (
	crafting_item_id int NOT NULL,
	inventory_id int NOT NULL,
	quantity int null,
	CONSTRAINT PK_crafting_item_inventory PRIMARY KEY (crafting_item_id, inventory_id),
	CONSTRAINT FK_crafting_item_id FOREIGN KEY (crafting_item_id) REFERENCES crafting_item (crafting_item_id),
	CONSTRAINT FK_inventory_id FOREIGN KEY (inventory_id) REFERENCES character_inventory (inventory_id)
);

CREATE TABLE inventory_soul_jar (
	soul_jar_id int NOT NULL,
	inventory_id int NOT NULL,
	quantity int null,
	CONSTRAINT PK_inventory_soul_jar PRIMARY KEY (soul_jar_id, inventory_id),
	CONSTRAINT FK_soul_jar_id FOREIGN KEY (soul_jar_id) REFERENCES soul_jar (soul_jar_id),
	CONSTRAINT FK_inventory_id FOREIGN KEY (inventory_id) REFERENCES character_inventory (inventory_id)
);

COMMIT TRANSACTION;
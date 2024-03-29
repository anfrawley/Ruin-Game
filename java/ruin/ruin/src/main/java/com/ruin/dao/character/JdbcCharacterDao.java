package com.ruin.dao.character;

import com.ruin.exception.DaoException;
import com.ruin.models.PlayerCharacter;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDateTime;

public class JdbcCharacterDao implements CharacterDao {

    private JdbcTemplate jdbcTemplate;

    private final int STARTING_MAIN = 10;
    private final int ATTRIBUTE_VALUE = 1;
    private final int STARTING_ATTACK = 1;
    private final int STARTING_DEFENSE = 0;
    private final int STARTING_ADDED_STAT = 0;
    private final int STARTING_EXP = 0;
    private final int STARTING_LEVEL = 1;
    private final int ATTRIBUTE_BONUS = 10;



    public JdbcCharacterDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public PlayerCharacter getCharacterById(int characterId){
        PlayerCharacter playerCharacter = null;
        String sql = "SELECT * FROM player_character WHERE character_id = ?";

        try{
            SqlRowSet results = jdbcTemplate.queryForRowSet(sql, characterId);
            if(results.next()) {
                playerCharacter = mapRowToCharacter(results);
            }
        } catch (CannotGetJdbcConnectionException e){
            throw new DaoException("Unable to connect to server or database.", e);
        } catch (DataIntegrityViolationException e){
            throw new DaoException("Data integrity violation", e);
        }

        return playerCharacter;
    }

    @Override
    public PlayerCharacter createCharacter(int classId, int raceId, String characterName){
        PlayerCharacter newCharacter = null;
        LocalDateTime saveDateTime = LocalDateTime.now();
        String sql = "INSERT INTO player_character (character_name, race_id, strength, agility, dexterity, constitution, intelligence, " +
                "health, stamina, willpower, attack, defense, added_attack, added_defence, experience, level, is_alive, " +
                "save_date_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING player_character_id;";

        try{
            if (raceId == 1) {
                int newCharacterId = jdbcTemplate.queryForObject(sql, int.class, characterName, raceId, ATTRIBUTE_VALUE + ATTRIBUTE_BONUS, ATTRIBUTE_VALUE,
                        ATTRIBUTE_VALUE, ATTRIBUTE_VALUE + ATTRIBUTE_BONUS, ATTRIBUTE_VALUE, STARTING_MAIN, STARTING_MAIN, STARTING_MAIN, STARTING_ATTACK,
                        STARTING_DEFENSE, STARTING_ADDED_STAT, STARTING_ADDED_STAT, STARTING_ADDED_STAT, STARTING_EXP, STARTING_LEVEL, true);
                newCharacter = getCharacterById(newCharacterId);
            } else if(raceId == 2) {
                int newCharacterId = jdbcTemplate.queryForObject(sql, int.class, characterName, raceId, ATTRIBUTE_VALUE + ATTRIBUTE_BONUS,
                        ATTRIBUTE_VALUE + ATTRIBUTE_BONUS, ATTRIBUTE_VALUE, ATTRIBUTE_VALUE, ATTRIBUTE_VALUE, STARTING_MAIN, STARTING_MAIN, STARTING_MAIN, STARTING_ATTACK,
                        STARTING_DEFENSE, STARTING_ADDED_STAT, STARTING_ADDED_STAT, STARTING_EXP, STARTING_LEVEL, true);
                newCharacter = getCharacterById(newCharacterId);
            } else if (raceId == 3) {
                int newCharacterId = jdbcTemplate.queryForObject(sql, int.class, characterName, raceId, ATTRIBUTE_VALUE, ATTRIBUTE_VALUE + ATTRIBUTE_BONUS,
                        ATTRIBUTE_VALUE + ATTRIBUTE_BONUS, ATTRIBUTE_VALUE, STARTING_MAIN, STARTING_MAIN, STARTING_MAIN, STARTING_ATTACK,
                        STARTING_DEFENSE, STARTING_ADDED_STAT, STARTING_ADDED_STAT, STARTING_EXP, STARTING_LEVEL, true);
                newCharacter = getCharacterById(newCharacterId);
            } else {
                int newCharacterId = jdbcTemplate.queryForObject(sql, int.class, characterName, raceId, ATTRIBUTE_VALUE, ATTRIBUTE_VALUE,
                        ATTRIBUTE_VALUE, ATTRIBUTE_VALUE, ATTRIBUTE_VALUE + ATTRIBUTE_BONUS, STARTING_MAIN, STARTING_MAIN, STARTING_MAIN, STARTING_ATTACK,
                        STARTING_DEFENSE, STARTING_ADDED_STAT, STARTING_ADDED_STAT, STARTING_EXP, STARTING_LEVEL, true);
                newCharacter = getCharacterById(newCharacterId);
            }
        } catch (CannotGetJdbcConnectionException e){
            throw new DaoException("Unable to connect to server or database", e);
        } catch (DataIntegrityViolationException e){
            throw new DaoException("Data integrity violation", e);
        }

        return newCharacter;
    }

    @Override
    public void updateCharacter(PlayerCharacter playerCharacter){
        String sql = "UPDATE player_character SET player_character_id = ?, character_name = ?, race_id = ?, equipped_armor_id = ?, equipped_weapon_id = ?, " +
                "strength = ?, agility = ?, dexterity = ?, constitution = ?, intelligence = ?, health = ?, stamina = ?, defense = ?, attack = ?, willpower = ?, " +
                "added_attack = ?, added_defense = ?, experience = ?, level = ?, is_alive = ?, save_date_time = ?;";

        try {
            int rowsAffected = jdbcTemplate.update(sql, playerCharacter.getCharacterId(), playerCharacter.getCharacterName(), playerCharacter.getRaceId(),
                    playerCharacter.getEquippedArmorId(), playerCharacter.getEquippedWeaponId(), playerCharacter.getStrength(), playerCharacter.getAgility(),
                    playerCharacter.getDexterity(), playerCharacter.getConstitution(), playerCharacter.getIntelligence(), playerCharacter.getHealth(),
                    playerCharacter.getStamina(), playerCharacter.getDefence(), playerCharacter.getAttack(), playerCharacter.getWillpower(),
                    playerCharacter.getAddedAttack(), playerCharacter.getAddedDefense(), playerCharacter.getExperience(), playerCharacter.getLevel(),
                    playerCharacter.isAlive(), playerCharacter.getSaveDateTime());

            if (rowsAffected == 0){
                throw new DaoException("Zero rows affected, expected at least one row");
            }
        } catch (CannotGetJdbcConnectionException e){
            throw new DaoException("Unable to connect to server or database", e);
        } catch (DataIntegrityViolationException e){
            throw new DaoException("Data integrity violation", e);
        }

    }

    @Override
    public void deleteCharacterById(int id){
        String sql = "DELETE FROM player_character WHERE character_id = ?";

        try{
            int rowsAffected = jdbcTemplate.update(sql, id);

            if(rowsAffected == 0){
                throw new DaoException("Zero rows affected, expected at least one row");
            }
        } catch (CannotGetJdbcConnectionException e){
            throw new DaoException("Unable to connect to server or database", e);
        } catch (DataIntegrityViolationException e){
            throw new DaoException("Data integrity violation", e);
        }
    }

    @Override
    public void levelUp(PlayerCharacter character){
        
    }

    private PlayerCharacter mapRowToCharacter(SqlRowSet rowSet){
        PlayerCharacter playerCharacter = new PlayerCharacter();
        playerCharacter.setCharacterId(rowSet.getInt("character_id"));
        playerCharacter.setCharacterName(rowSet.getString("character_name"));
        playerCharacter.setRaceId(rowSet.getInt("race_id"));
        playerCharacter.setEquippedArmorId(rowSet.getInt("equipped_armor_id"));
        playerCharacter.setEquippedWeaponId(rowSet.getInt("equipped_weapon_id"));
        playerCharacter.setStrength(rowSet.getInt("strength"));
        playerCharacter.setAgility(rowSet.getInt("agility"));
        playerCharacter.setDexterity(rowSet.getInt("dexterity"));
        playerCharacter.setConstitution(rowSet.getInt("constitution"));
        playerCharacter.setIntelligence(rowSet.getInt("intelligence"));
        playerCharacter.setHealth(rowSet.getInt("health"));
        playerCharacter.setStamina(rowSet.getInt("stamina"));
        playerCharacter.setDefence(rowSet.getInt("defence"));
        playerCharacter.setAttack(rowSet.getInt("attack"));
        playerCharacter.setWillpower(rowSet.getInt("willpower"));
        playerCharacter.setAddedAttack(rowSet.getInt("added_attack"));
        playerCharacter.setAddedDefense(rowSet.getInt("added_defense"));
        playerCharacter.setExperience(rowSet.getInt("experience"));
        playerCharacter.setLevel(rowSet.getInt("level"));
        playerCharacter.setAlive(rowSet.getBoolean("is_alive"));
        playerCharacter.setSaveDateTime(rowSet.getTimestamp("save_date_time").toLocalDateTime());
        return playerCharacter;
    }
}

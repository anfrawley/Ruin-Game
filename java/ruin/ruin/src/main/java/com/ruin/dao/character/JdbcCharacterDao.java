package com.ruin.dao.character;

import com.ruin.exception.DaoException;
import com.ruin.models.PlayerCharacter;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;

public class JdbcCharacterDao implements CharacterDao {

    private JdbcTemplate jdbcTemplate;

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
        playerCharacter.setAddedWillpower(rowSet.getInt("added_willpower"));
        playerCharacter.setExperience(rowSet.getInt("experience"));
        playerCharacter.setLevel(rowSet.getInt("level"));
        playerCharacter.setAlive(rowSet.getBoolean("is_alive"));
        playerCharacter.setSaveDateTime(rowSet.getTimestamp("save_date_time").toLocalDateTime());
        return playerCharacter;
    }
}

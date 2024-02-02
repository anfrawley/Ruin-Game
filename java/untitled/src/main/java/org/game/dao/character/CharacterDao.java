package org.game.dao.character;

import org.game.models.PlayerCharacter;

import java.time.LocalDateTime;

public interface CharacterDao {

    PlayerCharacter getCharacterById(int id);
    PlayerCharacter createCharacter(int classId, int raceId, String characterName, LocalDateTime saveDateTime);
    PlayerCharacter updateCharacter(PlayerCharacter character);
    
}

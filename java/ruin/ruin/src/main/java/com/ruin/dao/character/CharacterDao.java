package com.ruin.dao.character;

import com.ruin.models.PlayerCharacter;

import java.time.LocalDateTime;

public interface CharacterDao {

    PlayerCharacter getCharacterById(int id);
    PlayerCharacter createCharacter(int classId, int raceId, String characterName, LocalDateTime saveDateTime);
    PlayerCharacter updateCharacter(PlayerCharacter character);
    void deleteCharacterById(int id);
    void levelUp(PlayerCharacter character);
    
}

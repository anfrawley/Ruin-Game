package com.ruin.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class PlayerCharacter {

    private int characterId;
    private int classId;

    private int raceId;
    private int equippedArmorId;
    private int equippedWeaponId;
    private String characterName;
    private int strength;
    private int agility;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int health;
    private int stamina;
    private int defence;
    private int attack;
    private int willpower;
    private int addedAttack;
    private int addedDefense;
    private int addedWillpower;
    private int experience;
    private int level;
    private boolean isAlive;
    private LocalDateTime saveDateTime;
    private final int LEVEL_2_EXP_REQ = 100;
    private final int LEVEL_3_EXP_REQ = 200;
    private final int LEVEL_4_EXP_REQ = 500;
    private final int LEVEL_5_EXP_REQ = 1000;

    public PlayerCharacter() {
    }

    public PlayerCharacter(int characterId, int classId, int raceId, int equippedArmorId, int equippedWeaponId,
                           String characterName, int strength, int agility, int dexterity, int constitution,
                           int intelligence, int health, int stamina, int defence, int attack, int willpower,
                           int addedAttack, int addedDefense, int addedWillpower, int experience, int level,
                           boolean isAlive, LocalDateTime saveDateTime) {
        this.characterId = characterId;
        this.classId = classId;
        this.raceId = raceId;
        this.equippedArmorId = equippedArmorId;
        this.equippedWeaponId = equippedWeaponId;
        this.characterName = characterName;
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.health = health;
        this.stamina = stamina;
        this.defence = defence;
        this.attack = attack;
        this.willpower = willpower;
        this.addedAttack = addedAttack;
        this.addedDefense = addedDefense;
        this.addedWillpower = addedWillpower;
        this.experience = experience;
        this.level = level;
        this.isAlive = isAlive;
        this.saveDateTime = saveDateTime;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public int getEquippedArmorId() {
        return equippedArmorId;
    }

    public void setEquippedArmorId(int equippedArmorId) {
        this.equippedArmorId = equippedArmorId;
    }

    public int getEquippedWeaponId() {
        return equippedWeaponId;
    }

    public void setEquippedWeaponId(int equippedWeaponId) {
        this.equippedWeaponId = equippedWeaponId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getWillpower() {
        return willpower;
    }

    public void setWillpower(int willpower) {
        this.willpower = willpower;
    }

    public int getAddedAttack() {
        return addedAttack;
    }

    public void setAddedAttack(int addedAttack) {
        this.addedAttack = addedAttack;
    }

    public int getAddedDefense() {
        return addedDefense;
    }

    public void setAddedDefense(int addedDefense) {
        this.addedDefense = addedDefense;
    }

    public int getAddedWillpower() {
        return addedWillpower;
    }

    public void setAddedWillpower(int addedWillpower) {
        this.addedWillpower = addedWillpower;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public LocalDateTime getSaveDateTime() {
        return saveDateTime;
    }

    public void setSaveDateTime(LocalDateTime saveDateTime) {
        this.saveDateTime = saveDateTime;
    }

    public int getLEVEL_2_EXP_REQ() {
        return LEVEL_2_EXP_REQ;
    }

    public int getLEVEL_3_EXP_REQ() {
        return LEVEL_3_EXP_REQ;
    }

    public int getLEVEL_4_EXP_REQ() {
        return LEVEL_4_EXP_REQ;
    }

    public int getLEVEL_5_EXP_REQ() {
        return LEVEL_5_EXP_REQ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerCharacter that = (PlayerCharacter) o;
        return characterId == that.characterId && classId == that.classId && raceId == that.raceId && equippedArmorId == that.equippedArmorId && equippedWeaponId == that.equippedWeaponId && strength == that.strength && agility == that.agility && dexterity == that.dexterity && constitution == that.constitution && intelligence == that.intelligence && health == that.health && stamina == that.stamina && defence == that.defence && attack == that.attack && willpower == that.willpower && addedAttack == that.addedAttack && addedDefense == that.addedDefense && addedWillpower == that.addedWillpower && experience == that.experience && level == that.level && isAlive == that.isAlive && characterName.equals(that.characterName) && saveDateTime.equals(that.saveDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, classId, raceId, equippedArmorId, equippedWeaponId, characterName, strength, agility, dexterity, constitution, intelligence, health, stamina, defence, attack, willpower, addedAttack, addedDefense, addedWillpower, experience, level, isAlive, saveDateTime);
    }

    @Override
    public String toString() {
        return "PlayerCharacter{" +
                "characterId=" + characterId +
                ", classId=" + classId +
                ", raceId=" + raceId +
                ", equippedArmorId=" + equippedArmorId +
                ", equippedWeaponId=" + equippedWeaponId +
                ", characterName='" + characterName + '\'' +
                ", strength=" + strength +
                ", agility=" + agility +
                ", dexterity=" + dexterity +
                ", constitution=" + constitution +
                ", intelligence=" + intelligence +
                ", health=" + health +
                ", stamina=" + stamina +
                ", defence=" + defence +
                ", attack=" + attack +
                ", willpower=" + willpower +
                ", addedAttack=" + addedAttack +
                ", addedDefense=" + addedDefense +
                ", addedWillpower=" + addedWillpower +
                ", experience=" + experience +
                ", level=" + level +
                ", isAlive=" + isAlive +
                ", saveDateTime=" + saveDateTime +
                '}';
    }
}

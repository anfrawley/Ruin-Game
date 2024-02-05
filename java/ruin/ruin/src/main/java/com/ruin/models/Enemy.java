package com.ruin.models;

import java.util.Objects;

public class Enemy {

    private int enemyId;
    private String enemyName;
    private int attack;
    private int defense;
    private int willpower;
    private int health;
    private int stamina;
    private boolean isAlive;
    private int level;
    private int experience;

    public Enemy(int enemyId, String enemyName, int attack, int defense, int willpower, int health, int stamina, boolean isAlive, int level, int experience) {
        this.enemyId = enemyId;
        this.enemyName = enemyName;
        this.attack = attack;
        this.defense = defense;
        this.willpower = willpower;
        this.health = health;
        this.stamina = stamina;
        this.isAlive = isAlive;
        this.level = level;
        this.experience = experience;
    }

    public int getEnemyId() {
        return enemyId;
    }

    public void setEnemyId(int enemyId) {
        this.enemyId = enemyId;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getWillpower() {
        return willpower;
    }

    public void setWillpower(int willpower) {
        this.willpower = willpower;
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

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enemy enemy = (Enemy) o;
        return enemyId == enemy.enemyId && attack == enemy.attack && defense == enemy.defense && willpower == enemy.willpower && health == enemy.health && stamina == enemy.stamina && isAlive == enemy.isAlive && level == enemy.level && experience == enemy.experience && enemyName.equals(enemy.enemyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enemyId, enemyName, attack, defense, willpower, health, stamina, isAlive, level, experience);
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "enemyId=" + enemyId +
                ", enemyName='" + enemyName + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", willpower=" + willpower +
                ", health=" + health +
                ", stamina=" + stamina +
                ", isAlive=" + isAlive +
                ", level=" + level +
                ", experience=" + experience +
                '}';
    }
}

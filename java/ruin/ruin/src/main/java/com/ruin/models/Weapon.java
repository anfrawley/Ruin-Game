package com.ruin.models;

import java.util.Objects;

public class Weapon {
    private int weaponId;
    private int weaponTypeId;
    private int classTypeBonus;
    private String weaponName;
    private int attackValue;

    public Weapon(int weaponId, int weaponTypeId, int classTypeBonus, String weaponName, int attackValue) {
        this.weaponId = weaponId;
        this.weaponTypeId = weaponTypeId;
        this.classTypeBonus = classTypeBonus;
        this.weaponName = weaponName;
        this.attackValue = attackValue;
    }

    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public int getWeaponTypeId() {
        return weaponTypeId;
    }

    public void setWeaponTypeId(int weaponTypeId) {
        this.weaponTypeId = weaponTypeId;
    }

    public int getClassTypeBonus() {
        return classTypeBonus;
    }

    public void setClassTypeBonus(int classTypeBonus) {
        this.classTypeBonus = classTypeBonus;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon = (Weapon) o;
        return weaponId == weapon.weaponId && weaponTypeId == weapon.weaponTypeId && classTypeBonus == weapon.classTypeBonus && attackValue == weapon.attackValue && weaponName.equals(weapon.weaponName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weaponId, weaponTypeId, classTypeBonus, weaponName, attackValue);
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponId=" + weaponId +
                ", weaponTypeId=" + weaponTypeId +
                ", classTypeBonus=" + classTypeBonus +
                ", weaponName='" + weaponName + '\'' +
                ", attackValue=" + attackValue +
                '}';
    }
}

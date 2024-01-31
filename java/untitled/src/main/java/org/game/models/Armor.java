package org.game.models;

import java.util.Objects;

public class Armor {

    private int armorId;
    private int armorTypeId;
    private int classTypeBonus;
    private String armorName;
    private int defenceValue;
    private int blockValue;

    public Armor(int armorId, int armorTypeId, int classTypeBonus, String armorName, int defenceValue, int blockValue) {
        this.armorId = armorId;
        this.armorTypeId = armorTypeId;
        this.classTypeBonus = classTypeBonus;
        this.armorName = armorName;
        this.defenceValue = defenceValue;
        this.blockValue = blockValue;
    }

    public int getArmorId() {
        return armorId;
    }

    public void setArmorId(int armorId) {
        this.armorId = armorId;
    }

    public int getArmorTypeId() {
        return armorTypeId;
    }

    public void setArmorTypeId(int armorTypeId) {
        this.armorTypeId = armorTypeId;
    }

    public int getClassTypeBonus() {
        return classTypeBonus;
    }

    public void setClassTypeBonus(int classTypeBonus) {
        this.classTypeBonus = classTypeBonus;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getDefenceValue() {
        return defenceValue;
    }

    public void setDefenceValue(int defenceValue) {
        this.defenceValue = defenceValue;
    }

    public int getBlockValue() {
        return blockValue;
    }

    public void setBlockValue(int blockValue) {
        this.blockValue = blockValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Armor armor = (Armor) o;
        return armorId == armor.armorId && armorTypeId == armor.armorTypeId && classTypeBonus == armor.classTypeBonus && defenceValue == armor.defenceValue && blockValue == armor.blockValue && armorName.equals(armor.armorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(armorId, armorTypeId, classTypeBonus, armorName, defenceValue, blockValue);
    }

    @Override
    public String toString() {
        return "Armor{" +
                "armorId=" + armorId +
                ", armorTypeId=" + armorTypeId +
                ", classTypeBonus=" + classTypeBonus +
                ", armorName='" + armorName + '\'' +
                ", defenceValue=" + defenceValue +
                ", blockValue=" + blockValue +
                '}';
    }
}

package com.ruin.models.types;

import java.util.Objects;

public class ArmorType {

    private int armorTypeId;
    private String armorType;

    public ArmorType(int armorTypeId, String armorType) {
        this.armorTypeId = armorTypeId;
        this.armorType = armorType;
    }

    public int getArmorTypeId() {
        return armorTypeId;
    }

    public void setArmorTypeId(int armorTypeId) {
        this.armorTypeId = armorTypeId;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArmorType armorType1 = (ArmorType) o;
        return armorTypeId == armorType1.armorTypeId && armorType.equals(armorType1.armorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(armorTypeId, armorType);
    }

    @Override
    public String toString() {
        return "ArmorType{" +
                "armorTypeId=" + armorTypeId +
                ", armorType='" + armorType + '\'' +
                '}';
    }
}

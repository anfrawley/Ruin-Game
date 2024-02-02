package org.game.models;

import java.util.Objects;

public class Potion {

    private int potionId;
    private int potionTypeId;
    private String potionName;
    private int potionValue;

    public Potion(int potionId, int potionTypeId, String potionName, int potionValue) {
        this.potionId = potionId;
        this.potionTypeId = potionTypeId;
        this.potionName = potionName;
        this.potionValue = potionValue;
    }

    public int getPotionId() {
        return potionId;
    }

    public void setPotionId(int potionId) {
        this.potionId = potionId;
    }

    public int getPotionTypeId() {
        return potionTypeId;
    }

    public void setPotionTypeId(int potionTypeId) {
        this.potionTypeId = potionTypeId;
    }

    public String getPotionName() {
        return potionName;
    }

    public void setPotionName(String potionName) {
        this.potionName = potionName;
    }

    public int getPotionValue() {
        return potionValue;
    }

    public void setPotionValue(int potionValue) {
        this.potionValue = potionValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Potion potion = (Potion) o;
        return potionId == potion.potionId && potionTypeId == potion.potionTypeId && potionValue == potion.potionValue && potionName.equals(potion.potionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(potionId, potionTypeId, potionName, potionValue);
    }

    @Override
    public String toString() {
        return "Potion{" +
                "potionId=" + potionId +
                ", potionTypeId=" + potionTypeId +
                ", potionName='" + potionName + '\'' +
                ", potionValue=" + potionValue +
                '}';
    }
}

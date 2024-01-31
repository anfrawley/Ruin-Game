package org.game.models.types;

import java.util.Objects;

public class PotionType {

    private int potionTypeId;
    private String potionType;

    public PotionType(int potionTypeId, String potionType) {
        this.potionTypeId = potionTypeId;
        this.potionType = potionType;
    }

    public int getPotionTypeId() {
        return potionTypeId;
    }

    public void setPotionTypeId(int potionTypeId) {
        this.potionTypeId = potionTypeId;
    }

    public String getPotionType() {
        return potionType;
    }

    public void setPotionType(String potionType) {
        this.potionType = potionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PotionType that = (PotionType) o;
        return potionTypeId == that.potionTypeId && potionType.equals(that.potionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(potionTypeId, potionType);
    }

    @Override
    public String toString() {
        return "PotionType{" +
                "potionTypeId=" + potionTypeId +
                ", potionType='" + potionType + '\'' +
                '}';
    }
}

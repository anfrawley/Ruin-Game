package com.ruin.models.types;

import java.util.Objects;

public class CraftingItemType {

    private int craftingItemTypeId;
    private String craftingItemType;

    public CraftingItemType(int craftingItemTypeId, String craftingItemType) {
        this.craftingItemTypeId = craftingItemTypeId;
        this.craftingItemType = craftingItemType;
    }

    public int getCraftingItemTypeId() {
        return craftingItemTypeId;
    }

    public void setCraftingItemTypeId(int craftingItemTypeId) {
        this.craftingItemTypeId = craftingItemTypeId;
    }

    public String getCraftingItemType() {
        return craftingItemType;
    }

    public void setCraftingItemType(String craftingItemType) {
        this.craftingItemType = craftingItemType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CraftingItemType that = (CraftingItemType) o;
        return craftingItemTypeId == that.craftingItemTypeId && craftingItemType.equals(that.craftingItemType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(craftingItemTypeId, craftingItemType);
    }

    @Override
    public String toString() {
        return "CraftingItemType{" +
                "craftingItemTypeId=" + craftingItemTypeId +
                ", craftingItemType='" + craftingItemType + '\'' +
                '}';
    }
}

package com.ruin.models;

import java.util.Objects;

public class CraftingItem {

    private int CraftingItemId;
    private int craftingItemTypeId;
    private String craftingItemName;
    private String craftingItemDescription;

    public CraftingItem(int craftingItemId, int craftingItemTypeId, String craftingItemName, String craftingItemDescription) {
        CraftingItemId = craftingItemId;
        this.craftingItemTypeId = craftingItemTypeId;
        this.craftingItemName = craftingItemName;
        this.craftingItemDescription = craftingItemDescription;
    }

    public int getCraftingItemId() {
        return CraftingItemId;
    }

    public void setCraftingItemId(int craftingItemId) {
        CraftingItemId = craftingItemId;
    }

    public int getCraftingItemTypeId() {
        return craftingItemTypeId;
    }

    public void setCraftingItemTypeId(int craftingItemTypeId) {
        this.craftingItemTypeId = craftingItemTypeId;
    }

    public String getCraftingItemName() {
        return craftingItemName;
    }

    public void setCraftingItemName(String craftingItemName) {
        this.craftingItemName = craftingItemName;
    }

    public String getCraftingItemDescription() {
        return craftingItemDescription;
    }

    public void setCraftingItemDescription(String craftingItemDescription) {
        this.craftingItemDescription = craftingItemDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CraftingItem that = (CraftingItem) o;
        return CraftingItemId == that.CraftingItemId && craftingItemTypeId == that.craftingItemTypeId && craftingItemName.equals(that.craftingItemName) && craftingItemDescription.equals(that.craftingItemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CraftingItemId, craftingItemTypeId, craftingItemName, craftingItemDescription);
    }

    @Override
    public String toString() {
        return "CraftingItem{" +
                "CraftingItemId=" + CraftingItemId +
                ", craftingItemTypeId=" + craftingItemTypeId +
                ", craftingItemName='" + craftingItemName + '\'' +
                ", craftingItemDescription='" + craftingItemDescription + '\'' +
                '}';
    }
}

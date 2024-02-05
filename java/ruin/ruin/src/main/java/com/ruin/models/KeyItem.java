package com.ruin.models;

import java.util.Objects;

public class KeyItem {

    private int keyItemId;
    private int keyItemName;

    public KeyItem(int keyItemId, int keyItemName) {
        this.keyItemId = keyItemId;
        this.keyItemName = keyItemName;
    }

    public int getKeyItemId() {
        return keyItemId;
    }

    public void setKeyItemId(int keyItemId) {
        this.keyItemId = keyItemId;
    }

    public int getKeyItemName() {
        return keyItemName;
    }

    public void setKeyItemName(int keyItemName) {
        this.keyItemName = keyItemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyItem keyItem = (KeyItem) o;
        return keyItemId == keyItem.keyItemId && keyItemName == keyItem.keyItemName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyItemId, keyItemName);
    }

    @Override
    public String toString() {
        return "KeyItem{" +
                "keyItemId=" + keyItemId +
                ", keyItemName=" + keyItemName +
                '}';
    }
}

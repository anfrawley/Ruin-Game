package com.ruin.models.types;

import java.util.Objects;

public class WeaponType {

    private int weaponTypeId;
    private String weaponType;

    public WeaponType(int weaponTypeId, String weaponType) {
        this.weaponTypeId = weaponTypeId;
        this.weaponType = weaponType;
    }

    public int getWeaponTypeId() {
        return weaponTypeId;
    }

    public void setWeaponTypeId(int weaponTypeId) {
        this.weaponTypeId = weaponTypeId;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeaponType that = (WeaponType) o;
        return weaponTypeId == that.weaponTypeId && weaponType.equals(that.weaponType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weaponTypeId, weaponType);
    }

    @Override
    public String toString() {
        return "WeaponType{" +
                "weaponTypeId=" + weaponTypeId +
                ", weaponType='" + weaponType + '\'' +
                '}';
    }
}

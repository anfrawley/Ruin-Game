package com.ruin.models.types;

import java.util.Objects;

public class SoulJarSize {

    private int soulJarSizeId;
    private String soulJarSize;

    public SoulJarSize(int soulJarSizeId, String soulJarSize) {
        this.soulJarSizeId = soulJarSizeId;
        this.soulJarSize = soulJarSize;
    }

    public int getSoulJarSizeId() {
        return soulJarSizeId;
    }

    public void setSoulJarSizeId(int soulJarSizeId) {
        this.soulJarSizeId = soulJarSizeId;
    }

    public String getSoulJarSize() {
        return soulJarSize;
    }

    public void setSoulJarSize(String soulJarSize) {
        this.soulJarSize = soulJarSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoulJarSize that = (SoulJarSize) o;
        return soulJarSizeId == that.soulJarSizeId && soulJarSize.equals(that.soulJarSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(soulJarSizeId, soulJarSize);
    }

    @Override
    public String toString() {
        return "SoulJarSize{" +
                "soulJarSizeId=" + soulJarSizeId +
                ", soulJarSize='" + soulJarSize + '\'' +
                '}';
    }
}

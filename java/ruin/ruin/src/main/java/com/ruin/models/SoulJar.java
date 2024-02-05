package com.ruin.models;

import java.util.Objects;

public class SoulJar {

    private int soulJarId;
    private int enemyId;
    private int soulJarSizeId;
    private boolean isFull;

    public SoulJar(int soulJarId, int enemyId, int soulJarSizeId, boolean isFull) {
        this.soulJarId = soulJarId;
        this.enemyId = enemyId;
        this.soulJarSizeId = soulJarSizeId;
        this.isFull = isFull;
    }

    public int getSoulJarId() {
        return soulJarId;
    }

    public void setSoulJarId(int soulJarId) {
        this.soulJarId = soulJarId;
    }

    public int getEnemyId() {
        return enemyId;
    }

    public void setEnemyId(int enemyId) {
        this.enemyId = enemyId;
    }

    public int getSoulJarSizeId() {
        return soulJarSizeId;
    }

    public void setSoulJarSizeId(int soulJarSizeId) {
        this.soulJarSizeId = soulJarSizeId;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoulJar soulJar = (SoulJar) o;
        return soulJarId == soulJar.soulJarId && enemyId == soulJar.enemyId && soulJarSizeId == soulJar.soulJarSizeId && isFull == soulJar.isFull;
    }

    @Override
    public int hashCode() {
        return Objects.hash(soulJarId, enemyId, soulJarSizeId, isFull);
    }

    @Override
    public String toString() {
        return "SoulJar{" +
                "soulJarId=" + soulJarId +
                ", enemyId=" + enemyId +
                ", soulJarSizeId=" + soulJarSizeId +
                ", isFull=" + isFull +
                '}';
    }
}

package org.game.models;

import java.util.Objects;

public class CharacterClass {

    private int classId;
    private int classTypeId;
    private String className;

    public CharacterClass(int classId, int classTypeId, String className) {
        this.classId = classId;
        this.classTypeId = classTypeId;
        this.className = className;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getClassTypeId() {
        return classTypeId;
    }

    public void setClassTypeId(int classTypeId) {
        this.classTypeId = classTypeId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterClass that = (CharacterClass) o;
        return classId == that.classId && classTypeId == that.classTypeId && className.equals(that.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, classTypeId, className);
    }

    @Override
    public String toString() {
        return "CharacterClass{" +
                "classId=" + classId +
                ", classTypeId=" + classTypeId +
                ", className='" + className + '\'' +
                '}';
    }
}

package com.ruin.models.types;

import java.util.Objects;

public class ClassType {

    private int classTypeId;
    private String classType;

    public ClassType(int classTypeId, String classType) {
        this.classTypeId = classTypeId;
        this.classType = classType;
    }

    public int getClassTypeId() {
        return classTypeId;
    }

    public void setClassTypeId(int classTypeId) {
        this.classTypeId = classTypeId;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassType classType1 = (ClassType) o;
        return classTypeId == classType1.classTypeId && classType.equals(classType1.classType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classTypeId, classType);
    }

    @Override
    public String toString() {
        return "ClassType{" +
                "classTypeId=" + classTypeId +
                ", classType='" + classType + '\'' +
                '}';
    }
}

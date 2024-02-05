package com.ruin.models;

import java.util.Objects;

public class RuinUser {

    private int userId;
    private String username;
    private String password;
    private String role;
    private boolean isActive;
    private boolean isSuspended;

    public RuinUser(int userId, String username, String password, String role, boolean isActive, boolean isSuspended) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
        this.isActive = isActive;
        this.isSuspended = isSuspended;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RuinUser ruinUser = (RuinUser) o;
        return userId == ruinUser.userId && isActive == ruinUser.isActive && isSuspended == ruinUser.isSuspended && username.equals(ruinUser.username) && password.equals(ruinUser.password) && role.equals(ruinUser.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, password, role, isActive, isSuspended);
    }

    @Override
    public String toString() {
        return "RuinUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", isActive=" + isActive +
                ", isSuspended=" + isSuspended +
                '}';
    }
}

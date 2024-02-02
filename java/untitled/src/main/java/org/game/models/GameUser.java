package org.game.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class GameUser {

    private int gameUserId;
    private int userId;
    private LocalDate dateCreated;

    public GameUser(int gameUserId, int userId, LocalDate dateCreated) {
        this.gameUserId = gameUserId;
        this.userId = userId;
        this.dateCreated = dateCreated;
    }

    public int getGameUserId() {
        return gameUserId;
    }

    public void setGameUserId(int gameUserId) {
        this.gameUserId = gameUserId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameUser gameUser = (GameUser) o;
        return gameUserId == gameUser.gameUserId && userId == gameUser.userId && dateCreated.equals(gameUser.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameUserId, userId, dateCreated);
    }

    @Override
    public String toString() {
        return "GameUser{" +
                "gameUserId=" + gameUserId +
                ", userId=" + userId +
                ", dateCreated=" + dateCreated +
                '}';
    }
}

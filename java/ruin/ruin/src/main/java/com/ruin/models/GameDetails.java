package com.ruin.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class GameDetails {

    private int GameDetailsId;
    private int currentScene;
    private int characterId;
    private LocalDateTime saveDateTime;

    public GameDetails(int gameDetailsId, int currentScene, int characterId, LocalDateTime saveDateTime) {
        GameDetailsId = gameDetailsId;
        this.currentScene = currentScene;
        this.characterId = characterId;
        this.saveDateTime = saveDateTime;
    }

    public int getGameDetailsId() {
        return GameDetailsId;
    }

    public void setGameDetailsId(int gameDetailsId) {
        GameDetailsId = gameDetailsId;
    }

    public int getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(int currentScene) {
        this.currentScene = currentScene;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public LocalDateTime getSaveDateTime() {
        return saveDateTime;
    }

    public void setSaveDateTime(LocalDateTime saveDateTime) {
        this.saveDateTime = saveDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameDetails that = (GameDetails) o;
        return GameDetailsId == that.GameDetailsId && currentScene == that.currentScene && characterId == that.characterId && saveDateTime.equals(that.saveDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(GameDetailsId, currentScene, characterId, saveDateTime);
    }

    @Override
    public String toString() {
        return "GameDetails{" +
                "GameDetailsId=" + GameDetailsId +
                ", currentScene=" + currentScene +
                ", characterId=" + characterId +
                ", saveDateTime=" + saveDateTime +
                '}';
    }
}

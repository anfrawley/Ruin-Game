package com.ruin.models;

import java.util.Objects;

public class Scene {

    private int sceneId;
    private String sceneName;

    public Scene(int sceneId, String sceneName) {
        this.sceneId = sceneId;
        this.sceneName = sceneName;
    }

    public int getSceneId() {
        return sceneId;
    }

    public void setSceneId(int sceneId) {
        this.sceneId = sceneId;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scene scene = (Scene) o;
        return sceneId == scene.sceneId && sceneName.equals(scene.sceneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sceneId, sceneName);
    }

    @Override
    public String toString() {
        return "Scene{" +
                "sceneId=" + sceneId +
                ", sceneName='" + sceneName + '\'' +
                '}';
    }
}

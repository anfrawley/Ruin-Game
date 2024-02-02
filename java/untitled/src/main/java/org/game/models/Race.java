package org.game.models;

import java.util.Objects;

public class Race {

    private int raceId;
    private String raceName;
    private String raceDescription;
    private String attributeBonus;

    public Race(int raceId, String raceName, String raceDescription, String attributeBonus) {
        this.raceId = raceId;
        this.raceName = raceName;
        this.raceDescription = raceDescription;
        this.attributeBonus = attributeBonus;
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getRaceDescription() {
        return raceDescription;
    }

    public void setRaceDescription(String raceDescription) {
        this.raceDescription = raceDescription;
    }

    public String getAttributeBonus() {
        return attributeBonus;
    }

    public void setAttributeBonus(String attributeBonus) {
        this.attributeBonus = attributeBonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return raceId == race.raceId && raceName.equals(race.raceName) && raceDescription.equals(race.raceDescription) && attributeBonus.equals(race.attributeBonus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceId, raceName, raceDescription, attributeBonus);
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceId=" + raceId +
                ", raceName='" + raceName + '\'' +
                ", raceDescription='" + raceDescription + '\'' +
                ", attributeBonus='" + attributeBonus + '\'' +
                '}';
    }
}

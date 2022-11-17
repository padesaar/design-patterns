package org.example.adapter.exercise;

public class VideoGame {
   private String pegiName;
   private int ageRating;
   private int numberOfCores;
   private int pingTime;

    public VideoGame(String pegiName, int ageRating, int numberOfCores, int pingTime) {
        this.pegiName = pegiName;
        this.ageRating = ageRating;
        this.numberOfCores = numberOfCores;
        this.pingTime = pingTime;
    }

    public String getPegiName() {
        return pegiName;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public int getPingTime() {
        return pingTime;
    }
}

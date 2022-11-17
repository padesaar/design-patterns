package org.example.adapter.exercise;

import org.example.factory.Game;

public class VideoGameAdapter implements Game {
    private VideoGame videoGame;

    public VideoGameAdapter(VideoGame videoGame) {
        this.videoGame = videoGame;
    }


    @Override
    public String getName() {
        return videoGame.getPegiName();
    }

    @Override
    public String getType() {
        return "PC";
    }

    @Override
    public int getMinNumberOfPlayers() {
        return 1;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return 5;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return videoGame.getPingTime() < 100;
    }
}

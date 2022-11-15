package org.example.factory;


public class PCGame implements Game{
    private String name;
    private String type;
    private int minNumberOfPlayers;
    private int maxNumberOfPlayers;
    private boolean isOnline;

    public PCGame(String name, String type, int minNumberOfPlayers, int maxNumberOfPlayers, boolean isOnline) {
        this.name = name;
        this.type = type;
        this.minNumberOfPlayers = minNumberOfPlayers;
        this.maxNumberOfPlayers = maxNumberOfPlayers;
        this.isOnline = isOnline;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMinNumberOfPlayers() {
        return minNumberOfPlayers;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }

    public boolean canBePlayedRemotely() {
        return isOnline;
    }

    @Override
    public String toString() {
        return "PCGame{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", minNumberOfPlayers=" + minNumberOfPlayers +
                ", maxNumberOfPlayers=" + maxNumberOfPlayers +
                ", isOnline=" + isOnline +
                '}';
    }
}
package org.example.factory;

public class BoardGame implements Game{

    private String name ;
    private String type;
    private int maxPlayerNumber;

    public BoardGame(String name, String type, int maxPlayerNumber) {
        this.name = name;
        this.type = type;
        this.maxPlayerNumber = maxPlayerNumber;
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
        return 2;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return maxPlayerNumber;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return false;
    }

    @Override
    public String toString(){
        return "BoardGame{ name= " + name + ", type= " + type + " , maxPlayerNumber= " + maxPlayerNumber + " }";
    }
}
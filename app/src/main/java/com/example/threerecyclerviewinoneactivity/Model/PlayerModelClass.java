package com.example.threerecyclerviewinoneactivity.Model;

public class PlayerModelClass {
    private int PlayersImg;
    private String PlayerText1;

    public PlayerModelClass(int playersImg, String playerText1) {
        PlayersImg = playersImg;
        PlayerText1 = playerText1;
    }

    public int getPlayersImg() {
        return PlayersImg;
    }

    public String getPlayerText1() {
        return PlayerText1;
    }
}

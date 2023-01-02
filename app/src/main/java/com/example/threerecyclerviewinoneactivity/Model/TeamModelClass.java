package com.example.threerecyclerviewinoneactivity.Model;

public class TeamModelClass {
    private int TeamImg;
    private String TeamText1;
    private String Color;

    public TeamModelClass(int teamImg, String teamText1, String color) {
        TeamImg = teamImg;
        TeamText1 = teamText1;
        Color = color;
    }

    public int getTeamImg() {
        return TeamImg;
    }

    public String getTeamText1() {
        return TeamText1;
    }

    public String getColor() {
        return Color;
    }
}
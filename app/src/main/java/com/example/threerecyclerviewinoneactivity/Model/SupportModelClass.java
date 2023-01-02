package com.example.threerecyclerviewinoneactivity.Model;

public class SupportModelClass {
private int SportsImg;
private String SportsText;

    public SupportModelClass(int sportsImg, String sportsText) {
        SportsImg = sportsImg;
        SportsText = sportsText;
    }

    public int getSportsImg() {
        return SportsImg;
    }

    public String getSportsText() {
        return SportsText;
    }
}

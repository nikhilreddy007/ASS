package com.example.nikhilreddy.ass;

public class Item {

    private int number;
    private String chapter;

    public Item(int number, String chapter){
        this.number = number;
        this.chapter = chapter;
    }

    public String getChapter() {
        return chapter;
    }

    public int getNumber() {
        return number;
    }
}

package com.example.nikhilreddy.ass;

public class Link {
    private int number;
    private String chapter;
    private String link;

    public Link(int number, String chapter, String link){
        this.number = number;
        this.chapter = chapter;
        this.link = link;
    }

    public String getChapter() {
        return chapter;
    }

    public int getNumber() {
        return number;
    }

    public String getLink() {
        return link;
    }
}

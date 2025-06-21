package com.SuhanaSulfeekker.Moody.model;

public class MoodEntry {
    private int id;
    private String date;
    private String mood;

    public MoodEntry() {}

    public MoodEntry(int id, String date, String mood) {
        this.id = id;
        this.date = date;
        this.mood = mood;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getMood() { return mood; }
    public void setMood(String mood) { this.mood = mood; }
}

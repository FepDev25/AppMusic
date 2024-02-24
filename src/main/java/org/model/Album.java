package org.model;

import java.util.ArrayList;

public class Album {
    private String name;
    private int numSongs;
    private String duration;
    private int publishAge;
    private String gender;
    private ArrayList<GeneralSong> songs;

    public Album(String name, int numSongs, String duration, int publishAge, String gender) {
        this.name = name;
        this.numSongs = numSongs;
        this.duration = duration;
        this.publishAge = publishAge;
        this.gender = gender;
        this.songs = new ArrayList<>();
    }
    public void setSong(GeneralSong song){
        this.songs.add(song);
    }

    public void removeSong(GeneralSong song){
        this.songs.remove(song);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumSongs() {
        return numSongs;
    }

    public void setNumSongs(int numSongs) {
        this.numSongs = numSongs;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getPublishAge() {
        return publishAge;
    }

    public void setPublishAge(int publishAge) {
        this.publishAge = publishAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<GeneralSong> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<GeneralSong> songs) {
        this.songs = songs;
    }
}

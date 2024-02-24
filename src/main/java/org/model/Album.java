package org.model;

import java.util.ArrayList;

public class Album {
    private int id;
    private String name;
    private int numSongs;
    private int publishAge;
    private String gender;
    private ArrayList<GeneralSong> songs;

    public Album(int id, String name, int numSongs, int publishAge, String gender) {
        this.id = id;
        this.name = name;
        this.numSongs = numSongs;
        this.publishAge = publishAge;
        this.gender = gender;
        this.songs = new ArrayList<>();
    }

    public void viewSongs(){
        this.songs.forEach(p -> System.out.println("Song: " + p.getNombre()));
    }

    public Album setSong(Song song){
        this.songs.add(song);
        return this;
    }

    public void removeSong(GeneralSong song){
        this.songs.remove(song);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numSongs=" + numSongs +
                ", publishAge=" + publishAge +
                ", gender='" + gender + '\'' +
                ", songs=" + songs +
                '}';
    }
}

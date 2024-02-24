package org.model;

import java.util.ArrayList;

public class Artist {
    private String name;
    private String real;
    private String artisticName;
    private String country;
    private int age;
    private ArrayList<Album> albums;
    private ArrayList<GeneralSong> songs;

    public Artist(String name, String real, String artisticName, String country, int age) {
        this.name = name;
        this.real = real;
        this.artisticName = artisticName;
        this.country = country;
        this.age = age;
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public void setSong(GeneralSong song){
        this.songs.add(song);
    }

    public void removeSong(GeneralSong song){
        this.songs.remove(song);
    }

    public void setAlbum(Album album){
        this.albums.add(album);
    }

    public void removeAlbum(Album album){
        this.albums.remove(album);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReal() {
        return real;
    }

    public void setReal(String real) {
        this.real = real;
    }

    public String getArtisticName() {
        return artisticName;
    }

    public void setArtisticName(String artisticName) {
        this.artisticName = artisticName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public ArrayList<GeneralSong> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<GeneralSong> songs) {
        this.songs = songs;
    }
}

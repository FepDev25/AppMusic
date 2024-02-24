package org.model;

import java.util.ArrayList;

public class Artist {
    private int id;
    private String name;
    private String artisticName;
    private String country;
    private int age;
    private ArrayList<Album> albums;

    public Artist(int id, String name, String artisticName, String country, int age) {
        this.id = id;
        this.name = name;
        this.artisticName = artisticName;
        this.country = country;
        this.age = age;
        this.albums = new ArrayList<>();
    }
    public void viewSongs(){
        for (Album album : this.albums) {
            album.viewSongs();
        }
    }

    public void setAlbum(Album album){
        this.albums.add(album);
    }

    public void removeAlbum(Album album){
        this.albums.remove(album);
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

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artisticName='" + artisticName + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", albums=" + albums +
                '}';
    }
}

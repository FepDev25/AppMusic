package org.model;

public class Song extends GeneralSong{
    private Album album;

    public Song(String nombre, String duration, String gender, Artist artist, Album album) {
        super(nombre, duration, gender, artist);
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}

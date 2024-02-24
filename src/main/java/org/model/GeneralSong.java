package org.model;

public abstract class GeneralSong {
    protected String nombre;
    protected String duration;
    protected String gender;
    protected Artist artist;

    public GeneralSong(String nombre, String duration, String gender, Artist artist) {
        this.nombre = nombre;
        this.duration = duration;
        this.gender = gender;
        this.artist = artist;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}

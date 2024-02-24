package org.model;

public class Song extends GeneralSong{
    private boolean album;

    public Song(int id, String nombre, String gender) {
        super(id, nombre, gender);
        this.album = true;
    }

    public boolean getAlbum() {
        return album;
    }

    public void setAlbum(boolean album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "album=" + album +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

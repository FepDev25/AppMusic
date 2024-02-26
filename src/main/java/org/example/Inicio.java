package org.example;

import org.model.Album;
import org.model.Artist;
import org.model.Song;

public class Inicio {
    public static void main(String[] args) {
        Artist a1 = new Artist(1,"Roger Waters","Pink","England", 62);
        Album al1 = new Album(1, "Animals", 5, 1977, "Progressive Rock");
        Song c1 = new Song(1, "Pigs","Progressive Rock");
        Song c2 = new Song(1, "Cow","Progressive Rock");
        Song c3 = new Song(1, "Dog","Progressive Rock");

        Artist a2 = new Artist(1,"Roger Waters","Pink","England", 62);
        Artist a3 = new Artist(1,"Roger Waters","Pink","England", 62);
        Artist a4 = new Artist(1,"Roger Waters","Pink","England", 62);
        Artist a5 = new Artist(1,"Roger Waters","Pink","England", 62);

        al1.setSong(c1).setSong(c2).setSong(c3);
        System.out.println("Album = " + al1);

        a1.setAlbum(al1);
        System.out.println("Artist: " + a1);

        System.out.println();

        System.out.println("View songs:");
        a1.viewSongs();
    }
}
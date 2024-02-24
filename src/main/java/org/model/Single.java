package org.model;

public class Single extends GeneralSong{

    public Single(int id, String nombre, String gender) {
        super(id, nombre, gender);
    }

    @Override
    public String toString() {
        return "Single{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

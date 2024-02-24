package org.model;

public abstract class GeneralSong {
    protected int id;
    protected String nombre;
    protected String gender;

    public GeneralSong(int id, String nombre, String gender) {
        this.id = id;
        this.nombre = nombre;
        this.gender = gender;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

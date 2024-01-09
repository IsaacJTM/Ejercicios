package Ejercicio12_Herencia;

import java.util.ArrayList;

public class Usuario {
    private String username;
    private int id;
    ArrayList<LibraryItem> items;

    public Usuario(String username, int id) {
        //inicialización
        this.username = username;
        this.id = id;
        items = new ArrayList<>();
    }

    public Usuario() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

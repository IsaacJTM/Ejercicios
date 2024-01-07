package Ejercicio12_Herencia;

public class LibraryItem {
    protected int id;
    protected String title;
    protected boolean disponible;

    //constructor
    public LibraryItem(int id, String title, boolean disponible){
        this.id = id;
        this.title = title;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

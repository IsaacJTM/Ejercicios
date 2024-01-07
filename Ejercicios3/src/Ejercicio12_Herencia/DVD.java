package Ejercicio12_Herencia;

public class DVD extends LibraryItem{
    private String director;
    private String duracion;

    public DVD(int id, String title, boolean disponible, String director,String duracion ) {
        super(id, title, disponible);
        this.director = director;
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}

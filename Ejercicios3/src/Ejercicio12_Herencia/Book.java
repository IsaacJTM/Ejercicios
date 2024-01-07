package Ejercicio12_Herencia;

public class Book extends LibraryItem {
    private String autor;

   public Book(int id, String title, boolean disponible, String autor){
       super(id, title, disponible);
       this.autor = autor;
   }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

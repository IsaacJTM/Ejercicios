import Ejercicio12_Herencia.Book;
import Ejercicio12_Herencia.DVD;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos una instancia
        Book book1 = new Book(
                1,
                "El mundo que vimos arder",
                true,
                "Renato Cisneros");
        DVD dvd1 = new DVD(
                2,
                "El origen",
                true,
                "James",
                (short) 120 );

    }
}
package Ejercicio12H;

import java.util.ArrayList;

public class Library {
    String name;
    ArrayList<LibraryItem> libraryItems;
    ArrayList<Usuario> users;


    //Métos
    /*
    1. Prestar
    2. devolver
    3. registrar usuario
    4. eliminar usuario
    5. Buscar Item
     */

    //Prestamo de libro
    public boolean prestamoLibro(int item_id, int user_id){

        Usuario userList = new Usuario();
        boolean isUserPresent = false;
        //buscar usuario
        for(Usuario user:users){
            if(user.getId() == user_id){
                isUserPresent = true;
                userList = user;
                break;
            }
        }
        if(isUserPresent==false){
            System.out.println("El usuario no existe");
            return false;
        }

        for(LibraryItem item :libraryItems ){
            if(item.getId() == item_id){

            }
        }
        return false;
    }
}

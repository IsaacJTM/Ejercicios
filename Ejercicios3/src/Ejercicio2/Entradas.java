package Ejercicio2;

import java.awt.*;
import java.sql.SQLOutput;

public class Entradas {
    public void Ingreso(int edadPersona, short traeRegalo){
        if(edadPersona< 0 || edadPersona>105){
            String Error = "Edad invalida";
            throw new RuntimeException(Error);
        }
        if(edadPersona>= 15  && traeRegalo == 1){
            System.out.println("El invitado sí puede ingresar a la fiesta");
        }else if(edadPersona>=15 && traeRegalo == 0){
            System.out.println("El invitado no puede ingresar a la fiesta");
        }else{
            System.out.println("El invitado sí puede ingresar a la fiesta");
        }

    }

}

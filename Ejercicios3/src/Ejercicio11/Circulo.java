package Ejercicio11;

import javax.swing.*;
import java.awt.geom.Area;

public class Circulo extends Figura{
    private int radio;
    final float PI = 3.14f;
    public Circulo (String color, boolean colorFigura, int radio){
        super(color, colorFigura);
        this.radio = radio;
    }

    public int getRadio(){
        return radio;
    }

    public void setRadio(int radio){
        this.radio = radio;
    }

    @Override
    public void Area(){
        System.out.println((float)(PI*radio*radio));
    }

    @Override
    public void Perimetro() {
        System.out.println((float) (2*PI*radio));
    }

}

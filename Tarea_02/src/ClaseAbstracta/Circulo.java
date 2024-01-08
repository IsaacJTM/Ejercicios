package ClaseAbstracta;

import java.sql.SQLOutput;

public class Circulo extends Figura{
    private float radio;
    float pi = 3.14f;

    public Circulo(String color, float radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public float area() {
        return (float) (pi*Math.pow(radio,2));
    }

    @Override
    public float perimetro() {
        return (float) (2*pi*radio);
    }

    @Override
    public void imprimir() {
        System.out.println("CIRCULO");
        System.out.println("Radio :"+radio);
        System.out.println("Area es :" + area());
        System.out.println("Perímetro es :"+ perimetro());
    }
}

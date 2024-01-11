package Ejercicio11;

public class Rectangulo extends Figura{
    private float ancho;
    private float altura;

    public Rectangulo(String color,boolean colorRelleno, float ancho, float altura){
        super(color, colorRelleno);
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public void Area() {
        System.out.println(ancho*altura);
    }

    @Override
    public void Perimetro() {
        System.out.println(2*(ancho+altura));
    }

}

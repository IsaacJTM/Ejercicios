package ClaseAbstracta;

public class Cuadrado extends Figura {

    private float lado;

    public Cuadrado(String color, float lado){
        super(color);
        this.lado = lado;
    }
    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public float perimetro() {
        return lado*4;
    }

    @Override
    public void printColor() {
        System.out.println("El color del cuadrado es: "+ color);
    }

    @Override
    public void imprimir(){
        System.out.println("CUADRADO");
        System.out.println("lado :"+lado);
        System.out.println("Area es :" + area());
        System.out.println("Perímetro es :"+ perimetro());
    }
}

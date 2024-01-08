package ClaseAbstracta;

public abstract class Figura {
    protected String color;

    public Figura(String color){
        this.color = color;
    }
    public abstract float area();
    public abstract float perimetro();
    public void printColor(){
        System.out.println(color);
    }
    public abstract void imprimir();

}

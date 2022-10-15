public class Triangulo extends Forma {
    
    private float base;
    private float altura;

    public Triangulo(float base, float altura){
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public float area() {

        return (base * altura) /2;
    }

    @Override
    public void mostrar() {
        
        System.out.println("\n\n ***************************");
        System.out.println("A base do triangulo e: "+getBase());
        System.out.println("A Altura do trianhulo e: "+getAltura());
        System.out.println("A area e:" +area());
        System.out.println("O perimetro do triangulo e: "+perimetro());
        System.out.println("***************");
        
    }

    public float perimetro(){
        return base * 3;

}
}

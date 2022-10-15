public class Quadrado extends Forma {
    
    private float base;

    public Quadrado(float base){
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public float area() {

        return base * base;
    }

    @Override
    public void mostrar() {
        
        System.out.println("\n\n ***************************");
        System.out.println("A base do quadrado e: "+getBase());
        System.out.println("A area e:" +area());
        System.out.println("O perimetro do quadrado e: "+perimetro());
        System.out.println("***************");
        
    }
    public float perimetro(){
        return base*4;
    }

    
}

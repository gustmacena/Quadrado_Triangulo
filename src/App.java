import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int escolha;
        char resp = 'S';
        while(resp == 'S'){

        System.out.println("** \t\t\t Forma Geometrica");
        
        System.out.println("1 - Quadrado");
        System.out.println("2 - Triangulo");
        System.out.println("3 - Sair ");
        System.out.println("Escolha qual forma geometrica deseja cadastrar");
        escolha = leia.nextInt();

        switch (escolha){
            case 1:
                float lado;
                System.out.println("\t\t\t ** Quadrado **");
                System.out.println("Digite o lado do quadrado: ");
                lado = leia.nextFloat();
                Quadrado quadrado = new Quadrado(lado);
                quadrado.mostrar();
                break;


            case 2:
                float base;
                float altura;
                System.out.println("\t\t\t ** Quadrado **");
                Triangulo triangulo = new Triangulo(0,0);
                System.out.println("Digite a base do triangulo: ");
                triangulo.setBase(leia.nextFloat());
                System.out.println("Digite a altura do triangulo: ");
                triangulo.setAltura(leia.nextFloat());
                triangulo.mostrar();
                break;

            
            case 3:
            do{
                System.out.println("Deseja realmente sair do programa?(S/N)");
                resp = leia.next().toUpperCase().charAt(0);
            }while(resp != 'N' && resp != 'S');
            break ;
            
            default:
                System.out.println("Opção invalida!");
                break;

        }
    }
}
}
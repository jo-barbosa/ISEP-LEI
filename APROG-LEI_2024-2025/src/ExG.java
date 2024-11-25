import java.util.Scanner;

public class ExG {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        int contador = 0;
        if (numero > 0) {
            for ( int divisores = 1; divisores <= numero; divisores++) {
                if ( numero % divisores == 0) {
                    System.out.println(divisores);
                    contador++;
                }
            }
            System.out.printf("(%d)%n", contador);
        }
    }
}

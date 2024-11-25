import java.util.Scanner;

public class ExK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nLimite = sc.nextInt();
        for (int numero = 2; numero < nLimite; numero++) {
            int contador = 0;
            for (int divisor = 1; divisor <= numero; divisor++) {
                if (numero % divisor == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println(numero);
            }
        }
    }
}

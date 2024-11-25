import java.util.Scanner;

public class ExB {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        numero = ler.nextInt();
        while (numero >= 0) {
            int somaPares = 0;
            do {
                int algarismo = numero % 10;
                if (algarismo % 2 == 0) {
                    somaPares += algarismo;
                }
                numero /= 10;
            } while (numero > 0);
            System.out.println(somaPares);
            numero = ler.nextInt();
        }
    }
}

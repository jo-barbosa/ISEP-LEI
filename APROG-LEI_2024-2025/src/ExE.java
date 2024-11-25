import java.util.Scanner;

public class ExE {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        int algarismo, decimal = 0, potencia = 0;
        while (numero > 0) {
            do {
                algarismo = numero % 10;
                numero /= 10;
                decimal += algarismo * (int) Math.pow(8, potencia);
                potencia++;
            } while (numero > 0);
            System.out.println(decimal);
            potencia = 0;
            decimal = 0;
            numero = ler.nextInt();
        }
    }
}
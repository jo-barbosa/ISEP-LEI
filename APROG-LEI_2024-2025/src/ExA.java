import java.util.Scanner;

public class ExA {
    public static void main(String[] args) {
        int numero, somaPares;
        Scanner ler = new Scanner(System.in);
        numero = ler.nextInt();
        somaPares = 0;
        while (numero > 0){
            int algarismo = numero % 10;
            if (algarismo % 2 == 0) {
                somaPares += algarismo;
            }
            numero /= 10;
        }
        System.out.println(somaPares);
    }
}

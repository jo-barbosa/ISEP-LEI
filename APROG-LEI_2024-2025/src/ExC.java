import java.util.Scanner;

public class ExC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        int produtoImpares = 1;
        int contador = 0;
        do if (numero >=0){
            int algarismo = numero % 10;
            if (algarismo % 2 != 0) {
                produtoImpares *= algarismo;
                contador++;
            }
            numero = numero / 10;
        }while (numero != 0);
        if (contador > 0) {
            System.out.println(produtoImpares);
        }else
            System.out.println("no odd digits");
    }
}

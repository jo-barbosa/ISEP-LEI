import java.util.Scanner;

public class ExL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPerfeitos, contador = 0, somaDivisores, nPerfeito = 2;
        do {
            nPerfeitos = sc.nextInt();
        }while (nPerfeitos < 0);
        do {
            nPerfeito += 1;
            somaDivisores = 0;
                for (int divisor = 1; divisor < nPerfeito; divisor++) {
                    if (nPerfeito % divisor == 0) {
                        somaDivisores += divisor;
                    }
                }
                if (nPerfeito == somaDivisores) {
                    System.out.println(nPerfeito);
                    contador++;
                }

        }while (contador < nPerfeitos);
    }
}

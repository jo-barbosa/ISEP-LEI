import java.util.Scanner;

public class ExM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nTermos = sc.nextInt();
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int ntermo = 0;
        int termoAnterior = 0;
        for (int sequencia = 1; sequencia <= nTermos; sequencia++) {
            if (sequencia == 1) {
                System.out.println(primeiroTermo);
            } else if (sequencia == 2) {
                System.out.println(segundoTermo);
            } else {
                ntermo = segundoTermo + termoAnterior;
                termoAnterior = segundoTermo;
                segundoTermo = ntermo;
                System.out.println(ntermo);
            }

        }
    }
}

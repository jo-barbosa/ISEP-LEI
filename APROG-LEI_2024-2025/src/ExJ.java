import java.util.Scanner;

public class ExJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nLeituras = sc.nextInt();
        if (nLeituras > 0){
            double maiorPercentagem = 0;
            for (int leitura = 0; leitura < nLeituras; leitura++) {
                int numero = sc.nextInt();
                int nTestar = numero;
                int contador = 0;
                int divisor = 0;
                while (numero > 0) {
                    int algarismo = numero % 10;
                    numero/= 10;
                    contador++;
                    if (algarismo != 0) {
                        if (nTestar % algarismo == 0 ){
                            divisor++;
                        }
                    }
                }
                double percentagem = (double) divisor/contador*100;
                if (maiorPercentagem < percentagem){
                    maiorPercentagem = percentagem;
                }
                System.out.printf("%.2f%%\n", percentagem);
            }
            System.out.printf("(%.2f%%)\n", maiorPercentagem);
        }
    }
}

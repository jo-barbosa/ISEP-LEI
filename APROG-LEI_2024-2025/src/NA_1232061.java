import java.util.Scanner;

public class NA_1232061 {
    public static final int ID_MAQUINA_MINIMO = 1;
    public static final int ID_MAQUINA_MAXIMO = 20;
    public static final int QT_BOLAS_1EURO = 2;
    public static final int QT_BOLAS_2EUROS = 5;
    public static final int MIN_QT_MOEDAS = 2;
    public static final int MAX_QT_MOEDAS = 10;
    public static final int VALOR_MIN_MOEDAS = 1;
    public static final int VALOR_MAX_MOEDAS = 2;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int conjuntoMoedas = lerNoIntervalo(MIN_QT_MOEDAS, MAX_QT_MOEDAS);
        int valorMoeda = 0;
        int numeroMaquina = 0;
        int quantidadeVermelhas = 0;
        int quantidadeAzuis = 0;
        int somaGastosVermelhas = 0;
        int somaGastosAzuis = 0;
        double mediaVermelhas = 0, mediaAzuis = 0;

        for (int i = 0; i < conjuntoMoedas; i++) {
            valorMoeda = lerNoIntervalo(VALOR_MIN_MOEDAS, VALOR_MAX_MOEDAS);
            numeroMaquina = lerNoIntervalo(ID_MAQUINA_MINIMO, ID_MAQUINA_MAXIMO);
            if (numeroMaquina % 2 == 0) {
                somaGastosAzuis += valorMoeda;
                quantidadeAzuis += verificarBolas(valorMoeda);

            } else {
                somaGastosVermelhas += valorMoeda;
                quantidadeVermelhas += verificarBolas(valorMoeda);
            }


        }

        if (quantidadeVermelhas > 0)
            mediaVermelhas = calcularMedia(quantidadeVermelhas, somaGastosVermelhas);
        if (quantidadeAzuis > 0)
            mediaAzuis = calcularMedia(quantidadeAzuis, somaGastosAzuis);

        System.out.printf("Saíram %d bolas vermelhas e %d bolas azuis%n", quantidadeVermelhas, quantidadeAzuis);
        System.out.printf("Valor médio das bolas (vermelhas/azuis) : %.2f€/%.2f€%n", mediaVermelhas, mediaAzuis);
        if (mediaAzuis == mediaVermelhas) {
            System.out.println("As bolas vermelhas e azuis dão lucro idêntico");
        } else if (mediaAzuis > mediaVermelhas) {
            System.out.println("As bolas Azuis são mais lucrativas");
        } else {
            System.out.println("As bolas Vermelhas são mais lucrativas");
        }
    }

    public static double calcularMedia(int nBolas, int valorTotal) {
        double media = (double) valorTotal / nBolas;
        return media;
    }

    public static int verificarBolas(int valorMoeda) {
        if (valorMoeda == VALOR_MIN_MOEDAS)
            return QT_BOLAS_1EURO;
        return QT_BOLAS_2EUROS;
    }

    public static int lerNoIntervalo(int min, int max) {
        int valor = sc.nextInt();
        while (valor < min || valor > max) {
            valor = sc.nextInt();
        }
        return valor;
    }
}

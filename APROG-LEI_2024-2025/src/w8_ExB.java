import java.util.Scanner;

public class w8_ExB {
    public static Scanner sc = new Scanner(System.in);
    public static int MAX_ARRAY_SIZE = 100;

    public static int contarElementos(int[] elementos) {
        int contador = 0;
        int numero = sc.nextInt();
        while (numero > 0) {
            elementos[contador++] = numero;
            numero = sc.nextInt();
        }
        return contador;
    }

    public static int contarOcorrencias(int min, int quantidadeElementos, int[] elementos) {
        int contador = 0;
        for (int i = 0; i < quantidadeElementos; i++) {
            if (elementos[i] == min) {
                contador++;
            }
        }
        return contador;
    }

    public static int encontrarMinimo(int quantidadeElementos, int[] elementos) {
        int min = elementos[0];
        for (int i = 1; i < quantidadeElementos; i++) {
            if (elementos[i] < min) {
                min = elementos[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] elementos = new int[MAX_ARRAY_SIZE];
        int quantidadeElementos = contarElementos(elementos);
        if (quantidadeElementos > 0) {
            int minimo = encontrarMinimo(quantidadeElementos, elementos);
            int ocurrenciasMin = contarOcorrencias(minimo, quantidadeElementos, elementos);
            System.out.printf("min=%d\n", minimo);
            System.out.printf("occurrences=%d\n", ocurrenciasMin);
        }

    }

}

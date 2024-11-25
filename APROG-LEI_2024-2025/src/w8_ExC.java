import java.util.Scanner;

public class w8_ExC {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int qtNumeros = sc.nextInt();
        int [] lista = new int[qtNumeros];
        int quantidadeDiferentes = inserirValores(lista);
        Boolean saoCrescentes = naoTemRepetido(lista);
    }
    public static int inserirValores(int [] lista){

    }

    public static boolean naoTemRepetido(int [] lista, int quantidadeDiferentes){
        for (int i = 0; i < quantidadeDiferentes; i++) {
            if (lista[i] >= lista[(i+1)]) {
                return false;
            }
        }
        return true;
    }
}

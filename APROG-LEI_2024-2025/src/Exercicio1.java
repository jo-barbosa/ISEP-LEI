import java.util.Scanner;

public class Exercicio1 {
    public static final int MAX_PROCESSAMENTO = 4000, MIN_PRODUTORES = 1;
    public static final int MAX_PRODUTORES = 10;

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int nProdutores = sc.nextInt();
       if (verificarIntervalo(nProdutores, MIN_PRODUTORES, MAX_PRODUTORES)){
        int a = 0;
       }

    }

    public static boolean verificarIntervalo(int valor, int min, int max){
        if (valor < max && valor > min) {
        return true;            
        }
        return false;
        
    }

    
}

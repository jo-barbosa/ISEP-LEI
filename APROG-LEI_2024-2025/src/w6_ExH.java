import java.util.Scanner;

public class w6_ExH {
    static final int MAX_TENTATIVAS = 5;
    public static boolean isPalindrome (int numero){
        int aux = numero;
        int resultado = 0;
        while (aux > 0){
            int algorismo = aux % 10;
            aux /= 10;
            resultado = resultado*10 + algorismo;
        }
        return (numero == resultado);
    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int tentativas = 1;
        int numero = sc.nextInt();

        while( !isPalindrome(numero) && MAX_TENTATIVAS > tentativas){
            tentativas++;
            numero = sc.nextInt();
        }
        if (MAX_TENTATIVAS > tentativas) {
            System.out.println("palindrome");
        }else{
            System.out.println("attempts exceeded");
        }
    }
}

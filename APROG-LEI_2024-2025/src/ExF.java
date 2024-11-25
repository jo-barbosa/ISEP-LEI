import java.util.Scanner;

public class ExF {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nIntroduzido = ler.nextInt();
        int palindrome = 0, algarismo, numero;
        if (nIntroduzido > 0) {
            numero = nIntroduzido;
            do {
                algarismo = numero % 10;
                numero /= 10;
                palindrome = palindrome * 10 + algarismo;
            } while (numero > 0);
            if (palindrome == nIntroduzido) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome");
            }
        }
    }
}

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int num, alg;

        Scanner ler = new Scanner(System.in);

        num = ler.nextInt();
        do {
            alg = num % 10;
            num = num / 10;
            System.out.println(alg);

        } while (num != 0);
    }
}

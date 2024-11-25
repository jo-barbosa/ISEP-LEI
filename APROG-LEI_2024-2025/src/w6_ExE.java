import java.util.Scanner;

public class w6_ExE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nvalores = sc.nextInt();
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int sequencia = 1;
        int maiorComum1 = 0;
        int maiorComum2 = 0;
        int nComuns = 0;
        int qtMaxComuns = 0;

        do {
            sequencia++;
            nComuns = pComuns(numero1, numero2);
            if (sequencia == 1 || nComuns >= qtMaxComuns) {
                qtMaxComuns = nComuns;
                maiorComum1 = numero1;
                maiorComum2 = numero2;
            }

            numero1 = sc.nextInt();
            numero2 = sc.nextInt();
        } while (sequencia < nvalores);
        if (qtMaxComuns > 0) {
            System.out.printf("%d/%d%n", maiorComum1, maiorComum2);
        } else
            System.out.println("no results");
    }

    public static int pComuns(int n, int m) {
        int comuns = 0;
        while (n > 0 && m > 0) {
            int algarismoN = n % 10;
            int algarismoM = m % 10;
            if (algarismoN == algarismoM) {
                comuns++;
            }
            n /= 10;
            m /= 10;
        }
        return comuns;
    }
}

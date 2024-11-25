import java.util.Scanner;

public class w6_ExD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m >= n) {
            System.out.printf("C(%d,%d)=%d%n", m, n, combinations(m, n));
            System.out.printf("P(%d,%d)=%d%n", m, n, permutations(m, n));
        }
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int combinations(int m, int n) {
        int combinacoes = factorial(m) / (factorial(n) * factorial(m - n));
        return combinacoes;
    }

    public static int permutations(int m, int n) {
        int permutacoes = factorial(m) / factorial(m - n);
        return permutacoes;
    }
}

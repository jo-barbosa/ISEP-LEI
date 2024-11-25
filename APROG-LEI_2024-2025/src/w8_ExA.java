import java.util.Scanner;

public class w8_ExA {
    public static Scanner sc = new Scanner(System.in);
    public static int NOTA_MINIMA = 10;

    public static double lerAlunos(double[] alunos) {
        double soma = 0;

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = sc.nextDouble();
            soma += alunos[i];
        }
        return soma;
    }

    public static int contarReprovados(double[] alunos) {
        int reprovados = 0;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] < NOTA_MINIMA) {
                reprovados++;
            }
        }
        return reprovados;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        double[] alunos = new double[n];
        double media = lerAlunos(alunos) / n;
        int failures = contarReprovados(alunos);

        System.out.printf("average=%.1f%n", media);
        System.out.printf("failures=%d%n", failures);
    }
}

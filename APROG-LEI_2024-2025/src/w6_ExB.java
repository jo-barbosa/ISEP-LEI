import java.util.Scanner;

public class w6_ExB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAlunos, numeroDisciplinas, numeroAlunosAprovados;
        String nomeDisciplina;

        numeroAlunos = Integer.parseInt(sc.nextLine());
        numeroDisciplinas = Integer.parseInt(sc.nextLine());
        for (int disciplina = 0; disciplina < numeroDisciplinas; disciplina++) {
            nomeDisciplina = sc.nextLine();
            numeroAlunosAprovados = Integer.parseInt(sc.nextLine());
            imprimirInformacao(nomeDisciplina, numeroAlunos, numeroAlunosAprovados);
        }
    }

    public static void imprimirInformacao(String nomeDisciplina, int numeroAlunos, int numeroAlunosAprovados) {
        System.out.println("Subject: " + nomeDisciplina);
        System.out.print("- Approved: ");

        for (int i = 0; i < numeroAlunosAprovados; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("- Failed: ");
        for (int i = 0; i < (numeroAlunos - numeroAlunosAprovados); i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
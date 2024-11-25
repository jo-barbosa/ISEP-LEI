import java.util.Scanner;

public class w7_ExJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nInteiro;
        do {
            nInteiro = sc.nextInt();
        } while (nInteiro < 0 || nInteiro > 100);
        int triplas = triplas(nInteiro);
        System.out.println("triples=" + triplas);
    }

    public static int triplas(int nInteiro) {
        int triplas = 0;
        for (int numeroA = nInteiro - 2; numeroA >= 0; numeroA--) {
            for (int numeroB = 1; numeroB <= numeroA; numeroB++) {
                int numeroC = nInteiro - numeroA - numeroB;
                if (numeroC > 0 && numeroC <= numeroB) {
                    System.out.println(numeroA + "+" + numeroB + "+" + numeroC);
                    triplas++;
                }
            }
        }
        return triplas;
    }
}

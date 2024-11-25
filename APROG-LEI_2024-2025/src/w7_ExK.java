import java.util.Scanner;

public class w7_ExK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            numero = sc.nextInt();
        }while (numero < 0);
        int pontuacao = pontuacao(numero);
        System.out.println("points=" + pontuacao);
    }

    public static int pontuacao(int numero) {
        int pontuacao = 0;
        boolean repetido = false;
        int numeroPontuacao = 0;
        while (numero > 0){
            int auxiliar = numero % 10;
            numeroPontuacao = numeroPontuacao*10 + auxiliar;
            numero = numero / 10;
        }

        while (numeroPontuacao > 0) {
            int algarismo = numeroPontuacao % 10;
            if (repetido) {
                if (pontuacao > 0) {
                    pontuacao = (pontuacao * -1) + (algarismo * -1);
                } else {
                    pontuacao = pontuacao - algarismo;
                }
            }else {
                pontuacao += algarismo;
            }
            numeroPontuacao /= 10;
            repetido = false;
            if (numeroPontuacao % 10 == algarismo) {
                repetido = true;
            }
        }
        return pontuacao;
    }

}

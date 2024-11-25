import java.util.Scanner;

public class W6_ExA {
    static final int K = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxAlgarismos = sc.nextInt();
        int numero;
        int sequencia = 0;
        int soma = 0;
        do {
            numero = sc.nextInt();
            if (qtAlgarismos(numero) < maxAlgarismos) {
                soma += numero;
                sequencia++;
            }else if (sequencia == 0){
                sequencia = 1;
            }
        }while (sequencia < K && qtAlgarismos(numero) < maxAlgarismos);

        System.out.printf("%.2f%n",(double)soma / sequencia);



  }

  public static int qtAlgarismos(int numero){
        int qtAlgarismos = 1;
        while(numero  > 9){
            qtAlgarismos++;
            numero/=10;
        }
        return qtAlgarismos;
  }
}

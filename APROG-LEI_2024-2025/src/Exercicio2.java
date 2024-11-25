import java.util.Scanner;


public class Exercicio2 {
    public static final int MIN_PRODUTOS = 5, MAX_PRODUTOS = 50, MIN_QUALIDADE = 0, MAX_QUALIDADE = 100;
    public static final int MAX_REJECTED_LOW = 50, MAX_APPROVED = 90, MAX_REJECTED_HIGH = 100;
    public static void main(String[] args) {
        int quantidadeProdutos = obterDoIntervalo(MIN_PRODUTOS, MAX_PRODUTOS);
        int qualidadeProduto;
        int sequenciaMaximaAprovados = 0, sequenciaAtualAprovados = 0;
        int quantidadeAprovados = 0;
        int somaDaQualidade = 0;
        boolean ultimoProdutoFoiAprovado = false;
        int quantidadeRejeitadosLow = 0;

        for (int i = 1; i <= quantidadeProdutos; i++){
            qualidadeProduto = obterDoIntervalo(MIN_QUALIDADE, MAX_QUALIDADE);
            somaDaQualidade += qualidadeProduto;
            if (qualidadeProduto <= MAX_REJECTED_LOW ) {
                quantidadeRejeitadosLow++;
                ultimoProdutoFoiAprovado = false;

            }else if (qualidadeProduto <= MAX_APPROVED){
                quantidadeAprovados++;

                if(ultimoProdutoFoiAprovado){
                    sequenciaAtualAprovados++;
                    if (sequenciaAtualAprovados > sequenciaMaximaAprovados) {
                        sequenciaMaximaAprovados = sequenciaAtualAprovados;
                    }
                }else{
                    sequenciaAtualAprovados = 1;
                    if (sequenciaAtualAprovados > sequenciaMaximaAprovados) {
                        sequenciaMaximaAprovados = sequenciaAtualAprovados;
                    }
                }
                
                ultimoProdutoFoiAprovado = true;
            }else{

                ultimoProdutoFoiAprovado = false;
            }

        }
        if (quantidadeAprovados > 0) {
            System.out.printf("Número de produtos aprovados = %d%n", quantidadeAprovados);
            System.out.printf("Maior sequencia de produtos aprovados =  %d%n", quantidadeAprovados);
        }else{
            System.out.println("Nenhum produto foi aprovado");
        }
        System.out.printf("Valor médio da qualidade dos produtos = %.2f%n", ((double)somaDaQualidade/quantidadeProdutos));
        System.out.printf("Rejected (low) = %.2f%%%n", (double)quantidadeRejeitadosLow/quantidadeProdutos*100);
    }

    
    public static int obterDoIntervalo(int min, int max){
        Scanner sc = new Scanner(System.in);
        int valor;
        do{
            valor = sc.nextInt();
        }while(valor < min || valor > max);
        return valor;        
    }
}

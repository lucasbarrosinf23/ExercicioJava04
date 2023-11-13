import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int tam = 15;
        int[] vetor = new int[tam];


        for (int i = 0; i < tam; i++) {
            System.out.print("Informe o número na posição " + (i + 1) + ": ");
            vetor[i] = entrada.nextInt();
        }


        int[] vetorResult = new int[tam];
        int contResult = 0;

        for (int i = 0; i < tam; i++) {
            if (isPrimo(vetor[i])) {
                vetorResult[contResult] = vetor[i];
                contResult++;
            }
        }



        System.out.println("Números primos no vetor digitado: ");
        for (int i = 0; i < contResult; i++) {
            System.out.print(vetorResult[i] + " ");
        }


        entrada.close();
    }


    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
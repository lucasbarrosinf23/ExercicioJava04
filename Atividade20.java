import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int tam = 10;
        int[] num = new int[tam];

        System.out.println("Informe 10 numeros inteiro para preneencher o vetor: ");
        for (int i = 0; i < tam; i++) {
            System.out.println("Informe o " +(i + 1)+ "º número: ");
            num[i] = entrada.nextInt();
        }

        System.out.println("Os numeros positivos do vetor sao: ");
        for (int i = 0; i < tam; i++) {
            if (num[i] > 0) {
                System.out.println(num[i]);
            }
        }

        entrada.close();
    }
}
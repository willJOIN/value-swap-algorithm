import java.util.Scanner;

public class ExercicioTrocaValores {
    public static void main(String[] args) {
        /*
            Faça um algoritmo que leia dois valores para as variáveis A e B
            e efetue a troca dos valores de forma que a variável A passe a
            possuir o valor da variável B e a variável B passe a possuir o
            valor da variável A. Apresente os valores trocados.
         */

        int A = 0, B = 0, troca;

        // Enquanto A for diferente de B, pedir A e B
        do {
            try {
                // Leitura de dados
                Scanner leitor = new Scanner(System.in);
                System.out.println("Digite o valor de A:\n");
                A = leitor.nextInt();

                System.out.println("Digite o valor de B:\n");
                B = leitor.nextInt();
                leitor.close();
            } catch (Exception ex) {
                // Caso linhas 14-21 falhem, cai aqui
                System.out.println("Erro ao pegar A e/ou B:\n" + ex);
            }

            if (A == B) {
                System.out.println("\nA nao pode ser igual a B!\n");
            }
        } while (A == B);

        System.out.println("A estava: " + A + ", estava: " + B);

        troca = A;
        A = B;
        B = troca;

        System.out.println("A virou: " + A + ", virou: " + B);
    }
}

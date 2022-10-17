import java.util.Scanner;

public class nota_aluno {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite o nome do aluno: ");
            String nome = teclado.nextLine();
            System.out.print("Digite a nota do aluno: ");
            float nota = teclado.nextFloat();
            System.out.format("A nota de %s é %.1f \n", nome, nota);
        }
    }
}

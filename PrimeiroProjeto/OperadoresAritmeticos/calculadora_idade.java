package PrimeiroProjeto.OperadoresAritmeticos;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.SourceLocator;

public class calculadora_idade {
    public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
        System.out.print("Qual é o seu nome? ");
        String nome = teclado.nextLine();
        System.out.print("Digite o ano de nascimento: ");
        Integer anoNascimento = teclado.nextInt();
        System.out.print("Digite o ano atual: ");
        Integer anoAtual = teclado.nextInt();
        Integer idade = anoAtual - anoNascimento;
        System.out.format("%s tem %s anos \n", nome, idade);
        }
    }
    
}

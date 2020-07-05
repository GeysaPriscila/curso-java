/**
 * Entrada de Dados
 */
import java.util.Scanner;

public class EntradaDados {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        // Capturar numeros inteiros
        // System.out.print("Digite sua idade: ");
        // int idade = entrada.nextInt();
        // System.out.println(idade);

        // Capturar números reais
        // System.out.print("Digite sua altura: ");
        // float altura = entrada.nextFloat();
        // System.out.println(altura);

        // Capturar strings
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println(nome);
    }
}
/**
 * Esta é uma revisão dos temas abaixo que foram estudados:
 * Imprimir um texto na tela;
 * Variáveis;
 * Operadores lógicos e aritméticos;
 * Constantes;
 * Entrada de dados;
 * Concatenação;
 * Comentários.
 */
import java.util.Scanner;

 public class Revisao1 {
    public static void main(String args[]) {
        System.out.println("------------------------- Revisao da Aula -------------------------");
        Scanner entry = new Scanner(System.in);
        
        System.out.print("Digite seu nome completo: ");
        final String name = entry.nextLine();
        System.out.print("Digite sua idade: ");
        int age = entry.nextInt();

        int birthAge = 1997;
        int futureYear = 2021;
        int futureAge = futureYear - birthAge;

        System.out.println("------------------------- Saida dos Dados -------------------------");
        System.out.println("Meu nome eh " + name + " tenho " + age + " anos de idade.");
        System.out.println("No ano de 2021 terei " + futureAge + " anos de idade.");
    }
}
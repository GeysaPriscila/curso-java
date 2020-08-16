/**
 * Exercício de criar uma tabuada
 */
import java.util.Scanner;

public class Tabuada{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual tabuada voce quer exibir? ");
        int n = entrada.nextInt();
        System.out.println();

        System.out.println("========== Tabuada de " + n + " ==========");
        System.out.println();

        for(int i=1; i<11; i++){
            System.out.println(i + " x " + n + " = " + (i*n));
        }
    }
}
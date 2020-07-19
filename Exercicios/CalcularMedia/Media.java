/**
 * Cálculo da média aritmetica
 */
import java.util.Scanner;

public class Media {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.println("********************Calculo da Media********************");

        System.out.print("Digite a primeira nota: ");
        n1 = entrada.nextDouble();

        System.out.print("Digite a segundaa nota: ");
        n2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        n3 = entrada.nextDouble();

        media = ((n1 + n2 + n3) / 3);

        System.out.println("****************************************");
        System.out.println("A media dos valores eh: " + media);
    }
}
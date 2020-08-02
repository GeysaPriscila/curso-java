import java.util.Scanner;

public class Meses{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o mes: ");
        String mes = entrada.nextLine();

        switch (mes) {
            case "Janeiro":
            case "Marco":
            case "Maio":
            case "Julho":
            case "Agosto":
            case "Outubro":
            case "Dezembro":
                System.out.println("Mes de 31 dias");
                break;
            case "Fevereiro":
                System.out.println("Mes de 28 ou 29 dias");
                break;
            default:
                System.out.println("Mes de 30 dias");
                break;
        }
    }
}
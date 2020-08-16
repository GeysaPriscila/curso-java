import java.util.Scanner;

public class EstruturasCondicionaisAninhadas {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Qual eh a idade: ");
        int idade = entrada.nextInt();

        System.out.println("Informe o sexo: ");
        System.out.println("1. Masculino");
        System.out.println("2. Feminino");
        
        System.out.print("Sexo: ");        
        int sexo = entrada.nextInt();

        if (idade >= 18) {
            if (sexo == 1) {
                System.out.println("Eh Homem");
            }else if (sexo == 2) {
                System.out.println("Eh Mulher");
            }else{
                System.out.println("Opcao invalida");
            }
        }else{
            if (sexo == 1) {
                System.out.println("Eh Menino");
            } else if (sexo == 2) {
                System.out.println("Eh Menina");
            } else {
                System.out.println("Opcao invalida");
            }
        }
    }
}
import java.util.Scanner;

public class CondicaoIfElse {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual eh sua idade: ");
        int idade = entrada.nextInt();

        if(idade <= 12){
            System.out.println("Eh uma crianca!");
        }else if(idade < 12 && idade <= 17){
            System.out.println("Eh um Adolescente!");
        }else if (idade < 17 && idade <= 29) {
            System.out.println("Eh um Jovem!");
        }else if (idade < 29 && idade <= 59) {
            System.out.println("Eh um Adulto!");
        }else{ // Idade > 59
            System.out.println("Eh um idoso!");
        }
    }
}
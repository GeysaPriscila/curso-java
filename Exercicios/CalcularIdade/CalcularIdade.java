/**
 * Calcular Idade
 * 
 * Implemente uma aplicação que deverá imprimir uma mensagem na tela solicitando que o usuário introduza o seu ano de nascimento, este valor deverá ser introduzido pelo usuário e armazenado nema variável de tipo inteiro.
 * Em seguida a aplicação deverá imprimir uma mensagem na tela solicitando que o usuário introduza o ano atual, e este valor deverá ser introduzido pelo usuário e armazenado numa variável de tipo inteiro.
 * A partir dos valores introduzidos pelo usuário a aplicação deverá calcular a sua idade, para isto a aplicação deverá subtrair do ano atual o ano de nascimento do usuário e como resultado obterá a sua idade atual, a qual deverá ser impressa na tela do computador precedida da mensagem "a sua idade é " para que o usuário possa ver o resultado, que ficará no formato semelhante ao exemplo a seguir, Exemplo de resultado: "A sua idade é 35".
 */
import java.util.Scanner;
public class CalcularIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = entrada.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = entrada.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("A sua idade e "+idade);
    }
}
import java.util.Scanner;

public class CalcularIMC {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        double altura, peso, valorIMC;
        System.out.println();
        
        System.out.print("Informe seu Peso: ");
        peso = entrada.nextDouble();
        System.out.print("Informe sua Altura: ");
        altura = entrada.nextDouble();

        valorIMC = peso / (altura * altura);

        if(valorIMC < 20){
            System.out.println();
            System.out.println("IMC = " + valorIMC + ", abaixo do peso!");
            System.out.println();
        }else if(valorIMC >= 20 && valorIMC <= 24){
            System.out.println();
            System.out.println("IMC = " + valorIMC + ", peso normal!");
            System.out.println();
        }else if(valorIMC >= 25 && valorIMC <= 29){
            System.out.println();
            System.out.println("IMC = " + valorIMC + ", acima do peso!");
            System.out.println();
        }else if(valorIMC >= 30 && valorIMC <= 34){
            System.out.println();
            System.out.println("IMC = " + valorIMC + ", obeso!");
            System.out.println();
        }else{
            System.out.println();
            System.out.println("IMC = " + valorIMC + ", muito obeso!");
            System.out.println();
        }
    }
}
/**
 * Operadores Logicos
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 2, b = 3;

        boolean result1 = (a > b) && (a != b);
        boolean result2 = (a < b) || (a == b);

        System.out.println(result1);
        System.out.println(result2);
    }
}
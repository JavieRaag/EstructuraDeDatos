package stack;
import java.util.Scanner;

public class BalanceDePP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el texto para verificar el balanceo de paréntesis y llaves:");
        String texto = scanner.nextLine();

        Stack<Character> pilaBalance = new Stack<>();
        pilaBalance.BalancePp(texto);
        scanner.close();
    }
}


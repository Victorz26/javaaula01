import java.util.Scanner;

public class exc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2)/2;

        System.out.println("a sua média é: " + media);
    }
}

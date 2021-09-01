import java.util.Scanner;

public class referenciado {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("digite um numero: ");
        int a = scanner.nextInt();

        System.out.println("digite um nome: ");
        String nome = scanner.nextLine();
        nome = scanner.nextLine();

        System.out.println("digite uma nota: ");
        double nota = scanner.nextDouble();

        System.out.println(a);
        System.out.println(nome);
        System.out.println(nota);
    }

}

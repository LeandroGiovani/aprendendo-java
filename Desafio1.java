import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        String nome = sc.nextLine();

        System.out.println("Insira sua idade:");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.printf("Olá %s, você é maior de idade%n", nome);
        } else if (idade >= 13) {
            System.out.printf("Olá %s, você é adolescente%n", nome);
        } else {
            System.out.printf("Olá %s, você é criança%n", nome);
        }

        sc.close();
    }
}

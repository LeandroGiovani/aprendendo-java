import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira seu nome:");
        String nome = sc.nextLine();

        System.out.println("Insira sua idade:");
        int idade = sc.nextInt();

        // Tratativa de dados
        if (idade > 120 || idade < 0 || nome.trim().isEmpty()) {
            System.out.println("Dados inválidos");
            sc.close();
            return;
        }
        
        // Classificações
        if (idade >= 18) {
            System.out.printf("Olá %s, você é um adulto de %d%n", nome, idade);
        } else if (idade >= 13) {
            System.out.printf("Olá %s, você é um adolescente de %d%n", nome, idade);
        } else {
            System.out.printf("Olá %s, você é uma criança de %d%n", nome, idade);
        }

        sc.close();
    }
}

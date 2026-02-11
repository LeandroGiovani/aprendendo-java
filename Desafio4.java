import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        int i = 0;
        
        List<Pessoa> pessoas = new ArrayList<>();
        
        try (Scanner sc = new Scanner(System.in)) {
            while (i < 3) {
                System.out.println("Insira um nome:");
                String nome = sc.nextLine();

                System.out.println("Insira uma idade:");
                int idade = sc.nextInt();
                sc.nextLine();

                try {
                    pessoas.add(new Pessoa(nome, idade));
                    i++;
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome() + " - " + p.classificar());
        }
    }
}

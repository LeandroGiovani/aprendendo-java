import java.util.Scanner;

public class Desafio3 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        System.out.println("Insira seu nome:"); 
        String nome = sc.nextLine();
        
        System.out.println("Insira sua idade:"); 
        int idade = sc.nextInt(); 
        
        try {
            Pessoa pessoaDesafio = new Pessoa(nome, idade);
            System.out.println(pessoaDesafio.classificar());
        } catch (Exception e) { 
            System.err.println(e);
        } finally {
            sc.close(); 
        }
    } 
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while (true) { 
            System.out.println("/n=====MENU======");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Listar");
            System.out.println("[3] - Buscar por nome");
            System.out.println("[4] - Remover por nome");
            System.out.println("[0] - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome:");
                    String nome = sc.nextLine();

                    System.out.println("Idade:");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    try {
                        Pessoa nova_pessoa = new Pessoa(nome, idade);
                        pessoas.add(nova_pessoa);
                        System.out.println("Nova pessoa cadastrada!");
                    } catch (IllegalArgumentException e) {
                        throw new IllegalArgumentException(e.getMessage());
                    }

                    break;
                case 2:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        System.out.println("Lista de pessoas:");
                        for (Pessoa p : pessoas) {
                            System.out.println(p.getNome() + " - " + p.classificar());
                        }
                    }

                    break;
                case 3:
                    System.out.println("Nome que deseja buscar:");
                    String buscaNome = sc.nextLine();
                    boolean encontrada = false;

                    for (Pessoa p : pessoas) {
                        if (p.getNome().equalsIgnoreCase(buscaNome)) {
                            System.out.println("Encontrada: " + p.getNome() + " - " + p.classificar());
                            encontrada = true;
                        }
                    }

                    if (!encontrada) {
                        System.out.println(buscaNome + " não encontrada.");
                    }

                    break;
                case 4:
                    System.out.println("Nome que deseja remover:");
                    String removerNome = sc.nextLine();
                    boolean removido = pessoas.removeIf(pessoa -> pessoa.getNome().equalsIgnoreCase(removerNome));

                    if (removido) {
                        System.out.println("Pessoa removida com sucesso!");
                    } else {
                        System.out.println("Pessoa não encontrada no sistema.");
                    }
                    break;
                case 0:
                    sc.close();
                    System.out.println("Saindo do sistema...");
                default:
                    System.out.println("Opção inválida");
            }

        }

    }
}
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O campo nome é obrigatório.");
        }

        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida.");
        }

        this.nome = nome;
        this.idade = idade;
    }

    public String classificar() {
        if (this.idade >= 18) {
            return "Adulto";
        } else if (this.idade >= 13) {
            return "Adolescente";
        } else {
            return "Criança";
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}

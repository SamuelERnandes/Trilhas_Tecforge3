import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Universidade universidade;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }


    public Universidade getUniversidade() {
        return universidade;
    }

    // Método que exibe informações sobre a pessoa e sua universidade
    public void informarDados() {
        if (universidade != null) {
            System.out.println(nome + " trabalha na universidade " + universidade.getNome());
        } else {
            System.out.println(nome + " não está associado a nenhuma universidade.");
        }
    }
}

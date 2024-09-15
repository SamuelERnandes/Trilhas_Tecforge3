import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Universidade princeton = new Universidade("Princeton, Nova Jersey - Estados Unidos da América");
        Universidade cambridge = new Universidade("Cambridge, Inglaterra");


        Pessoa einstein = new Pessoa("Albert Einstein", LocalDate.of(1879, 3, 14));
        Pessoa newton = new Pessoa("Isaac Newton", LocalDate.of(1643, 1, 4));


        einstein.setUniversidade(princeton);
        newton.setUniversidade(cambridge);


        einstein.informarDados();
        newton.informarDados();
    }
}

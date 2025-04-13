package firstClasses;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Guilherme");
        nomes.add("Lucas");
        nomes.add("João");
        // for(String nome: nomes){
        //     System.out.println("O nome é: " + nome);
        // }
        // nomes.forEach(System.out::println);  
        nomes.forEach(nome -> {
            System.out.println("O nome que apareceu foi: " + nome);
        });
    }  
}

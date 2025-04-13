package firstClasses;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> mapa = Map.of(
            "Guilherme", 10,
            "Lucas", 20,
            "João", 30
        );
        System.out.println("Map: " + mapa);
    }
}

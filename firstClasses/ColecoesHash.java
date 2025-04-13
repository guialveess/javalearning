package firstClasses;
import java.util.HashMap;
import java.util.Map;

public class ColecoesHash {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Guilherme", 10);
        notas.put("Gustavo", 9);
        notas.put("Luiz", 6);
        //System.out.println("Nota do Guilherme: " + notas.get("Gustavo"));
        //var notinhas = notas.get("Gustavo");
        //System.out.println("A nota de Gustavo foi:" + notinhas);
        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Nota: " + entry.getValue());
        }
    }
}

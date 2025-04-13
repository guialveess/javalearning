package Constructor;

public class TestConstructor {

    public static void main(String[] args) {
        Constructor constructor =  new Constructor(5); // Construtor com parâmetro
        Constructor constructor2 = new Constructor("Hello World 2");
        constructor.setNumero(10);
        constructor2.setTexto("Hello World 2");
        System.out.println(constructor.getNumero());
        System.out.println(constructor2.getTexto());
    }

}
 
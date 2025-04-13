package Constructor;

public class Constructor { // É um metodo especial que é chamado quando um objeto é chamado ou instanciado
                           // (Inicializar atributos tb)

    private int numero;
    private String texto;

    public Constructor(int numero) { // Construtor com parâmetros
        this.numero = numero;

    }

    public Constructor(String string) {
       this.texto = string;
    }

    public void setNumero(int numero) { 
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }


}

package Exceptions;

public class ExceptionsChecked { // Exceções utilizamos para lidar com erros, ou informar algum erro pra aplicação (Situações excepcionais)
    // Checked Exception: São exceções que o compilador obriga a tratar, ou seja, são obrigatórias
    // Unchecked Exception: São exceções que o compilador não obriga a tratar, ou seja, são opcionais

    public static void main(String[] args) throws Exception { 
        // try /catch
        try {
            validarNumero();
        } catch(Exception e) {
            System.out.println("Deu ruim");
            e.printStackTrace(); // Detalhe do erro
        }
        
    }

    public static void validarNumero() throws Exception { // Static significa que o método pode ser chamado sem instanciar a classe
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O Número menor que 100");
        } else {
            System.out.println("O número é maior que 100");
        }
    }
}

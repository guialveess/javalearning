package Exceptions;

import Person.Person;

public class ExceptionsUnchecked { 
    public static void main(String[] args) throws Exception { 
       Person p = null;
       p.getCpf(); // NullPointerException
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

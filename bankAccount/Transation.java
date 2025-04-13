package bankAccount;

// Conceito de Encapsulamento
// Atributos privados
// Métodos públicos

public class Transation {
    public static void main(String[] args) {

        BankAccount contabancaria1 = new BankAccount();
        contabancaria1.setNumero("1234");
    
        contabancaria1.setTitular("Guilherme Alves");

        contabancaria1.depositar(150);

        contabancaria1.sacar(100);

        System.out.println("Seu saldo é de: " + contabancaria1.getSaldo());
    }
}

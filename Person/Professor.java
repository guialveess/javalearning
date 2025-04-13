package Person;

// Aprendendo extends que é herança
// Aluno e Professor herdam de Pessoa
// Aluno e Professor são subclasses de Pessoa

public class Professor extends Person {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Sobrescreveu o método da classe pai Person

    String imprimirDadosDaPessoa() {
        System.out.println(super.imprimirDadosDaPessoa()); // Super Siginifica que ele vai até a classe pai Person (Polimorfismo)
        return "Você é professor"; 
    }

}

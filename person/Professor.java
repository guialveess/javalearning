package person;

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

}

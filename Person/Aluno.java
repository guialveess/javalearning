package Person;

// Aluno e Professor herdam de Pessoa

public class Aluno extends Person {

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    String imprimirDadosDaPessoa() {
        System.out.println(super.imprimirDadosDaPessoa()); // Super Siginifica que ele vai até a classe pai Person
        return "Você é aluno";
    }
}

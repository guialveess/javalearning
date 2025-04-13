package Person;

// Aprendendo extends que é herança
// Aluno e Professor herdam de Pessoa
// Aluno e Professor são subclasses de Pessoa

public class TestPerson extends Person{
    public static void main(String[] args) {
        Professor professor = new Professor(); // Construtor padrão
        professor.setCpf("123.434.212-12");
        professor.setNome("Gustavo");
        professor.setSobrenome("Alves");
        professor.setIdade(19);
        professor.setSalario(2000.00);

        System.out.println(professor.imprimirDadosDaPessoa());

        // Instancia de Aluno  
        Aluno aluno = new Aluno();
        aluno.setCpf("123.434.212-12");
        aluno.setNome("Guilherme");
        aluno.setSobrenome("Souza");
        aluno.setIdade(19);
        aluno.setMatricula("123456789");
        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}

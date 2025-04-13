package Person;

public class Person {
    //nome, idade, cpf
    // tipo, nomedaVariavel
    private String nome;
    private String sobrenome;
    private String cpf;
    int idade;

    // Getters e Setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    

    String imprimirDadosDaPessoa(){
       return "O nome da pessoa é: " + nome + "" + sobrenome +  ", a idade é: " + idade + ", e o cpf é: " + cpf + ", e o indice é: ";
    }
}

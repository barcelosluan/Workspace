package tp_aula13.curso;

public class Aluno {

    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        setNome(nome);
        setMatricula(matricula);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

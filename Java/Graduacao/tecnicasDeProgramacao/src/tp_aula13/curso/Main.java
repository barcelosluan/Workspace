package tp_aula13.curso;

public class Main {

    public static void main(String[] args) {

        Curso java = new Curso("Curso de Java", 40);
        Curso android = new Curso("Curso de Android", 30);
        Curso web = new Curso("Curso de WEB", 50);

        Instrutor felipe = new Instrutor("Felipe");
        Instrutor ivan = new Instrutor("Ivan");
        java.setInstrutor(felipe);
        android.setInstrutor(ivan);

        Aluno ana = new Aluno("Ana", "1001");
        Aluno jose = new Aluno("José", "1002");
        Aluno nelson = new Aluno("Nelson", "1003");
        Aluno jaqueline = new Aluno("Jaqueline", "1004");
        Aluno thais = new Aluno("Thais", "1005");
        Aluno john = new Aluno("John", "1006");

        java.setAlunos(ana);
        java.setAlunos(jose);
        java.setAlunos(nelson);
        java.setAlunos(jaqueline);
        android.setAlunos(ana);
        android.setAlunos(jose);
        android.setAlunos(thais);
        android.setAlunos(john);

        System.out.println("O curso " + java.getNome() + " tem o instrutor: " + java.getInstrutor() +
                " tem " + (java.getAlunosMatriculados() + 1) + " alunos matriculados que são: " + java.getAlunosCurso());
        System.out.println("O curso " + android.getNome() + " tem o instrutor: " + android.getInstrutor() +
                " tem " + (android.getAlunosMatriculados() + 1) + " alunos matriculados que são: " + android.getAlunosCurso());
        // Teste de curso sem Instrutor e sem Aluno
        System.out.println("O curso " + web.getNome() + " tem o instrutor: " + web.getInstrutor() +
                " e os alunos são: " + web.getAlunosCurso());

        System.out.println("Os alunos que fazem os cursos " + java.getNome() + " e " + android.getNome() +
                " simultâneamente são: " + Curso.compareCursos(java, android));
    }
}

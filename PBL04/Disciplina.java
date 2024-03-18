package PBL04;

public class Disciplina {
    private String nome;
    private Professor professor;
    private Aluno[] alunos;
    private int qtdeAlunos = 0;

    public Disciplina(String nomeDisciplina, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public Disciplina(String nomeDisciplina, String nomeProf, String codRh) {
        this.nome = nome;
        this.professor = new Professor(nomeProf, codRh);
    }

    public void matricularAluno(Aluno aluno) {
        if (qtdeAlunos == 10) {
            System.out.println("Limite de alunos atingido");
            return;
        }
        alunos[qtdeAlunos] = aluno;
        qtdeAlunos++;
        System.out.println(aluno.getNome() + " matriculado");
    }

    public void imprimirInfo() {
        System.out.print("\n--------INFO DISCIPLINA--------\n");
        System.out.print("Disciplina: " + this.nome + "\nProfessor: " + this.professor.getNome() + "\n");
        System.out.println("Alunos Matriculados: ");
        for (int i = 0; i < qtdeAlunos; i++) {
            System.out.println(alunos[i].getNome());
        }
        System.out.print("-------------------------------\n\n");
    }

    public void substiturProfessor(String nome, String codRh) {
        this.professor.setNome(nome);
        this.professor.setCodRh(codRh);
    }

    public Professor getProfessor() {
        return professor;
    }
}

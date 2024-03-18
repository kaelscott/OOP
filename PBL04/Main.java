package PBL04;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Marina", "74123698");
        Disciplina disciplina = new Disciplina("POO", professor);
        Aluno aluno = new Aluno("Gabriel", "852741963");

        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(aluno);
        disciplina.matricularAluno(new Aluno("Lucas", "24234234"));
        disciplina.matricularAluno(new Aluno("Davi", "3423483"));
        Escola politecnica = new Escola(new Professor("Marina", "74123698"));

        System.out.println("Nome do professor na classe Main: " + professor.getNome());
        disciplina.imprimirInfo();
        System.out.println("Professor da politécnica: " + politecnica.getNomeProfessor() + "\n");

    }
}

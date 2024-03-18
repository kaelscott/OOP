package PBL04;

public class Escola {
    private Professor professor;

    public Escola(Professor professor) {
        this.professor = professor;
    }

    public String getNomeProfessor() {
        return professor.getNome();
    }
}

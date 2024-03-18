package PBL04;

public class Professor {
    private String nome;
    private String codRh;

    public Professor(String nome, String codRh) {
        this.nome = nome;
        this.codRh = codRh;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodRh() {
        return codRh;
    }
    public void setCodRh(String codRh) {
        this.codRh = codRh;
    }
}

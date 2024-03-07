package PBL03.Classes;

public class Usuario {
    private String nome;
    private String tipoDeConta;
    private String foto;
    private String email;
    private String senha;

    // construtor sem parâmetros
    public Usuario() {
        this.nome = "Nome";
        this.tipoDeConta = "Conta";
        this.foto = "foto.jpg";
        this.email = "email";
        this.senha = "senha";
    }
    // construtor com parâmetros
    public Usuario(String nome, String tipoDeConta, String foto, String email, String senha) {
        this.nome = nome;
        this.tipoDeConta = tipoDeConta;
        this.foto = foto;
        this.email = email;
        this.senha = senha;
    }

    // getters e setters
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoDeConta() {
        return this.tipoDeConta;
    }
    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
    public String getSenha() {
        return this.senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void logar() {
        System.out.println("Logando...");
    }
    public void trocarFoto() {
        System.out.println("Trocando foto...");
    }
    public void trocarSenha() {
        System.out.println("Trocando senha...");
    }
    public void trocarNome() {
        System.out.println("Trocando nome...");
    }
    public void UpgradeConta() {
        System.out.println("Upgrade de conta...");
    }

}



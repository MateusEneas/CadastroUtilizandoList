package projeto1.entities;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String email;
    private String genero;
    private String cpf;

    private List<Pessoa> cadastros = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String genero, String cpf) {
        this.nome = nome;
        this.email = email;
        this.genero = genero;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Pessoa> getCadastros() {
        return cadastros;
    }

    public void addCadastro (Pessoa addCadastro){
        cadastros.add(addCadastro);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nEmail: " + email + "\nGênero: " + genero + "\nCPF: " + cpf ;
    }
}

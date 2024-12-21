package br.com.magnata19;

public class Pessoa {

    private Long id;
    private String nome;
    private String cpf;

    public Pessoa(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}

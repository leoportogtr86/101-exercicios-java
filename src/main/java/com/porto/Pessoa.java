package com.porto;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public void info() {
        System.out.println(this.toString());
    }

    public void hello() {
        System.out.println("Hello, from Pessoa.");
    }
}

//25. **Classe simples:** Crie uma classe "Pessoa" com atributos nome e
// idade e um método para imprimir as informações.

//26. **Construtores:** Adicione um construtor à classe "Pessoa" que
// inicialize os atributos nome e idade.


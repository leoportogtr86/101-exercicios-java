package com.porto.model;

public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "curso='" + curso + '\'' +
                '}';
    }

    @Override
    public void hello() {
        System.out.println("Hello, from Estudante.");
    }
}

//27. **Herança:** Crie uma classe "Estudante" que herda de "Pessoa" e adicione o atributo "curso".
//28. **Polimorfismo:** Implemente métodos na classe "Pessoa" e sobrescreva-os na classe "Estudante".

package com.porto.model;

import com.porto.interfaces.Trabalhador;

public class Funcionario implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Funcionário está trabalhando.");
    }
}

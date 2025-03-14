package com.fatec.projeto.projeto2025.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cliente {
    private Long id;
    private String nome;
    private Integer idade;

    // Construtores
    public Cliente() {}

    public Cliente(Long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

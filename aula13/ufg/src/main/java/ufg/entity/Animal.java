package ufg.entity;

public abstract class Animal {

    String nome;
    int idade;

    public String fazerBarulho() {
        return "....";
    }

    public String getNome() {
        return nome;
    }
}

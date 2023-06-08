package br.ufg;

public class Cachorro extends Animal implements  Corredor{

    public String fazerBarulho() {
        return "AUAUAAUAU";
    }

    @Override
    public String correr() {
        return "Cachorro corre com vivacidade!\n";
    }
}

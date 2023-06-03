package ufg.entity;

public class Cavalo extends Animal implements Corredor{

    public String fazerBarulho() {
        return "IIIHRRRNRNN";
    }

    @Override
    public String correr() {
        return null;
    }
}

package br.ufg;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Jaula {

    Animal animal;
    public  Jaula(Animal animal){

        this.animal = animal;
    }

    public String passarPelaJaula(){
        return this.animal.fazerBarulho();
    }






}

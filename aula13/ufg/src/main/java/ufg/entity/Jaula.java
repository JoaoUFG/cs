package ufg.entity;
import ufg.entity.*;

public class Jaula {

    Animal animal;
    public  Jaula(Animal animal){

        this.animal = animal;
    }

    public String passarPelaJaula(){
        return this.animal.fazerBarulho();
    }






}

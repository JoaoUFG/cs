package ufg.entity;
import ufg.entity.*;
import ufg.exception.AnimalInvalidoException;

public class Veterinario {

    public String examinarAnimal(Animal animal) throws AnimalInvalidoException {
        if(
                !(animal instanceof Cavalo) &&
                !(animal instanceof Cachorro) &&
                !(animal instanceof Preguica )
        ) throw new AnimalInvalidoException("O animal recebido não é válido! Ele é do tipo: "+ animal.getClass().getName());

        return animal.fazerBarulho();
    }


}

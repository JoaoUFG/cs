import br.ufg.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class AnimalTeste {
    List<Animal> animais = new ArrayList<>();
    AnimalTeste(){


        animais.add(new Cachorro());
        animais.add(new Cavalo());
        animais.add(new Preguica());

    }
    @Test
    public void testeBarulhoDoAnimal(){
        String barulhoTotal = "";
        for (Animal barulhento : animais) {
            barulhoTotal+= barulhento.fazerBarulho();
        }
        Assertions.assertTrue(barulhoTotal.contains("....."));
        Assertions.assertTrue(barulhoTotal.contains("IIIHRRRNRNN"));
    }

    @Test
    public void exameTeste(){
        Veterinario veterinario = new Veterinario();
        for (Animal animal : animais) {
            Assertions.assertTrue(veterinario.examinarAnimal(animal).equals(""));

        }

    }

    @Test
    public void passarPelaJaula(){
        Zoologico zoologico = new Zoologico();
         var jaulas = new ArrayList<Jaula>();
         jaulas.add(new Jaula(new Cavalo()));
        jaulas.add(new Jaula(new Preguica()));
        jaulas.add(new Jaula(new Cavalo()));
        jaulas.add(new Jaula(new Cavalo()));
        jaulas.add(new Jaula(new Preguica()));
        jaulas.add(new Jaula(new Cavalo()));
        jaulas.add(new Jaula(new Cavalo()));
        jaulas.add(new Jaula(new Preguica()));
        jaulas.add(new Jaula(new Cavalo()));
        jaulas.add(new Jaula(new Cachorro()));
        zoologico.getJaulas().addAll(jaulas);

        System.out.println("Passando pelas jaulas... \n");
        zoologico.getJaulas().forEach(jaula -> {
            System.out.println(jaula.passarPelaJaula());
            Assertions.assertTrue(jaula.passarPelaJaula()!=null);

        });

    }



}

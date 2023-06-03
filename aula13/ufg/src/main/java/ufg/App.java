package ufg;
import ufg.entity.*;
import ufg.exception.AnimalInvalidoException;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
            ArrayList<Animal> objects = new ArrayList<>();
            objects.add(new Cavalo());
            objects.add(new CaoMecanico("EKH-9802"));
            var veterinario = new Veterinario();
            objects.forEach(obj -> {
                try{
                    veterinario.examinarAnimal(obj);

                }catch (AnimalInvalidoException e){
                    System.out.println(e.getMessage());
                }

            });


    }
}

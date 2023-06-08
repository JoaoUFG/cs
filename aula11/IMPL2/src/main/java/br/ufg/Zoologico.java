package br.ufg;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

   ArrayList<Jaula> jaulas;

    public Zoologico(){
        jaulas = new ArrayList<>();
    }


    public ArrayList<Jaula> getJaulas() {
        return jaulas;
    }
}

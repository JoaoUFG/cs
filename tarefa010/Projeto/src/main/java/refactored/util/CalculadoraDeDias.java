package refactored.util;

import refactored.Main;

public class CalculadoraDeDias {
    public static int calcularDias(String[] lista) {
        Main.msg(lista[0]);
        int ano= Integer.parseInt(lista[0]);
        int meses = Integer.parseInt(lista[1]);
        int dias = Integer.parseInt(lista[2]);
        return ((ano*365)+(meses*30)+(dias));
    }
}

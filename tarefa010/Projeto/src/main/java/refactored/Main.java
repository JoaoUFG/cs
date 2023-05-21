package refactored;

import refactored.util.CalculadoraDeDias;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
    msg("Digite a idade no seguinte formato: <anos>,<meses>,<dias>\n ex: 3,2,15");
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String entradaFormatada = entrada.replace(","," ");

        int dias = CalculadoraDeDias.calcularDias(entradaFormatada.split(" "));
        msg(String.valueOf(dias));

    }

    public static void msg(String msg){
            logger.info(msg);
    }

}
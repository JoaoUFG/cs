package org.joao;

import org.joao.util.CalculadoraDeDias;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    msg("Digite a idade no seguinte formato: <anos>,<meses>,<dias>\n ex: 3,2,15");
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String entradaFormatada = entrada.replaceAll(","," ");

        int dias = CalculadoraDeDias.calcularDias(entradaFormatada.split(" "));
        msg(String.valueOf(dias));

    }

    public static void msg(String msg){
         System.out.println(msg);
    }

}
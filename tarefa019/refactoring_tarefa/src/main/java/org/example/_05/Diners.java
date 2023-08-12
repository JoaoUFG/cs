package org.example._05;


public class Diners extends Cartao {
    public static final int BANDEIRA = 4;

    @Override
    public int getBandeira() {
        return BANDEIRA;
    }

    @Override
    protected boolean validarFormato(String numero) {
        // tamanho 14, prefixos 300 305, 36 e 38.
        return numero.matches("^3[68]\\d{12}|0[0-5]\\d{11}$");
    }
}
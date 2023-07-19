package org.example._05;

public class Mastercard extends Cartao {
    public static final int BANDEIRA = 2;

    @Override
    public int getBandeira() {
        return BANDEIRA;
    }

    @Override
    protected boolean validarFormato(String numero) {
        // tamanho 16, prefixos 51 a 55
        return numero.matches("^5[1-5]\\d{14}$");
    }
}


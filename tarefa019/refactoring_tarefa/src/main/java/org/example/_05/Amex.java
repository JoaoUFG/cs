package org.example._05;

public class Amex extends Cartao {
    public static final int BANDEIRA = 3;

    @Override
    public int getBandeira() {
        return BANDEIRA;
    }

    @Override
    protected boolean validarFormato(String numero) {
        // tamanho 15, prefixos 34 e 37.
        return numero.matches("^3[47]\\d{13}$");
    }
}


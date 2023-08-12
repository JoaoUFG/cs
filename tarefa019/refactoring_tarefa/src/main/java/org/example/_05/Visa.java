package org.example._05;

public class Visa extends Cartao {
    public static final int BANDEIRA = 1;

    @Override
    public int getBandeira() {
        return BANDEIRA;
    }

    @Override
    protected boolean validarFormato(String numero) {
        // tamanhos 13 ou 16, prefixo 4.
        return numero.matches("^4(\\d{12}|\\d{15})$");
    }
}



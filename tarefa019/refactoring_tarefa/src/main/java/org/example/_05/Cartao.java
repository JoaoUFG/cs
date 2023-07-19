package org.example._05;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Cartao {
    public static final Boolean CARTAO_OK = true;
    public static final Boolean CARTAO_ERRO = false;

    public abstract int getBandeira();

    public Boolean validar(String numero, String validade) throws ParseException {
        boolean validadeOK = validarValidade(validade);
        if (!validadeOK) {
            throw new IllegalArgumentException("Data de validade inválida.");
        } else {
            String formatado = removerNaoNumericos(numero);
            boolean formatoOK = validarFormato(formatado);
            if (!formatoOK) {
                throw new IllegalArgumentException("Número do cartão inválido.");
            } else {
                boolean luhnValido = validarLuhn(formatado);
                if (!luhnValido) {
                    throw new IllegalArgumentException("Número do cartão inválido.");
                } else {
                    return CARTAO_OK;
                }
            }
        }
    }

    private boolean validarValidade(String validade) throws ParseException {
        Date dataValidade = new SimpleDateFormat("MM/yyyy").parse(validade);
        Calendar calValidade = new GregorianCalendar();
        calValidade.setTime(dataValidade);

        // apenas mês e ano são utilizados na validação
        Calendar calTemp = new GregorianCalendar();
        Calendar calHoje = (GregorianCalendar) calValidade.clone();
        calHoje.set(Calendar.MONTH, calTemp.get(Calendar.MONTH));
        calHoje.set(Calendar.YEAR, calTemp.get(Calendar.YEAR));

        return calHoje.before(calValidade);
    }

    private String removerNaoNumericos(String numero) {
        return numero.replaceAll("[^0-9]", "");
    }

    private boolean validarLuhn(String numero) {
        int soma = 0;
        int digito;
        int somafim;
        boolean multiplica = false;

        for (int i = numero.length() - 1; i >= 0; i--) {
            digito = Integer.parseInt(numero.substring(i, i + 1));
            if (multiplica) {
                somafim = digito * 2;
                if (somafim > 9) {
                    somafim -= 9;
                }
            } else {
                somafim = digito;
            }
            soma += somafim;
            multiplica = !multiplica;
        }

        int resto = soma % 10;
        return resto == 0;
    }

    protected abstract boolean validarFormato(String numero);
}

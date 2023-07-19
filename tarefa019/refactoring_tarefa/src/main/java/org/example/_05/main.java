package org.example._05;

import java.text.ParseException;

public class main {
    public static void main(String[] args) {
        // Números de cartão válidos
        String numeroVisa = "4111 1111 1111 1111"; // VISA
        String numeroMastercard = "5555 5555 5555 4444"; // Mastercard
        String numeroAmex = "3782 822463 10005"; // American Express
        String numeroDiners = "3056 9309 0259 04"; // Diners

        // Datas de validade corretas (MM/yyyy)
        String validade = "07/2025";

        Cartao visa = new Visa();
        Cartao mastercard = new Mastercard();
        Cartao amex = new Amex();
        Cartao diners = new Diners();

        try {
            System.out.println("Visa: " + visa.validar(numeroVisa, validade));
            System.out.println("Mastercard: " + mastercard.validar(numeroMastercard, validade));
            System.out.println("Amex: " + amex.validar(numeroAmex, validade));
            System.out.println("Diners: " + diners.validar(numeroDiners, validade));
        } catch (ParseException e) {
            System.out.println("Data de validade inválida: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Número do cartão inválido: " + e.getMessage());
        }
    }
}

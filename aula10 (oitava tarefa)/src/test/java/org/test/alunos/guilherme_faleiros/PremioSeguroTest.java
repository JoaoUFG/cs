package org.test.alunos.guilherme_faleiros;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PremioSeguroTest {

    @Test
    public void testeFemininoSolteira18Anos() {
        final Cliente cliente = new Cliente(
                "Joana",
                "70876660103",
                "01/01/2003",
                "Feminino",
                "Solteira",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(5.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeFemininoSolteira25Anos() {
        final Cliente cliente = new Cliente(
                "Joana",
                "70876660103",
                "01/01/1998",
                "Feminino",
                "Solteira",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(5.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeFemininoSolteira26Anos() {
        final Cliente cliente = new Cliente(
                "Joana",
                "70876660103",
                "01/01/1996",
                "Feminino",
                "Solteira",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(15.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeFemininoSolteira60Anos() {
        final Cliente cliente = new Cliente(
                "Joana",
                "70876660103",
                "01/01/1963",
                "Feminino",
                "Solteira",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(15.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeFemininoCasada18Anos() {
        final Cliente cliente = new Cliente(
                "Joana",
                "70876660103",
                "01/01/2003",
                "Feminino",
                "Casada",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(10.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeFemininoCasada25Anos() {
        final Cliente cliente = new Cliente(
                "Joana",
                "70876660103",
                "01/01/1998",
                "Feminino",
                "Casada",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(10.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeFemininoCasada26Anos() {
        final Cliente cliente = new Cliente(
                "Joana",
                "70876660103",
                "01/01/1996",
                "Feminino",
                "Casada",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(30.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeFemininoCasada60Anos() {
        final Cliente cliente = new Cliente(
                "Joana",
                "70876660103",
                "01/01/1962",
                "Feminino",
                "Casada",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(30.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeMasculinoSolteiro18Anos() {
        final Cliente cliente = new Cliente(
                "João",
                "70876660103",
                "01/01/2003",
                "Masculino",
                "Solteiro",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(0.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeMasculinoSolteiro25Anos() {
        final Cliente cliente = new Cliente(
                "João",
                "70876660103",
                "01/01/1998",
                "Masculino",
                "Solteiro",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(0.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeMasculinoSolteiro26Anos() {
        final Cliente cliente = new Cliente(
                "João",
                "70876660103",
                "01/01/1996",
                "Masculino",
                "Solteiro",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(10.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeMasculinoSolteiro60Anos() {
        final Cliente cliente = new Cliente(
                "João",
                "70876660103",
                "01/01/1962",
                "Masculino",
                "Solteiro",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(10.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeMasculinoCasado18Anos() {
        final Cliente cliente = new Cliente(
                "João",
                "70876660103",
                "01/01/2003",
                "Masculino",
                "Casado",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(5.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeMasculinoCasado25Anos() {
        final Cliente cliente = new Cliente(
                "João",
                "70876660103",
                "01/01/1998",
                "Masculino",
                "Casado",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(5.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeMasculinoCasado26Anos() {
        final Cliente cliente = new Cliente(
                "João",
                "70876660103",
                "01/01/1996",
                "Masculino",
                "Casado",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(20.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

    @Test
    public void testeMasculinoCasado60Anos() {
        final Cliente cliente = new Cliente(
                "João",
                "70876660103",
                "01/01/1962",
                "Masculino",
                "Casado",
                "Brasileira",
                "12345678910"
        );
        final PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        assertEquals(20.00, premioSeguro.getPercentualDesconto(), 0.01);
    }

}
//quatro casos de teste falharam
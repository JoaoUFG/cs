package org.test.alunos.gustavo_henrique;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertEquals;


public class PremioSeguroTest {

    PremioSeguro premio;
    Cliente cliente;

    @Test
    public void testaCenarioMulherSolteiraMenorIgual25() {
        cliente = new Cliente("Maria", "113.431.673-96", "20/10/2001",
                "Feminino", "Solteira", "Brasileira", "");

        premio = new PremioSeguro(cliente);
        premio.obtemPercentualDesconto();
        Double resultadoEsperado = 5.0;
        try {
            assertEquals(resultadoEsperado, premio.getPercentualDesconto());
        } catch (Exception e){
            // TODO: handle exception
        }
    }

    @Test
    public void testaCenarioMulherSolteiraMaior25Menor75() {
        cliente = new Cliente("Joana", "113.431.673-96", "07/10/1990",
                "Feminino", "Solteira", "Brasileira", "");

        premio = new PremioSeguro(cliente);
        premio.obtemPercentualDesconto();
        Double resultadoEsperado = 15.0;
        try {
            assertEquals(resultadoEsperado, premio.getPercentualDesconto());
        } catch (Exception e){
            // TODO: handle exception
        }
    }

    @Test
    public void testaCenarioMulherCasadaMenorIgual25() {
        cliente = new Cliente("Paula", "113.431.673-96", "20/10/2002",
                "Feminino", "Casada", "Brasileira", "");

        premio = new PremioSeguro(cliente);
        premio.obtemPercentualDesconto();
        Double resultadoEsperado = 10.0;
        try {
            assertEquals(resultadoEsperado, premio.getPercentualDesconto());
        } catch (Exception e){
            // TODO: handle exception
        }
    }

    @Test
    public void testaCenarioMulherCasadaMaior25Menor75() {
        cliente = new Cliente("Erica", "113.431.673-96", "20/10/1990",
                "Feminino", "Casada", "Brasileira", "");

        premio = new PremioSeguro(cliente);
        premio.obtemPercentualDesconto();
        Double resultadoEsperado = 30.0;
        try {
            assertEquals(resultadoEsperado, premio.getPercentualDesconto());
        } catch (Exception e){
            // TODO: handle exception
        }
    }

    @Test
    public void testaCenarioHomemSolteiroMenorIgual25() {
        cliente = new Cliente("Carlos", "112.242.037-47", "14/05/1997",
                "Masculino", "Solteiro", "Brasileira", "");

        premio = new PremioSeguro(cliente);
        premio.obtemPercentualDesconto();
        Double resultadoEsperado = 0.0;
        try {
            assertEquals(resultadoEsperado, premio.getPercentualDesconto());
        } catch (Exception e){
            // TODO: handle exception
        }
    }

    @Test
    public void testaCenarioHomemSolteiroMaior25Menor75() {
        cliente = new Cliente("Pedro", "112.242.037-47", "14/09/1982",
                "Masculino", "Solteiro", "Brasileira", "");

        premio = new PremioSeguro(cliente);
        premio.obtemPercentualDesconto();
        Double resultadoEsperado = 10.0;
        try {
            assertEquals(resultadoEsperado, premio.getPercentualDesconto());
        } catch (Exception e){
            // TODO: handle exception
        }
    }

    @Test
    public void testaCenarioHomemCasadoMenorIgual25() {
        cliente = new Cliente("Otavio", "112.242.037-47", "14/09/1998",
                "Masculino", "Casado", "Brasileira", "");

        premio = new PremioSeguro(cliente);
        premio.obtemPercentualDesconto();
        Double resultadoEsperado = 5.0;
        try {
            assertEquals(resultadoEsperado, premio.getPercentualDesconto());
        } catch (Exception e){
            // TODO: handle exception
        }
    }

    @Test
    public void testaCenarioHomemCasadoMaiorDe25Menor75() {
        cliente = new Cliente("Marcelo", "112.242.037-47", "09/09/1992",
                "Masculino", "Casado", "Brasileira", "");

        premio = new PremioSeguro(cliente);
        premio.obtemPercentualDesconto();
        Double resultadoEsperado = 20.0;
        try {
            assertEquals(resultadoEsperado, premio.getPercentualDesconto());
        } catch (Exception e){
            // TODO: handle exception
        }
    }
}

//todos os casos de teste falhara pelo uso de um CPF inválido
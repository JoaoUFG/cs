package org.test.alunos.felipe_silveira;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//Casos de invalidez nos dados dos clientes testados na ClienteTest
public class PremioSeguroTest {

    Cliente cliente;

    @Before
    public void setup() {
        cliente = new Cliente("Felipe", "19836808000", "01/07/1999", "Masculino", "Solteiro", "Brasileira", "A");
    }
    
    @Test
    public void calculaDesconteMulherSolteriaJovem() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        PremioSeguro seguro = new PremioSeguro(cliente);
        seguro.setValorSeguro(10.0);
        seguro.obtemPercentualDesconto();
        seguro.calculaValorComDesconto();
        //assert seguro.getPercentualDesconto() == 5.00;
        //assert seguro.getValorSeguroComDesconto() == 9.50;

        assertTrue(seguro.getPercentualDesconto() == 5.00);
        assertTrue(seguro.getValorSeguroComDesconto() == 9.50);
    }

    @Test
    public void calculaDesconteMulherCasadaJovem() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        PremioSeguro seguro = new PremioSeguro(cliente);
        seguro.setValorSeguro(10.0);
        seguro.obtemPercentualDesconto();
        seguro.calculaValorComDesconto();
        //assert seguro.getPercentualDesconto() == 10.00;
        //assert seguro.getValorSeguroComDesconto() == 9.00;

        assertTrue(seguro.getPercentualDesconto() == 10.00);
        assertTrue(seguro.getValorSeguroComDesconto() == 9.00);
    }

    @Test
    public void calculaDesconteMulherSolteriaMaior25() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento("01/07/1990");
        PremioSeguro seguro = new PremioSeguro(cliente);
        seguro.setValorSeguro(10.0);
        seguro.obtemPercentualDesconto();
        seguro.calculaValorComDesconto();
        //assert seguro.getPercentualDesconto() == 15.00;
        //assert seguro.getValorSeguroComDesconto() == 8.50;

        assertTrue(seguro.getPercentualDesconto() == 15.00);
        assertTrue(seguro.getValorSeguroComDesconto() == 8.50);
    }

    @Test
    public void calculaDesconteMulherCasadaMaior25() {
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento("01/07/1990");
        PremioSeguro seguro = new PremioSeguro(cliente);
        seguro.setValorSeguro(10.0);
        seguro.obtemPercentualDesconto();
        seguro.calculaValorComDesconto();
        //assert seguro.getPercentualDesconto() == 30.00;
        //assert seguro.getValorSeguroComDesconto() == 7.00;

        assertTrue(seguro.getPercentualDesconto() == 30.00);
        assertTrue(seguro.getValorSeguroComDesconto() == 7.00);
    }

    @Test
    public void calculaDesconteHomemSolteriroJovem() {
        PremioSeguro seguro = new PremioSeguro(cliente);
        seguro.setValorSeguro(10.0);
        seguro.obtemPercentualDesconto();
        seguro.calculaValorComDesconto();
        //assert seguro.getPercentualDesconto() == 0.00;
        //assert seguro.getValorSeguroComDesconto() == 10.00;

        assertTrue(seguro.getPercentualDesconto() == 0.00);
        assertTrue(seguro.getValorSeguroComDesconto() == 10.00);
    }

    @Test
    public void calculaDesconteHomemCasadoJovem() {
        cliente.setEstadoCivil("Casado");
        PremioSeguro seguro = new PremioSeguro(cliente);
        seguro.setValorSeguro(10.0);
        seguro.obtemPercentualDesconto();
        seguro.calculaValorComDesconto();
        //assert seguro.getPercentualDesconto() == 5.00;
        //assert seguro.getValorSeguroComDesconto() == 9.50;

        assertTrue(seguro.getPercentualDesconto() == 5.00);
        assertTrue(seguro.getValorSeguroComDesconto() == 9.50);
    }

    @Test
    public void calculaDesconteHomemSolteriroMaior25() {
        cliente.setDataNascimento("01/07/1990");
        PremioSeguro seguro = new PremioSeguro(cliente);
        seguro.setValorSeguro(10.0);
        seguro.obtemPercentualDesconto();
        seguro.calculaValorComDesconto();
        //assert seguro.getPercentualDesconto() == 10.00;
        //assert seguro.getValorSeguroComDesconto() == 9.00;

        assertTrue(seguro.getPercentualDesconto() == 10.00);
        assertTrue(seguro.getValorSeguroComDesconto() == 9.00);
    }

    @Test
    public void calculaDesconteHomemCasadoMaior25() {
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento("01/07/1990");
        PremioSeguro seguro = new PremioSeguro(cliente);
        seguro.setValorSeguro(10.0);
        seguro.obtemPercentualDesconto();
        seguro.calculaValorComDesconto();
        //assert seguro.getPercentualDesconto() == 20.00;
        //assert seguro.getValorSeguroComDesconto() == 8.00;

        assertTrue(seguro.getPercentualDesconto() == 20.00);
        assertTrue(seguro.getValorSeguroComDesconto() == 8.00);
    }
}

//todos os assert foram implementados errado.
//Todos os testes passaram

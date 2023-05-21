package org.test.alunos.alexandre_wagner;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PremioSeguroTest {
    public Double valorSeguro = 1000.00;
    public String CPF = "11111111111";
    public Cliente clienteFemininaSolteiraMenorDe25;
    public Cliente clienteFemininaSolteiraMaiorDe25;
    public Cliente clienteFemininaCasadaMenorDe25;
    public Cliente clienteFemininaCasadaMaiorDe25;
    public Cliente clienteMasculinoSolteiroMenorDe25;
    public Cliente clienteMasculinoSolteiroMaiorDe25;
    public Cliente clienteMasculinoCasadoMenorDe25;
    public Cliente clienteMasculinoCasadoMaiorDe25;
    @Before
    public void setup(){
        clienteFemininaSolteiraMenorDe25 = new Cliente();
        clienteFemininaSolteiraMenorDe25.setSexo("Feminino");
        clienteFemininaSolteiraMenorDe25.setEstadoCivil("Solteira");
        clienteFemininaSolteiraMenorDe25.setDataNascimento("01/01/2004");
        clienteFemininaSolteiraMenorDe25.setCpf(CPF);
        clienteFemininaSolteiraMenorDe25.setNacionalidade("Brasileira");

        clienteFemininaSolteiraMaiorDe25 = new Cliente();
        clienteFemininaSolteiraMaiorDe25.setSexo("Feminino");
        clienteFemininaSolteiraMaiorDe25.setEstadoCivil("Solteira");
        clienteFemininaSolteiraMaiorDe25.setDataNascimento("01/01/1995");
        clienteFemininaSolteiraMaiorDe25.setCpf(CPF);
        clienteFemininaSolteiraMaiorDe25.setNacionalidade("Brasileira");

        clienteFemininaCasadaMenorDe25 = new Cliente();
        clienteFemininaCasadaMenorDe25.setSexo("Feminino");
        clienteFemininaCasadaMenorDe25.setEstadoCivil("Casada");
        clienteFemininaCasadaMenorDe25.setDataNascimento("01/01/2004");
        clienteFemininaCasadaMenorDe25.setCpf(CPF);
        clienteFemininaCasadaMenorDe25.setNacionalidade("Brasileira");

        clienteFemininaCasadaMaiorDe25 = new Cliente();
        clienteFemininaCasadaMaiorDe25.setSexo("Feminino");
        clienteFemininaCasadaMaiorDe25.setEstadoCivil("Casada");
        clienteFemininaCasadaMaiorDe25.setDataNascimento("01/01/1995");
        clienteFemininaCasadaMaiorDe25.setCpf(CPF);
        clienteFemininaCasadaMaiorDe25.setNacionalidade("Brasileira");

        clienteMasculinoSolteiroMenorDe25 = new Cliente();
        clienteMasculinoSolteiroMenorDe25.setSexo("Masculino");
        clienteMasculinoSolteiroMenorDe25.setEstadoCivil("Solteiro");
        clienteMasculinoSolteiroMenorDe25.setDataNascimento("01/01/2004");
        clienteMasculinoSolteiroMenorDe25.setCpf(CPF);
        clienteMasculinoSolteiroMenorDe25.setNacionalidade("Brasileira");

        clienteMasculinoSolteiroMaiorDe25 = new Cliente();
        clienteMasculinoSolteiroMaiorDe25.setSexo("Masculino");
        clienteMasculinoSolteiroMaiorDe25.setEstadoCivil("Solteiro");
        clienteMasculinoSolteiroMaiorDe25.setDataNascimento("01/01/1995");
        clienteMasculinoSolteiroMaiorDe25.setCpf(CPF);
        clienteMasculinoSolteiroMaiorDe25.setNacionalidade("Brasileira");

        clienteMasculinoCasadoMenorDe25 = new Cliente();
        clienteMasculinoCasadoMenorDe25.setSexo("Masculino");
        clienteMasculinoCasadoMenorDe25.setEstadoCivil("Casado");
        clienteMasculinoCasadoMenorDe25.setDataNascimento("01/01/2004");
        clienteMasculinoCasadoMenorDe25.setCpf(CPF);
        clienteMasculinoCasadoMenorDe25.setNacionalidade("Brasileira");

        clienteMasculinoCasadoMaiorDe25 = new Cliente();
        clienteMasculinoCasadoMaiorDe25.setSexo("Masculino");
        clienteMasculinoCasadoMaiorDe25.setEstadoCivil("Casado");
        clienteMasculinoCasadoMaiorDe25.setDataNascimento("01/01/1995");
        clienteMasculinoCasadoMaiorDe25.setCpf(CPF);
        clienteMasculinoCasadoMaiorDe25.setNacionalidade("Brasileira");
    }

    @Test
    public void testaValorDescontoClienteFemininaSolteiraMenorDe25(){
        PremioSeguro premioSeguro = new PremioSeguro(clienteFemininaSolteiraMenorDe25);
        premioSeguro.setValorSeguro(valorSeguro);
        premioSeguro.obtemPercentualDesconto();
        premioSeguro.calculaValorComDesconto();
        Assert.assertEquals(950, (double) premioSeguro.getValorSeguroComDesconto(), 0.0);
    }

    @Test
    public void testaValorDescontoClienteFemininaSolteiraMaiorDe25(){
        PremioSeguro premioSeguro = new PremioSeguro(clienteFemininaSolteiraMaiorDe25);
        premioSeguro.setValorSeguro(valorSeguro);
        premioSeguro.obtemPercentualDesconto();
        premioSeguro.calculaValorComDesconto();
        Assert.assertEquals(850, (double) premioSeguro.getValorSeguroComDesconto(), 0.0);
    }

    @Test
    public void testaValorDescontoClienteFemininaCasadaMenorDe25(){
        PremioSeguro premioSeguro = new PremioSeguro(clienteFemininaCasadaMenorDe25);
        premioSeguro.setValorSeguro(valorSeguro);
        premioSeguro.obtemPercentualDesconto();
        premioSeguro.calculaValorComDesconto();
        Assert.assertEquals(900, (double) premioSeguro.getValorSeguroComDesconto(), 0.0);
    }

    @Test
    public void testaValorDescontoClienteFemininaCasadaMaiorDe25(){
        PremioSeguro premioSeguro = new PremioSeguro(clienteFemininaCasadaMaiorDe25);
        premioSeguro.setValorSeguro(valorSeguro);
        premioSeguro.obtemPercentualDesconto();
        premioSeguro.calculaValorComDesconto();
        Assert.assertEquals(700, (double) premioSeguro.getValorSeguroComDesconto(), 0.0);
    }

    @Test
    public void testaValorDescontoClienteMasculinoSolteiroMenorDe25(){
        PremioSeguro premioSeguro = new PremioSeguro(clienteMasculinoSolteiroMenorDe25);
        premioSeguro.setValorSeguro(valorSeguro);
        premioSeguro.obtemPercentualDesconto();
        premioSeguro.calculaValorComDesconto();
        Assert.assertEquals(1000, (double) premioSeguro.getValorSeguroComDesconto(), 0.0);
    }

    @Test
    public void testaValorDescontoClienteMasculinoSolteiroMaiorDe25(){
        PremioSeguro premioSeguro = new PremioSeguro(clienteMasculinoSolteiroMaiorDe25);
        premioSeguro.setValorSeguro(valorSeguro);
        premioSeguro.obtemPercentualDesconto();
        premioSeguro.calculaValorComDesconto();
        Assert.assertEquals(900, (double) premioSeguro.getValorSeguroComDesconto(), 0.0);
    }

    @Test
    public void testaValorDescontoClienteMasculinoCasadoMenorDe25(){
        PremioSeguro premioSeguro = new PremioSeguro(clienteMasculinoCasadoMenorDe25);
        premioSeguro.setValorSeguro(valorSeguro);
        premioSeguro.obtemPercentualDesconto();
        premioSeguro.calculaValorComDesconto();
        Assert.assertEquals(950, (double) premioSeguro.getValorSeguroComDesconto(), 0.0);
    }

    @Test
    public void testaValorDescontoClienteMasculinoCasadoMaiorDe25(){
        PremioSeguro premioSeguro = new PremioSeguro(clienteMasculinoCasadoMaiorDe25);
        premioSeguro.setValorSeguro(valorSeguro);
        premioSeguro.obtemPercentualDesconto();
        premioSeguro.calculaValorComDesconto();
        Assert.assertEquals(800, (double) premioSeguro.getValorSeguroComDesconto(), 0.0);
    }
}

//todos os testes falharam, por usar um CPF inválido
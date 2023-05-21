package org.test.alunos.flavimar;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PremioSeguroTest {
    Cliente cliente;
    PremioSeguro ps;
    @Before
    public void setup(){
         cliente = new Cliente();

    }
    @Test(expected = Exception.class)
    public void testaValorSeguroMenorQueZero(){
        ps = new PremioSeguro(new Cliente());
        ps.setValorSeguro(-0.01);
    }
    @Test(expected = Exception.class)
    public void testaValorSeguroIgualZero(){
        ps = new PremioSeguro(new Cliente());
        ps.setValorSeguro(0.00);
    }
    @Test
    public void testaValorSeguroMaiorQueZero(){
        ps = new PremioSeguro(new Cliente());
        ps.setValorSeguro(0.01);
        Assert.assertEquals(0.01,ps.getValorSeguro(),0.00001);
    }

    @Test
    public void testaPercentualDescontoFemininoSolteiraMenorQue25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Fulana Amadeu Andrade");
        cliente.setSexo("Feminino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento("20/10/1998");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(5.00,ps.getPercentualDesconto(),0.000001);
    }
    @Test
    public void testaPercentualDescontoFemininoSolteiraIgual25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Fulana Amadeu Andrade");
        cliente.setSexo("Feminino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento("20/10/1998");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(5.00,ps.getPercentualDesconto(),0.000001);
    }
    @Test
    public void testaPercentualDescontoFemininoSolteiraMaior25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Fulana Amadeu Andrade");
        cliente.setSexo("Feminino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento("20/10/1996");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(15.00,ps.getPercentualDesconto(),0.000001);
    }
    @Test
    public void testaPercentualDescontoFemininoCasadaMenorQue25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Fulana Amadeu Andrade");
        cliente.setSexo("Feminino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento("20/10/1998");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(10.00,ps.getPercentualDesconto(),0.000001);
    }
    @Test
    public void testaPercentualDescontoFemininoCasadaIgual25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Fulana Amadeu Andrade");
        cliente.setSexo("Feminino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento("20/10/1998");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(10.00,ps.getPercentualDesconto(),0.000001);
    }
    @Test
    public void testaPercentualDescontoFemininoCasadaMaior25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Fulana Amadeu Andrade");
        cliente.setSexo("Feminino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento("20/10/1996");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(30.00,ps.getPercentualDesconto(),0.000001);
    }

    @Test
    public void testaPercentualDescontoMasculinoSolteiroMenorQue25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Ciclano Amadeu Andrade");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento("20/10/1998");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(0.00,ps.getPercentualDesconto(),0.000001);
    }
    @Test
    public void testaPercentualDescontoMasculinoSolteiroIgual25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Ciclano Amadeu Andrade");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento("20/10/1998");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(0.00,ps.getPercentualDesconto(),0.000001);
    }
    @Test
    public void testaPercentualDescontoMasculinoSolteiroMaior25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Ciclano Amadeu Andrade");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento("20/10/1996");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(10.00,ps.getPercentualDesconto(),0.000001);
    }
    @Test
    public void testaPercentualDescontoMasculinoCasadoMenorQue25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Ciclano Amadeu Andrade");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento("20/10/1998");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(5.00,ps.getPercentualDesconto(),0.000001);
    }
    @Test
    public void testaPercentualDescontoMasculinoCasadoMenorIgual25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Ciclano Amadeu Andrade");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento("20/10/1998");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(5.00,ps.getPercentualDesconto(),0.000001);
    }
    @Test
    public void testaPercentualDescontoMasculinoCasadoMaior25(){
        Cliente cliente = new Cliente();
        cliente.setNome("Ciclano Amadeu Andrade");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento("20/10/1996");
        cliente.setCpf("46313894006");
        ps = new PremioSeguro(cliente);
        ps.obtemPercentualDesconto();
        Assert.assertEquals(20.00,ps.getPercentualDesconto(),0.000001);
    }
    @Test
    public void testeValorSeguroComDescontoCorreto(){
        ps = new PremioSeguro(new Cliente());
        ps.setValorSeguro(2000.00);
        ps.setPercentualDesconto(5.00);
        ps.calculaValorComDesconto();
        Assert.assertEquals(1900.00,ps.getValorSeguroComDesconto(),0.000001);
    }
}

//seis testes falharam
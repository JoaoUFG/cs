package org.test.alunos.andrey_dias;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// Aluno: Andrey Dias Rodrigues Cardoso -- Matrícula: 201905521;

public class TestPremioSeguro {

    @Test
    public void testaPercentualDescontoMasculino() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("27/05/1998");
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setNacionalidade("Brasileiro");
        cliente.setCpf("12345678900");

        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();

        Assert.assertEquals((Double)0.0, premioSeguro.getPercentualDesconto());
    }
    @Test
    public void testaPercentualDescontoMasculinoSolteiro() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("22/08/1977");
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setNacionalidade("Brasileiro");
        cliente.setCpf("12345678900");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        Assert.assertEquals((Double)10.0, premioSeguro.getPercentualDesconto());
    }
    @Test
    public void testaPercentualDescontoMasculinoCasado() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("22/06/1950");
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setNacionalidade("Brasileiro");
        cliente.setCpf("12345678900");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        Assert.assertEquals((Double)5.0, premioSeguro.getPercentualDesconto());
    }
    @Test
    public void testaPercentualDescontoFemininoSolteira() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("10/04/1996");
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("12345678900");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        Assert.assertEquals((Double)5.0, premioSeguro.getPercentualDesconto());
    }
    @Test
    public void testaPercentualDescontoFemininoCasada() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("13/12/1969");
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("12345678900");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
        Assert.assertEquals((Double)10.0, premioSeguro.getPercentualDesconto());
    }
}

//todos os testes falharam por usar um cpf inválido
package org.test.alunos.felipe_ramos;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// ALUNO: JOÃO PEDRO SILVA FRANCO - MATRÍCULA: 202204196

public class PremioSeguroTest {

    @Test
    public void testaPercentualDescontoMasculinoSolteiroNovo() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("13/12/2000");
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("98734141006");

        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();

        Assert.assertEquals((Double)0.0, premioSeguro.getPercentualDesconto());
    }

    @Test
    public void testaPercentualDescontoMasculinoSolteiroVelho() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("13/12/1980");
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("98734141006");

        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();

        Assert.assertEquals((Double)10.0, premioSeguro.getPercentualDesconto());
    }

    @Test
    public void testaPercentualDescontoMasculinoCasadoNovo() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("13/12/2000");
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("98734141006");

        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();

        Assert.assertEquals((Double)5.0, premioSeguro.getPercentualDesconto());
    }

    @Test
    public void testaPercentualDescontoMasculinoCasadoVelho() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("13/12/1980");
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("98734141006");

        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();

        Assert.assertEquals((Double)20.0, premioSeguro.getPercentualDesconto());
    }

    @Test
    public void testaPercentualDescontoFemininoSolteiraNova() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("13/12/2000");
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("98734141006");

        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();

        Assert.assertEquals((Double)5.0, premioSeguro.getPercentualDesconto());
    }

    @Test
    public void testaPercentualDescontoFemininoSolteiraVelha() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("13/12/1980");
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("98734141006");

        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();

        Assert.assertEquals((Double)15.0, premioSeguro.getPercentualDesconto());
    }

    @Test
    public void testaPercentualDescontoFemininoCasadaNova() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("13/12/2000");
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("98734141006");

        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();

        Assert.assertEquals((Double)10.0, premioSeguro.getPercentualDesconto());
    }

    @Test
    public void testaPercentualDescontoFemininoCasadaVelha() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("13/12/1980");
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("98734141006");

        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();

        Assert.assertEquals((Double)30.0, premioSeguro.getPercentualDesconto());
    }

    @Test
    public void testaValorSeguroComDesconto() {
        Cliente cliente = new Cliente();
        cliente.setDataNascimento("13/12/1980");
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("98734141006");

        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.setValorSeguro(1000.0);
        premioSeguro.obtemPercentualDesconto();
        premioSeguro.calculaValorComDesconto();

        Assert.assertEquals((Double)700.0, premioSeguro.getValorSeguroComDesconto());
    }
}

//todos os testes passaram
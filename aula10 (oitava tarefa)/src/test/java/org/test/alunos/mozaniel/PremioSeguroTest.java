package org.test.alunos.mozaniel;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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

        assertEquals((Double)0.0, premioSeguro.getPercentualDesconto());
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

        assertEquals((Double)10.0, premioSeguro.getPercentualDesconto());
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

        assertEquals((Double)5.0, premioSeguro.getPercentualDesconto());
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

        assertEquals((Double)20.0, premioSeguro.getPercentualDesconto());
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

        assertEquals((Double)5.0, premioSeguro.getPercentualDesconto());
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

        assertEquals((Double)15.0, premioSeguro.getPercentualDesconto());
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

        assertEquals((Double)10.0, premioSeguro.getPercentualDesconto());
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

        assertEquals((Double)30.0, premioSeguro.getPercentualDesconto());
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

        assertEquals((Double)700.0, premioSeguro.getValorSeguroComDesconto());
    }
}

package org.test.alunos.randerson;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PremioSeguroTest {
    Cliente cliente;
    PremioSeguro ps;

    @Test
    public void testaPercentualDescontoInvalido()
    {
        Cliente cliente = new Cliente();
        cliente.setNome("Mário Allan Alex");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento("20/10/2000");
        cliente.setCpf("38539788357");

        PremioSeguro ps = new PremioSeguro(cliente);
        ps.setValorSeguro(5000.00);
        ps.obtemPercentualDesconto();
        ps.calculaValorComDesconto();
        double expect = 0.00;
        double atual = ps.getPercentualDesconto();
        assertEquals(expect, atual, 0.000001);
    }

    @Test
    public void testaValorDeDescontoInvalido()
    {
        Cliente cliente = new Cliente();
        cliente.setNome("Mário Allan Alex");
        cliente.setSexo("Masculino");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento("20/10/2000");
        cliente.setCpf("38539788357");

        PremioSeguro ps = new PremioSeguro(cliente);
        ps.setValorSeguro(5000.00);
        ps.obtemPercentualDesconto();
        ps.calculaValorComDesconto();
        double expect = 4750.00;
        double atual = ps.getValorSeguroComDesconto();
        assertEquals(expect, atual, 0.000001);
    }
}

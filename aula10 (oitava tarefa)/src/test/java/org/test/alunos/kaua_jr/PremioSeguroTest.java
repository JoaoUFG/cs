package org.test.alunos.kaua_jr;

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

    PremioSeguro premioSeguro;
    Cliente cliente;

    @Before
    public void setup(){
        cliente = new Cliente();
        cliente.setNacionalidade("Brasileira");
        cliente.setCpf("04921237131");
        premioSeguro = new PremioSeguro(cliente);
    }

    // feminino, solteira, 24 anos
    @Test
    public void fs24(){
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento("20/12/1998");
        premioSeguro.obtemPercentualDesconto();
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 5.00);
    }

    // feminino, solteira, 25 anos
    @Test
    public void fs25(){
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento("20/12/1998");
        premioSeguro.obtemPercentualDesconto();
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 5.00);
    }

    // feminino, solteira, 26 anos
    @Test
    public void fs26(){
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setDataNascimento("20/12/1996");
        premioSeguro.obtemPercentualDesconto();
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 15.00);
    }

    //feminino, casada, 24 anos
    @Test
    public void fc24(){
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento("20/12/1998");
        premioSeguro.obtemPercentualDesconto();
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 10.00);
    }

    // feminino, casada, 25 anos
    @Test
    public void fc25(){
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento("20/12/1998");
        premioSeguro.obtemPercentualDesconto();
        System.out.println(premioSeguro.getPercentualDesconto());
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 10.00);
    }

    // feminino, casada, 26 anos
    @Test
    public void fc26(){
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setDataNascimento("20/12/1996");
        premioSeguro.obtemPercentualDesconto();
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 30.00);
    }

    // masculino, solteiro, 24 anos
    @Test
    public void ms24(){
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento("20/12/1998");
        premioSeguro.obtemPercentualDesconto();
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 0.00);

    }

    // masculino, solteiro, 25 anos
    @Test
    public void ms25(){
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento("20/12/1998");
        premioSeguro.obtemPercentualDesconto();
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 0.00);
    }

    // masculino, solteiro, 26 anos
    @Test
    public void ms26(){
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setDataNascimento("20/12/1996");
        premioSeguro.obtemPercentualDesconto();
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 10.00);
    }

    // masculino, casado, 24 anos
    @Test
    public void mc24(){
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento("20/12/1998");
        premioSeguro.obtemPercentualDesconto();
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 5.00);
    }

    // masculino, casado, 25 anos
    @Test
    public void mc25(){
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento("20/12/1998");
        premioSeguro.obtemPercentualDesconto();
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 5.00);
    }

    // masculino, casado, 26 anos
    @Test
    public void mc26(){
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setDataNascimento("20/12/1996");
        premioSeguro.obtemPercentualDesconto();
        Assert.assertTrue(premioSeguro.getPercentualDesconto() == 20.00);
    }

}
//todos os testes passaram
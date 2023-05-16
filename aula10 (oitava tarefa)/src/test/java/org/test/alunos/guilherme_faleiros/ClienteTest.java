package org.test.alunos.guilherme_faleiros;

import org.model.*;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ClienteTest {

    Cliente cliente;
    @Before
    public void setup(){
        cliente = new Cliente();
    }
    //Exemplo de caso de teste para capturar uma exceção, quando se passa uma data inválida para ser a data de nascimento do cliente.
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento("31/02/2000");
    }

    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido(){
        cliente.setDataNascimento("31/10/2000");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteiro");
        cliente.setSexo("Outro");

        final var premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }

    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
        cliente.setDataNascimento("31/10/2000");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteiroaa");
        cliente.setSexo("Masculino");

        final var premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }

    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
        cliente.setDataNascimento("31/10/2000");
        cliente.setNacionalidade("Brasileiraaa");
        cliente.setEstadoCivil("Solteiro");
        cliente.setSexo("Masculino");

        final var premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }

    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido(){
        cliente.setDataNascimento("31/10/2000");
        cliente.setNacionalidade("Brasileira");
        cliente.setEstadoCivil("Solteiro");
        cliente.setCpf("17216816037");
        cliente.setSexo("Masculino");

        final var premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }

    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido(){
        cliente.setDataNascimento("31/10/2000");
        cliente.setNacionalidade("Estrangeira");
        cliente.setEstadoCivil("Solteiro");
        cliente.setCpf("ABCDEFGHIJKLMN");
        cliente.setSexo("Masculino");
        cliente.setPassaporte(null);

        final var premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }
}

//todos os testes passaram

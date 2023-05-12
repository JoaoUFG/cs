package org.test.alunos.kaua_jr;

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

    @Test
    public void testaDataValida(){
        cliente.setDataNascimento("27/02/1998");
        assertTrue(DataUtils.validaData(DataUtils.DateToString(cliente.getDataNascimento())));
    }

    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido(){
        cliente.setCpf("0000002");
        assertFalse(CpfValidator.isCPF(cliente.getCpf()));
    }

    @Test
    public void testaCpfValido(){
        cliente.setCpf("04921237131");
        assertTrue(CpfValidator.isCPF(cliente.getCpf()));
    }

    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
        cliente.setEstadoCivil("SOLteirooo");
        assertFalse(EstadoCivilValidator.validaEstadoCivil(cliente.getEstadoCivil()));
    }

    @Test
    public void testaEstadoCivilValido(){
        cliente.setEstadoCivil("Solteiro");
        assertTrue(EstadoCivilValidator.validaEstadoCivil(cliente.getEstadoCivil()));
    }

    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
        cliente.setNacionalidade("Escócia");
        assertFalse(NacionalidadeValidator.validaNacionalidade(cliente.getNacionalidade()));
    }

    @Test
    public void testaNacionalidadeValida(){
        cliente.setNacionalidade("Estrangeira");
        assertTrue(NacionalidadeValidator.validaNacionalidade(cliente.getNacionalidade()));
    }

    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido(){
        cliente.setPassaporte(null);
        assertFalse(PassaporteValidator.validaPassaporte(cliente.getPassaporte()));
    }

    @Test
    public void testaPassaporteValido(){
        cliente.setPassaporte("Passaporte Brasileiro");
        assertTrue(PassaporteValidator.validaPassaporte(cliente.getPassaporte()));
    }

    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido(){
        cliente.setSexo("Intersexo");
        assertFalse(SexoValidator.validaSexo(cliente.getSexo()));
    }

    @Test
    public void testaSexoValido(){
        cliente.setSexo("Masculino");
        assertTrue(SexoValidator.validaSexo("Masculino"));
    }

}

//todos os testes passaram

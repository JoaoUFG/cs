package org.test.alunos.randerson;

import org.model.*;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.Date;

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

    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida2(){
        DataUtils.validaData("01/01/1888");
    }

    @Test(expected = DataInvalidaException.class)
    public void testaIdadeInvalida(){
        Date data1 = DataUtils.StringToDate("01/01/2025");
        Date data2 = DataUtils.StringToDate("01/01/2020");
        DataUtils.validaIdade(data1, data2);
    }

    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido() {
        SexoValidator.validaSexo("masculino");
    }

    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido(){
        CpfValidator.isCPF("1");
    }

    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
        EstadoCivilValidator.validaEstadoCivil("tests");
    }

    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
        NacionalidadeValidator.validaNacionalidade("artenga");
    }

    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido(){
        PassaporteValidator.validaPassaporte(null);
    }
}

//só foram testado valores inválidos. E os válidos?

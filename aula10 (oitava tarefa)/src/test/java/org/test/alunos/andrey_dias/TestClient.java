package org.test.alunos.andrey_dias;

import org.model.Cliente;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

// Aluno: Andrey Dias Rodrigues Cardoso -- Matrícula: 201905521;

public class TestClient {

    Cliente cliente;
    @Before
    public void setup(){
        cliente = new Cliente();
    }
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento("32/13/1998");
    }

    @Test
    public void testaDataValida() {
        boolean result = DataUtils.validaData("27/05/1998");

        assertEquals(true, result);
    }

    @Test(expected = DataInvalidaException.class)
    public void testaDia31EmMesCom30Dias() {
        boolean result = DataUtils.validaData("31/04/1998");
    }

    @Test(expected = CpfInvalidoException.class)
    public void testaCpfComMenosDe11Numeros() {
        boolean result = CpfValidator.isCPF("1234567890");
        //este cpf é válido, como se espera uma exceção, o teste falhou.
    }

    @Test
    public void testaCpfComMaisDe11Numeros() {
        boolean result = CpfValidator.isCPF("123456789000");

        assertEquals(false, result);
    }

    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido() {
        boolean result = CpfValidator.isCPF("12345678900");
    }

    @Test
    public void testaCpfValido() {
        boolean result = CpfValidator.isCPF("12345678901");

        assertEquals(true, result);
        //este cpf não é valido
    }

    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido() {
        boolean result = EstadoCivilValidator.validaEstadoCivil("Invalido");
    }
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida() {
        boolean result = NacionalidadeValidator.validaNacionalidade("Invalida");
    }
    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido() {
        boolean result = PassaporteValidator.validaPassaporte(null);
    }
    @Test
    public void testaPassaporteValido() {
        boolean result = PassaporteValidator.validaPassaporte("1479534");

        assertEquals(true, result);
    }
    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido() {
        boolean result = SexoValidator.validaSexo("Invalido");
    }
}

// public void testaCpfValido - falhou
// testaCpfComMenosDe11Numeros - falhou

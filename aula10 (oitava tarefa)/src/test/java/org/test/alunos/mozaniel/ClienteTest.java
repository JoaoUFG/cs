package org.test.alunos.mozaniel;

import org.model.*;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

public class ClienteTest {

    Cliente cliente;
    @Before
    public void setup(){
        cliente = new Cliente();
    }
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento("31/02/2000");
    }

    @Test
    public void testaDataValida() {
        boolean result = DataUtils.validaData("19/03/2001");

        assertEquals(true, result);
    }

    @Test(expected = DataInvalidaException.class)
    public void testaDia31EmMesCom30Dias() {
        boolean result = DataUtils.validaData("31/04/2000");
    }

    @Test(expected = CpfInvalidoException.class)
    public void testaCpfComMenosDe11Numeros() {
        boolean result = CpfValidator.isCPF("123");
    }

    @Test
    public void testaCpfComMaisDe11Numeros() {
        boolean result = CpfValidator.isCPF("123456789001");

        assertEquals(false, result);
    }

    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido() {
        boolean result = CpfValidator.isCPF("12345678900");
    }

    @Test
    public void testaCpfValido() {
        boolean result = CpfValidator.isCPF("98734141006");

        assertEquals(true, result);
    }

    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido() {
        boolean result = EstadoCivilValidator.validaEstadoCivil("Invalido");
    }

    @Test
    public void testaEstadosCivisValidos() {
        boolean result1 = EstadoCivilValidator.validaEstadoCivil("Solteiro");
        boolean result2 = EstadoCivilValidator.validaEstadoCivil("Solteira");
        boolean result3 = EstadoCivilValidator.validaEstadoCivil("Casado");
        boolean result4 = EstadoCivilValidator.validaEstadoCivil("Casada");
        boolean result5 = EstadoCivilValidator.validaEstadoCivil("Viuvo");
        boolean result6 = EstadoCivilValidator.validaEstadoCivil("Viuva");
        boolean result7 = EstadoCivilValidator.validaEstadoCivil("Desquitado");
        boolean result8 = EstadoCivilValidator.validaEstadoCivil("Desquitada");
        boolean result9 = EstadoCivilValidator.validaEstadoCivil("Divorciado");
        boolean result10 = EstadoCivilValidator.validaEstadoCivil("Divorciada");

        ArrayList<Boolean> resultados = new ArrayList<Boolean>();
        resultados.add(result1);
        resultados.add(result2);
        resultados.add(result3);
        resultados.add(result4);
        resultados.add(result5);
        resultados.add(result6);
        resultados.add(result7);
        resultados.add(result8);
        resultados.add(result9);
        resultados.add(result10);
        for (boolean result: resultados) {
            assertEquals(true, result);
        }
    }

    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida() {
        boolean result = NacionalidadeValidator.validaNacionalidade("Invalido");
    }

    @Test
    public void testaNacionalidadesValidas() {
        boolean result1 = NacionalidadeValidator.validaNacionalidade("Brasileira");
        boolean result2 = NacionalidadeValidator.validaNacionalidade("Estrangeira");

        ArrayList<Boolean> resultados = new ArrayList<Boolean>();
        resultados.add(result1);
        resultados.add(result2);

        for (boolean result: resultados) {
            assertEquals(true, result);
        }
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

    @Test
    public void testaSexosValidos() {
        boolean result1 = SexoValidator.validaSexo("Masculino");
        boolean result2 = SexoValidator.validaSexo("Feminino");

        ArrayList<Boolean> resultados = new ArrayList<Boolean>();
        resultados.add(result1);
        resultados.add(result2);

        for (boolean result: resultados) {
            assertEquals(true, result);
        }
    }
}

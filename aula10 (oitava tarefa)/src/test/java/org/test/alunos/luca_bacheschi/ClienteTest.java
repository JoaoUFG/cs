package org.test.alunos.luca_bacheschi;

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
        cliente.setDataNascimento("31/03/2000");
    }

    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido(){
        var sexoInvalido = "A";
        SexoValidator.validaSexo(sexoInvalido);
        cliente.setSexo(sexoInvalido);
    }

    @Test
    public void testaSexoMasculino(){
        var sexo = "Masculino";
        SexoValidator.validaSexo(sexo);
        cliente.setSexo(sexo);
    }

    @Test
    public void testaSexoFeminino (){
        var sexo = "Feminino";
        SexoValidator.validaSexo(sexo);
        cliente.setSexo(sexo);
    }

    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido(){
        PassaporteValidator.validaPassaporte(null);
        cliente.setPassaporte(null);
    }

    @Test
    public void testaPassaporteValido(){
        PassaporteValidator.validaPassaporte("A");
        cliente.setPassaporte("A");
    }

    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
        NacionalidadeValidator.validaNacionalidade("A");
        cliente.setPassaporte("A");
    }

    @Test
    public void testaNacionalidadeBrasileira(){
        NacionalidadeValidator.validaNacionalidade("Brasileira");
        cliente.setPassaporte("Brasileira");
    }

    @Test
    public void testaNacionalidadeEstrangeira(){
        NacionalidadeValidator.validaNacionalidade("Estrangeira");
        cliente.setPassaporte("Estrangeira");
    }

    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
        EstadoCivilValidator.validaEstadoCivil("A");
        cliente.setEstadoCivil("A");
    }

    @Test
    public void testaEstadoCivilSolteiro(){
        EstadoCivilValidator.validaEstadoCivil("Solteira");
        cliente.setEstadoCivil("Solteira");
    }

    @Test
    public void testaEstadoCivilSolteira(){
        EstadoCivilValidator.validaEstadoCivil("Solteiro");
        cliente.setEstadoCivil("Solteiro");
    }

    @Test
    public void testaEstadoCivilCasado(){
        EstadoCivilValidator.validaEstadoCivil("Casado");
        cliente.setEstadoCivil("Casado");
    }

    @Test
    public void testaEstadoCivilCasada(){
        EstadoCivilValidator.validaEstadoCivil("Casada");
        cliente.setEstadoCivil("Casada");
    }

    @Test
    public void testaEstadoCivilViuva(){
        EstadoCivilValidator.validaEstadoCivil("Viuva");
        cliente.setEstadoCivil("Viuva");
    }

    @Test
    public void testaEstadoCivilViuvo(){
        EstadoCivilValidator.validaEstadoCivil("Viuvo");
        cliente.setEstadoCivil("Viuvo");
    }

    @Test
    public void testaEstadoCivilDesquitado(){
        EstadoCivilValidator.validaEstadoCivil("Desquitado");
        cliente.setEstadoCivil("Desquitado");
    }

    @Test
    public void testaEstadoCivilDesquitada(){
        EstadoCivilValidator.validaEstadoCivil("Desquitada");
        cliente.setEstadoCivil("Desquitada");
    }

    @Test
    public void testaEstadoCivilDivorciado(){
        EstadoCivilValidator.validaEstadoCivil("Divorciado");
        cliente.setEstadoCivil("Divorciado");
    }

    @Test
    public void testaCpfInvalido(){
        assertFalse(CpfValidator.isCPF("A"));
        cliente.setCpf("A");
    }

    @Test
    public void testaCpfValido(){
        assertTrue(CpfValidator.isCPF("50374685070"));
        CpfValidator.isCPF("50374685070");
        cliente.setCpf("50374685070");
    }

    @Test(expected = IdadeInvalidaException.class)
    public void testaIdadeInvalida(){
        DataUtils.validaIdade(DataUtils.StringToDate("25/01/2000"), DataUtils.StringToDate("25/01/2001"));
        cliente.setDataNascimento("25/01/2000");
    }

    @Test
    public void testaIdadeValida(){
        DataUtils.validaIdade(DataUtils.StringToDate("25/01/2000"), DataUtils.StringToDate("25/01/2022"));
        cliente.setDataNascimento("25/01/2000");
    }
}

//todos os testes passaram
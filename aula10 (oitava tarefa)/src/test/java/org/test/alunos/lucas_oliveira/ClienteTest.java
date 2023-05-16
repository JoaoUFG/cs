package org.test.alunos.lucas_oliveira;

import org.model.*;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
        String data = "16/04/2009";
        cliente.setDataNascimento(data);
        assertNotNull(data);
    }

    @Test(expected = SexoInvalidoException.class)
    public void testeSexoInvalido(){
        if(SexoValidator.validaSexo("Homem")) {
            cliente.setSexo("Homem");
        }
    }

    @Test
    public void testaSexoMasculino(){
        String sexo = "Masculino";
        cliente.setSexo(sexo);
        assertTrue(SexoValidator.validaSexo(sexo));
    }

    @Test
    public void testaSexoFeminino(){
        String sexo = "Feminino";
        cliente.setSexo(sexo);
        assertTrue(SexoValidator.validaSexo(sexo));
    }

    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
        if(NacionalidadeValidator.validaNacionalidade("Alemão")) {
            cliente.setNacionalidade("Alemão");
        }
    }

    @Test
    public void testaNacionalidadeBrasileira(){
        String nacionalidade = "Brasileira";
        cliente.setNacionalidade(nacionalidade);
        assertTrue(NacionalidadeValidator.validaNacionalidade(nacionalidade));
    }

    @Test
    public void testaNacionalidadeEstrangeira(){
        String nacionalidade = "Estrangeira";
        cliente.setNacionalidade(nacionalidade);
        assertTrue(NacionalidadeValidator.validaNacionalidade(nacionalidade));
    }

    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido(){
        if(PassaporteValidator.validaPassaporte(null)) {
            cliente.setPassaporte(null);
        }
    }

    @Test
    public void testaPassaporteValido(){
        String passaporte = "785554885";
        cliente.setPassaporte(passaporte);
        assertTrue(PassaporteValidator.validaPassaporte(passaporte));
    }

    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido(){
        if(CpfValidator.isCPF("12345678912")) {
            cliente.setCpf("12345678912");
        }
    }

    @Test
    public void testaCpfValido(){
        String cpf = "70400286114";
        cliente.setCpf(cpf);
        assertTrue(CpfValidator.isCPF(cpf));
    }

    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
        if(EstadoCivilValidator.validaEstadoCivil("Namorando")) {
            cliente.setEstadoCivil("Namorando");
        }
    }

    @Test
    public void testaEstadoCivilSolteiro(){
        String estadoCivil = "Solteiro";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }

    @Test
    public void testaEstadoCivilSolteira(){
        String estadoCivil = "Solteira";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }

    @Test
    public void testaEstadoCivilCasado(){
        String estadoCivil = "Casado";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }

    @Test
    public void testaEstadoCivilCasada(){
        String estadoCivil = "Casada";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }

    @Test
    public void testaEstadoCivilViuvo(){
        String estadoCivil = "Viuvo";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }

    @Test
    public void testaEstadoCivilViuva(){
        String estadoCivil = "Viuva";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }

    @Test
    public void testaEstadoCivilDesquitado(){
        String estadoCivil = "Desquitado";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }

    @Test
    public void testaEstadoCivilDesquitada(){
        String estadoCivil = "Desquitada";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }


    @Test
    public void testaEstadoCivilDivorciado(){
        String estadoCivil = "Divorciado";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }
}

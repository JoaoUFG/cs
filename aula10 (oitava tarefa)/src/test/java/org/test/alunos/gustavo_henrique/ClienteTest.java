package org.test.alunos.gustavo_henrique;

import org.model.*;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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

    @Test()
    public void testaCPFInvalido(){
        cliente.setCpf("001.002.003-44");
        try{
            assertFalse(CpfValidator.isCPF(cliente.getCpf()));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Test()
    public void testaEstadoCivilInvalido(){
        cliente.setEstadoCivil("Mulherengo");
        try{
            assertFalse(EstadoCivilValidator.validaEstadoCivil(cliente.getEstadoCivil()));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Test()
    public void testaNacionalidadeInvalida(){
        cliente.setNacionalidade("Portuguesa");
        try{
            assertFalse(NacionalidadeValidator.validaNacionalidade(cliente.getNacionalidade()));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Test()
    public void testaPassaporteInvalido(){
        cliente.setPassaporte(null);
        try{
            assertFalse(PassaporteValidator.validaPassaporte(cliente.getPassaporte()));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Test
    public void testaSexoInvalido(){
        cliente.setSexo("Nenhum");

        try{
            assertFalse(EstadoCivilValidator.validaEstadoCivil(cliente.getSexo()));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
//quatro casos de teste falharam
package org.test.alunos.wendel_marcio;

import org.model.*;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ClienteTest {

    Cliente cliente;
    @Before
    public void setup(){
        cliente = new Cliente();
    }
    /*Exemplo de caso de teste para capturar uma exceção, quando se passa uma
    data inválida para ser a data de nascimento do cliente.*/
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento("31/02/2000");
    }
    
    @Test(expected = IdadeInvalidaException.class)
    public void testaIdadeInvalidaSuperior() {
        cliente.setDataNascimento("25/12/1941");
        assertFalse(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    
    @Test(expected = IdadeInvalidaException.class)
    public void testaIdadeInvalidaInferior() {
        cliente.setDataNascimento("23/12/2005");
        assertFalse(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    
    @Test
    public void testaIdade() {
        cliente.setDataNascimento("17/03/1990");
        assertTrue(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    
    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalidoM() {
        cliente.setSexo("Macho");
        assertFalse(SexoValidator.validaSexo(cliente.getSexo()));
    }
    
    @Test
    public void testaSexoM() {
        cliente.setSexo("Masculino");
        assertTrue(SexoValidator.validaSexo(cliente.getSexo()));
    }

    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalidoF() {
        cliente.setSexo("Femea");
        assertFalse(SexoValidator.validaSexo(cliente.getSexo()));
    }
    
    @Test
    public void testaSexoF() {
        cliente.setSexo("Feminino");
        assertTrue(SexoValidator.validaSexo(cliente.getSexo()));
    }
    
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido() {
        cliente.setEstadoCivil("Namorado");
        assertFalse(EstadoCivilValidator.validaEstadoCivil(cliente.getEstadoCivil()));
    }
    
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida() {
        cliente.setNacionalidade("Japonesa");
        assertFalse(NacionalidadeValidator.validaNacionalidade(cliente.getNacionalidade()));
    }
    
    @Test
    public void testaNacionalidadeBr() {
        cliente.setNacionalidade("Brasileira");
        assertTrue(NacionalidadeValidator.validaNacionalidade(cliente.getNacionalidade()));
    }
    
    @Test
    public void testaNacionalidadeEs() {
        cliente.setNacionalidade("Estrangeira");
        assertTrue(NacionalidadeValidator.validaNacionalidade(cliente.getNacionalidade()));
    }
    
    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido() {
        cliente.setCpf("12345");
        assertFalse(CpfValidator.isCPF(cliente.getCpf()));
    }
    
    @Test
    public void testaCpf() {
        cliente.setCpf("02116490405");
        assertTrue(CpfValidator.isCPF(cliente.getCpf()));
    }
    
    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido() {
        cliente.setPassaporte(null);
        assertFalse(PassaporteValidator.validaPassaporte(cliente.getPassaporte()));
    }
    
    @Test
    public void testaPassaporte() {
        cliente.setPassaporte("584531518");
        assertTrue(PassaporteValidator.validaPassaporte(cliente.getPassaporte()));
    }
    
}

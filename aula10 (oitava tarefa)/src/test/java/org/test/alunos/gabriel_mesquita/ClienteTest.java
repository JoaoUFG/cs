package org.test.alunos.gabriel_mesquita;

import java.util.Date;

import org.model.Cliente;
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
    
    @Test(expected = CpfInvalidoException.class)
    public void testaCpf () {
        cliente.setCpf("12312312300");
        assertFalse(CpfValidator.isCPF(cliente.getCpf()));
    }
    
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivil () {
        cliente.setEstadoCivil("Solteira");
        //assertFalse(EstadoCivilValidator.validaEstadoCivil(cliente.getEstadoCivil));
        assertFalse(EstadoCivilValidator.validaEstadoCivil(cliente.getEstadoCivil()));
    }
    
    @Test(expected = IdadeInvalidaException.class)
    public void testaIdadeInvalidaSuperior(){
        cliente.setDataNascimento("25/12/1941");
        assertFalse(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida() {
        cliente.setNacionalidade("Marciano");
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
    
    @Test
    public void testaPassaporte(){
        cliente.setPassaporte("12312313");
        assertTrue(PassaporteValidator.validaPassaporte(cliente.getPassaporte()));
    }
    
    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido() {
        cliente.setPassaporte(null);
        assertFalse(PassaporteValidator.validaPassaporte(cliente.getPassaporte()));
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
    
}
//public void testaEstadoCivil () - falhou
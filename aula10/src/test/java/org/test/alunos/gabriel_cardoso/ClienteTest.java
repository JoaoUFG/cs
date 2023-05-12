package org.test.alunos.gabriel_cardoso;

import org.model.Cliente;
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
        cliente = new Cliente(null, null, null, null, null, null, null);
    }
    //Exemplo de caso de teste para capturar uma exceção, quando se passa uma data inválida para ser a data de nascimento do cliente.
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento("31/02/2000");
    }
    //---------------------------------------------------------------------------------------------------------
    @Test
    public void testedeCPFCorreto() {
    	//cliente.setCpf(CpfValidator.isCPF("88888888888"));
        cliente.setCpf("88888888888");
    }
    @Test(expected = CpfInvalidoException.class)
    public void testedeCPFIncorreto() {

        //cliente.setCpf(CpfValidator.isCPF("8888"));
        cliente.setCpf("8888");
    }
    //---------------------------------------------------------------------------------------------------------
    @Test
    public void testaestadocivilCorreta() {
    	//cliente.setEstadoCivil(EstadoCivilValidator.validaEstadoCivil("Solteira"));
        cliente.setEstadoCivil("Solteira");
        //sem validação
    }
    
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaestadocivilIncorreta() {
    	//cliente.setEstadoCivil(EstadoCivilValidator.validaEstadoCivil("Solteirx"));
        cliente.setEstadoCivil("Solteirx");
    }
    //---------------------------------------------------------------------------------------------------------
    @Test
    public void testaidadeAceita() {
    	cliente.setDataNascimento("21/04/2002");
    	assertTrue(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    
    @Test(expected = IdadeInvalidaException.class)
    public void testaidadeMaior() {
    	cliente.setDataNascimento("21/04/1920");
    	assertFalse(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    
    @Test(expected = IdadeInvalidaException.class)
    public void testaidadeMenor() {
    	cliente.setDataNascimento("21/04/2015");
    	assertFalse(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    //----------------------------------------------------------------------------------------------------------
    @Test
    public void testedesexoCerto() {
    	//cliente.setSexo(SexoValidator.validaSexo("Feminino"));
        cliente.setSexo("Feminino");
        //sem validação
    }
    
    @Test(expected = SexoInvalidoException.class)
    public void testedesexoInvalido() {
    	//cliente.setSexo(SexoValidator.validaSexo("Femininx"));
        cliente.setSexo("Femininx");
        //sem validação
    }
    //----------------------------------------------------------------------------------------------------------
    @Test(expected = PassaporteInvalidoException.class)
    public void testedepassaporteSEM() {

        //cliente.setPassaporte(PassaporteValidator.validaPassaporte(null));
        cliente.setPassaporte(null);
    }
    
    @Test
    public void testedepassaporteCOM() {
    	//cliente.setPassaporte(PassaporteValidator.validaPassaporte("1"));
        cliente.setPassaporte("1");
        //sem validação
    }
    //----------------------------------------------------------------------------------------------------------
    @Test
    public void testedenacionalidadeValida() {
    	//cliente.setNacionalidade(NacionalidadeValidator.validaNacionalidade("Brasileira"));
        cliente.setNacionalidade("Brasileira");
        //sem validação
    }
    
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testedenacionalidadeInvalida() {
    	//cliente.setNacionalidade(NacionalidadeValidator.validaNacionalidade("Brasileirx"));
        cliente.setNacionalidade("Brasileirx");
    }
    //----------------------------------------------------------------------------------------------------------
}

//todos os testes falharam por falta de valores a atributos "validados" do cliente
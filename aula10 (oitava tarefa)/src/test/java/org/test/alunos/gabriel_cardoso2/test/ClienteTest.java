package org.test.alunos.gabriel_cardoso2.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import org.test.alunos.gabriel_cardoso2.excecoes.CpfInvalidoException;
import org.test.alunos.gabriel_cardoso2.excecoes.DataInvalidaException;
import org.test.alunos.gabriel_cardoso2.excecoes.EstadoCivilInvalidoException;
import org.test.alunos.gabriel_cardoso2.excecoes.IdadeInvalidaException;
import org.test.alunos.gabriel_cardoso2.excecoes.NacionalidadeInvalidaException;
import org.test.alunos.gabriel_cardoso2.excecoes.PassaporteInvalidoException;
import org.test.alunos.gabriel_cardoso2.excecoes.SexoInvalidoException;
import org.junit.Before;
import org.junit.Test;
import org.test.alunos.gabriel_cardoso2.model.Cliente;
import org.test.alunos.gabriel_cardoso2.util.CpfValidator;
import org.test.alunos.gabriel_cardoso2.util.DataUtils;
import org.test.alunos.gabriel_cardoso2.util.EstadoCivilValidator;
import org.test.alunos.gabriel_cardoso2.util.NacionalidadeValidator;
import org.test.alunos.gabriel_cardoso2.util.PassaporteValidator;
import org.test.alunos.gabriel_cardoso2.util.SexoValidator;

public class ClienteTest {

    Cliente cliente;
    @Before
    public void setup(){
        cliente = new Cliente(null, null, null, null, null, null, null);
    }
    //Exemplo de caso de teste para capturar uma exceção, quando se passa uma data inválida para ser a data de nascimento do cliente.
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento(DataUtils.StringToDate("31/02/2000"));
    }
    //---------------------------------------------------------------------------------------------------------
    @Test
    public void testedeCPFCorreto() {
    	cliente.setCpf(CpfValidator.isCPF("191"));
    }
    @Test(expected = CpfInvalidoException.class)
    public void testedeCPFIncorreto() {
    	cliente.setCpf(CpfValidator.isCPF("888"));
    }
    //---------------------------------------------------------------------------------------------------------
    @Test
    public void testaestadocivilCorreta() {
    	cliente.setEstadoCivil(EstadoCivilValidator.validaEstadoCivil("Solteira"));
    }
    
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaestadocivilIncorreta() {
    	cliente.setEstadoCivil(EstadoCivilValidator.validaEstadoCivil("Solteirx"));
    }
    //---------------------------------------------------------------------------------------------------------
    @Test
    public void testaidadeAceita() {
    	cliente.setDataNascimento(DataUtils.StringToDate("21/04/2002"));
    	assertTrue(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    
    @Test(expected = IdadeInvalidaException.class)
    public void testaidadeMaior() {
    	cliente.setDataNascimento(DataUtils.StringToDate("21/04/1920"));
    	assertFalse(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    
    @Test(expected = IdadeInvalidaException.class)
    public void testaidadeMenor() {
    	cliente.setDataNascimento(DataUtils.StringToDate("21/04/2015"));
    	assertFalse(DataUtils.validaIdade(cliente.getDataNascimento(), new Date()));
    }
    //----------------------------------------------------------------------------------------------------------
    @Test
    public void testedesexoCerto() {
    	cliente.setSexo(SexoValidator.validaSexo("Feminino"));
    }
    
    @Test(expected = SexoInvalidoException.class)
    public void testedesexoInvalido() {
    	cliente.setSexo(SexoValidator.validaSexo("Femininx"));
    }
    //----------------------------------------------------------------------------------------------------------
    @Test(expected = PassaporteInvalidoException.class)
    public void testedepassaporteSEM() {
    	cliente.setPassaporte(PassaporteValidator.validaPassaporte(null));
    }
    
    @Test
    public void testedepassaporteCOM() {
    	cliente.setPassaporte(PassaporteValidator.validaPassaporte("1"));
    }
    //----------------------------------------------------------------------------------------------------------
    @Test
    public void testedenacionalidadeValida() {
    	cliente.setNacionalidade(NacionalidadeValidator.validaNacionalidade("Brasileira"));
    }
    
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testedenacionalidadeInvalida() {
    	cliente.setNacionalidade(NacionalidadeValidator.validaNacionalidade("Brasileirx"));
    }
    //----------------------------------------------------------------------------------------------------------
}
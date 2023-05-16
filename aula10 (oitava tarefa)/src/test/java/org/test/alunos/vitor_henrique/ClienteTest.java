package org.test.alunos.vitor_henrique;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.model.*;
import org.test.alunos.vitor_henrique.excecoes.NomeInvalidoException;
import org.test.alunos.vitor_henrique.utils.NomeValidator;
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
    
    @Test
    public void testaNomeValido(){
    	String nome = "Vitor Henrique";
    	cliente.setNome(nome);
        assertTrue(NomeValidator.validaNome(nome));
    }
    
    @Test(expected = NomeInvalidoException.class)
    public void testaNomeInvalido(){
    	String nome = null;
        Boolean resultado = NomeValidator.validaNome(nome);
        if(resultado) {
        	cliente.setNome(nome);
        }
    }
    
    @Test
    public void testaDataValida(){
    	String dataNascimento = "23/03/2001";
        cliente.setDataNascimento(dataNascimento);
        assertNotNull(dataNascimento);
    }
    
    //Exemplo de caso de teste para capturar uma exceção, quando se passa uma data inválida para ser a data de nascimento do cliente.
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento("31/02/2000");
    }
    
    @Test
    public void testaSexoValidoMasculino(){
    	String sexo = "Masculino";
    	cliente.setSexo(sexo);
    	assertTrue(SexoValidator.validaSexo(sexo));
    }
    
    @Test
    public void testaSexoValidoFeminino(){
    	String sexo = "Feminino";
    	cliente.setSexo(sexo);
    	assertTrue(SexoValidator.validaSexo(sexo));
    }
    
    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido(){
    	String sexo = "MasculinoFeminino";
        Boolean resultado = SexoValidator.validaSexo(sexo);
        if(resultado) {
        	cliente.setSexo(sexo);
        }
    }
    
    @Test
    public void testaEstadoCivilValidoCasado(){
    	String estadoCivil = "Casado";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }
    
    @Test
    public void testaEstadoCivilValidoCasada(){
    	String estadoCivil = "Casada";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }
    
    @Test
    public void testaEstadoCivilValidoSolteiro(){
    	String estadoCivil = "Solteiro";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }
    
    @Test
    public void testaEstadoCivilValidoSolteira(){
    	String estadoCivil = "Solteira";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }
    
    @Test
    public void testaEstadoCivilValidoViuvo(){
    	String estadoCivil = "Viuvo";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }
    
    @Test
    public void testaEstadoCivilValidoViuva(){
    	String estadoCivil = "Viuva";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }
    
    @Test
    public void testaEstadoCivilValidoDesquitado(){
    	String estadoCivil = "Desquitado";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }
    
    @Test
    public void testaEstadoCivilValidoDesquitada(){
    	String estadoCivil = "Desquitada";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }
    
    @Test
    public void testaNacionalidadeDivorciado(){
    	String estadoCivil = "Divorciado";
        cliente.setEstadoCivil(estadoCivil);
        assertTrue(EstadoCivilValidator.validaEstadoCivil(estadoCivil));
    }
    
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
    	String estadoCivil = "Vivendo e aproveitando";
        Boolean resultado = EstadoCivilValidator.validaEstadoCivil(estadoCivil);
        if(resultado) {
        	cliente.setEstadoCivil(estadoCivil);
        }
    }
    
    @Test
    public void testaNacionalidadeValidaBrasileira(){
    	String nacionalidade = "Brasileira";
        Boolean resultado = NacionalidadeValidator.validaNacionalidade(nacionalidade);
        if(resultado) {
        	cliente.setNacionalidade(nacionalidade);
        }
    }
    
    @Test
    public void testaNacionalidadeValidaEstrangeira(){
    	String nacionalidade = "Estrangeira";
        Boolean resultado = NacionalidadeValidator.validaNacionalidade(nacionalidade);
        if(resultado) {
        	cliente.setNacionalidade(nacionalidade);
        }
    }
    
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
    	String nacionalidade = "Europeu";
        Boolean resultado = NacionalidadeValidator.validaNacionalidade(nacionalidade);
        if(resultado) {
        	cliente.setNacionalidade(nacionalidade);
        }
    }
    
    @Test
    public void testaCpfValido(){
    	String cpf = "67100847010";
    	cliente.setCpf(cpf);
        assertTrue(CpfValidator.isCPF(cpf));
    }
    
    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido(){
    	String cpf = "01234567891";
        Boolean resultado = CpfValidator.isCPF(cpf);
        if(resultado) {
        	cliente.setCpf(cpf);
        }
    }
    
    @Test
    public void testaPassaporteValido(){
    	String passaporte = "Passaporte 1";
    	cliente.setPassaporte(passaporte);        
    	assertTrue(PassaporteValidator.validaPassaporte(passaporte));
    }
    
    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido(){
    	String passaporte = null;
        Boolean resultado = PassaporteValidator.validaPassaporte(passaporte);
        if(resultado) {
        	cliente.setPassaporte(passaporte);
        }        
    }   
}

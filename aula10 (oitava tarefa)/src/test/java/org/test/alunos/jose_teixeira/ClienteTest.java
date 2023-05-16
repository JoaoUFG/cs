package org.test.alunos.jose_teixeira;

import org.model.*;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/*
Alunos:
Jose Teixeira Mendes Junior
Emanoel de Souza Aleixo 
*/

public class ClienteTest {

    Cliente cliente;

    @Before
    public void setup(){
        cliente = new Cliente();
    }
    //! data
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento("31/02/2000");
    }

    @Test
    public void testaDataValida(){
        cliente.setDataNascimento("28/02/2000");
    }
    
    //! sexo
    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido1(){//nome de método duplicado
        //cliente.setSexo(SexoValidator.validaSexo("masculine")); Erro
        cliente.setSexo("masculine");
    }

    @Test
    public void testaSexoValido1(){//nome duplicado
        //cliente.setSexo(SexoValidator.validaSexo("Masculino")); erro
        cliente.setSexo("Masculino");
        //Sem validação
    }

    //! estado Civil
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
        cliente.setEstadoCivil("dequistado");
    }

    @Test
    public void testaEstadoCivilValido(){
        cliente.setEstadoCivil("Desquitado");
        //sem validação
    }

    //! nacionalidade
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
        cliente.setNacionalidade("Argentina");
    }

    @Test
    public void testaNacionalidadeValida(){
        cliente.setNacionalidade("Brasileira");
        //sem validação
    }

    //! cpf
    @Test(expected = CpfInvalidoException.class)
    public void testaSexoInvalido(){
        cliente.setCpf("123456789");
    }

    @Test
    public void testaSexoValido(){
        cliente.setCpf("63385260000");
        //sem validação
    }

    //! passaporte
    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido(){
        cliente.setPassaporte(null);
    }

    @Test
    public void testaPassaporteValido(){
        //erro: cliente.setDataNascimento("passaporte");
        cliente.setDataNascimento("passaporte");
    }

}

//public void testaPassaporteValido() - falhou
package org.test.alunos.emanoel;

import org.model.Cliente;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    /*@Test() errado*/@Test
    public void testaDataValida(){
        cliente.setDataNascimento("28/02/2000");
        //não está validando se o teste passou ou não
    }
    
    //! sexo
    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido1(){//nome de método repetido
        //cliente.setSexo(SexoValidator.validaSexo("masculine")); erro
        cliente.setSexo("masculine");
    }

    /*@Test() errado*/@Test
    public void testaSexoValido1(){//nome repetido
        //cliente.setSexo(SexoValidator.validaSexo("Masculino")); erro
        cliente.setSexo("Masculino");
        //não está validando se o teste passou ou não
    }

    //! estado Civil
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
        cliente.setEstadoCivil("dequistado");
    }

    /*@Test() errado*/@Test
    public void testaEstadoCivilValido(){
        cliente.setEstadoCivil("Desquitado");
        //não está validando se o teste passou ou não
    }

    //! nacionalidade
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
        cliente.setNacionalidade("Argentina");
    }

    /*@Test() errado*/@Test
    public void testaNacionalidadeValida(){
        cliente.setNacionalidade("Brasileira");
        //não está validando se o teste passou ou não
    }

    //! cpf
    @Test(expected = CpfInvalidoException.class)
    public void testaSexoInvalido(){
        cliente.setCpf("123456789");
    }

    /*@Test() errado*/@Test
    public void testaSexoValido(){
        cliente.setCpf("63385260000");
        //não está validando se o teste passou ou não
    }

    //! passaporte
    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido(){
        cliente.setPassaporte(null);
    }

    /*@Test() errado*/@Test
    public void testaPassaporteValido(){
        //cliente.setDataNascimento("passaporte"); erro
        cliente.setPassaporte("passaporte");
        //não está validando se o teste passou ou não
    }
}

//A Maiorida dos métodos de teste está implementada errada.
//todos os testes passaram

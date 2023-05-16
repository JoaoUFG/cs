package org.test.alunos.jose_teixeira;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/*
Alunos:
Jose Teixeira Mendes Junior
Emanoel de Souza Aleixo 
*/

public class PremioSeguroTest {
    PremioSeguro seguro;

    @Before
    public void setup(){
        seguro = new PremioSeguro();
    }

    //* feminino
    //! 5%
    @Test()
    public void descontoFemininoCincoPorCento() {
        Cliente cliente = new Cliente();
        cliente.setNome("Carla");
        //cliente.setDataNascimento("01/04/1997");
        cliente.setDataNascimento("01/04/1998");
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setNacionalidade("Brasileira");
        cliente.setPassaporte("passaporte");
        cliente.setCpf("63385260000");

        seguro.setCliente(cliente);
        seguro.obtemPercentualDesconto();

        Double resultado = seguro.getPercentualDesconto();
        Double esperado = 5.00;
        assertEquals(resultado, esperado);

    }
    //! 10%
    @Test()
    public void descontoFemininoDezPorCento() {
        Cliente cliente = new Cliente();
        cliente.setNome("Claudia");
        //cliente.setDataNascimento("01/04/1997");
        cliente.setDataNascimento("01/04/1998");
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setNacionalidade("Brasileira");
        cliente.setPassaporte("passaporte");
        cliente.setCpf("63385260000");

        seguro.setCliente(cliente);
        seguro.obtemPercentualDesconto();

        Double resultado = seguro.getPercentualDesconto();
        Double esperado = 10.00;

        //assertEquals(resultado, eperado); erro no nome da variável "esperado".
        assertEquals(resultado, esperado);
    }
    //! 15%
    @Test()
    public void nameTest() {
        Cliente cliente = new Cliente();
        cliente.setNome("Marcia");
        //cliente.setDataNascimento("01/04/1996");
        cliente.setDataNascimento("01/04/1996");
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Solteira");
        cliente.setNacionalidade("Brasileira");
        cliente.setPassaporte("passaporte");
        cliente.setCpf("63385260000");

        seguro.setCliente(cliente);
        seguro.obtemPercentualDesconto();

        Double resultado = seguro.getPercentualDesconto();
        Double esperado = 15.00;

        assertEquals(resultado, esperado);
    }
    //! 30%
    @Test()
    public void nameTest1() {//nome de método repetido
        Cliente cliente = new Cliente();
        cliente.setNome("Beatriz");
        //cliente.setDataNascimento("01/04/1996");
        cliente.setDataNascimento("01/04/1996");
        cliente.setSexo("Feminino");
        cliente.setEstadoCivil("Casada");
        cliente.setNacionalidade("Brasileira");
        cliente.setPassaporte("passaporte");
        cliente.setCpf("63385260000");

        seguro.setCliente(cliente);
        seguro.obtemPercentualDesconto();

        Double resultado = seguro.getPercentualDesconto();
        Double esperado = 30.00;

        assertEquals(resultado, esperado);
    }

    //* masculino
    //! 0%
    @Test()
    public void nameTest2() {//nome de método repetido
        Cliente cliente = new Cliente();
        cliente.setNome("Joao");
        //cliente.setDataNascimento("01/05/1997");
        cliente.setDataNascimento("01/05/1998");
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setNacionalidade("Brasileira");
        cliente.setPassaporte("passaporte");
        cliente.setCpf("63385260000");

        seguro.setCliente(cliente);
        seguro.obtemPercentualDesconto();

        Double resultado = seguro.getPercentualDesconto();
        Double esperado = 0.00;

        assertEquals(resultado, esperado);
    }
    //! 5%
    @Test()
    public void nameTest3() {//nome de método repetido
        Cliente cliente = new Cliente();
        cliente.setNome("Thiago");
        //cliente.setDataNascimento("01/05/1997");
        cliente.setDataNascimento("01/05/1998");
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setNacionalidade("Brasileira");
        cliente.setPassaporte("passaporte");
        cliente.setCpf("63385260000");

        seguro.setCliente(cliente);
        seguro.obtemPercentualDesconto();

        Double resultado = seguro.getPercentualDesconto();
        Double esperado = 5.00;

        assertEquals(resultado, esperado);
    }
    //! 10%
    @Test()
    public void nameTest4() {//nome de método repetido
        Cliente cliente = new Cliente();
        cliente.setNome("Pedro");
        //cliente.setDataNascimento("01/05/1996");
        cliente.setDataNascimento("01/05/1996");
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Solteiro");
        cliente.setNacionalidade("Brasileira");
        cliente.setPassaporte("passaporte");
        cliente.setCpf("63385260000");

        seguro.setCliente(cliente);
        seguro.obtemPercentualDesconto();

        Double resultado = seguro.getPercentualDesconto();
        Double esperado = 10.00;

        assertEquals(resultado, esperado);
    }
    //! 20%
    @Test()
    public void nameTest5() {//nome de método repetido
        Cliente cliente = new Cliente();
        cliente.setNome("Sergio");
        //cliente.setDataNascimento("01/05/1996");
        cliente.setDataNascimento("01/05/1996");
        cliente.setSexo("Masculino");
        cliente.setEstadoCivil("Casado");
        cliente.setNacionalidade("Brasileira");
        cliente.setPassaporte("passaporte");
        cliente.setCpf("63385260000");

        seguro.setCliente(cliente);
        seguro.obtemPercentualDesconto();

        Double resultado = seguro.getPercentualDesconto();
        Double esperado = 20.00;

        assertEquals(resultado, esperado);
    }

}

//erros por falta de validação
//erros na atribuição da data de nascimento ao cliente
//Nomes de métodos de teste duplicados.
//quatro casos de teste falharam

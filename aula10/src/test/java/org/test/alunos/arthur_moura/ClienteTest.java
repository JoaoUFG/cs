package org.test.alunos.arthur_moura;

import org.model.Cliente;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClienteTest {
    // Teste de nome
    @Test
    public void testNome() {
        Cliente c = new Cliente();
        c.setNome("John");
        assertEquals("John", c.getNome());
    }

    // Teste de data de nascimento
    @Test
    public void testDataNascimento() {
        Cliente c = new Cliente();
        Date d = new Date();
        c.setDataNascimento(DataUtils.DateToString(d));
        assertEquals(d, c.getDataNascimento());
    }

    // Tesst de sexo
    @Test
    public void testSexo() {
        Cliente c = new Cliente();
        c.setSexo("M");
        assertEquals("M", c.getSexo());
    }

    // Teste de estado civíl
    @Test
    public void testEstadoCivil() {
        Cliente c = new Cliente();
        c.setEstadoCivil("Solteiro");
        assertEquals("Solteiro", c.getEstadoCivil());
    }

    // Teste de nacionalidade
    @Test
    public void testNacionalidade() {
        Cliente c = new Cliente();
        c.setNacionalidade("Brasileira");
        assertEquals("Brasileira", c.getNacionalidade());
    }

    // Teste de cpf
    @Test
    public void testCpf() {
        Cliente c = new Cliente();
        c.setCpf("123-456-789-01");
        assertEquals("123-456-789-01", c.getCpf());
    }

    // Teste de passaporte
    @Test
    public void testPassaporte() {
        Cliente c = new Cliente();
        c.setPassaporte("ABC123");
        assertEquals("ABC123", c.getPassaporte());
    }
}

//public void testSexo() falhou
//public void testCpf() falhou
//public void testDataNascimento() falhou
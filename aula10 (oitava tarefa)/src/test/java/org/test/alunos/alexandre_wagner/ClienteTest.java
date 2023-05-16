package org.test.alunos.alexandre_wagner;

import org.model.Cliente;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClienteTest {

    Cliente cliente;
    @Before
    public void setup(){
        cliente = new Cliente();
    }
    public String CPF = "12345678911";
    public String sexo = "outros";
    public String estadoCivil = "outros";
    public String nacionalidade = "outros";
    public String passaporte = null;
    //Exemplo de caso de teste para capturar uma exceção, quando se passa uma data inválida para ser a data de nascimento do cliente.
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento("31/02/2000");
    }
    @Test
    public void testaDataValida(){
        cliente.setDataNascimento("28/02/2000");
    }
    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido(){
        if(CpfValidator.isCPF(CPF))
            cliente.setCpf(CPF);
    }
    @Test
    public void testaCpfValido(){
        CPF = "11111111111";
        if(CpfValidator.isCPF(CPF))
            cliente.setCpf(CPF);
    }
    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido(){
        if(SexoValidator.validaSexo(sexo))
            cliente.setSexo(sexo);
    }
    @Test
    public void testaSexoValidoFeminino(){
        sexo="Feminino";
        if(SexoValidator.validaSexo(sexo))
            cliente.setSexo(sexo);
    }
    @Test
    public void testaSexoValidoMasculino(){
        sexo="Masculino";
        if(SexoValidator.validaSexo(sexo))
            cliente.setSexo(sexo);
    }
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
        if(EstadoCivilValidator.validaEstadoCivil(estadoCivil))
        cliente.setEstadoCivil(estadoCivil);
    }
    @Test
    public void testaEstadoCivilValidoSolteiro(){
        estadoCivil = "Solteiro";
        if(EstadoCivilValidator.validaEstadoCivil(estadoCivil))
            cliente.setEstadoCivil(estadoCivil);
    }
    @Test
    public void testaEstadoCivilValidoCasado(){
        estadoCivil = "Casado";
        if(EstadoCivilValidator.validaEstadoCivil(estadoCivil))
            cliente.setEstadoCivil(estadoCivil);
    }
    @Test
    public void testaEstadoCivilValidoViuvo(){
        estadoCivil = "Viuvo";
        if(EstadoCivilValidator.validaEstadoCivil(estadoCivil))
            cliente.setEstadoCivil(estadoCivil);
    }
    @Test
    public void testaEstadoCivilValidoDesquitado(){
        estadoCivil = "Desquitado";
        if(EstadoCivilValidator.validaEstadoCivil(estadoCivil))
            cliente.setEstadoCivil(estadoCivil);
    }
    @Test
    public void testaEstadoCivilValidoDivorciado(){
        estadoCivil = "Divorciado";
        if(EstadoCivilValidator.validaEstadoCivil(estadoCivil))
            cliente.setEstadoCivil(estadoCivil);
    }
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
        if(NacionalidadeValidator.validaNacionalidade(nacionalidade))
        cliente.setNacionalidade(nacionalidade);
    }
    @Test
    public void testaNacionalidadeValidaBrasileira(){
        nacionalidade = "Brasileira";
        if(NacionalidadeValidator.validaNacionalidade(nacionalidade))
            cliente.setNacionalidade(nacionalidade);
    }
    @Test
    public void testaNacionalidadeValidaEstrangeira(){
        nacionalidade = "Estrangeira";
        if(NacionalidadeValidator.validaNacionalidade(nacionalidade))
            cliente.setNacionalidade(nacionalidade);
    }
    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaporteInvalido(){
        if(PassaporteValidator.validaPassaporte(passaporte))
        cliente.setPassaporte(passaporte);
    }
    @Test
    public void testaPassaporteValido(){
        passaporte = "";
        if(PassaporteValidator.validaPassaporte(passaporte))
            cliente.setPassaporte(passaporte);
    }

}

//todos os testes passaram

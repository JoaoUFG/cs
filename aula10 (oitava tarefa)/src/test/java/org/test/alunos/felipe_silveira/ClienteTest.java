package org.test.alunos.felipe_silveira;

import org.model.Cliente;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

public class ClienteTest {

    Cliente cliente;

    @Before
    public void setup() {
        cliente = new Cliente();
    }

    //Exemplo de caso de teste para capturar uma exceção, quando se passa uma data inválida para ser a data de nascimento do cliente.
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida() {
        cliente.setDataNascimento("31/02/2000");
    }

    @Test
    public void validaCpfValido() {
        //assert CpfValidator.isCPF("19836808000");
        assertTrue(CpfValidator.isCPF("19836808000"));
    }

    @Test
    public void validaCpfInvalidoTamanhoMaior() {
        //assert !CpfValidator.isCPF("198368080001");
        assertTrue(!CpfValidator.isCPF("198368080001"));
    }

    @Test
    public void validaCpfInvalidoNumerosIguais() {
        //assert !CpfValidator.isCPF("00000000000");
        assertTrue(!CpfValidator.isCPF("00000000000"));
    }

    @Test(expected = CpfInvalidoException.class)
    public void validaCpfInvalido() {
        CpfValidator.isCPF("19836808001");
    }

    @Test(expected = DataInvalidaException.class)
    public void validaDataInvalidaFevereiroInvalido() {
        DataUtils.validaData("30/02/2000");
    }

    @Test(expected = DataInvalidaException.class)
    public void validaDataInvalidaMes30DiasInvalido() {
        DataUtils.validaData("31/04/2000");
    }

    @Test(expected = DataInvalidaException.class)
    public void validaDataInvalidaMes31DiasInvalido() {
        DataUtils.validaData("32/01/2000");
    }

    @Test(expected = DataInvalidaException.class)
    public void validaDataInvalidaMesInvalido() {
        DataUtils.validaData("30/13/2000");
    }


    @Test(expected = DataInvalidaException.class)
    public void validaDataInvalidaAnoInvalido1() {
        DataUtils.validaData("03/03/2024");
    }

    @Test(expected = DataInvalidaException.class)
    public void validaDataInvalidaAnoInvalido2() {
        DataUtils.validaData("03/03/1899");
    }

    @Test
    public void validaDataValida() {
        //assert DataUtils.validaData("03/03/2022");
        assertTrue(DataUtils.validaData("03/03/2022"));
    }

    @Test
    public void testeGetIdade() {
        int idade = DataUtils.getIdade(DataUtils.StringToDate("01/07/1999"), new Date());
        assertTrue(idade == 24);
    }

    @Test(expected = IdadeInvalidaException.class)
    public void validaIdadeInvalidaMenor18() {
        DataUtils.validaIdade(DataUtils.StringToDate("03/03/2005"), new Date());
    }

    @Test(expected = IdadeInvalidaException.class)
    public void validaIdadeInvalidaMaior75() {
        DataUtils.validaIdade(DataUtils.StringToDate("03/03/1945"), new Date());
    }

    @Test
    public void validaIdadeValida() {
        //assert DataUtils.validaIdade(DataUtils.StringToDate("01/07/1999"), new Date());
        assertTrue(DataUtils.validaIdade(DataUtils.StringToDate("01/07/1999"), new Date()));
    }

    @Test
    public void validaDataValido1() {
        //assert SexoValidator.validaSexo("Masculino");
        assertTrue(SexoValidator.validaSexo("Masculino"));
    }

    @Test
    public void validaDataValido2() {
        //assert SexoValidator.validaSexo("Feminino");
        assertTrue(SexoValidator.validaSexo("Feminino"));
    }

    @Test(expected = SexoInvalidoException.class)
    public void validaSexoInvalido() {
        //assert SexoValidator.validaSexo("Masculio");
        assertTrue(SexoValidator.validaSexo("Masculio"));
    }

    @Test
    public void validaEstadoCivilValido() {
        //assert EstadoCivilValidator.validaEstadoCivil("Solteiro");
        assertTrue(EstadoCivilValidator.validaEstadoCivil("Solteiro"));
        //assert EstadoCivilValidator.validaEstadoCivil("Solteira");
        assertTrue(EstadoCivilValidator.validaEstadoCivil("Solteira"));
        //assert EstadoCivilValidator.validaEstadoCivil("Casado");
        assertTrue(EstadoCivilValidator.validaEstadoCivil("Casado"));
        //assert EstadoCivilValidator.validaEstadoCivil("Casada");
        assertTrue(EstadoCivilValidator.validaEstadoCivil("Casada"));
        //assert EstadoCivilValidator.validaEstadoCivil("Viuvo");
        assertTrue(EstadoCivilValidator.validaEstadoCivil("Viuvo"));
        //assert EstadoCivilValidator.validaEstadoCivil("Viuva");
        assertTrue(EstadoCivilValidator.validaEstadoCivil("Viuva"));
        //assert EstadoCivilValidator.validaEstadoCivil("Desquitado");
        assertTrue(EstadoCivilValidator.validaEstadoCivil("Desquitado"));
        //assert EstadoCivilValidator.validaEstadoCivil("Desquitada");
        assertTrue(EstadoCivilValidator.validaEstadoCivil("Desquitada"));
        //assert EstadoCivilValidator.validaEstadoCivil("Divorciado");
        assertTrue(EstadoCivilValidator.validaEstadoCivil("Divorciado"));
    }

    @Test(expected = EstadoCivilInvalidoException.class)
    public void validaEstadoCivilInvalido() {
        EstadoCivilValidator.validaEstadoCivil("a");
    }

    @Test
    public void validaNacionalidadeValida() {
        assert NacionalidadeValidator.validaNacionalidade("Brasileira");
        assert NacionalidadeValidator.validaNacionalidade("Estrangeira");
    }

    @Test(expected = NacionalidadeInvalidaException.class)
    public void validaNacionalidadeInvalida() {
        NacionalidadeValidator.validaNacionalidade("a");
    }

    @Test
    public void validaPassaporteValido() {
        //assert PassaporteValidator.validaPassaporte("a");
        assertTrue(PassaporteValidator.validaPassaporte("a"));
    }

    @Test(expected = PassaporteInvalidoException.class)
    public void validaPassaporteInvalido() {
        PassaporteValidator.validaPassaporte(null);
    }
}

//muitos erros de assert
//todos os erros passaram

package org.test.alunos.flavimar;

import org.model.Cliente;
import org.util.*;
import org.excecoes.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClienteTest {

    Cliente cliente;
    Calendar cal;
    Date date;
    SimpleDateFormat format;
    @Before
    public void setup(){
        cliente = new Cliente();

        format = new SimpleDateFormat("dd/MM/yyyy");
        cal = Calendar.getInstance();
        date = cal.getTime();
        Date pyear = cal.getTime();
        System.out.println("\nDate before 1 year : " + pyear);
    }
    //Exemplo de caso de teste para capturar uma exceção, quando se passa uma data inválida para ser a data de nascimento do cliente.
    @Test(expected = DataInvalidaException.class)
    public void testaDataInvalida(){
        cliente.setDataNascimento("31/02/2000");
    }
    @Test
    public void testaDataValida(){
        cliente.setDataNascimento("31/12/2000");
        try {
            assertEquals(format.parse("31/12/2000"),cliente.getDataNascimento());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    @Test(expected = IdadeInvalidaException.class)
    public void testaDataMenor18(){
        cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -17);
        Date date1 = cal.getTime();
        DataUtils.validaIdade(date1,new Date());
    }
    @Test
    public void testaDataIgual18(){
        cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -18);
        Date date1 = cal.getTime();
        assertTrue(DataUtils.validaIdade(date1,new Date()));
    }
    @Test
    public void testaDataMaior18(){
        cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -19);
        Date date1 = cal.getTime();
        assertTrue(DataUtils.validaIdade(date1,new Date()));
    }
    @Test(expected = IdadeInvalidaException.class)
    public void testaDataMaior75(){
        cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -76);
        Date date1 = cal.getTime();
        DataUtils.validaIdade(date1,new Date());
    }
    @Test
    public void testaDataIgual75(){
        cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -75);
        Date date1 = cal.getTime();
        assertTrue(DataUtils.validaIdade(date1,new Date()));
    }
    @Test
    public void testaDataMenor75(){
        cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -74);
        Date date1 = cal.getTime();
        assertTrue(DataUtils.validaIdade(date1,new Date()));
    }
    @Test
    public void testaSexoValido(){
        assertTrue(SexoValidator.validaSexo("Masculino"));
    }
    @Test(expected = SexoInvalidoException.class)
    public void testaSexoInvalido(){
        SexoValidator.validaSexo("Não-binario");
    }
    @Test(expected = EstadoCivilInvalidoException.class)
    public void testaEstadoCivilInvalido(){
        EstadoCivilValidator.validaEstadoCivil("Namorando");
    }
    @Test
    public void testaEstadoCivilValido(){
        assertTrue(EstadoCivilValidator.validaEstadoCivil("Solteira"));
    }
    @Test
    public void testaNacionalidadeValida(){
        assertTrue(NacionalidadeValidator.validaNacionalidade("Brasileira"));
    }
    @Test(expected = NacionalidadeInvalidaException.class)
    public void testaNacionalidadeInvalida(){
        NacionalidadeValidator.validaNacionalidade("Europeia");
    }
    @Test(expected = CpfInvalidoException.class)
    public void testaCpfInvalido(){
        CpfValidator.isCPF("10411218011");
    }
    @Test
    public void testaCpfValido(){
        assertTrue(CpfValidator.isCPF("30469248017"));
    }
    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaportInvalidoVazio(){
        PassaporteValidator.validaPassaporte("");
    }
    @Test(expected = PassaporteInvalidoException.class)
    public void testaPassaportInvalidoNull(){
        PassaporteValidator.validaPassaporte(null);
    }
    @Test
    public void testaPassaportValido(){
        assertTrue(PassaporteValidator.validaPassaporte("teste"));
    }

}
//public void testaPassaportInvalidoVazio() - falhou
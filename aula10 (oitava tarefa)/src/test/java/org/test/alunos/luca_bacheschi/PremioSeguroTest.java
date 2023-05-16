package org.test.alunos.luca_bacheschi;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PremioSeguroTest {
    @Test
    public void testaFemininoSolteira18A25(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/2000", "Feminino", "Solteira", "Brasileira", "Passaporte");
        Double esperado = 5.00;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaFemininoSolteira26A60(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/1981", "Feminino", "Solteira", "Brasileira", "Passaporte");
        Double esperado = 15.00;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaFemininoCasada18A25(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/2000", "Feminino", "Casada", "Brasileira", "Passaporte");
        Double esperado = 10.00;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaFemininoCasada26A60(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/1981", "Feminino", "Casada", "Brasileira", "Passaporte");
        Double esperado = 30.00;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaFemininoViuva18A25Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/2000", "Feminino", "Viuva", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaFemininoViuva26A60Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/1981", "Feminino", "Viuva", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaFemininoDivorciada18A25Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/2000", "Feminino", "Divorciado", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }
    
    @Test
    public void testaFemininoDivorciada26A60Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/1981", "Feminino", "Divorciado", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaFemininoDesquitada18A25Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/2000", "Feminino", "Desquitada", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaFemininoDesquitada26A60Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/1981", "Feminino", "Desquitada", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaMasculinoSolteiro18A25(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/2000", "Masculino", "Solteiro", "Brasileira", "Passaporte");
        Double esperado = 0.00;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaMasculinoSolteiro26A60(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/1981", "Masculino", "Solteiro", "Brasileira", "Passaporte");
        Double esperado = 10.00;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaMasculinoCasado18A25(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/2000", "Masculino", "Casado", "Brasileira", "Passaporte");
        Double esperado = 5.00;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaMasculinoCasado26A60(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/1981", "Masculino", "Casado", "Brasileira", "Passaporte");
        Double esperado = 20.00;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaMasculinoViuvo18A25Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/2000", "Masculino", "Viuvo", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaMasculinoViuvo26A60Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/1981", "Masculino", "Viuvo", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaMasculinoDivorciado18A25Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/2000", "Masculino", "Divorciado", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }
    
    @Test
    public void testaMasculinoDivorciado26A60Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/1981", "Masculino", "Divorciado", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaMasculinoDesquitado18A25Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/2000", "Masculino", "Desquitado", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }

    @Test
    public void testaMasculinoDesquitado26A60Invalido(){
        Cliente cliente = new Cliente("Nome", "68662010040", "17/12/1981", "Masculino", "Desquitado", "Brasileira", "Passaporte");
        Double esperado = null;
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        //Double desconto = premioSeguro.obtemPercentualDesconto();//este método não retorna nada
        premioSeguro.obtemPercentualDesconto();
        Double desconto = premioSeguro.getPercentualDesconto();
        assertEquals(desconto, esperado);
    }
}

//erro na implementação da obtenção do desconto.
//Após a correção, todos os testes passaram


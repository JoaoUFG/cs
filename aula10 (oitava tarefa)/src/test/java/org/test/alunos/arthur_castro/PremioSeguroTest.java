/*
feminino -> solteira -> 18 <= idade <= 25 -> 5% X
feminino -> solteira -> 26 <= idade <= 60 -> 15% X
feminino -> casada -> 18 <= idade <= 25 -> 10% X
feminino -> casada -> 26 <= idade <= 60 -> 30% X
masculino -> solteiro -> 18 <= idade <= 25 -> 0% x
masculino -> solteiro -> 26 <= idade <= 60 -> 10 
masculino -> casado -> 18 <= idade <= 25 -> 5% X
masculino -> casado -> 26 <= idade <= 60 -> 20% X
 */

package org.test.alunos.arthur_castro;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class PremioSeguroTest {
    PremioSeguro premioSeguro;
    Cliente cliente;

    @Test()
    public void descontoDeveSerZeroParaHomemDe23anosSolteiro(){
        cliente = new Cliente("Arthur", "00644516151", "18/06/1999" , "Masculino", "Solteiro", "Brasileira", "5349027");
        //premioSeguro = new PremioSeguro(cliente, 1000.00);
        premioSeguro = new PremioSeguro(cliente);
        premioSeguro.setValorSeguro(1000.00);
        //Double percentualDesconto = premioSeguro.obtemPercentualDesconto();
        premioSeguro.obtemPercentualDesconto();
        Double percentualDesconto = premioSeguro.getPercentualDesconto();

        assertEquals(Double.valueOf(0), percentualDesconto);
    }

    @Test()
    public void descontoDeveSerZeroParaHomemDe30anosSolteiro(){
        cliente = new Cliente("Arthur", "00644516151", "18/06/1992" , "Masculino", "Solteiro", "Brasileira", "5349027");
        //premioSeguro = new PremioSeguro(cliente, 1000.00);
        premioSeguro = new PremioSeguro(cliente);
        premioSeguro.setValorSeguro(1000.00);
        //Double percentualDesconto = premioSeguro.obtemPercentualDesconto();
        premioSeguro.obtemPercentualDesconto();
        Double percentualDesconto = premioSeguro.getPercentualDesconto();

        assertEquals(Double.valueOf(10), percentualDesconto);
    }

    @Test()
    public void descontoDeve30ParaHomemDe30anosCasado(){
        cliente = new Cliente("Arthur", "00644516151", "18/06/1992", "Masculino", "Casado", "Brasileira", "5349027");
        //premioSeguro = new PremioSeguro(cliente, 1000.00);
        premioSeguro = new PremioSeguro(cliente);
        premioSeguro.setValorSeguro(1000.00);
        //Double percentualDesconto = premioSeguro.obtemPercentualDesconto();
        premioSeguro.obtemPercentualDesconto();
        Double percentualDesconto = premioSeguro.getPercentualDesconto();

        assertEquals(Double.valueOf(20), percentualDesconto);
    }


    @Test()
    public void descontoDeveSerCincoParaHomemDe24anosCasado(){
        cliente = new Cliente("Arthur", "00644516151", "18/06/1998" , "Masculino", "Casado", "Brasileira", "5349027");
        //premioSeguro = new PremioSeguro(cliente, 1000.00);
        premioSeguro = new PremioSeguro(cliente);
        premioSeguro.setValorSeguro(1000.00);
        //Double percentualDesconto = premioSeguro.obtemPercentualDesconto();
        premioSeguro.obtemPercentualDesconto();
        Double percentualDesconto = premioSeguro.getPercentualDesconto();

        assertEquals(Double.valueOf(5), percentualDesconto);
    }


    @Test()
    public void descontoDeveSerCincoParaMulherDe23anosSolteira(){
        cliente = new Cliente("Sarah", "00644516151", "18/06/1999" , "Feminino", "Solteira", "Brasileira", "5349027");
        //premioSeguro = new PremioSeguro(cliente, 1000.00);
        premioSeguro = new PremioSeguro(cliente);
        premioSeguro.setValorSeguro(1000.00);
        //Double percentualDesconto = premioSeguro.obtemPercentualDesconto();
        premioSeguro.obtemPercentualDesconto();
        Double percentualDesconto = premioSeguro.getPercentualDesconto();

        assertEquals(Double.valueOf(5), percentualDesconto);
    }

    @Test()
    public void descontoDeveSerCincoParaMulherDe30anosSolteira(){
        cliente = new Cliente("Sarah", "00644516151", "18/06/1992" , "Feminino", "Solteira", "Brasileira", "5349027");
        //premioSeguro = new PremioSeguro(cliente, 1000.00);
        premioSeguro = new PremioSeguro(cliente);
        premioSeguro.setValorSeguro(1000.00);
        //Double percentualDesconto = premioSeguro.obtemPercentualDesconto();
        premioSeguro.obtemPercentualDesconto();
        Double percentualDesconto = premioSeguro.getPercentualDesconto();

        assertEquals(Double.valueOf(15), percentualDesconto);
    }

    @Test()
    public void descontoDeveSerCincoParaMulherDe24anosCasada(){
        cliente = new Cliente("Sarah", "00644516151", "18/06/1998" , "Feminino", "Casada", "Brasileira", "5349027");
        //premioSeguro = new PremioSeguro(cliente, 1000.00);
        premioSeguro = new PremioSeguro(cliente);
        premioSeguro.setValorSeguro(1000.00);
        //Double percentualDesconto = premioSeguro.obtemPercentualDesconto();
        premioSeguro.obtemPercentualDesconto();
        Double percentualDesconto = premioSeguro.getPercentualDesconto();

        assertEquals(Double.valueOf(10), percentualDesconto);
    }

    @Test()
    public void descontoDeveSerCincoParaMulherDe30anosCasada(){
        cliente = new Cliente("Sarah", "00644516151", "18/06/1992" , "Feminino", "Casada", "Brasileira", "5349027");
        //premioSeguro = new PremioSeguro(cliente, 1000.00);
        premioSeguro = new PremioSeguro(cliente);
        premioSeguro.setValorSeguro(1000.00);
        //Double percentualDesconto = premioSeguro.obtemPercentualDesconto();
        premioSeguro.obtemPercentualDesconto();
        Double percentualDesconto = premioSeguro.getPercentualDesconto();
        assertEquals(Double.valueOf(30), percentualDesconto);
    }
}

//todos os métodos com erro de implementação
//apó correção, todos os testes passaram.

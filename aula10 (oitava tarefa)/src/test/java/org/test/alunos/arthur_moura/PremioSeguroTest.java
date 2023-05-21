package org.test.alunos.arthur_moura;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PremioSeguroTest {
    // Test for the valorSeguro attribute
    @Test
    public void testValorSeguro() {
        PremioSeguro p = new PremioSeguro();
        p.setValorSeguro(1000.0);
        assertEquals(1000.0, p.getValorSeguro(), 0.001);
    }

    // Test for the percentualDesconto attribute
    @Test
    public void testPercentualDesconto() {
        PremioSeguro p = new PremioSeguro();
        p.setPercentualDesconto(5.0);
        assertEquals(5.0, p.getPercentualDesconto(), 0.001);
    }

    // Test for the valorSeguroComDesconto attribute
    @Test
    public void testValorSeguroComDesconto() {
        PremioSeguro p = new PremioSeguro();
        p.setValorSeguroComDesconto(950.0);
        assertEquals(950.0, p.getValorSeguroComDesconto(), 0.001);
    }

    // Test for the cliente attribute
    @Test
    public void testCliente() {
        PremioSeguro p = new PremioSeguro();
        Cliente c = new Cliente();
        p.setCliente(c);
        assertEquals(c, p.getCliente());
    }

    @Test
    public void testObtemPercentualDesconto() {
        // Teste para feminino, solteira, menor que 25 anos
        PremioSeguro p = new PremioSeguro();
        //Cliente c = new Cliente("Jane", new Date(1995, 5, 5), "Feminino", "Solteira", "Brasileira", "123-456-789-01", null);//parâmetros fora de ordem
        Cliente c = new Cliente("Jane", "12345678901", "05/05/1955", "Feminino", "Solteira", "Brasileira", null);
        p.setCliente(c);
        p.obtemPercentualDesconto();
        assertEquals(5.0, p.getPercentualDesconto(), 0.001);

        // Teste para feminino, solteira, maior que 25 anos
        p = new PremioSeguro();
        //c = new Cliente("Jane", new Date(1990, 5, 5), "Feminino", "Solteira", "Brasileira", "123-456-789-01", null);
        c = new Cliente("Jane", "12345678901", "05/05/1990", "Feminino", "Solteira", "Brasileira", null);
        p.setCliente(c);
        p.obtemPercentualDesconto();
        assertEquals(15.0, p.getPercentualDesconto(), 0.001);

        // Teste para feminino, casada, menor que 25 anos
        p = new PremioSeguro();
        //c = new Cliente("Jane", new Date(1995, 5, 5), "Feminino", "Casada", "Brasileira", "123-456-789-01", null);
        c = new Cliente("Jane", "12345678901", "05/05/1995", "Feminino", "Casada", "Brasileira", null);
        p.setCliente(c);
        p.obtemPercentualDesconto();
        assertEquals(30.0, p.getPercentualDesconto(), 0.001);

        // Teste para masculino, solteiro, menor que 25 anos
        p = new PremioSeguro();
        //c = new Cliente("John", new Date(1995, 5, 5), "Masculino", "Solteiro", "Brasileira", "123-456-789-01", null);
        c = new Cliente("John", "12345678901", "05/05/1995", "Masculino", "Solteiro", "Brasileira", null);
        p.setCliente(c);
        p.obtemPercentualDesconto();
        assertEquals(0.0, p.getPercentualDesconto(), 0.001);

        // Teste para masculino, solteiro, maior que 25 anos
        p = new PremioSeguro();
        //c = new Cliente("John", new Date(1990, 5, 5), "Masculino", "Solteiro", "Brasileira", "123-456-789-01", null);
        c = new Cliente("John", "12345678901", "05/05/1990", "Masculino", "Solteiro", "Brasileira", null);
        p.setCliente(c);
        p.obtemPercentualDesconto();
        assertEquals(10.0, p.getPercentualDesconto(), 0.001);

        // Teste para masculino, casado, menor que 25 anos
        p = new PremioSeguro();
        //c = new Cliente("John", new Date(1995, 5, 5), "Masculino", "Casado", "Brasileira", "123-456-789-01", null);
        c = new Cliente("John", "12345678901", "05/05/1995", "Masculino", "Casado", "Brasileira", null);
        p.setCliente(c);
        p.obtemPercentualDesconto();
        assertEquals(5.0, p.getPercentualDesconto(), 0.001);

        // Teste para masculino, casado, maior que 25 anos
        p = new PremioSeguro();
        //c = new Cliente("John", new Date(1990, 5, 5), "Masculino", "Casado", "Brasileira", "123-456-789-01", null);
        c = new Cliente("John", "12345678901", "05/05/1990", "Masculino", "Casado", "Brasileira", null);
        p.setCliente(c);
        p.obtemPercentualDesconto();
        assertEquals(20.0, p.getPercentualDesconto(), 0.001);
    }
}//faltou a chave de fechamento da classe

    //erro no formato do cpf;
    //Erro na instanciação do cliente. CPF fora da ordem
    //Um único método de teste para todos os cenários testados. E falhou pelo uso de um CPF inválido.
      
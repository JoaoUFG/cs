package org.test.alunos.vitor_henrique;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;
import org.excecoes.*;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PremioSeguroTest {
	@Test(expected = IdadeInvalidaException.class)
    public void testaIdade17AnosFemininoSolteira(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/2005", "Feminino", "Solteira", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	premioSeguro.obtemPercentualDesconto();
    }
	
	@Test
    public void testaIdade18AnosFemininoSolteira(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/2004", "Feminino", "Solteira", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 5.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade23AnosFemininoSolteira(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/1999", "Feminino", "Solteira", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 5.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade26AnosFemininoSolteira(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/1996", "Feminino", "Solteira", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 15.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade25AnosFemininoSolteira(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/1998", "Feminino", "Solteira", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 5.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade28AnosFemininoSolteira(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/1994", "Feminino", "Solteira", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 15.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test(expected = IdadeInvalidaException.class)
    public void testaIdade61AnosFemininoSolteira(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/1961", "Feminino", "Solteira", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	premioSeguro.obtemPercentualDesconto();
    }
	
	@Test(expected = IdadeInvalidaException.class)
    public void testaIdade17AnosFemininoCasada(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/2006", "Feminino", "Casada", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	premioSeguro.obtemPercentualDesconto();
    }
	
	public void testaIdade18AnosFemininoCasada(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/2004", "Feminino", "Casada", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 10.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade24AnosFemininoCasada(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/1998", "Feminino", "Casada", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 10.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade26AnosFemininoCasada(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/1996", "Feminino", "Casada", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 30.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade25AnosFemininoCasada(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/1998", "Feminino", "Casada", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 10.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade30AnosFemininoCasada(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/1992", "Feminino", "Casada", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 30.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test(expected = IdadeInvalidaException.class)
    public void testaIdade61AnosFemininoCasada(){
    	Cliente cliente = new Cliente("Joana Darc", "47326754098", "23/03/1961", "Feminino", "Casada", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	premioSeguro.obtemPercentualDesconto();
    }
	
	@Test(expected = IdadeInvalidaException.class)
    public void testaIdade17AnosMasculinoSolteiro(){
    	Cliente cliente = new Cliente("Vitor Henrique", "10759039046", "23/03/2006", "Masculino", "Solteiro", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	premioSeguro.obtemPercentualDesconto();
    }
	
	public void testaIdade18AnosMasculinoSolteiro(){
    	Cliente cliente = new Cliente("Vitor Henrique", "10759039046", "23/03/2004", "Masculino", "Solteira", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 0.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade23AnosMasculinoSolteiro(){
    	Cliente cliente = new Cliente("Vitor Henrique", "10759039046", "23/03/1999", "Masculino", "Solteiro", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 0.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade26AnosMasculinoSolteiro(){
    	Cliente cliente = new Cliente("Vitor Henrique", "47326754098", "23/03/1996", "Masculino", "Solteiro", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 10.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade25AnosMasculinoSolteiro(){
    	Cliente cliente = new Cliente("Vitor Henrique", "47326754098", "23/03/1998", "Masculino", "Solteiro", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 0.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade30AnosMasculinoSolteiro(){
    	Cliente cliente = new Cliente("Vitor Henrique", "47326754098", "23/03/1992", "Masculino", "Solteiro", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 10.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test(expected = IdadeInvalidaException.class)
    public void testaIdade61AnosMasculinoSolteiro(){
    	Cliente cliente = new Cliente("Vitor Henrique", "47326754098", "23/03/1961", "Masculino", "Solteiro", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	premioSeguro.obtemPercentualDesconto();
    }
	
	@Test(expected = IdadeInvalidaException.class)
    public void testaIdade17AnosMasculinoCasado(){
    	Cliente cliente = new Cliente("Vitor Henrique", "47326754098", "23/03/2006", "Masculino", "Casado", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	premioSeguro.obtemPercentualDesconto();
    }
	
	@Test
    public void testaIdade18AnosMasculinoCasado(){
    	Cliente cliente = new Cliente("Vitor Henrique", "47326754098", "23/03/2004", "Masculino", "Casado", "Brasileira", "Passaporte 1");
    	Double valor = 5.00;
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade23AnosMasculinoCasado(){
    	Cliente cliente = new Cliente("Vitor Henrique", "47326754098", "23/03/1999", "Masculino", "Casado", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 5.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade26AnosMasculinoCasado(){
    	Cliente cliente = new Cliente("Vitor Henrique", "47326754098", "23/03/1996", "Masculino", "Casado", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 20.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade25AnosMasculinoCasado(){
    	Cliente cliente = new Cliente("Vitor Henrique", "47326754098", "23/03/1998", "Masculino", "Casado", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 5.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test
    public void testaIdade30AnosMasculinoCasado(){
    	Cliente cliente = new Cliente("Vitor Henrique", "47326754098", "23/03/1992", "Masculino", "Casado", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	Double valor = 20.00;
    	premioSeguro.obtemPercentualDesconto();
    	assertEquals(valor, premioSeguro.getPercentualDesconto());
    }
	
	@Test(expected = IdadeInvalidaException.class)
	public void testaIdade61AnosMasculinoCasado(){
    	Cliente cliente = new Cliente("Vitor Henrique", "47326754098", "23/03/1961", "Masculino", "Casado", "Brasileira", "Passaporte 1");
    	PremioSeguro premioSeguro = new PremioSeguro(cliente);
    	premioSeguro.obtemPercentualDesconto();
    }
}

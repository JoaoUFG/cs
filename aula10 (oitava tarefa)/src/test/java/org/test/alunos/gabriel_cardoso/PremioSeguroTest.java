package org.test.alunos.gabriel_cardoso;



import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PremioSeguroTest {
	
	Cliente cliente;
	PremioSeguro premio;
	
	@Before
	public void setup() {
		cliente = new Cliente();
		premio = new PremioSeguro(cliente);
	}
	//-------------------------------------------------------------------------------------
	//feminino, solteira, menor que 25 anos.
	@Test /*(expected = DescontoInvalidoException.class) não existe esta classe*/
	public void Sol_Fem_Menor25_Negativo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Solteira");
		cliente.setSexo("Feminino");
		cliente.setNacionalidade("Brasileira");
		cliente.setDataNascimento("21/04/2002");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertFalse(premio.getPercentualDesconto() == 10.00);
	}
	//feminino, solteira, menor que 25 anos.
	@Test
	public void Sol_Fem_Menor25_Positivo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Solteira");
		cliente.setSexo("Feminino");
		cliente.setNacionalidade("Brasileira");
		cliente.setDataNascimento("21/04/2002");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertTrue(premio.getPercentualDesconto() == 5.00);
	}
	//----------------------------------------------------------------------------
	//feminino, solteira, maior que 25 anos.
	@Test /*(expected = DescontoInvalidoException.class) não existe esta classe*/
	public void Sol_Fem_Maior25_Negativo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Solteira");
		cliente.setSexo("Feminino");
		cliente.setNacionalidade("Brasileira");
		cliente.setDataNascimento("21/04/1980");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertFalse(premio.getPercentualDesconto() == 10.00);
	}
	//feminino, solteira, maior que 25 anos.
	@Test
	public void Sol_Fem_Maior25_Positivo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Solteira");
		cliente.setSexo("Feminino");
		cliente.setNacionalidade("Brasileira");
		cliente.setDataNascimento("21/04/1980");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertTrue(premio.getPercentualDesconto() == 15.00);
	}
	//-----------------------------------------------------------------------------------
	//feminino, casada, menor que 25 anos.
	@Test /*(expected = DescontoInvalidoException.class) não existe esta classe*/
	public void Cas_Fem_Menor25_Negativo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Casada");
		cliente.setSexo("Feminino");
		cliente.setNacionalidade("Brasileira");
		cliente.setDataNascimento("21/04/2002");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertFalse(premio.getPercentualDesconto() == 15.00);
	}
	//feminino, casada, menor que 25 anos.
	@Test
	public void Cas_Fem_Menor25_Positivo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Casada");
		cliente.setSexo("Feminino");
		cliente.setNacionalidade("Brasileira");
		cliente.setDataNascimento("21/04/2002");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
			
		assertTrue(premio.getPercentualDesconto() == 10.00);
	}
	//-------------------------------------------------------------------------
	//feminino, casada, maior que 25 anos.
	@Test /*(expected = DescontoInvalidoException.class) não existe esta classe*/
	public void Cas_Fem_Maior25_Negativo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Casada");
		cliente.setSexo("Feminino");
		cliente.setNacionalidade("Brasileira");
		cliente.setDataNascimento("21/04/1980");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertFalse(premio.getPercentualDesconto() == 15.00);
	}
	//feminino, casada, maior que 25 anos.
	@Test
	public void Cas_Fem_Maior25_Positivo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Casada");
		cliente.setSexo("Feminino");
		cliente.setNacionalidade("Brasileira");
		cliente.setDataNascimento("21/04/1980");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertTrue(premio.getPercentualDesconto() == 30.00);
	}
	//-------------------------------------------------------------------------
	//masculino, solteiro, menor que 25 anos.
	@Test /*(expected = DescontoInvalidoException.class) não existe esta classe*/
	public void Sol_Mas_Menor25_Negativo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Solteiro");
		cliente.setSexo("Masculino");
		cliente.setNacionalidade("Brasileiro");
		cliente.setDataNascimento("21/04/2002");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertFalse(premio.getPercentualDesconto() == 15.00);
	}
	//masculino, solteiro, menor que 25 anos.
	@Test
	public void Sol_Mas_Menor25_Positivo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Solteiro");
		cliente.setSexo("Masculino");
		cliente.setNacionalidade("Brasileiro");
		cliente.setDataNascimento("21/04/2002");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertTrue(premio.getPercentualDesconto() == 0.00);
	}
	//-----------------------------------------------------------------------------
	//masculino, solteiro, maior que 25 anos.
	@Test /*(expected = DescontoInvalidoException.class) não existe esta classe*/
	public void Sol_Mas_Maior25_Negativo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Solteiro");
		cliente.setSexo("Masculino");
		cliente.setNacionalidade("Brasileiro");
		cliente.setDataNascimento("21/04/1980");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertFalse(premio.getPercentualDesconto() == 15.00);
	}
	//masculino, solteiro, maior que 25 anos.
	@Test
	public void Sol_Mas_Maior25_Positivo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Solteiro");
		cliente.setSexo("Masculino");
		cliente.setNacionalidade("Brasileiro");
		cliente.setDataNascimento("21/04/1980");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertTrue(premio.getPercentualDesconto() == 10.00);
	}
	//------------------------------------------------------------------------
	//Masculino, casado, menor que 25 anos.
	@Test /*(expected = DescontoInvalidoException.class) não existe esta classe*/
	public void Cas_Mas_Menor25_Negativo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Casado");
		cliente.setSexo("Masculino");
		cliente.setNacionalidade("Brasileiro");
		cliente.setDataNascimento("21/04/2002");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertFalse(premio.getPercentualDesconto() == 15.00);
	}
	//Masculino, casado, menor que 25 anos.
	@Test
	public void Cas_Mas_Menor25_Positivo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Casado");
		cliente.setSexo("Masculino");
		cliente.setNacionalidade("Brasileiro");
		cliente.setDataNascimento("21/04/2002");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertTrue(premio.getPercentualDesconto() == 5.00);
	}
	//-------------------------------------------------------------------------
	//Masculino, casado, maior que 25 anos.
	@Test /*(expected = DescontoInvalidoException.class) não existe esta classe*/
	public void Cas_Mas_Maior25_Negativo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Casado");
		cliente.setSexo("Masculino");
		cliente.setNacionalidade("Brasileiro");
		cliente.setDataNascimento("21/04/1980");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertFalse(premio.getPercentualDesconto() == 15.00);
	}
	//Masculino, casado, maior que 25 anos.
	@Test /*(expected = DescontoInvalidoException.class) não existe esta classe*/
	public void Cas_Mas_Maior25_Positivo() {
		cliente.setCpf("19702606020");
		cliente.setEstadoCivil("Casado");
		cliente.setSexo("Masculino");
		cliente.setNacionalidade("Brasileiro");
		cliente.setDataNascimento("21/04/1980");
		premio.setCliente(cliente);
		premio.setValorSeguro(5000.00);
		premio.obtemPercentualDesconto();
		
		assertTrue(premio.getPercentualDesconto() == 20.00);
	}
}

//oito casos de teste falharam
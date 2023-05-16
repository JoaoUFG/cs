package org.test.alunos.lucas_oliveira;

import org.model.Cliente;
import org.model.PremioSeguro;
import org.util.DataUtils;
import org.excecoes.*;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertEquals;

public class PremioSeguroTest {

    // Sexo: feminino, idade:17, solteira --> Retornar idade inválida
    @Test(expected = IdadeInvalidaException.class)
    public void CT01(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/2005", "Feminino", "Solteira", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }

    // Sexo: feminino, idade:18, solteira --> Desconto de 5%
    @Test
    public void CT02(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/2004", "Feminino", "Solteira", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 5.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: feminino, idade:25, solteira --> Desconto de 5%
    @Test
    public void CT03(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/1998", "Feminino", "Solteira", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 5.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: feminino, idade:26, solteira --> Desconto de 15%
    @Test
    public void CT04(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/1996", "Feminino", "Solteira", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 15.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: feminino, idade:60, solteira --> Desconto de 15%
    @Test
    public void CT05(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/1962", "Feminino", "Solteira", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 15.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: feminino, idade:61, solteira --> Retornar idade inválida
    @Test(expected = IdadeInvalidaException.class)
    public void CT06(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/1961", "Feminino", "Solteira", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }

    // Sexo: feminino, idade:17, Casada --> Retornar idade inválida
    @Test(expected = IdadeInvalidaException.class)
    public void CT07(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/2005", "Feminino", "Casada", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }

    // Sexo: feminino, idade:18, Casada --> Desconto de 10%
    @Test
    public void CT08(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/2004", "Feminino", "Casada", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 10.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: feminino, idade:25, Casada --> Desconto de 10%
    @Test
    public void CT09(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/1998", "Feminino", "Casada", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 10.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: feminino, idade:26, Casada --> Desconto de 30%
    @Test
    public void CT10(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/1996", "Feminino", "Casada", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 30.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: feminino, idade:60, Casada --> Desconto de 30%
    @Test
    public void CT11(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/1962", "Feminino", "Casada", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 30.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: feminino, idade:61, Casada --> Retornar idade inválida
    @Test(expected = IdadeInvalidaException.class)
    public void CT12(){
        Cliente cliente = new Cliente("Luciene", "90544378040", "16/04/1961", "Feminino", "Casada", "Brasileira", "19975765");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }

    // Sexo: Masculino, idade:17, Solteiro --> Retornar idade inválida
    @Test(expected = IdadeInvalidaException.class)
    public void CT13(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/2005", "Masculino", "Solteiro", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }

    // Sexo: Masculino, idade:18, Solteiro --> Desconto de 0%
    @Test
    public void CT14(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/2004", "Masculino", "Solteiro", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 0.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: Masculino, idade:25, Solteiro --> Desconto de 0%
    @Test
    public void CT15(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/1998", "Masculino", "Solteiro", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 0.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: Masculino, idade:26, Solteiro --> Desconto de 10%
    @Test
    public void CT16(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/1996", "Masculino", "Solteiro", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 10.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: Masculino, idade:60, Solteiro --> Desconto de 10%
    @Test
    public void CT17(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/1962", "Masculino", "Solteiro", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 10.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: Masculino, idade:61, Solteiro --> Retornar idade inválida
    @Test(expected = IdadeInvalidaException.class)
    public void CT18(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/1961", "Masculino", "Solteiro", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }

    // Sexo: Masculino, idade:17, Casado --> Retornar idade inválida
    @Test(expected = IdadeInvalidaException.class)
    public void CT19(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/2005", "Masculino", "Casado", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }

    // Sexo: Masculino, idade:18, Casado --> Desconto de 5%
    @Test
    public void CT20(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/2004", "Masculino", "Casado", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 5.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: Masculino, idade:25, Casado --> Desconto de 5%
    @Test
    public void CT21(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/1998", "Masculino", "Casado", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 5.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: Masculino, idade:26, Casado --> Desconto de 20%
    @Test
    public void CT22(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/1996", "Masculino", "Casado", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 20.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: Masculino, idade:60, Casado --> Desconto de 20%
    @Test
    public void CT23(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/1962", "Masculino", "Casado", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        Double valor = 20.00;
        premioSeguro.obtemPercentualDesconto();
        assertEquals(valor, premioSeguro.getPercentualDesconto());
    }

    // Sexo: Masculino, idade:61, Casado --> Retornar idade inválida
    @Test(expected = IdadeInvalidaException.class)
    public void CT24(){
        Cliente cliente = new Cliente("Lucas", "78293157011", "16/04/1961", "Masculino", "Casado", "Brasileira", "18575998");
        PremioSeguro premioSeguro = new PremioSeguro(cliente);
        premioSeguro.obtemPercentualDesconto();
    }


}

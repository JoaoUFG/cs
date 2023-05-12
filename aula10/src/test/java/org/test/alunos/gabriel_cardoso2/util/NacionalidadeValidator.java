package org.test.alunos.gabriel_cardoso2.util;

import org.excecoes.NacionalidadeInvalidaException;

import java.util.Arrays;
import java.util.List;

public class NacionalidadeValidator {
    public static boolean validaNacionalidade(String nacionalidade){
        boolean result = false;
        List<String> sexosValidos = Arrays.asList("Brasileira","Estrangeira");
        if(sexosValidos.contains(nacionalidade))
            result = true;
        else
            throw new NacionalidadeInvalidaException("Nacionalidade Inválida!");
        return result;
    }
}

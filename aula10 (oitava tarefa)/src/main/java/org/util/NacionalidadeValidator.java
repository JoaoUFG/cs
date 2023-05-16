package org.util;

import org.excecoes.NacionalidadeInvalidaException;

import java.util.Arrays;
import java.util.List;

public class NacionalidadeValidator {
    public static Boolean validaNacionalidade(String nacionalidade){
        boolean result = false;
        List<String> NacionalidadesValidas = Arrays.asList("Brasileira","Estrangeira");
        if(NacionalidadesValidas.contains(nacionalidade))
            result = true;
        else
            throw new NacionalidadeInvalidaException("Nacionalidade Inválida!");
        return result;
    }
}

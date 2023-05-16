package org.test.alunos.vitor_henrique.utils;

import org.test.alunos.vitor_henrique.excecoes.NomeInvalidoException;

public class NomeValidator {
    public static Boolean validaNome(String nome){
        boolean result = false;
        if(nome != null && nome != "")
            result = true;
        else
            throw new NomeInvalidoException("Nome Inválido!");
        return result;
    }
	
}

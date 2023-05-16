package org.test.gilmar;

import org.excecoes.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.util.*;

public class EstadoCivilTest {

    //validação 1
    @Test(expected = EstadoCivilInvalidoException.class)
    public void validaEstadoCivil(){
        assertTrue(EstadoCivilValidator.validaEstadoCivil("CasadA"));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombrePremier;

import com.mycompany.testunitaireinsset.string.StringUtils;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author talend
 */
@RunWith(JUnitParamsRunner.class)
public class StringUtilsTest {

    private Object[] parametersForTestStringInvert() {
        return new Object[][]{
            {"camion", false},
            {"banane", false},
            {"ressasser", true}
        };
    }

    @Test
    @Parameters
    public void testStringInvert(String n, boolean expResult) {
        //given
        StringUtils instance = new StringUtils();

        //when
        boolean result = instance.isPalindrome(n);

        //then
        assertEquals(expResult, result);
    }
    

    
    
    
}

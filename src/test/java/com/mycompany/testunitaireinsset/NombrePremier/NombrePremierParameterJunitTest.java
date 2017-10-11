/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombrePremier;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author user
 */
//La première étape est de spécifier le runner en annotant la classe de test : 
@RunWith(JUnitParamsRunner.class)
public class NombrePremierParameterJunitTest {

    public NombrePremierParameterJunitTest() {
    }

    //Il ne reste plus qu’à fournir les paramètres à notre méthode. JUnitParams propose plusieurs manières de faire : directement par annotation,
    //par méthode, par classe externe, ou par lecture depuis une ressource externe (ex.: CSV). Nous allons utiliser une méthode pour fournir les paramètres au test.
    private Object[] parametersForTestIsPremier() {
        return new Object[][]{
            {1, false},
            {11, true},
            {10, false}
        };
    }

    /**
     * Test de la methode isPremier aec un nombre premier
     */
    //Créons ensuite notre méthode de test, en l’annotant avec @Parameters, fournie par JUnitParams : 
    @Test
    @Parameters
    public void testIsPremier(int n, boolean expResult) {
        //given
        NombrePremier instance = new NombrePremier();

        //when
        boolean result = instance.isPremier(n);

        //then
        assertEquals(expResult, result);

    }
}

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombrePremier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user
 */
public class NombrePremierTest {

    public NombrePremierTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /*
    *   Test de la méthode 
    */
    
    /**
     * Test de la methode isPremier aec un nombre premier
     */
    @org.junit.Test
    public void testIsPremierOK() {
        //given
        int n = 11;
        NombrePremier instance = new NombrePremier();
        boolean expResult = true;

        //when
        boolean result = instance.isPremier(n);

        //then
        Assert.assertTrue("OK", result);

    }

    /**
     * Test de la methode isPremier aec un nombre non premier
     */
    @org.junit.Test
    public void testIsPremierNOK() {
        //given
        int n = 10;
        NombrePremier instance = new NombrePremier();

        //when
        boolean result = instance.isPremier(n);

        //then
        Assert.assertFalse("NOK", result);

    }

    /**
     * Test de la methode isPremier aec un nombre non premier
     */
    @org.junit.Test
    public void testIsPremierLimit() {
        //given
        int n = 0;
        NombrePremier instance = new NombrePremier();
        boolean expResult = false;

        //when
        boolean result = instance.isPremier(n);

        //then
        assertEquals(expResult, result);

    }

    /**
     * Test of isNombreValide method, of class NombrePremier.
     */
    @org.junit.Test
    public void testIsNombreValideOK() {
        //given
        String str = "123456";
        NombrePremier instance = new NombrePremier();
        boolean expResult = true;

        //when
        boolean result = instance.isNombreValide(str);

        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of isNombreValide method, of class NombrePremier.
     */
    @org.junit.Test
    public void testIsNombreValideKO() {
        //given
        String str = "123a456";
        NombrePremier instance = new NombrePremier();
        boolean expResult = false;

        //when
        boolean result = instance.isNombreValide(str);

        //then
        assertEquals(expResult, result);

    }

    /**
     * Test of isNombreValide method, of class NombrePremier.
     */
    @org.junit.Test
    public void testIsNombreValideKONull() {
        //given
        String str = null;
        NombrePremier instance = new NombrePremier();
        boolean expResult = false;

        //when
        boolean result = instance.isNombreValide(str);

        //then
        assertEquals(expResult, result);

    }

    /**
     * Test of isNombreValide method, of class NombrePremier.
     */
    @org.junit.Test
    public void testIsNombreValideKOLimit() {
        //given
        String str = "";
        NombrePremier instance = new NombrePremier();
        boolean expResult = false;

        //when
        boolean result = instance.isNombreValide(str);

        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of afficherResult method, of class NombrePremier.
     */
    @Test
    public void testFormaterResultOK() {
        //given
        boolean isPremier = false;
        int nb = 0;
        NombrePremier instance = new NombrePremier();
        String expResult = "le nombre 0 n'est pas premier";

        //when
        String result = instance.formaterResult(isPremier, nb);

        //then
        assertEquals(expResult, result);
        Assert.assertNotNull(result);
    }

    /**
     * Test of afficherResult method, of class NombrePremier.
     */
    @Test
    public void testFormaterResultNOK() {
        //given
        boolean isPremier = true;
        int nb = 11;
        NombrePremier instance = new NombrePremier();
        String expResult = "le nombre 11 est premier";

        //when
        String result = instance.formaterResult(isPremier, nb);

        //then
        assertEquals(expResult, result);
        Assert.assertNotNull(result);
    }
}

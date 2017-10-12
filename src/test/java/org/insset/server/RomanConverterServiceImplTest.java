/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class RomanConverterServiceImplTest {
    
    public RomanConverterServiceImplTest() {
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

    /**
     * Test of convertDateYears method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertDateYears() {
        System.out.println("convertDateYears");
        String nbr = "10/10/2010";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "X/X/MMX";
        String result = instance.convertDateYears(nbr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of convertRomanToArabe method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertRomanToArabe() {
        System.out.println("convertRomanToArabe");
        String nbr = "X";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 10;
        Integer result = instance.convertRomanToArabe(nbr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of convertArabeToRoman method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testConvertArabeToRoman() {
        System.out.println("convertArabeToRoman");
        Integer nbr = 100;
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        String expResult = "C";
        String result = instance.convertArabeToRoman(nbr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of percentCalcul method, of class RomanConverterServiceImpl.
     */
    @Test
    public void testPercentCalcul() {
        System.out.println("percentCalcul");
        String snbr = "100";
        String spercent = "20";
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer expResult = 80;
        Integer result = instance.percentCalcul(snbr, spercent);
        assertEquals(expResult, result);
        
    }
    
}

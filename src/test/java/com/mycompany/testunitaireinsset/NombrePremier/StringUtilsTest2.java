/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombrePremier;

import com.mycompany.testunitaireinsset.string.StringUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author talend
 */
public class StringUtilsTest2 {

    public void testischainevalid() {
        String str = "test";
        
        Map<String, Integer> expResult = new HashMap<>();
        
        expResult.put("t", 2);
        expResult.put("e", 1);
        expResult.put("s", 1);
        
        StringUtils instance = new StringUtils();
        
        Map<String, Integer>map = instance.compterOccurences(str);
        Assert.assertEquals(expResult,map);
    }
}

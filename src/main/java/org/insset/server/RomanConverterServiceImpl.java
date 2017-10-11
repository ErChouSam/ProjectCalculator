/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.insset.client.service.RomanConverterService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {
    private static final Map<Character, Integer> map = new HashMap<>(7);
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
    private static final TreeMap<Integer, String> mapNum = new TreeMap<>(Collections.reverseOrder());
    static {
        mapNum.put(1000, "M");
        mapNum.put(900, "CM");
        mapNum.put(500, "D");
        mapNum.put(400, "CD");
        mapNum.put(100, "C");
        mapNum.put(90, "XC");
        mapNum.put(50, "L");
        mapNum.put(40, "XL");
        mapNum.put(10, "X");
        mapNum.put(9, "IX");
        mapNum.put(5, "V");
        mapNum.put(4, "IV");
        mapNum.put(1, "I");
    }
    
    @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
        //Implement your code
        return "XV/III/MX";
    }

    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        int sum = 0;
        int len = nbr.length() - 1;
        for (int i = 0; i < len; i++) {
            if (map.get(nbr.charAt(i)) < map.get(nbr.charAt(i + 1))) {
                sum -= map.get(nbr.charAt(i));
            } else {
                sum += map.get(nbr.charAt(i));
            }
        }
        return sum += map.get(nbr.charAt(len));
    }

    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
        StringBuilder roman = new StringBuilder("");
        for (Integer i: mapNum.keySet()) {
            for (int j = 1; j <= nbr / i; j++) {
                roman.append(mapNum.get(i));
            }
            nbr %= i;
        }
        return roman.toString();
    }

}

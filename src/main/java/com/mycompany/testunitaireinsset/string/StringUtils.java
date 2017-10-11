/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author user
 */
public class StringUtils {

    public StringUtils() {
    }

    /**
     * Vérifie si la chaine entrée est valide
     *
     * @param str
     * @return true si valide false sinon
     */
    public boolean isChaineValide(String str) {
        if (str.length() < 2) {
            throw new IllegalArgumentException(
                    "Il faut au moins deux caractere en entrée");
        }
        return true;
    }

    /**
     * Inverse la chaine de caractere en entrée
     *
     * @param str
     * @return String : Chaine de caractére inversé
     */
    public String inverse(String str) {

        int longueur = str.length();
        StringBuffer envers = new StringBuffer();
        int i;

        for (i = 0; i < longueur; i++) {
            envers.append(str.charAt(longueur - i - 1));
        }
        return new String(envers);
    }

    /**
     * Verifie si la chaine entrée est un palindrome (mot identique lorsqu'il
     * est inversé)
     *
     * @param str
     * @return boolean : vrai ou faux
     */
    public boolean isPalindrome(String str) {
        if (inverse(str).equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public Map<String, Integer> compterOccurences(String str) {
        Map<String, Integer> map;
        map = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            int nombreOccurrencesCharActuel = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    nombreOccurrencesCharActuel++;
                }
            }
            map.put(String.valueOf(str.charAt(i)), nombreOccurrencesCharActuel);

        }
        return map;

    }
}

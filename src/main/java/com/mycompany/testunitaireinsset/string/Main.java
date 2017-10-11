/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir une chaine :");

        String str = sc.nextLine();
        StringUtils strUtils = new StringUtils();
        if (strUtils.isChaineValide(str)) {
            //compte le nombre d'occurence
            for (Map.Entry<String, Integer> e : strUtils.compterOccurences(str).entrySet()) {
                System.out.println("Le caractère " + e.getKey() + " apparaît " + e.getValue() + " fois.");
            }
            if (strUtils.isPalindrome(str)) {
                System.out.println("La chaine " + str + " est un palindrome ");
                System.out.println("La chaine inversé : " + strUtils.inverse(str));
            } else {
                System.out.println("La chaine " + str + " n'est pas un palindrome ");
                System.out.println("La chaine inversé : " + strUtils.inverse(str));
            }
        }
    }

}

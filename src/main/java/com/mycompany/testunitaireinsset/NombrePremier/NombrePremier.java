/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombrePremier;

/**
 *
 * @author user
 */
public class NombrePremier {

    public boolean isPremier(int n) {
        boolean isPremier = true;
        if (n < 2) {
            isPremier = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n != i && n % i == 0) {
                    isPremier = false;
                    break;
                }
            }
        }
        return isPremier;
    }

    public boolean isNombreValide(String str) {
        if (str == null) {
            return false;
        }
        String regex = "\\d+";
        return str.matches(regex);
    }

    public String formaterResult(boolean isPremier, int nb) {
        if (isPremier) {
            return "le nombre " + nb + " est premier";
        } else {
            return "le nombre " + nb + " n'est pas premier";
        }

    }

}

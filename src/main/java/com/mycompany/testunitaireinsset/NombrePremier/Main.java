/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombrePremier;

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

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre :");

        String str = sc.nextLine();
        NombrePremier np = new NombrePremier();

        if (np.isNombreValide(str)) {
            System.out.println(np.formaterResult(np.isPremier(Integer.parseInt(str)), Integer.parseInt(str)));
        } else {
            System.out.println("format incorrect");
        }

    }

}

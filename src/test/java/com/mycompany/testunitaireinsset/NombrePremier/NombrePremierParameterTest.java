/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombrePremier;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author user
 */
//Pour utiliser le runner Parameterized, il faut annoter la classe de test de la manière suivante :
@RunWith(Parameterized.class)
public class NombrePremierParameterTest {

    //Il faut ensuite créer une méthode static annotée @Parameters fournissant les paramètres du test 
    //(entrées, résultat attendu) sous forme de Collection d’objet, où chaque élément de la collection est un objet (généralement un tableau) 
    //contenant les paramètres du test : 
    @Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(
                new Object[]{1, false},
                new Object[]{11, true},
                new Object[]{10, false}
        );
    }

    //Le runner Parameterized Parameterized va injecter les valeurs fournies par la précédente méthode dans des attributs de classe afin de les rendre 
    //accessibles aux méthodes de test. Par conséquent, il faut ajouter les attributs et le constructeur nécessaires à cette injection : 
    private final int nombre;
    private final boolean isPremier;

    public NombrePremierParameterTest(final int nombre, final boolean isPremier) {
        this.nombre = nombre;
        this.isPremier = isPremier;
    }

    /**
     * Test de la methode isPremier aec un nombre premier
     */
    //Et enfin, il faut créer la méthode de test. Ici nous testerons la méthode isValidPhoneNumber de la classe utilitaire PhoneUtils : 
    @Test
    public void testIsPremier() {
        //given
        NombrePremier instance = new NombrePremier();

        //when
        boolean result = instance.isPremier(nombre);

        //then
        assertEquals(isPremier, result);

    }
}

package org.insset.shared;
import com.google.gwt.core.client.GWT;
import java.util.regex.*;
import org.insset.server.RomanConverterServiceImpl;

/**
 * <p>
 * FieldVerifier validates that the name the user enters is valid.
 * </p>
 * <p>
 * This class is in the <code>shared</code> packing because we use it in both
 * the client code and on the server. On the client, we verify that the name is
 * valid before sending an RPC request so the user doesn't have to wait for a
 * network round trip to get feedback. On the server, we verify that the name is
 * correct to ensure that the input is correct regardless of where the RPC
 * originates.
 * </p>
 * <p>
 * When creating a class that is used on both the client and the server, be sure
 * that all code is translatable and does not use native JavaScript. Code that
 * is note translatable (such as code that interacts with a database or the file
 * system) cannot be compiled into client side JavaScript. Code that uses native
 * JavaScript (such as Widgets) cannot be run on the server.
 * </p>
 */
public class FieldVerifier {
    
    /**
     * Verifies that the specified name is valid for our service.
     *
     * In this example, we only require that the name is at least four
     * characters. In your application, you can use more complex checks to
     * ensure that usernames, passwords, email addresses, URLs, and other fields
     * have the proper syntax.
     *
     * @param name the name to validate
     * @return true if valid, false if invalid
     */
    public static boolean isValidName(String name) {
        if ((name == null) || (name.isEmpty())) {
            return false;
        }
        return true;
    }

    /**
     * Verifies that the specified value is valide.
     *
     * In this example, we only require that the name is at least four
     * characters. In your application, you can use more complex checks to
     * ensure that usernames, passwords, email addresses, URLs, and other fields
     * have the proper syntax.
     *
     * @param name the name to validate
     * @return true if valid, false if invalid
     */
    public static boolean isValidDecimal(Integer nbr) {
        if(nbr<1)
            return false;
        else if(nbr>2000)
            return false;
        else
            return true;
    }
    public static boolean isValidRoman(String snbr,boolean State, Integer Nbr) {
        if(State)
        {
            if(Nbr<2000 && Nbr>1)
                return true;
        }
        else{
            for(int i = 0 ;i < snbr.length();i++){
                if(snbr.charAt(i) == 'I' ||snbr.charAt(i) == 'V' ||snbr.charAt(i) == 'X' ||snbr.charAt(i) == 'L' ||snbr.charAt(i) == 'C' ||snbr.charAt(i) == 'D' ||snbr.charAt(i) == 'M')
                {}
                else
                    return false;
            }   
        }        
        return true;
    }
    public static boolean isValidRoman(String nbr){
        return isValidRoman(nbr,false,0);
    }
    

    public static boolean isValidDate(String date) {
        if(date.length()!= 10) 
            return false;
        if((date.charAt(2)=='/' && date.charAt(5)=='/') || (date.charAt(2)=='-' && date.charAt(5)=='-'))
            return true;
        else 
            return false;
    }
    public static boolean isValidNombre(String nbr) {
        
        if(!nbr.matches("-?[0-9]+") )
            return false;
        if(Integer.valueOf(nbr) <=0 || Integer.valueOf(nbr)> 999)
            return false;
        return true;
        
    }
    public static boolean isValidPourcentage(String nbr) {
        
        if(!nbr.matches("-?[0-9]+") )
            return false;
        if(Integer.valueOf(nbr) <=0 || Integer.valueOf(nbr)> 99)
            return false;
        return true;
        
    }
}

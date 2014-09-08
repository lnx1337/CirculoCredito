package com.maxcom.mpm.util;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Contiene funcionalidades comunes que se comparten en el proyecto.
 * @author Nelson C.
 */
public class Utilerias {
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);    
    
    public static final Pattern VALID_CUSTOMER_NAME_REGEX = 
        Pattern.compile("^\\p{L}+(?: \\p{L}+)*$", Pattern.CASE_INSENSITIVE);
    
    /**
     * Valida si una cadena no es nula o esta vacia.
     * @param s Cadena a validar
     * @return True-Si la cadena no es nula y tiene al menos un caracter.
     */
    public static boolean isValidString(String s){
        return s!=null && s.length()>0;
    }
    
    /**
     * Valida si una lista es nulla o esta vacia.
     * @param l Lista a validar
     * @return True - Si la lista no es nula y tiene al menos un elemento
     */
    public static boolean isValidList(List l){
        return l!=null && l.size()>0;
    }    
    
    public static boolean isValidEmail(String email){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
        return matcher.find();
    }    
    
    public static boolean isValidCustomerName(String name){
        Matcher matcher = VALID_CUSTOMER_NAME_REGEX .matcher(name);
        return matcher.find();
    }
      
    
}

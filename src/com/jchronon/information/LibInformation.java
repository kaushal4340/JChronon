/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jchronon.information;

/**
 *
 * @author kaushal
 */
public class LibInformation {
    private final static String CREATOR = "Kaushal Patel";
    private final static String VERSION = "1.0 Beta";
    private final static String EMAIL = "kaushal.patel4340@gmail.com";
    
    public static String getCreatorName(){
        return CREATOR;
    }
    public static String getLibVersion(){
        return VERSION;
    }
    public static String getCreatorEmail(){
        return EMAIL;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jchronon.date;

/**
 *
 * @author kaushal
 */
interface JDate{
    int getDaysBetween(String date1,String date2,String pattern);    
    String getCurrentDate(String pattern);    
    String getDateAfterDays(int days,String date,String pattern);
    String getMonth();
    int getYear();    
    String getDayOfWeek();
    String convertDatePattern(String date ,String currentPattern, String newPattern);
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jchronon.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kaushal
 */
public class DateHandler implements JDate{    
    private static DateHandler d;
    private DateHandler(){        
    }    
    public static DateHandler getInstance(){
        if(d == null){
            d = new DateHandler();
        }
        return d;
    }    
    @Override
    public int getDaysBetween(String startDate, String endDate, String pattern) {
        return calculateDays(startDate,endDate,pattern);
    }
    
    private static int calculateDays(String startDate, String endDate,String pattern){
        Calendar cal3 = null,cal4 = null;
        try{
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date sDate = dateFormat.parse(startDate);
        Date eDate = dateFormat.parse(endDate);
        cal3 = Calendar.getInstance();
        cal3.setTime(sDate);
        cal4 = Calendar.getInstance();
        cal4.setTime(eDate);
        }catch(ParseException pe){
            System.err.println(pe);
        }
        return daysBetween(cal3, cal4);
    }
    
    private static int daysBetween(Calendar startDate, Calendar endDate) {
        Calendar date = (Calendar) startDate.clone();
        int daysBetween = 0;
        while (date.before(endDate)) {
            date.add(Calendar.DAY_OF_MONTH, 1);
            daysBetween++;
        }
        return daysBetween;
    }

    @Override
    public String getCurrentDate(String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(new Date());        
    }

    @Override
    public String getDateAfterDays(int days,String date,String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String output=null;
        try{
        Calendar c = Calendar.getInstance();
        Date d = dateFormat.parse(date);
        c.setTime(d); // Now use date.
        c.add(Calendar.DATE, days); // Adding n days
        output = dateFormat.format(c.getTime());
        }catch(ParseException pe){
            System.err.println(pe);
        }
        return output;
    }

    @Override
    public int getYear() {
        return Integer.parseInt(getCurrentDate("yyyy"));
    }

    @Override
    public String getMonth(){
       return (getCurrentDate("MMM")); 
    }

    @Override
    public String getDayOfWeek() {
        return (getCurrentDate("EEE"));
    }

    @Override
    public String convertDatePattern(String date,String currentPattern, String newPattern) {
        String op=null;
        SimpleDateFormat currentdateFormat = new SimpleDateFormat(currentPattern);
        SimpleDateFormat newdateFormat = new SimpleDateFormat(newPattern);
        try{
        Date d = currentdateFormat.parse(date);
        op = newdateFormat.format(d);
        }catch(ParseException PE){
            throw new UnsupportedOperationException("Unparsable date pattern, your date pattern does not matched with currentPattern");
        }        
        return op;
    }
    
}

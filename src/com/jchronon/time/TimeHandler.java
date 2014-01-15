/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jchronon.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author kaushal
 */
public class TimeHandler implements Time{
    private static TimeHandler time;
    private TimeHandler(){        
    }
    
    public static TimeHandler getInstance(){
        if(time == null){
            time = new TimeHandler();
        }
        return time;
    }

    @Override
    public String subtractTime(String endtime, String starttime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCurrentTimeIn24hr() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return dateFormat.format(new Date());
    }

    @Override
    public String getCurrentTimeIn12hr() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
        return dateFormat.format(new Date());
    }

    @Override
    public String addSecondsInTime(String time, int seconds) {        
        return addInTime(time, "SEC", seconds);
    }

    @Override
    public String addMinutesInTime(String time, int minutes) {
        return addInTime(time, "MIN", minutes);
    }

    @Override
    public String addHourInTime(String time, int hours) {
        return addInTime(time, "HOUR", hours);
    }
    
    
    private String addInTime(String time , String hms , int value){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar c = Calendar.getInstance();                
        try{
        Date d = dateFormat.parse(time);
        c.setTime(d);
        if(hms.equals("SEC"))
            c.add(Calendar.SECOND, value);
        else if(hms.equals("MIN"))
            c.add(Calendar.MINUTE, value);
        else if(hms.equals("HOUR"))
            c.add(Calendar.HOUR, value);
        }catch(ParseException pe){
           throw new UnsupportedOperationException("Unparsable Time Format,Required HH:mm:ss"); 
        }
        return dateFormat.format(c.getTime());
    }

    @Override
    public String convertTimeInto12HR(String time) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        String output=null;
        try{
        Date d = dateFormat.parse(time);
        output = dateFormat.format(d);
        }catch(ParseException PE){
            throw new UnsupportedOperationException("Unparsable time format");
        }
        return output;
    }

    
}

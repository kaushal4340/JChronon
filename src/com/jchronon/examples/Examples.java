/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jchronon.examples;

import com.jchronon.date.DateHandler;
import com.jchronon.duration.DurationHandler;
import com.jchronon.information.LibInformation;
import com.jchronon.time.TimeHandler;
import java.util.Vector;



/**
 *
 * @author kaushal
 */
public class Examples{
   public static void main(String args[]){

    TimeHandler time = TimeHandler.getInstance();
    DurationHandler duration = DurationHandler.getInstance();
    DateHandler dateHandler = DateHandler.getInstance();
    //----------------------------------INFORMATION------------------------------------------------
    System.out.println("Creator : "+LibInformation.getCreatorName());
    System.out.println("Version : "+LibInformation.getLibVersion());
    System.out.println("Email : "+LibInformation.getCreatorEmail());
    //----------------------------------DURATION------------------------------------------------    
    Vector v = new Vector();
    v.add("00:01:03");
    v.add("00:01:04");
    v.add("00:01:03");
    v.add("00:01:00");
    v.add("00:01:59");
    v.add("00:09:09");
    System.out.println("Vector : "+v);
    DurationHandler d = DurationHandler.getInstance();
    System.out.println("Total : "+d.getTotalDuration(v));   
    System.out.println("Avarage :"+d.getAvarageDuration(v));

    String a = "05:10:10";
    String b = "04:00:20";
    System.err.println("Subtracted Dur : "+d.subtractTime(a, b));
    //------------------------------------DATE----------------------------------------------  
    System.out.println("Current date : "+dateHandler.getCurrentDate("yyyy-MM-dd"));
    System.out.println("Date diff : "+dateHandler.getDaysBetween("2014-02-20", "2014-02-21","yyyy-MM-dd"));
    System.out.println("Date after days : "+dateHandler.getDateAfterDays(1, dateHandler.getCurrentDate("yyyy-MM-dd"),"yyyy-MM-dd"));
    System.out.println("Current year : "+dateHandler.getYear());
    System.out.println("Month of year : "+dateHandler.getMonth());
    System.out.println("Day Of Week : "+dateHandler.getDayOfWeek());
    System.out.println("Convert Date Pattern : "+dateHandler.convertDatePattern("2014-01-09", "yyyy-MM-dd", "dd-MMM-yyyy"));
    //-------------------------------------TIME-----------------------------------------------
    System.out.println("Current time 24hr : "+time.getCurrentTimeIn24hr());
    System.out.println("Current time 12hr : "+time.getCurrentTimeIn12hr());
//    System.out.println("1hr before current time :  "+duration.subtractTime(time.getCurrentTimeIn24hr(), "01:00:00"));

    System.out.println("Add Seconds : "+time.addSecondsInTime(time.getCurrentTimeIn12hr(), 10));
    System.out.println("Add Minutes : "+time.addMinutesInTime("01:55:55", 10));
    System.out.println("Add Hour : "+time.addHourInTime("09:55:55", 2));
    System.out.println("convert time into 12hr : "+time.convertTimeInto12HR("23:09:55"));
    }       
}

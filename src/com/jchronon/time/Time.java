/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jchronon.time;

import java.util.Vector;

/**
 *
 * @author kaushal
 */
interface Time {
   String getCurrentTimeIn24hr();
   String getCurrentTimeIn12hr();   
   String subtractTime(String endtime,String starttime);
   String addSecondsInTime(String time ,int seconds);
   String addMinutesInTime(String time ,int minutes);
   String addHourInTime(String time, int hours);
   String convertTimeInto12HR(String time);   
}

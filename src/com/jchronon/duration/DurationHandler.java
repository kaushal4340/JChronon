/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jchronon.duration;

import java.util.Vector;
/**
 *
 * @author kaushal
 */
public class DurationHandler implements Duration {

    private static DurationHandler d;
    private DurationHandler(){
        
    }
    public static DurationHandler getInstance(){
        if(d == null){
            d = new DurationHandler();
        }
        return d;
    }
    static long temp=0,temp1=0;
    @Override
    public synchronized String getTotalDuration(Vector times) {
        long seconds = 0;       
        for(int i=0;i<times.size();i++){
             seconds = stringToSeconds(times.get(i).toString());             
             temp += seconds;
        }        
        return secondToString(temp);
    }

    @Override
    public String subtractTime(String endtime, String starttime) {
        int seconds = 0;
        int end = (int)stringToSeconds(endtime);
        int start = (int)stringToSeconds(starttime);
        if(end >= start)
            seconds =  end - start;
        else
            throw new UnsupportedOperationException("Start time is minor than endtime.");
        return secondToString(seconds);
    }
    
    
    private long stringToSeconds(String time){
       String[] h1 = time.split(":");
       int hour = Integer.parseInt(h1[0]);
       int minute = Integer.parseInt(h1[1]);
       int second = Integer.parseInt(h1[2]);
       long temp = second + (60 * minute) + (3600 * hour);
       return temp;
    }
    
    private String secondToString(long seconds){
      int hr = (int)(seconds/3600);
      int rem = (int)(seconds%3600);
      int mn = rem/60;
      int sec = rem%60;
      String hh = (hr<10 ? "0" : "")+hr;
      String mm = (mn<10 ? "0" : "")+mn;
      String ss = (sec<10 ? "0" : "")+sec;      
      return hh+":"+mm+":"+ss;
    }

    @Override
    public synchronized String getAvarageDuration(Vector times) {
        long seconds = 0;      
        for(int i=0;i<times.size();i++){
             seconds = stringToSeconds(times.get(i).toString());             
             temp1 += seconds;
        }        
        return secondToString(temp1/times.size());
    }
}

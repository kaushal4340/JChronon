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
interface Duration{    
    String getTotalDuration(Vector times);     
    String getAvarageDuration(Vector times);    
    String subtractTime(String endtime,String starttime);
}

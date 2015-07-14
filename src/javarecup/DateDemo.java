/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javarecup;

import java.util.*;
import java.text.*;

/**
 *
 * @author segun
 * Java - Date & Time
 * http://www.tutorialspoint.com/java/java_date_time.htm
 */
public class DateDemo {
    
    public DateDemo(){
        
    }
    
    public void currentDateAndTime() {
         // Instantiate a Date object
        Date date = new Date();
        
        // display time and date using toSting()
        System.out.println(date.toString());
    }
    
    public void simpleDateFormat() {
        
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh.mm.ss a zzz");
        
        System.out.println("Current Date: " + ft.format(dNow));
    }
    
    public void printF() {
        // Instantiate a date object
        Date date = new Date();
        
        // display time and date using toString()
        //String str = String.format("Current Date/Time : %tc", date);
        String str = String.format("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
        
        System.out.printf(str);
        System.out.println();
        
        // display formatted date
        System.out.printf("%s %tB %<te, %<tY", "Due date", date);
        System.out.println();
    }
    
    public void sleepDemo() {
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date() + "\n");
        }catch (Exception e) {
            System.out.println("Got an exception");
        }
    }
    
    public void measuringElapsedTime() {
        
    }
    
    public static void main(String args[]) {
       
        DateDemo date = new DateDemo();
        
        date.currentDateAndTime();
        date.simpleDateFormat();
        date.printF();
        date.sleepDemo();
    }
}

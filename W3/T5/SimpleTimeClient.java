import java.time.*;
import java.lang.*;
import java.util.*;

import javax.print.attribute.standard.MediaSize.Other;

public class SimpleTimeClient implements TimeClient, Cloneable {
    private LocalDateTime dateAndTime;
    
    public SimpleTimeClient() {
        dateAndTime = LocalDateTime.now();
    }
    
    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }
    
    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }
    
    public void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second); 
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }
    
    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }
    
    public String toString() {
        return dateAndTime.toString();
    }
    
    public static void main(String... args) {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println(myTimeClient.toString());
    }

    @Override
    public Object clone() {
        try{  
            return super.clone();  
        }catch(Exception e){ 
            return null; 
        }
    }

    @Override
    public boolean equals(Object otherObject) {
        SimpleTimeClient otherSimpleTimeClient = (SimpleTimeClient) otherObject;
        if (this.dateAndTime.compareTo(otherSimpleTimeClient.dateAndTime)==0) {
            return true;
        }
        else return false;
    }
    @Override
    public int hashCode() {
       return this.dateAndTime.getDayOfMonth() *5 + this.dateAndTime.getDayOfYear() *7 + this.dateAndTime.getMonthValue()*13;
    }

}

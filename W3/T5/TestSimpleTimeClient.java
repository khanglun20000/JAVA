import java.time.*;
import java.lang.*;
import java.sql.Time;
import java.util.*;

public class TestSimpleTimeClient {
    public static void main(String... args) {
        TimeClient myTimeClient =  new SimpleTimeClient();
        System.out.println("Current time: " + myTimeClient.toString());
        System.out.println("Time in California: " +
            myTimeClient.getZonedDateTime("Blah blah").toString());

        SimpleTimeClient time1 = new SimpleTimeClient();
        SimpleTimeClient time2 = (SimpleTimeClient) time1.clone();
    
        System.out.println(time1.toString());
        System.out.println(time2.toString());


        System.out.println(time1.hashCode());
        System.out.println(time2.hashCode());
    }
}
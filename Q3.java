import java.lang.System;
// import java.util.TimeZone;

/* 
Displaying the Current Time: you will design a program that displays the current time
in GMT (Greenwich Mean Time) in the format hour:minute:second, such as 13:19:8.

The CurrentTimeMillis method in the System class returns the current time in
milliseconds elapsed since midnight, January 1, 1970 GMT, as shown in Figure 1. This
time is known as the UNIX epoch. The epoch is the point when time starts, and 1970
was the year when the UNIX operating system was formally introduced. 
*/



public class Q3 {
    
    // For fun later:
    // Make it adjust to current time zone (default).
    // Make it output year, month, day.
    // Make it use own date time format.
    // Make it adjust to given time zone (input GMT timezone offset).
    // Make it more efficient.
    
    public static void GetTime() {
        
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        
        System.out.printf("Current time is %d:%d:%d GMT", currentHour, currentMinute, currentSecond);
    }
    
    public static void main(String[] args) {

        GetTime();

    }
}

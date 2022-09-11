package solutions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Time {
	 /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        int hh,mm,ss;
        
        String tAP[] = s.split(":");
        String AmPm;
        String output;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
               
        hh = Integer.parseInt(tAP[0]);
        mm = Integer.parseInt(tAP[1]);
        ss = Integer.parseInt(tAP[2].substring(0,2));
        AmPm = tAP[2].substring(2,4);
        
        if(AmPm.equals("PM")){
            hh += 12;
        }
        else if(AmPm.equals("AM") && hh == 12){
            hh = 00;
        }
        
        LocalTime time = LocalTime.of(hh,mm,ss);
        output = time.format(formatter);
        return output;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Result = timeConversion("12:01:00AM");
		System.out.print(Result);
	}

}

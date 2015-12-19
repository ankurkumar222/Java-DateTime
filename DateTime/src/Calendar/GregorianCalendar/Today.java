package Calendar.GregorianCalendar;
/*

 * Sometimes it is useful to create an instance of the GregorianCalendar class representing the day
 * the instance was created. To do so, simply use the GregorianCalendar constructor taking no arguments,
 * such as:
 * GregorianCalendar thisday = new GregorianCalendar();
 * A sample program to output today's date, starting with a GregorianCalendar object is:
 */


import java.util.*;
import java.text.*;
public class Today {
   public static void main(String[] args) {
      GregorianCalendar thisday = new GregorianCalendar();       
      Date d = thisday.getTime();
      DateFormat df = DateFormat.getDateInstance();
      String s = df.format(d);
      System.out.println("Today is " + s);
   }
}
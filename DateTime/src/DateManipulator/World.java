package DateManipulator;
/*
 * The GregorianCalendar class offers methods for manipulating dates. 
   One useful method is add(). With the add() method, you can add such time units as years,
   months, and days to a date. To use the add() method, you must supply the field being increased,
   and the integer amount by which it will increase. Some useful constants for the fields 
   are DATE, MONTH, YEAR, and WEEK_OF_YEAR. The add() method is used in the program below to 
   calculate a date 80 days in the future. Phileas Fogg, the central character in Jules Verne's
   Around the World in 80 Days, could have used such a program to calculate a date 80 days
   from his departure on October 2, 1872:

 */
import java.util.*;
import java.text.*;
public class World {
   public static void main(String[] args) {
      GregorianCalendar worldTour = new GregorianCalendar(1872, Calendar.OCTOBER, 2);
      worldTour.add(GregorianCalendar.DATE, 80);
      Date d = worldTour.getTime();
      DateFormat df = DateFormat.getDateInstance();
      String s = df.format(d);
      System.out.println("80 day trip will end " + s);
   }
}
/*
While the example is a bit fanciful, adding days to a date is a common operation: 
video rentals can be due in 3 days, a library may lend books for 21 days, stores frequently 
require purchased items to be exchanged within 30 days.
*/


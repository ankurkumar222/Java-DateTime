package Calendar.GregorianCalendar;

/*
	 In the previous section, you learned how to turn Date objects into Strings.
	 You will do the same again; but first, you need to convert a GregorianCalendar object to a Date.
	 To do so, you will use the getTime() method, which GregorianCalendar inherits from its parent 
	 Calendar class. The getTime() method returns a Date corresponding to a GregorianCalendar object. 
	 You can put the whole process of creating a GregorianCalendar object, converting it to a Date, 
	 and getting and outputting the corresponding String in the following program:
*/
import java.util.*;
import java.text.*;

public class Flight {
	public static void main(String[] args) {
		GregorianCalendar firstFlight = new GregorianCalendar(1903,	Calendar.DECEMBER, 17);
		Date d = firstFlight.getTime();
		DateFormat df = DateFormat.getDateInstance();
		String s = df.format(d);
		System.out.println("First flight was " + s);
	}
}
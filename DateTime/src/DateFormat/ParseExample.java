package DateFormat;

/*
 Parsing a String:
 You can also use the DateFormat class to create Date objects from a String, via 
 the parse() method. This particular method can throw a ParseException error, so 
 you must use proper error-handling techniques. A sample program that turns a String 
 into a Date is shown below:

 */
import java.util.*;
import java.text.*;

public class ParseExample {
	public static void main(String[] args) {
		String ds = "November 1, 2000";
		DateFormat df = DateFormat.getDateInstance();
		try {
			Date d = df.parse(ds);
			System.out.println("Able to parse " + d);
		} catch (ParseException e) {
			System.out.println("Unable to parse " + ds);
		}
	}
}
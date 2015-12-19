package DateFormat;

/*
 * convert a Date object to a string with the format method. 
 */

import java.util.*;
import java.text.*;

public class NowString {
	public static void main(String[] args) {
		Date now = new Date();
		DateFormat df = DateFormat.getDateInstance();
		String s = df.format(now);
		System.out.println("Today is " + s);
	}
}

/*
 * The getDateInstance method shown in the code above, with no arguments,
 * creates an object in the default format or style. Java also provides some
 * alternative styles for dates, which you can obtain through the overloaded
 * getDateInstance(int style).
 * 
 * 
 * 
 * For convenience' sake, DateFormat provides some ready-made constants that you
 * can use as arguments in the getDateInstance method. Some examples are SHORT,
 * MEDIUM, LONG, and FULL, which are demonstrated in the program below:
 */
class StyleDemo {
  public static void main(String[] args) {
     Date now = new Date();
     DateFormat df =  DateFormat.getDateInstance();
     DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
     DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
     DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
     DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL); 
     String s =  df.format(now);
     String s1 = df1.format(now);
     String s2 = df2.format(now);
     String s3 = df3.format(now);
     String s4 = df4.format(now);
     System.out.println("(Default) Today is " + s);
     System.out.println("(SHORT)   Today is " + s1);
     System.out.println("(MEDIUM)  Today is " + s2);
     System.out.println("(LONG)    Today is " + s3);
     System.out.println("(FULL)    Today is " + s4);
  }
}
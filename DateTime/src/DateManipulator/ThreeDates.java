package DateManipulator;

/*
 The following program shows a calculation using years:
 */

import java.util.*;
import java.text.*;

class Mortgage {
	public static void main(String[] args) {
		GregorianCalendar mortgage = new GregorianCalendar(1997, Calendar.MAY,	18);
		mortgage.add(Calendar.YEAR, 15);
		Date d = mortgage.getTime();
		DateFormat df = DateFormat.getDateInstance();
		String s = df.format(d);
		System.out.println("15 year mortgage amortized on " + s);
	}
}

/*
 * One important side effect of the add() method is that it changes the original
 * date. Sometimes it is important to have both the original date and the
 * modified date. Unfortunately, you cannot simply create a new
 * GregorianCalendar object set equal to the original. The reason is that the
 * two variables have a reference to one date. If the date is changed, both
 * variables now refer to the changed date. Instead, a new object should be
 * created. The following example will demonstrate this:
 */

public class ThreeDates {
	public static void main(String[] args) {
		GregorianCalendar gc1 = new GregorianCalendar(2000, Calendar.JANUARY, 1);
		GregorianCalendar gc2 = gc1;
		GregorianCalendar gc3 = new GregorianCalendar(2000, Calendar.JANUARY, 1);
		// Three dates all equal to January 1, 2000
		gc1.add(Calendar.YEAR, 1);
		// gc1 and gc2 are changed
		DateFormat df = DateFormat.getDateInstance();
		Date d1 = gc1.getTime();
		Date d2 = gc2.getTime();
		Date d3 = gc3.getTime();
		String s1 = df.format(d1);
		String s2 = df.format(d2);
		String s3 = df.format(d3);
		System.out.println("gc1 is " + s1);
		System.out.println("gc2 is " + s2);
		System.out.println("gc3 is " + s3);
	}
}
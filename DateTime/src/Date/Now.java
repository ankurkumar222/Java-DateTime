package Date;

/* To keep track of time, Java counts the number of milliseconds from the start of January 1, 1970. 
 * This means, for example, that January 2, 1970, began 86,400,000 milliseconds later. 
 * Similarly, December 31, 1969, began 86,400,000 milliseconds before January 1, 1970. 
 * The Java Date class keeps track of those milliseconds as a long value. 
 * Because long is a signed number, dates can be expressed before and after the start of January 1, 1970. 
 * The largest positive and negative values expressible by the long primitive can generate dates forward and backward about 290,000,000 years, 
 * which suits most people's schedules.

The Date class

	The Date class, found in the java.util package, encapsulates a long value representing a specific moment in time. 
	One useful constructor is Date(), which creates a Date object representing the time the object was created.
	The getTime() method returns the long value of a Date object. 
	In the program below, I use the Date() constructor to create a date based on when the program was run, and the getTime() method to find out the number of milliseconds that the date represents:

*/   
import java.util.*;

public class Now {
	public static void main(String[] args) {
		Date now = new Date();
		long nowLong = now.getTime();
		System.out.println("Value is " + nowLong);

	}
}


/* When I ran that program, it gave me a value of 972,568,255,150. 
 * A quick check with my calculator confirms this number is at least in the correct ballpark: 
 * it's a bit less than 31 years, which corresponds to the right number of years between January 1, 1970, and the day I wrote this article.
 * While computers may thrive on numbers like the foregoing value, most people are reluctant to say such things as "I'll see you on 996,321,998,346." Fortunately, 
 * Java provides a way to convert Date objects to Strings, which represent dates in more traditional ways. 
 * The DateFormat class, discussed in the next section, can create Strings with alacrity.*/

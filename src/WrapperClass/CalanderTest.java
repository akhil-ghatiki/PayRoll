package WrapperClass;

import java.util.Calendar;

public class CalanderTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		//Calendar cal1 = Calendar.get(Calendar.YEAR);
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		
		// refer the below link for the remianing methods of the Calendar class.
		
		//http://docs.oracle.com/javase/7/docs/api/java/util/GregorianCalendar.html

	}

}

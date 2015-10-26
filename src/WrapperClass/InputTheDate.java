package WrapperClass;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class InputTheDate {
	
	/*String s1;
	public String scanning()
	{
		Scanner s=new Scanner(System.in);
		s1 = s.next();
		//s.close();
		return s1;
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		InputTheDate itd = new InputTheDate();
		SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yy");
		System.out.println("enter date in dd-mmm-yy");
		//String s1 = s.next();
		while(s.hasNext())
		{
		try{
		System.out.println(sd.parse(s.next()));
		break;
		}
		catch(NullPointerException n)
		{
			System.out.println("enter Valid Date");
		}
		catch(IllegalArgumentException ill)
		{
			System.out.println("enter the given format");
		}
		catch(ParseException p)
		{
			System.out.println("enter the given format");
		}
		//System.out.println(itd.s1);
	}
		s.close();

	}

}

package ExceptionHandling;

public class Point {
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double slope(int x1, int y1) throws ArithmeticException
	{
		
		double slope = (y1-y)/(x1-x);
	    System.out.println("Slope is "+ slope);
		return slope;
	}
	public void slope2(int a, int b)
		{
		//int  a =x1; int b= y1;
		try{
			slope(a,b);
		}
		catch(ArithmeticException e)
    	{
    		System.out.println("this is an undefined line");
    	}
		
		}
    public static void main(String [] args) throws ArithmeticException
    {
    	Point p = new Point(1,1);
    	//try{
    	p.slope2(1,1);
    	//StackTrace();
    	//}
    	//catch(ArithmeticException e)
    	//{
    	//	System.out.println("this is an undefined line");
    	//}
    }
	
}
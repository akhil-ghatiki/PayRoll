package WrapperClass;

import java.util.ArrayList;

public class WrapperClass1 {
	
	

	public WrapperClass1() {
		int k = 52;
		ArrayList a1 = new ArrayList();
		Integer intobj = new Integer(k);
		a1.add(intobj);
		System.out.println(intobj);
		String s = "2356";
		System.out.println(s);
		int p = Integer.parseInt(s);
		System.out.println(p);
		// TODO Auto-generated constructor stub
		
		int unwrapped=intobj.intValue();        ////This is unwrapping the wrapped intobj
		System.out.println(unwrapped);
		System.out.println(intobj);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperClass1 wc = new WrapperClass1();

	}

}

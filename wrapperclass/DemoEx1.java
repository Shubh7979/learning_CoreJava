package wrapperclass;

public class DemoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte by = 10;
		short s = 20;
		int i = 30;
		long l = 50;
		float f = 60.0F;
		double d = 70.00;
		char c = 's';
		boolean b1 = true;
		
		//Converting primitive types to object types this is autoboxing 
		
		Byte bobj = by;
		Short sobj = s;
		Integer iobj = i;
		Long lobj = l;
		Float fobj = f;
		Double dobj = d;
		Character cobj = c;
		Boolean b1obj = b1;
		
		//converting object types to primitive types this is unboxing
		
		byte by1 = bobj;
		short s1 = sobj;
		int i1 = iobj;
		long l1 = lobj;
		float f1 = fobj;
		double d1 = dobj;
		char c1 = cobj;
		boolean b2 = b1obj;

		
	}

}

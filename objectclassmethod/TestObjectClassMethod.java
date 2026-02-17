package objectclassmethod;

class TestObject{
	
	int a,b;
	
	public TestObject(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	public int add() {
		
		return(a+b);
	}
}

public class TestObjectClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TestObject t1 = new TestObject(7,15);
		 TestObject t2 = new TestObject(7,15);
		 
		 
		 System.out.println(t1.add());
		 
		 System.out.println(t1.getClass());
		 
		 System.out.println(t1.hashCode());
		 System.out.println(t2.hashCode());
		 
		 System.out.println(t1.equals(t2));
		 
		 t2=t1;
		 System.out.println("\n"+t1.equals(t2));
		 System.out.println(t2.hashCode());

	}

}

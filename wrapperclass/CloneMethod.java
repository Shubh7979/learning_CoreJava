package wrapperclass;

class Employee implements Cloneable{
	
	int id ;
	String Name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.Name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
}

public class CloneMethod {
	
	public static void main(String[] args) {
		
		try {
			Employee e1 = new Employee(79,"Shubham");
			
			Employee e2 = (Employee)e1.clone();
			
			System.out.println(e1.id +" "+ e1.Name);
			System.out.println(e2.id +" "+ e2.Name);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}

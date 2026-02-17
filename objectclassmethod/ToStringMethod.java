package objectclassmethod;

class Student{
	
	int rollNo;
	String Name;
	
	public Student(int rollNo, String Name) {
		
		this.rollNo = rollNo;
		this.Name = Name;
	}
	
	public void show() {
		
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Student Name: "+ Name);
	}
	
	public String toString() {
		
//		String s = "Student id :"+rollNo +", Name: "+ Name;
//		return s;
		
		return "Student id: ".concat(rollNo+" ").concat(", Name: ".concat(Name));
	}
	
}



public class ToStringMethod {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Shubham");
		
		s1.show();
		
		System.out.println(s1);
		
		System.out.println(s1.toString());
		
	}
	
}

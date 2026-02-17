package innerClass;

class human{
	static int data = 100;
	static class Inner {
		void name() {
			System.out.println("students " + data);
		}
	}
	
	static class school{
		static void teacher() {
			System.out.println("teacher teaches students is "+data);
		}
	}
	
}

public class nestedStaticInner_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human.Inner i = new human.Inner();
		i.name();
		
		human.school.teacher();
	}

}

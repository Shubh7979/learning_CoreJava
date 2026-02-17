package innerClass;

class Action{
	
	String name = "Riya";
	
	public void display() {
		System.out.println("Name is " + name);
	}
	class Reply{
		public void Print() {
			System.out.println("name is inner class " + name);
		}
	}
}

public class DemoMemberInner {
	public static void main(String[] args) {
		
		Action a = new Action();
		Action.Reply r = a.new Reply();
		
		a.display();
		r.Print();
	}

}

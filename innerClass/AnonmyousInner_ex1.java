package innerClass;

abstract class Person{
	abstract void show();
}

public class AnonmyousInner_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person() {
			void show(){
				System.out.println("this is Anonymous inner class");
			}
		};
		p.show();
	}

}

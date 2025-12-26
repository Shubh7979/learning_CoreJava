package superkeyword;

class Animal{
	public void show() {
		System.out.println("This is parent class property");
	}
}

class Tiger extends Animal {
	
	public void display() {
		super.show();
		System.out.println("This is child property");
	}
}

class Cat extends Tiger {
	
	public void test() {
		super.display();
		System.out.println("This is test property");
	}
}

public class callParentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiger t = new Tiger();
		t.display();
		t.show();
		
		Cat c = new Cat();
		c.test();
	}

}

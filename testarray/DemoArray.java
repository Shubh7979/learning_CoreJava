package testarray;

class Product{
	int id ;
	String name;
	float price;
	public Product(int id,String name, float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public void show() {
		System.out.println("product id:  "+id);
		System.out.println("product name:  "+name);
		System.out.println("product price:  "+price);
		System.out.println();

	}
}

public class DemoArray {

	public static void main(String[] args) {
//
//		Product p = new Product(111,"watch",1500);
//		p.show();
		
		// datatype varname[] = {};
		
		//datatype varname = new datatype[size];
		//int a[] = new int[3];
		//a[0] = 12;
		//a[1] = 
		
		Product p[] = new Product[6];
		p[0] = new Product(111,"watch",1500);
		p[1] = new Product(112,"smartwatch",1510);
		p[2] = new Product(113,"phone",1000);
		p[3] = new Product(114,"laptop",1501);
		p[4] = new Product(115,"tab",1599);
		p[5] = new Product(116,"gun",1499);
 	
		p[2].show();
		p[0].show();
		
		for(Product pr :p) {
			pr.show();
		}
	}

}

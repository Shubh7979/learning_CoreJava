public class ex1{

    public void Display(){
        int num = 10;
        String name = "Shubham";

        System.out.println(num+" "+name);
    }

    public static void main(String[] args ){

        ex1 obj = new ex1();

        obj.Display();

        car c1 = new car("black","TATA");
        c1.display();

    }


}

class car{
    String color;
    String brand;
    public car(String color,String brand){
        this.color = color;                 
        this.brand = brand;
    }

    public void display(){
        System.out.print("The car is " + color);
        System.out.println("The brand is " + brand);
    }
}
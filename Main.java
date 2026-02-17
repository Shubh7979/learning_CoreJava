class Dog {
    String name = "Sheru";

    public void Bark(){
        System.out.println(name +" is barking");
    }
    
}

public class Main {
    public static void main(String[] args) {
        
       // ClassName ObjName = new ClassName();
       // Main obj1 = new Main();

        Dog d1 = new Dog();
        d1.Bark();
        d1.name = "tommy";
        d1.Bark(); 
    }
}

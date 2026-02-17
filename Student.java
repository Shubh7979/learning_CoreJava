public class Student {

    static String SchoolName = "HighSchool";
    String Name;

    Student(String Name){
        this.Name = Name;
    }

    public void Display(){
        System.out.println(Name +": "+ SchoolName);
    }

    public static void Display1(String Name){

        System.out.println( Name +": "+ SchoolName);
    }

    public static void Display3(){
        System.out.println("hello!!!");
    }

    public static void main(String[] args) {

        Student obj1 = new Student("Shubham");
        obj1.Display();
        Student obj2 = new Student("pratik");
        obj2.Display();
        
        Student.Display1("Yash Marathe");

        Student.Display3();

    }
}

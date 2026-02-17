public class Demo {

    // int requires return compulory
    //void does need return
    public int name1(){
        System.out.println("Shubham");

        int data = 10;
        return data;
    }

    public void name(){
        System.out.println("Shubham");

    }

    public int Add(int num1 ,int num2){
        int sum = (num1 + num2);

        return sum;
    }


    public static void main(String[] args) {
        
        // Syntax of method:

        // AccessModifier returnType MethodName(){}

        // double num = Math.sqrt(160000);

        // System.err.println(num);

        Demo obj = new Demo();

        int result = obj.name1();
        System.out.println(result);

        obj.name();

        int sum1 = obj.Add(15, 13);
        System.out.println(sum1);

        int sum2 = obj.Add(60, 19);
        System.out.println(sum2);

    }
}

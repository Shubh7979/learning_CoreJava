public class SelectionStatements {
    public static void main(String[] args) {
        
        int age = 10;

        // if(condition){
        //     block of code
        // }

        if(age >= 18){
            System.out.println("Eligible for voting");
        }else{
            System.out.println("you are a minor");
        }

        int marks = 90;

        if(marks>=90){
            System.out.println("Outstanding");
        } else if (marks>=80 && marks <90) {
            System.out.println("Grade A");
        }else if (marks>=70 && marks <80) {
            System.out.println("Grade B");
        } else if (marks>=50 && marks <70) {
            System.out.println("Pass");
        } else{
            System.out.println("Fail");
        }

        
        //If the number is divisible by 3, 5 them fizzBuzz
        //If the number is divisible by 3 then fizz
        //If divisible by 5  then BUzz

        int num = 15;

        if((num%3==0) && (num%5==0)){
            System.out.println("FuzzBuzz " + num);
        } else if((num%3==0)){
            System.out.println("Fuzz " + num);
        } else if((num%5==0)){
            System.out.println("Buzz " + num);
        } 

        int weight = 55;
        int donorAge = 20;

        if(donorAge>=18){

            if (weight>=50) {
                System.err.println("You can Donate blood");
            }else{
                System.out.println("you are under weight to donate blood");
            }

        }else{
            System.out.println("you are under Age to donate blood");
        }

        int Attendance = 55;
        int marks1 = 20;

        if(Attendance>=50){

            if (marks1>=40) {
                System.err.println("You passed");
            }else{
                System.out.println("you failed");
            }

        }else{
            System.out.println("you are not eligible for examination");
        }
    }
}

//the consition must be boolean expression always
//no semicolon(;) after the if line
//the statement contionues with the block in curly braces
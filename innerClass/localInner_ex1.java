package innerClass;

class outer1 {
    int data = 100;

    public void show() {
        // Local inner class
        class inner {
            public void print() {
                System.out.println("this is local inner class " + data);
            }
        }

        // Create object and call method
        inner i = new inner();
        i.print();
    }
}

public class localInner_ex1 {
    public static void main(String[] args) {
        outer1 o = new outer1();
        o.show();
    }
}

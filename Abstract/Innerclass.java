package Abstract;

class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    // Without static Keyword :-

    // class B
    // {
    // public void config()
    // {
    // System.out.println("in config");
    // }
    // }

    // With static Keyword :-

    static class B {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class Innerclass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // Without static Keyword :-

        // A.B obj1=obj.new B();
        // obj1.config();

        // With static Keyword :-

        A.B obj1 = new A.B();
        obj1.config();

    }
}

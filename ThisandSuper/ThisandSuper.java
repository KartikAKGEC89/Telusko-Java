package ThisandSuper;

class A {
    public A() {
        System.out.println("Without paramenter constructor");
    }

    public A(int n) {
        System.out.println("With parameter");
    }
}

class B extends A {
    public B() {
        System.out.println("Without parameter constructor");
    }

    public B(int n) {
        System.out.println("With parameter");
    }
}

public class ThisandSuper {
    public static void main(String[] args) {
        B obj = new B();
    }
}

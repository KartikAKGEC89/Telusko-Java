package Inheritance;

class A {
    public void show() {
        System.out.println("Hello A");
    }

    public void config() {
        System.out.println("Byye A");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("Hello B");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}

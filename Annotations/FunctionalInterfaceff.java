package Annotations;

@FunctionalInterface
interface A {
    void show();
    // void run();
}
// class B implements A
// {
// public void show()
// {
// System.out.println("in Show");
// }
// }

public class FunctionalInterfaceff {
    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("in Show");
            }
        };
        // A obj=new A();
        // A obj=new B();
        obj.show();
    }
}

// A functional interface is an interface that contains only one abstract
// method. They can have only one functionality to exhibit. From Java 8 onwards,
// lambda expressions can be used to represent the instance of a functional
// interface. A functional interface can have any number of default methods.
// Runnable, ActionListener, and Comparable are some of the examples of
// functional interfaces.

// Functional Interface
// is additionally
// recognized as
// Single Abstract
// Method Interfaces.In short,
// they are
// also known
// as SAM
// interfaces.Functional interfaces
// in Java
// are the new
// feature that
// provides users
// with the
// approach of
// fundamental programming
package Thread;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class Threadclass {
    public static void main(String[] args) throws NumberFormatException {

        A obj1 = new A();
        B obj2 = new B();

        // obj1.show();
        // obj2.show();

        obj1.start();
        obj2.start();
    }
}

// Threads:-
// Multiple threads run at same time in a code.
// This is known as Multithreading.

// - A thread is a smallest unit to work with. (individual task)
// - They can run parallely.
// - Multiple threads can share resources.
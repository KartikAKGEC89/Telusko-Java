package Abstract;

abstract class Car {
    // public void drive()
    // {
    //
    // }

    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class WagnoR extends Car {
    // public void fly()
    // {
    // System.out.println("Flying...");
    // }
    public void drive() {
        System.out.println("Driving...");
    }
}

class UpdateWagnoR extends WagnoR // concrete class
{
    public void fly() {
        System.out.println("flying...");
    }
}

public class Abstract {
    public static void main(String[] args) {

        // Car obj=new Car();
        // Car obj=new WagnoR();
        Car obj = new UpdateWagnoR();
        obj.drive();
        obj.playMusic();
    }
}

// Data abstraction is the process of hiding certain details and showing only
// essential information to the user.
// Abstraction can be achieved with either abstract classes or interfaces (which
// you will learn more about in the next chapter).

// The abstract keyword is a non-access modifier, used for classes and methods:

// Abstract class: is a restricted class that cannot be used to create objects
// (to access it, it must be inherited from another class).

// Abstract method: can only be used in an abstract class, and it does not have
// a body. The body is provided by the subclass (inherited from).

package Polymorphism;

// What is Polymorphism in Java?
// Polymorphism is considered one of the important features of Object-Oriented Programming. Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to define one interface and have multiple implementations. The word “poly” means many and “morphs” means forms, So it means many forms.

// Polymorphism enables Java developers to create more flexible and reusable code. Understanding when and how to use it can make your code more maintainable. The Java Programming Course offers practical examples and projects that showcase the power of polymorphism in real-world applications.

// Types of Java Polymorphism
// In Java Polymorphism is mainly divided into two types: 

// Compile-time Polymorphism   (Method overloading)
// Runtime Polymorphism (Method overriding)

// Dynamic order dispatch
class A {
    public void show() {
        System.out.println("In A");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}

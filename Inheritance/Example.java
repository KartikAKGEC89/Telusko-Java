package Inheritance;

// Single Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Multilevel Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal walks.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Hierarchical Inheritance
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a rectangle.");
    }
}

// Multiple Inheritance (Using Interfaces)
interface Engine {
    void engineType();
}

interface Wheels {
    void wheelCount();
}

class Truck implements Engine, Wheels {
    public void engineType() {
        System.out.println("This truck has a diesel engine.");
    }

    public void wheelCount() {
        System.out.println("This truck has 6 wheels.");
    }
}

// Hybrid Inheritance (Using Interfaces)
interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class HybridClass implements B {
    public void methodA() {
        System.out.println("Method A from interface A.");
    }

    public void methodB() {
        System.out.println("Method B from interface B.");
    }
}

public class Example {
    public static void main(String[] args) {
        // Single Inheritance
        System.out.println("Single Inheritance:");
        Car car = new Car();
        car.start(); // From Vehicle
        car.drive(); // From Car

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance:");
        Dog dog = new Dog();
        dog.eat(); // From Animal
        dog.walk(); // From Mammal
        dog.bark(); // From Dog

        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");
        Circle circle = new Circle();
        circle.draw(); // From Shape
        circle.drawCircle(); // From Circle

        Rectangle rectangle = new Rectangle();
        rectangle.draw(); // From Shape
        rectangle.drawRectangle(); // From Rectangle

        // Multiple Inheritance
        System.out.println("\nMultiple Inheritance (Using Interfaces):");
        Truck truck = new Truck();
        truck.engineType(); // From Engine
        truck.wheelCount(); // From Wheels

        // Hybrid Inheritance
        System.out.println("\nHybrid Inheritance:");
        HybridClass hybrid = new HybridClass();
        hybrid.methodA(); // From Interface A
        hybrid.methodB(); // From Interface B
    }
}
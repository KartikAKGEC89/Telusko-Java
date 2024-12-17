package Interfaces;

interface A {
    // public abstract void show();
    // public abstract void config();
    int age = 44; // final and static
    String area = "Mumbai";

    void show();

    void config();
}

class B implements A {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in cofing");
    }
}

public class WhatisInterface {
    public static void main(String[] args) {

        A obj;
        obj = new B();

        obj.show();
        obj.config();

        // A.area="Hyderabad";

        System.out.println(A.area);

    }
}

// An Interface in Java programming language is defined as an abstract type used
// to specify the behavior of a class. An interface in Java is a blueprint of a
// behavior. A Java interface contains static constants and abstract methods.

// Implementation: To implement an interface, we use the keyword implements

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
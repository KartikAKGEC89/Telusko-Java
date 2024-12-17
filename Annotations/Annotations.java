package Annotations;

@Deprecated
class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in show A");
    }
}

class B extends A {
    @Override
    // public void showTheDataWhichBelongToThisClass()
    public void showTheDataWhichBelongsToThisClass()

    {
        System.out.println("in show B");
    }
}

public class Annotations {
    public static void main(String[] args) {

        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();

    }
}

// Java Annotations
// Java Annotation is a tag that represents the metadata i.e. attached with
// class, interface, methods or fields
// to indicate some additional information which can be used by java compiler
// and JVM.

// Annotations in Java are used to provide additional information, so it is an
// alternative option for XML and Java marker interfaces.

// First, we will learn some built-in annotations then we will move on creating
// and using custom annotations.

// Built-In Java Annotations
// There are several built-in annotations in Java. Some annotations are applied
// to Java code and some to other annotations.

// Built-In Java Annotations used in Java code
// @Override
// @SuppressWarnings
// @Deprecated
// Built-In Java Annotations used in other annotations
// @Target
// @Retention
// @Inherited
// @Documented

// @Override
// @Override annotation assures that the subclass method is overriding the
// parent class method.
// If it is not so, compile time error occurs.

// @SuppressWarnings
// @SuppressWarnings annotation: is used to suppress warnings issued by the
// compiler.

// @Deprecated
// @Deprecated annoation marks that this method is deprecated so compiler prints
// warning. It informs user that it may be removed in the
// future versions. So, it is better not to use such methods.

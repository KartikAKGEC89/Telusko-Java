package FinalKeyword;

// Final keyword in java are used in :- variable, method, class

// Final stop extends for class
final class A {
    // final stop override for method
    final public void show() {
        System.out.println("hello");
    }
}

// class B extends A {
// // public void show() {
// // System.out.println("Not done");
// // }
// }

public class FinalKeyword {
    public static void main(String[] args) {
        // final stop reinitialize here
        final int num = 1;
        // num = 2;
        System.out.println(num);
    }
}

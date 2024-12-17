package Abstract;

class C {
    public void show() {
        System.out.println("in C show");
    }
}
// class B extends C
// {
// public void show()
// {
// System.out.println("in B Show");
// }
// }

public class Anonyums {
    public static void main(String[] args) {

        // C obj=new B();

        // Anonymus class

        C obj = new C() {
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}

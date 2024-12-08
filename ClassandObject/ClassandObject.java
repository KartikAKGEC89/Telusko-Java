package ClassandObject;

class calculator {
    int n = 10;

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class ClassandObject {
    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 6;

        calculator cal = new calculator();

        int result = cal.add(num1, num2);

        System.out.println(result);
    }
}

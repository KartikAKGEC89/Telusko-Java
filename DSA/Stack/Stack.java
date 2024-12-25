package DSA.Stack;

public class Stack {
    public static int insert(int[] num, int data, int top) {
        if (top >= num.length) {
            System.out.println("Stack Overflow! Cannot insert " + data);
            return top;
        }
        num[top] = data;
        top++;
        return top;
    }

    public static void show(int[] num, int top) {
        for (int i = 0; i < top; i++) {
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        int num[] = {};
        int top = 0;
        insert(num, 5, top);
        insert(num, 6, top);
        insert(num, 5, top);
        insert(num, 6, top);
        show(num, top);
    }
}
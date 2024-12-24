package DSA.Array;

public class Array {

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        int target = 3;

        int result = LinearSearch(num, target);

        if (result == -1) {
            System.out.println("Number not exist in array");
        } else {
            System.out.println("Number exist at" + result);
        }

        int result2 = BinarySearch(num, target);

        if (result2 == -1) {
            System.out.println("Number not exist in array");
        } else {
            System.out.println("Number exist at" + result2);
        }
    }

    // Linear Search :-

    public static int LinearSearch(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search :-

    public static int BinarySearch(int[] num, int target) {
        int s = 0;
        int e = num.length - 1;
        while (s < e) {
            int mid = (s + e) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }
}

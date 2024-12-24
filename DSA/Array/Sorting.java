package DSA.Array;

public class Sorting {
    public static void main(String[] args) {
        int num[] = { 4, 5, 6, 1, 2, 3 };
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println(" ");
        BubbleSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println(" ");
        SelectionSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println(" ");
        InsertionSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println(" ");
        quickSort(num, 0, num.length - 1);
        System.out.println("QUICK SORT");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        System.out.println(" ");
    }

    // BUBBLE SORT :-

    public static void BubbleSort(int[] num) {
        System.out.println("BUBBLE SORT");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j + 1] < num[j]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }
            }
        }
    }

    // SELECTION SORT :-

    public static void SelectionSort(int[] num) {
        System.out.println("SELECTION SORT");
        for (int i = 0; i < num.length; i++) {
            int minindex = i;
            for (int j = i; j < num.length; j++) {
                if (num[minindex] > num[j]) {
                    minindex = j;
                }
            }

            int temp = num[minindex];
            num[minindex] = num[i];
            num[i] = temp;
        }
    }

    // INSERTION SORT :-

    public static void InsertionSort(int[] num) {
        System.out.println("INSERTION SORT");
        for (int i = 1; i < num.length; i++) {
            int key = num[i];
            int j = i - 1;
            while (num[j] > key && j >= 0) {
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = key;
        }
    }

    // QUICK SORT :-

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}

public class Loop {
    public static void main(String[] args) {

        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }

        // create an array
        int[] numbers = { 3, 7, 5, -5 };

        // iterating through the array
        for (int number : numbers) {
            System.out.println(number);
        }

        // While loop
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // do while loop
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

    }

}

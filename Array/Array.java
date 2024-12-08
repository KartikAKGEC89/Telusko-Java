public class Array {
    public static void main(String[] args) {
        // Static
        int num[] = { 1, 2, 3, 4 };
        System.out.println(num[0]);
        // Dynamic
        int nums[] = new int[4];
        nums[0] = 1;

        // Matrix

        int matrix[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}

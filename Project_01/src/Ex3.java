import java.util.Arrays;
import java.util.Random;

public class Ex3 {
    public static void findSmallestPositiveAndBiggestNegative(int n, int a, int b) throws Exception {
        if (a > b) {
            throw new IllegalArgumentException("a must smaller than b !");
        }

        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(b - a + 1) + a;
        }

        System.out.println(Arrays.toString(arr));

        // Find smallest positive number in array
        int smallestPositve = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallestPositve >= arr[i] && arr[i] > 0) {
                smallestPositve = arr[i];
            }
        }

        if (smallestPositve == Integer.MAX_VALUE) {
            System.out.println("Not found smallest positive number in array !");
        } else {
            System.out.println("Smallest postive number: " + smallestPositve);
        }

        // Find biggest negative number in array
        int biggestNegative = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (biggestNegative <= arr[i] && arr[i] < 0) {
                biggestNegative = arr[i];
            }
        }

        if (biggestNegative == Integer.MIN_VALUE) {
            System.out.println("Not found biggest negative number in array !");
        } else {
            System.out.println("Biggest negative number: " + biggestNegative);
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            findSmallestPositiveAndBiggestNegative(5, -10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}

package ArrayPractice;

import java.util.Arrays;

public class RotateArrayToRight {

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle case when k > n

        for (int i = 0; i < k; i++) {
            int temp = arr[n - 1]; // store last element
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1]; // shift elements right
            }
            arr[0] = temp; // put last element at first
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Before rotation:");
        System.out.println(Arrays.toString(values));

        rotate(values, k);

        System.out.println("After " + k + " right rotations:");
        System.out.println(Arrays.toString(values));
    }
}

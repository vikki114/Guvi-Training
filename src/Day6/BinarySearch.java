package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int bin_search(int num[], int key) {
        int left = 0;
        int right = num.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (num[mid] == key) {
                return mid;
            } else if (num[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {22, 3, 2, 10, 5, 6};

       
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();

        int pos = bin_search(numbers, key);

        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index (in sorted array): " + pos);
        }

        sc.close();
    }
}

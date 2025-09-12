package SearchMethods;

import java.util.Scanner;

public class LinearSearch {
    public static int lin_search(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int[] numbers = {2, 6, 8, 12, 15, 20};

        
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();
          int pos = lin_search(numbers, key);

       
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + pos);
        }

        sc.close();
    }
}

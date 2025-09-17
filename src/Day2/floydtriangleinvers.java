package Day2;

import java.util.Scanner;

public class floydtriangleinvers {
    public static void main(String[] args) {
        int n, i, j, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();

        // Find total numbers in Floyd's triangle = n*(n+1)/2
        num = n * (n + 1) / 2;

        // Outer loop for rows (from n to 1)
        for (i = n; i >= 1; i--) {
            // Inner loop for columns
            for (j = 1; j <= i; j++) {
                System.out.print(num-- + " ");
            }
            System.out.println(); // move to next line
        }
    }
}

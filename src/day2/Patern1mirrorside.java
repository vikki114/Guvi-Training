package day2;

import java.util.Scanner;

public class Patern1mirrorside {
    
	public static void main(String[] args) {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) { // {Row}
           
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
          
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }
    }
}

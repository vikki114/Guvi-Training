package Day2;

import java.util.Scanner;

public class alphabettriangle {
    
	public static void main(String[] args) {
        int n, i, j;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) { 
            c = 'A';   
            for (j = 1; j <= i; j++) {
                System.out.print(c++);
            }
            System.out.println(); 
        }
    }
}

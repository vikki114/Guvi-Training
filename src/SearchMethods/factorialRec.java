import java.util.Scanner;

public class factorialRec {
    public static int fact(int n1) {
        if (n1 == 0 || n1 == 1) {
            return 1;   // base case
        } else {
            return n1 * fact(n1 - 1); // recursive step
        }
    }

    public static void main(String[] args) {
        int n;
        int f;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        n = sc.nextInt();

        f = fact(n);   // call recursive function
        System.out.println("Factorial of " + n + " is: " + f);

        sc.close();
    }
}

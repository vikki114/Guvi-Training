//digit checker

package Day1;
import java.util.Scanner;

public class vikki2 {
 
	public static void main(String[] args)
 {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	 n=sc.nextInt();
	 if (n<10)
	 {
		 System.out.println(n+"-is Single Digit");
	 }
	 else if (n<100)
	 {
		 System.out.println(n+"-is Two Digite");
	 }
	 else if (n<1000)
	 {
		 System.out.println(n+"-is Three Digit");
	 }
	 else 
	 {
		 System.out.println(n+"-Not in Range");
	 }
}
}
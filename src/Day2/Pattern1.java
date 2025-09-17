package Day2;
import java.util.Scanner;
//{Right Angle Triangle}
public class Pattern1 {
public static void main(String[] args) {
	int n,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enater n");
	n=sc.nextInt();
	for(i=1;i<=n;i++) { //{Row}
		for(j=1;j<=i;j++) { //{Column}
			System.out.print("*");
			
		}
		System.out.println();//{next row start in a new line}
	}
}
}

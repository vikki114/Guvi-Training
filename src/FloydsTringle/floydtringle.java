package FloydsTringle;

import java.util.Scanner;
//Right side triangle
public class floydtringle {
	public static void main(String[] args) {
		int n,i,j,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enater n");
		n=sc.nextInt();
		num=1;
		for(i=1;i<=n;i++) { //{Row}
			for(j=1;j<=i;j++) { //{Column}
				System.out.print(num++ +" ");
				
			}
			System.out.println();//{next row start in a new line}
		}
	}
}

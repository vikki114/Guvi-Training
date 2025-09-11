package IncreasingNumber;

import java.util.Scanner;

public class IncreasingNo {
	public static void main(String[] args) {
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enater n");
		n=sc.nextInt();
		for(i=1;i<=n;i++) { //{Row}
			for(j=1;j<=i;j++) { //{Column}
				System.out.print(j);
				
			}
			System.out.println();//{next row start in a new line}
		}
	}
}

package day2;
import java.util.Scanner;
public class GradeCalculator {
	public static void main(String[] args)
	 {
		int marks;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		 marks=sc.nextInt();
		
		 
		 if (marks >=90)
		 {
			 System.out.println("Grade A");
		 }
		 
		 else if (marks >= 80 && marks <= 89)
		 {
			 System.out.println("Grade B");
		 }
		 else if (marks >= 70 && marks <= 79)
		 {
			 System.out.println("Grade C");
		 }
		 else
		 {
			 System.out.println("Fail");
		 }
	}
}

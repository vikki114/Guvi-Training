package day2;
import java.util.Scanner;
public class PrimeNoCheck {
	    public static void  main(String[] args){
	        int n,i ;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Number");
	        n = sc.nextInt();
	        for(i=2;i<n;i++){
	            if(n%i==0){
	            System.out.println(n+" is not Prime");
	            break;
	            
	        }}
	    
	    if(i==n)
	    {
	        System.out.println(n+ " is Prime");
	    }
	    }
	}


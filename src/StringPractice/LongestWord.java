package StringPractice;
import java.util.Scanner;
public class LongestWord {
	public static void main(String[] args) {
		String sentence=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		sentence=sc.nextLine();
		String[] words=sentence.split(" ");
		String longest="";
		for (String word: words) {
			if(word.length()>longest.length());
			{
			
					longest=word;
				}
			}
			System.out.println("Longest word: " + longest);
			System.out.println("Longest word length: " + longest.length());
		}
	}


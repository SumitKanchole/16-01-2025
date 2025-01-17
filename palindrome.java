package s1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word to check it is palindrome or not : ");
		String str = sc.nextLine();
		int c = str.length()-1;
		for(int i=0; i<str.length()/2-1;i++) {
			
			if(str.charAt(i)==str.charAt(c)) {
				System.out.println("it is palindrome");
			}
			else {
				System.out.println("its not a palindrome");
				break;
			}
			
		}
			
		}
		
	}

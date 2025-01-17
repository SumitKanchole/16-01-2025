package s1;
import java.util.*;
public class SpecialCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to check it contains special character or not : ");
		String str = sc.nextLine();
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='$' || str.charAt(i)=='@' || str.charAt(i)=='#' || str.charAt(i)=='&' || str.charAt(i)=='%') {
				System.out.println("it contained Special characters!!");
				break;
			}
			else {
			System.out.println("its not contained special characters!");
			break;
		}
	}
	}
	}

import java.util.*;
public class SpaceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to check how many space occur in that word : ");
		String str = sc.nextLine();
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("there are "+count+" spaces occured in that word!");
	}

}

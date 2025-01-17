 package s1;

import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word : ");
		String str = sc.nextLine();
		String reverse="";
		char logic;
		int a = str.length();
		for(int i=0; i<str.length(); i++)
		{
			logic = str.charAt(a-1);
			reverse += logic;
			a--;
			}
		System.out.println(reverse);
		}

	}

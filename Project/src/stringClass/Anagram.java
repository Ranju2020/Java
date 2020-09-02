package stringClass;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = sc.nextLine();
		// char ch[] = new char[str.length()];
		anagram(str,str1);
	}

	static void anagram(String str,String str1) {
		// int j = -1;
		char ch[] = str.toCharArray();
		char ch1[] = str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
				
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		String s = String.valueOf(ch);
		System.out.println();
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i]);
		}
		String s1 = String.valueOf(ch1);
		System.out.println();
		if(s.equals(s1))
			System.out.println("Anagram");
		else
			System.out.println("not");
	}

}

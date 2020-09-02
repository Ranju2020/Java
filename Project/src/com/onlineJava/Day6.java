package com.onlineJava;

import java.util.Arrays;

import java.util.Scanner;

public class Day6 {

// 1.*****************************************
	static void countVowelConsonant(String s) {
		int vowel = 0, consonant = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
					|| s.charAt(i) == 'o' || s.charAt(i) == 'u')
				vowel++;
			else
				consonant++;
		}
		System.out.println("Vowels : " + vowel + "\nConsonant : " + consonant);
	}

// 2. *****************************************

	static void removeWhiteSpaces(String s) {
		System.out.println(s.replace(" ", ""));
	}

// 3. *****************************************

	static void palindrome(String s) {
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			str = str + s.charAt(i);
		}
		if (str.equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");

	}

// 4. *****************************************

	static void rotation(String s1, String s2) {
		String str = s1 + s1;
		boolean b = str.contains(s2);
		if (true)
			System.out.println(s1 + " is a rotation of " + s2);
		else
			System.out.println(s1 + " is not a rotation of " + s2);
	}

// 5. *****************************************
	static void duplicateWords(String s) {
		String words[] = s.split(" ");
		int count = 1;

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}

			if (count > 1 && words[i] != "0")
				System.out.println(words[i]);
		}
	}

// 6. *****************************************

	static void findLargestSmallest(String s) {

		String words[] = s.split(" ");
		String small = "";
		String large = "";
		String word = "";

		int len = 0;
		int j = 0;
		int a[] = new int[len];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				word = word + s.charAt(i);
			} else {
				words[len] = word;
				len++;
				word = "";
			}
		}
		small = large = words[0];

		for (int i = 0; i < len; i++) {
			if (small.length() > words[i].length())
				small = words[i];

			if (large.length() < words[i].length())
				large = words[i];
		}
		System.out.println(small);
		System.out.println(large);
	}
// 7. *****************************************

	static void swap(String s1, String s2) {
		System.out.println("Before swapping : " + s1 + " " + s2);
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swapping : " + s1 + " " + s2);
	}

// 8.*****************************************

	static void anagram(String str, String str1) {
		char ch[] = str.toCharArray();
		char ch1[] = str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);

		String s = String.valueOf(ch);

		String s1 = String.valueOf(ch1);
		if (s.equals(s1))
			System.out.println("Anagram");
		else
			System.out.println("not anagram");
	}

// *****************************************
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		countVowelConsonant(s1);
		removeWhiteSpaces(s1);
		palindrome(s1);
		duplicateWords(s1);
		findLargestSmallest(s1);
		swap(s1, s2);
		anagram(s1, s2);
		rotation(s1, s2);
	}
}
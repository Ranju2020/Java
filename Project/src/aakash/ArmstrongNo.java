package aakash;

import java.util.*;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int exp = 0;
		int n1 = num;
		while (n1 != 0) {
			int digit = n1 % 10;
			exp++;
			n1 /= 10;
		}

		ArmstrongNo ob = new ArmstrongNo();
		int r = ob.chkArmstrong(num, exp);
		if (r == num)
			System.out.println(num + " Armstrong number");
		else
			System.out.println(num + " Not");
	}

	static int chkArmstrong(int num, int exp) {
		int n = num;
		int e = exp;
		int result = 1;
		int sum = 0;
		while (n != 0) {
			int base = n % 10;
			while (e != 0) {
				result *= base;
				e--;
			}
			n /= 10;
			sum += result;
			e = exp;
			result = 1;
		}
		return sum;
	}
}
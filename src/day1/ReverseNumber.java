package day1;

import java.util.Scanner;

public class ReverseNumber {
	
	public static long reverse(long n) {
		int sign = n<0?-1:1;
	     n = Math.absExact(n);
		long rev=0;
		while(n>0) {
			rev = rev*10+n%10;
			n=n/10;
		}
		return sign*rev;
	}

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value you want to reverse");
		int n = sc.nextInt();
		long rev =reverse(n);
		System.out.println(rev);
	}
}

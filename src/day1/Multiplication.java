package day1;

import java.util.Scanner;

public class Multiplication {
	
	public static void printTable(int n,int upto){
		for(int i=1;i<=upto;i++) {
			System.out.println(n+"*"+i+"="+n*i);	
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number  n:");
		int n = sc.nextInt();
		System.out.println("Print table up to? (default 10): ");
		String line = sc.next();
		int upto = line.matches("\\d+")?Integer.parseInt(line):10;
		printTable(n,upto);
	}

}

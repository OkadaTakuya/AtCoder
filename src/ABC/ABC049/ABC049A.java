package ABC.ABC049;

import java.util.Scanner;

public class ABC049A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		
		switch(c) {
		case 'a':
		case 'i':
		case 'u':
		case 'e':
		case 'o':
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonant");
			break;
		}
	}
}

package ABC.ABC013;

import java.util.Scanner;

public class ABC013A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char X = sc.next().charAt(0);
		sc.close();
		
		switch(X) {
		case 'A':
			System.out.println("1");
			break;
		case 'B':
			System.out.println("2");
			break;
		case 'C':
			System.out.println("3");
			break;
		case 'D':
			System.out.println("4");
			break;
		case 'E':
			System.out.println("5");
			break;
		}
	}
}

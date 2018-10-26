package ABC.ABC020;

import java.util.Scanner;

public class ABC020A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		switch(num) {
		case 1:
			System.out.println("ABC");
			break;
		case 2:
			System.out.println("chokudai");
			break;
		}
	}
}

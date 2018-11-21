package ABC.ABC028;

import java.util.Scanner;

public class ABC028A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N < 60)
			System.out.println("Bad");
		else if(N < 90)
			System.out.println("Good");
		else if(N < 100)
			System.out.println("Great");
		else
			System.out.println("Perfect");
	}
}

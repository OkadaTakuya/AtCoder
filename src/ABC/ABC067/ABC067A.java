package ABC.ABC067;

import java.util.Scanner;

public class ABC067A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		if(A % 3 == 0 || B % 3 == 0 || (A+B) % 3 == 0)
			System.out.println("Possible");
		else
			System.out.println("Impossible");
	}
}

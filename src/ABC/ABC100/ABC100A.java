package ABC.ABC100;

import java.util.Scanner;

public class ABC100A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		if(A <= 8 && B <= 8)
			System.out.println("Yay!");
		else
			System.out.println(":(");
	}
}

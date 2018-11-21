package ABC.ABC061;

import java.util.Scanner;

public class ABC061A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		if(A <= C && C <= B)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

package ABC.ABC083;

import java.util.Scanner;

public class ABC083A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		
		if(A+B > C+D)
			System.out.println("Left");
		else if(A+B < C+D)
			System.out.println("Right");
		else
			System.out.println("Balanced");
	}
}

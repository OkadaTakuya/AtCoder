package ABC.ABC016;

import java.util.Scanner;

public class ABC016A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		
		if(M % D == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}

package ABC.ABC080;

import java.util.Scanner;

public class ABC080A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int plan1 = T * A;
		if(plan1 > B)
			System.out.println(B);
		else
			System.out.println(plan1);
	}
}

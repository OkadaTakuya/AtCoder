package ABC.ABC039;

import java.util.Scanner;

public class ABC039A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		System.out.println((A*B*2+B*C*2+A*C*2));
	}
}

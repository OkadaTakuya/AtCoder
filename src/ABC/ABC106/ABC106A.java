package ABC.ABC106;

import java.util.Scanner;

public class ABC106A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int sq = (A*B)-A-B+1;
		System.out.println(sq);
	}
}
package ABC.ABC065;

import java.util.Scanner;

public class ABC065A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		if(A >= B)
			System.out.println("delicious");
		else if(A + X >= B)
			System.out.println("safe");
		else
			System.out.println("dangerous");
	}
}

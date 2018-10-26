package ABC.ABC011;

import java.util.Scanner;

public class ABC011A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N == 12)
			System.out.println("1");
		else
			System.out.println((N+1));
	}
}

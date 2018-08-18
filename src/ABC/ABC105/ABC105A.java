package ABC.ABC105;

import java.util.Scanner;

public class ABC105A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		if(N % K == 0)
			System.out.println(0);
		else
			System.out.println(1);
	}
}
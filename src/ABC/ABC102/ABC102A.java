package ABC.ABC102;

import java.util.Scanner;

public class ABC102A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N % 2 == 0)
			System.out.println(N);
		else
			System.out.println(N*2);
	}
}

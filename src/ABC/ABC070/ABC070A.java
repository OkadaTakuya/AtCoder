package ABC.ABC070;

import java.util.Scanner;

public class ABC070A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N/100 == N%10)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

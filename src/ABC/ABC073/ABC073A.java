package ABC.ABC073;

import java.util.Scanner;

public class ABC073A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N/10 == 9 || N%10 == 9)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

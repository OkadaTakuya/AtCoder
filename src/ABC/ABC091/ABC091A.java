package ABC.ABC091;

import java.util.Scanner;

public class ABC091A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		if(A+B >= C)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

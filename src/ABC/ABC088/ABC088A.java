package ABC.ABC088;

import java.util.Scanner;

public class ABC088A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		sc.close();
		
		if((N%500) <= A)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}

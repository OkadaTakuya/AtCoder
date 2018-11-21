package ABC.ABC072;

import java.util.Scanner;

public class ABC072A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int t = sc.nextInt();
		sc.close();
		
		if(X < t)
			System.out.println("0");
		else
			System.out.println((X - t));
	}
}

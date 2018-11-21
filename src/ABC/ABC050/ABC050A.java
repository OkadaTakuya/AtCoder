package ABC.ABC050;

import java.util.Scanner;

public class ABC050A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		char op = sc.next().charAt(0);
		int B = sc.nextInt();
		sc.close();
		
		if(op == '+')
			System.out.println((A+B));
		else
			System.out.println((A-B));
	}
}

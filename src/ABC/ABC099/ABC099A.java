package ABC.ABC099;

import java.util.Scanner;

public class ABC099A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N > 999)
			System.out.println("ABD");
		else
			System.out.println("ABC");
	}
}

package ABC.ABC031;

import java.util.Scanner;

public class ABC031A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		
		int atk = (A+1) * D;
		int def = A * (D+1);
		if(atk > def)
			System.out.println(atk);
		else
			System.out.println(def);
	}
}

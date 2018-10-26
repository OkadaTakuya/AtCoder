package ABC.ABC011;

import java.util.Scanner;

public class ABC011B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
	}
}

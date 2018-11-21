package ABC.ABC048;

import java.util.Scanner;

public class ABC048A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		System.out.println("A" + (s.split(" "))[1].charAt(0) + "C");
	}
}

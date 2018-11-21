package ABC.ABC069;

import java.util.Scanner;

public class ABC069B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		System.out.println(String.format("%c%d%c", s.charAt(0), s.length()-2, s.charAt(s.length()-1)));
	}
}

package ABC.ABC104;

import java.util.Scanner;

public class ABC104B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		
		if (input.charAt(0) != 'A') {
			System.out.println("WA");
			return;
		}
		int ccount = 0;
		int cposition = 0;
		for (int i = 2; i < input.length() - 1; ++i) {
			if (input.charAt(i) == 'C') {
				ccount++;
				cposition = i;
			}
		}
		if (ccount != 1) {
			System.out.println("WA");
			return;
		}
		String trimStr = input.substring(1, cposition) + input.substring(cposition + 1);
		if (trimStr.equals(trimStr.toLowerCase()))
			System.out.println("AC");
		else
			System.out.println("WA");

	}
}

package ABC.ABC001;

import java.util.Scanner;

public class ABC001B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		sc.close();
		
		if(m < 100)
			System.out.println("00");
		else if(m < 1000)
			System.out.println("0" + (m/100));
		else if(m <= 5000)
			System.out.println((m/100));
		else if(m <= 30000)
			System.out.println((m / 1000 + 50));
		else if(m <= 70000)
			System.out.println(((m / 1000 - 30)/5 + 80));
		else
			System.out.println("89");
	}
}
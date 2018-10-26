package ABC.ABC016;

import java.util.Scanner;

public class ABC016B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		boolean pflag = A + B == C;
		boolean mflag = A - B == C;
		if(pflag && mflag)
			System.out.println("?");
		else if(!pflag && !mflag)
			System.out.println("!");
		else if(pflag)
			System.out.println("+");
		else
			System.out.println("-");
	}
}

package ABC.ABC033;

import java.util.Scanner;

public class ABC033A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int num1 = N/1000;
		int num2 = (N%1000)/100;
		int num3 = (N%100)/10;
		int num4 = N%10;
		if(num1 == num2 && num2 == num3 && num3 == num4)
			System.out.println("SAME");
		else
			System.out.println("DIFFERENT");
	}
}

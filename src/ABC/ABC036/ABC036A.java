package ABC.ABC036;

import java.util.Scanner;

public class ABC036A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		int ans = B / A;
		if(B % A != 0)
			++ans;
		System.out.println(ans);
	}
}

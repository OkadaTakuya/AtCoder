package ABC.ABC096;

import java.util.Arrays;
import java.util.Scanner;

public class ABC096B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for(int i = 0;i < 3;++i)
			num[i] = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		Arrays.sort(num);
		int ans = num[0] + num[1] + (num[2]<<K);
		System.out.println(ans);
	}
}

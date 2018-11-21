package ABC.ABC031;

import java.util.Scanner;

public class ABC031B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;++i)
			A[i] = sc.nextInt();
		sc.close();
		
		for(int i = 0;i < N;++i) {
			if(A[i] < L)
				System.out.println(L-A[i]);
			else if(A[i] > H)
				System.out.println("-1");
			else
				System.out.println("0");
		}
	}
}

package ABC.ABC015;

import java.util.Scanner;

public class ABC015B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;++i)
			A[i] = sc.nextInt();
		sc.close();
		
		int det = 0;
		int sum = 0;
		for(int i = 0;i < N;++i) {
			if(A[i] == 0)continue;
			det++;
			sum += A[i];
		}
		sum += det-1;
		
		System.out.println(sum/det);
	}
}

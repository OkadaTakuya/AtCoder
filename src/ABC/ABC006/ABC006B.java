package ABC.ABC006;

import java.util.Scanner;

public class ABC006B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int[] num = new int[4];
		num[0] = 0;
		num[1] = 0;
		num[2] = 1;
		for(int i = 3;i < n;++i) {
			switch(i%4) {
			case 0:
				num[0] = (num[1] + num[2] + num[3])%10007;
				break;
			case 1:
				num[1] = (num[0] + num[2] + num[3])%10007;
				break;
			case 2:
				num[2] = (num[0] + num[1] + num[3])%10007;
				break;
			case 3:
				num[3] = (num[0] + num[1] + num[2])%10007;
				break;
			}
		}
		
		if(n < 3) {
			System.out.println("0");
		} else {
			System.out.println(num[(n-1)%4]);
		}
	}
}

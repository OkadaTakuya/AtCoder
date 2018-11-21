package ABC.ABC029;

import java.util.Scanner;

public class ABC029B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = new String[12];
		for(int i = 0;i < 12;++i)
			input[i] = sc.next();
		sc.close();
		
		int ans = 0;
		for(int i = 0;i < 12;++i) {
			for(int j = 0;j < input[i].length();++j) {
				if(input[i].charAt(j) == 'r') {
					++ans;
					break;
				}
			}	
		}
		System.out.println(ans);
	}
}

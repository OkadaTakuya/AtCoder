package ABC.ABC008;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ABC008B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> voteList = new HashMap<String, Integer>();
		for(int i = 0;i < N;++i) {
			String str = sc.next();
			if(voteList.containsKey(str)) {
				Integer num = voteList.get(str);
				voteList.remove(str);
				voteList.put(str, num+1);
			} else {
				voteList.put(str, 1);
			}
		}
		sc.close();
		
		int max = 0;
		String max_name = "";
		for(String key : voteList.keySet()) {
			if(voteList.get(key) > max) {
				max = voteList.get(key);
				max_name = key;
			}
		}
		
		System.out.println(max_name);
	}
}

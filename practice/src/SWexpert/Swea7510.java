package SWexpert;
import java.util.*;

public class Swea7510 {
	
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;

	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			int cnt = 0;
			int i=1;
			while(i<=N) {
				int sum = 0;
				int k =0;
				
				while(true) {
					sum+=i+k;
					if(sum == N) {
						cnt++;
						break;
					}
					
					if(sum >N) {
						break;
					}
					k++;
					
					
				}
				i++;
			}
			System.out.println("#" + tc + " " + (cnt));
		}

	}

}

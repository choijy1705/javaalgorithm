package SWexpert;
import java.util.*;
public class Swea8104 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int K;
	public static void main(String[] args) {
		
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			
			int n = 1;
			int num=0;
			String result = "";
			while(n<=K) {
				int sum = 0;
				num = n;
				for(int i=0;i<N;i++) {
					
					sum += num;
					if(i%2 == 0) {
						num += (2*K -(2*n -1));
					}else {
						num+=(2*n -1);
					}
				}
				result += sum + " ";
				n++;
			}
			System.out.println("#" + tc + " " + result);
			
		}

	}

}

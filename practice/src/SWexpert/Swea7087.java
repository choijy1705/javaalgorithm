package SWexpert;
// 문제 제목 붙이기
import java.util.*;
public class Swea7087 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			int N = sc.nextInt();
			
			char[] arr = new char[N];			
			for(int i=0;i<N;i++) {
				arr[i] = sc.next().charAt(0);
			}
			
			
			
			String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			char[] abc = alpha.toCharArray();
						
			Arrays.sort(arr);
			
			
			int k=0;
			int cnt = 0;
			for(int i=0;i<N;i++) {
				if(arr[i] == abc[k]) {
					cnt++;
					k++;
				}else if(k>0 && arr[i] == abc[k-1]) {
					
				}else {
					break;
				}
				
			}
			
			System.out.println("#" + tc + " " + cnt);
		}

	}

}
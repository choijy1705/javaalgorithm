	package SWexpert;
	//요일 맞추기
	import java.util.*;
	
	public class Swea5515 {
		static Scanner sc = new Scanner(System.in);
		static int C;
		static int m;
		static int d;
		static int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
		public static void main(String[] args) {
			C = sc.nextInt();
			
			for(int tc =1;tc<=C;tc++) {
				m = sc.nextInt();
				d = sc.nextInt();
				
				int sum = 0;
				if(m != 1) {
					for(int i=0;i<m-1;i++) {
						sum+=month[i];
					}
				}
				
				sum += d;
				
				int result = sum%7 +3;
				result = result >= 7 ? result-7:result;
				
				System.out.println("#" + tc + " " + (result));
			}
		}
	
	}
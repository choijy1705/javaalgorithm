package SWexpert;
// 새셈이와 세소수
// 주어진 숫자를 세개의 소수로 나타낼수 있는 개수
import java.util.*;
public class Swea5986 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			int n = sc.nextInt();
			
			List<Integer> list = new ArrayList<>();
			
			for(int i=2;i<=1000;i++) {
				list.add(i);
			}
			int z=0;
			while(z < list.size()) {
				int a = list.get(z);
				
				for(int i=z+1;i<list.size();i++) {
					if(list.get(i)%a == 0) {
						list.remove(i);
					}
				}
				z++;
			}
			int cnt = 0;
			for(int i=0;i<list.size();i++) {
				int num = n;
				
				num-=list.get(i);
	
				if(num<=0) {
					break;
				}
				for(int j=i;j<list.size();j++) {
					int num2 = num;
					num2-=list.get(j);
					
					if(num2<=0) {
						break;
					}
					for(int k=j;k<list.size();k++) {
						int num3 = num2;
						num3-=list.get(k);
						
						if(num3<0) {
							break;
						}
						if(num3 == 0) {
							cnt++;
						}
					}
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}

	}

}

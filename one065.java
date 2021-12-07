package Algorithm;
import java.util.Scanner;
public class one065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int han = 0;
		int k;
		
		int a[] = new int[3];
		
		for(int i=1; i<=n; i++) {
			if(i<100&&i>0) {
				han = i;
			}
			else if(i==1000) {
				break;
			}
			else {
				k=0;
				int t = i;
				for(int j=0; j<3; j++) {
				k = t%10;
				a[j] = k;
				t/=10;
				}
				if(a[0]-a[1] == a[1]-a[2]) {
					++han;					
//					System.out.println(han);
				}
				
			}
		}
		System.out.println(han);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//				Scanner sc = new Scanner(System.in);
//				
//				int n=sc.nextInt(), 
//				i, //반복문 i
//				k, // 3자리 수 배열인자
//				han=0, //한수 갯수 
//				a[] = new int[3]; //한수 비교 배열
//				
//				for (i = 1; i <= n; i++) {
//					if (0 < i && i < 100) han = i;
//					else if (i == 1000) break;
//					else {
//						k = 0; //3자리 수 배열인자 0으로 초기화
//						int t = i; //100부터의 수를 t로 넣음.
//						while (t > 0) {
//							a[k] = t % 10;
//							t /= 10; k++; //a[0]에 일, a[1]에 십, a[2]에 백의 숫자를 각각 넣음.
//						}
//						if (a[0] - a[1] == a[1] - a[2]) han++;
//					}
//				}
//				System.out.println(han);
//				sc.close();
//			
		
	}
}

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
//				i, //�ݺ��� i
//				k, // 3�ڸ� �� �迭����
//				han=0, //�Ѽ� ���� 
//				a[] = new int[3]; //�Ѽ� �� �迭
//				
//				for (i = 1; i <= n; i++) {
//					if (0 < i && i < 100) han = i;
//					else if (i == 1000) break;
//					else {
//						k = 0; //3�ڸ� �� �迭���� 0���� �ʱ�ȭ
//						int t = i; //100������ ���� t�� ����.
//						while (t > 0) {
//							a[k] = t % 10;
//							t /= 10; k++; //a[0]�� ��, a[1]�� ��, a[2]�� ���� ���ڸ� ���� ����.
//						}
//						if (a[0] - a[1] == a[1] - a[2]) han++;
//					}
//				}
//				System.out.println(han);
//				sc.close();
//			
		
	}
}

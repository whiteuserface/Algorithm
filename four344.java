package Algorithm;
import java.util.Scanner;
public class four344 {
	public static void main(String[] args) {
		int sum = 0;
		
		//���߹迭 ����
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("�迭�� ���̸� �Է�:");
		int arr_num = sc.nextInt();
		int[][] arr = new int[arr_num][];
		
		int[] average = new int[arr_num]; //��հ��ֱ�
		int averageUp = 0;
		
		
		
		
			
		//���߹迭 �� �Է¹��� ������ ����
		for(int j=0; j<arr.length; j++) {
//		System.out.printf("%d��° ���߹迭 ���̸� �Է�:",j+1);
		int arr_num2 = sc.nextInt();
		arr[j] = new int[arr_num2];
			
				//���߹迭 ���� �Է¹ޱ�
				
			for(int k=0; k < arr[j].length; k++) {
//				System.out.printf("%d��° ���߹迭�� %d��° ���� �Է�:",j+1,k+1);
				arr[j][k] = sc.nextInt();
				}
				
			}

			
	
		
		//----------------------------------------
		//���߹迭�� �� ��� ���ϱ�.
		for(int i =0; i< arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
			sum	+= arr[i][j];
			}
			average[i] = sum/(arr[i].length);
			sum = 0;
		}
		//��� ���� �л��� ���� ��ȯ
		
		for(int i =0; i< arr.length; i++) {
			//������ �� ���� �ο��� ������ ���ϱ�.
			for(int j=0; j<arr[i].length; j++) {
			
				if(average[i]<arr[i][j]) {
					averageUp++;
				}
			}
			average[i] = averageUp;
			averageUp = 0;
		}
		
		for(int i=0; i<average.length; i++) {
		float percent	= (float)average[i]/(float)arr[i].length;
		String num = String.format("%.3f", percent*100);
		System.out.println(num+"%");
		}
		
		
		
		//���߹迭 ����
	}
}

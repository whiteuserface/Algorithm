package Algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class fifteen46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		float[] first = new float[count];
		float[] second = new float[count];
		
		float sum = 0;
		
		float final_value =0;
		//�Է¹ޱ�
		for(int i = 0; i<first.length; i++) {
			first[i] = sc.nextInt();
			sum += first[i];
			}
		//�Է¹����� second�� ���� �� ������������ ���� �� ���� ū �� ���Ͽ� ���ĸ����
		//second�� ����
		for(int i =0; i<first.length; i++) {
			second[i] = first[i];
		}
		//�������� ����
		Arrays.sort(second);
		//�ִ��
		float max_num = second[second.length-1];
//		System.out.println(max_num);
		//�� ���Ѽ�
//		System.out.println(sum);
		//�ִ��� ������ ���
		float average = (sum)/first.length;
		//���Ŀϼ�
		final_value = (average/max_num)*100;
		
		System.out.println(final_value);
		
		
		
		
		 
		//50/70
	}
}


package Algorithm;
import java.util.*;
public class thirty52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//����10�� �Է¹ޱ�;
		int[] input = new int[10];
		//%42�� ������ ���� ���� �迭 ����
		int[] tmp = new int[input.length];
		
		for(int i =0; i<input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		//�Է¹��� ���ڿ� 42�� ������ �������� ���� ������.
		int divice_num = 42;
		for(int i =0; i<input.length; i++) {
			
			//tmp�迭�� �� ����ֱ�
			tmp[i] = input[i];
			//tmp�迭�� ���� %42�� ���� �����ϱ�.
			tmp[i]%=divice_num;
		}
		//%42�� �� �迭 ���~
//		for(int i=0; i<tmp.length; i++) {
//			System.out.println(tmp[i]);
//		}
		//tmp�迭�� %42�� ������ �ٸ� ���� ��ִ��� ���ϱ�.
		//tmp[]�迭 �ȿ� �ִ� ���� �� 10�� �������� ������ -1��
		Arrays.sort(tmp);
		int[] same_count = new int[1];
		
		for(int i = 0; i<10; i++) {
			if(i==9) {
				break;
			}
			if(tmp[i]==tmp[i+1]) {
				same_count[0]+=1;
//				System.out.println(same_count[0]);
			}
		}
		System.out.print(tmp.length-same_count[0]);
	}
}

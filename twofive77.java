package Algorithm;
import java.util.*;
public class twofive77 {
	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		
		//�Է¹ޱ�
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//���� �� ����
		int cop = a*b*c;
		//String���� ����
		String cop_String = Integer.toString(cop);
		
//		System.out.println(cop_String.length());
		
		//�� �ڸ��� ���� �迭�� �ϳ� �߰��ϰ�
		int[] arr = new int[cop_String.length()];
		
		//�� �迭�� �ڸ��� ���ڸ� ���ʷ� ���.
		for(int i=0; i<cop_String.length(); i++) {
			arr[i] = cop_String.charAt(i)-48;
//			System.out.println(arr[i]);
		}
		//0~9���� ���ڿ� �ش��Ҷ����� �� �ڸ��� count�� �ö󰡴� �迭 �����.
		int[] count = new int[10];
		
		//arr�� �迭�� 0~9���� ���ڵ��� ī��Ʈ�ϴ� ������ �ۼ�
		for(int i =0; i<arr.length;i++) {
			if(arr[i] == 0) {
				count[0]+=1;
			} 
			else if(arr[i] == 1){
				count[1] += 1;
			}
			else if(arr[i] == 2){
				count[2] += 1;
			}
			else if(arr[i] == 3){
				count[3] += 1;
			}
			else if(arr[i] == 4){
				count[4] += 1;
			}
			else if(arr[i] == 5){
				count[5] += 1;
			}
			else if(arr[i] == 6){
				count[6] += 1;
			}
			else if(arr[i] == 7){
				count[7] += 1;
			}
			else if(arr[i] == 8){
				count[8] += 1;
			}
			else if(arr[i] == 9){
				count[9] += 1;
			} else {
				System.out.println(" ");
			}	
		}
		//ī��Ʈ �Լ��� �ϳ��� ȣ���Ͽ� ���
		for(int i = 0; i<count.length; i++) {
			System.out.println(count[i]);
		}
		}
}

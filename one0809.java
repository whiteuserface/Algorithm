package Algorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class one0809 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//�ҹ��� �ܾ� �Է¹ޱ�
		String S = bf.readLine();
		bf.close();
		//�� ��µ�. (Ȯ��)
//		System.out.println(S);
		
		//26�� ���ĺ� ��ġ�� ���ؼ� -1�� ǥ���� �迭 ����
		int[] alpha = new int[26];
		char[] charArray = new char[S.length()];
		//�ʱⰪ�� -1�� setting
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = -1;
		}
		
		//�ҹ��� �ܾ �˻��ؼ� char�迭�� ���ʴ�� �ֱ�.
		for(int i=0; i<S.length(); i++) {
			charArray[i] = S.charAt(i);
		}
		
		int a = S.charAt(0);
//		System.out.println(a);
		//-1�� �ʱ�ȭ�� alpha�迭�� charArray[i]�� ���� int�� �����ؼ� -97�ϸ� 0~26���� �񱳰���
		// �� for���ȿ� i�� �ڸ����̰� 
		for(int i=0; i<charArray.length; i++) {
			int change = charArray[i]-97; // charArray�� ���� ������� int�� ����
			if(alpha[change]!=-1) {
				continue;
			} else {
				alpha[change] = i;
			}
			
		}
		for(int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i]+" ");
		}
	}
}

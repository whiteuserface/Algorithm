package Algorithm;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class one157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//inputString �ޱ�
		String inputString = br.readLine();
		//�빮�ڷ� ���� 
		inputString = inputString.toUpperCase();
		
		int alpha[] = new int[26]; //�빮�� 26�� �� ī��Ʈ ������ų �迭����
		
		for(int i=0; i<inputString.length(); i++) {
			alpha[(inputString.charAt(i)-65)]++;
		}
		int max =0;
		int num =0;
		int cnt = 0;
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i]>max) {
				max = alpha[i];
				num = i;
			}
		}
		
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i]==max) {
				cnt++;
			}
		}
		
		if(cnt>1) {
			System.out.println("?");
		}
		else {
			System.out.println((char)(num+65));
		}
		
		
	}
}

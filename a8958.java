package Algorithm;
import java.io.*;
public class a8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.print("�迭 ����:");
		int input = (int)br.read();
		input = (int)(input-48);
		if(input > 0&& input < 80) {
		int count = 0; //O�� ���ö����� ++
		int sum = 0;
		String[] StringArr = new String[input];
		int[] result = new int[StringArr.length]; // ���� ����.
		for(int i = 0; i<input; i++) {
			if(i>input) {
				br.close();
			}
			System.out.print("�Է�:");
			StringArr[i] = br.readLine();
			br.close();
		}
		for(int i = 0; i< StringArr.length; i++) {
			//���ο� char �迭�� Arr.length��ŭ�� ����.
			int Array_length = StringArr[i].length();
			char[] charArr = new char[Array_length];
			//String�迭�� 0���� ���ο� char�迭�� �ϳ��� ����.
			for(int j=0; j<charArr.length; j++) {
				charArr[j] = StringArr[i].charAt(j);
//				System.out.print(charArr[j]);
			}
			//���ǹ� O�̸� count ++
		for(int j=0; j<charArr.length; j++) {
			
			if(charArr[j]!='O') {
					count = 0;
			} else {
				count++;
			}
			sum += count;
			
		}
		result[i] = sum;
		sum=0;
		count=0;
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		} else {
			System.exit(0);
		}
	}
}

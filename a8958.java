package Algorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class a8958 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�迭�� ���� �Է¹ޱ�
		
		StringBuilder sb = new StringBuilder();
		int test_case = Integer.parseInt(br.readLine());
		
		String arr[] = new String[test_case];
		
		for(int i=0; i<test_case; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i=0; i<test_case; i++) {
			int cnt = 0; //����Ƚ��
			int sum = 0; //���� �ջ�
			
			for(int j=0; j<arr[i].length(); j++) {
				
				if(arr[i].charAt(j)=='O') {
					cnt++;
				} else {
					cnt=0;
				}
				sum += cnt;
			}
			sb.append(sum).append('\n');
		}
		
		System.out.print(sb);
		
		
	}
}

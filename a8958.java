package Algorithm;
import java.io.*;
public class a8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.print("배열 갯수:");
		int input = (int)br.read();
		input = (int)(input-48);
		if(input > 0&& input < 80) {
		int count = 0; //O가 나올때마다 ++
		int sum = 0;
		String[] StringArr = new String[input];
		int[] result = new int[StringArr.length]; // 값을 담음.
		for(int i = 0; i<input; i++) {
			if(i>input) {
				br.close();
			}
			System.out.print("입력:");
			StringArr[i] = br.readLine();
			br.close();
		}
		for(int i = 0; i< StringArr.length; i++) {
			//새로운 char 배열을 Arr.length만큼의 만듬.
			int Array_length = StringArr[i].length();
			char[] charArr = new char[Array_length];
			//String배열의 0부터 새로운 char배열에 하나씩 담음.
			for(int j=0; j<charArr.length; j++) {
				charArr[j] = StringArr[i].charAt(j);
//				System.out.print(charArr[j]);
			}
			//조건문 O이면 count ++
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

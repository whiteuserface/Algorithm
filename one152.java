package Algorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class one152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int cnt=0;
		int len=0;
		
		String inputString = br.readLine();
		len = inputString.length();
//		System.out.println(len);
		
		char[] inputArray = new char[inputString.length()];
//		System.out.println(inputArray.length);
		
		for(int i=0; i<inputArray.length; i++) {
			inputArray[i] = inputString.charAt(i);
		}
		
		for(int i=0; i<inputArray.length; i++) {
			if(i == inputArray.length-1) {
				cnt++;
				break;
			}
			if((inputArray[i]==' ')&&(inputArray[i+1]==' ')) {
				continue;
			} else if ((inputArray[i]==' ')&&(inputArray[i+1]!=' ')){
				cnt++;
			} 
		}
		if(inputArray[0]==' ') {
			cnt-=1;
		}
//		if(inputArray[inputArray.length-1]==' ') {
//			cnt-=1;
//		}
		System.out.println(cnt);
		
	}
}

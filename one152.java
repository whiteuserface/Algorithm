package Algorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class one152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String inputString = br.readLine();
		int cnt = 1;
		
		for(int i=0; i<inputString.length(); i++) {
			
			if(inputString.charAt(i) == ' ') {
				if(inputString.charAt(i)==inputString.charAt(i+1)) {
					cnt++;
				} else {
					cnt++;
				}
			}
		}
		if(inputString.charAt(0)==' ') {
			cnt = cnt-1;
		}
		
		System.out.println(cnt);
	}
}

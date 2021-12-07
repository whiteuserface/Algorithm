package Algorithm;
import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.io.IOException;

public class 파보나치수10870two {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		System.out.println(fibo(n));
	}
	
	public static int fibo(int n) {
		
		if(n <= 1 ) {
			return n;
			
		} else {
			return fibo(n-1)+fibo(n-2); 
		}
		
	}
	//재귀함수로 구현
}

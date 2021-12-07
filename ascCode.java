package Algorithm;
import java.util.Scanner;
public class ascCode {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int sum = 0;
		int ArrayNum = sc.nextInt();
        String inputNum = sc.next();
        char[] device = new char[ArrayNum];
//        System.out.print(inputNum.length());
        for(int i=0; i<inputNum.length(); i++) {
        	device[i] = inputNum.charAt(i);
//        	System.out.println(device[i]);
        }
        for(int i=0; i<inputNum.length(); i++) {
        	sum += (device[i]-48);
        }
        System.out.println(sum);
        
	}
}

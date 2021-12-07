package Algorithm;
import java.util.Scanner;
public class Factorial {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 boolean oc = true;
		while(oc) {
			int a = sc.nextInt();
			String b = sc.next();
			char[] arr = new char[a];
			char[] fullArr = new char[a*b.length()];
			for(int i =0; i<a*b.length(); i=i+a) {
				if(i>0&&i<=3) {
					i-=1;	
				}
				arr[i/a] =b.charAt(i); 
				System.out.print(arr[i/a]);
			}
			
		}
	}
}

package Algorithm;
import java.util.*;
public class thirty52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//숫자10개 입력받기;
		int[] input = new int[10];
		//%42로 나눈후 값을 넣을 배열 생성
		int[] tmp = new int[input.length];
		
		for(int i =0; i<input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		//입력받은 숫자에 42로 나누고 나머지의 값을 구하자.
		int divice_num = 42;
		for(int i =0; i<input.length; i++) {
			
			//tmp배열에 값 집어넣기
			tmp[i] = input[i];
			//tmp배열에 값을 %42값 으로 변경하기.
			tmp[i]%=divice_num;
		}
		//%42를 한 배열 출력~
//		for(int i=0; i<tmp.length; i++) {
//			System.out.println(tmp[i]);
//		}
		//tmp배열에 %42한 값들의 다른 수가 몇개있는지 구하기.
		//tmp[]배열 안에 있는 수는 총 10개 같은수가 있으며 -1씩
		Arrays.sort(tmp);
		int[] same_count = new int[1];
		
		for(int i = 0; i<10; i++) {
			if(i==9) {
				break;
			}
			if(tmp[i]==tmp[i+1]) {
				same_count[0]+=1;
//				System.out.println(same_count[0]);
			}
		}
		System.out.print(tmp.length-same_count[0]);
	}
}

package Algorithm;
import java.util.*;
public class twofive77 {
	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		//입력받기
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//곱한 값 저장
		int cop = a*b*c;
		//String으로 저장
		String cop_String = Integer.toString(cop);
		
//		System.out.println(cop_String.length());
		
		//각 자리를 담을 배열을 하나 추가하고
		int[] arr = new int[cop_String.length()];
		
		//각 배열의 자리에 숫자를 차례로 담기.
		for(int i=0; i<cop_String.length(); i++) {
			arr[i] = cop_String.charAt(i)-48;
//			System.out.println(arr[i]);
		}
		//0~9까지 숫자에 해당할때마다 각 자리의 count가 올라가는 배열 만들기.
		int[] count = new int[10];
		
		//arr의 배열의 0~9까지 숫자들의 카운트하는 구문을 작성
		for(int i =0; i<arr.length;i++) {
			if(arr[i] == 0) {
				count[0]+=1;
			} 
			else if(arr[i] == 1){
				count[1] += 1;
			}
			else if(arr[i] == 2){
				count[2] += 1;
			}
			else if(arr[i] == 3){
				count[3] += 1;
			}
			else if(arr[i] == 4){
				count[4] += 1;
			}
			else if(arr[i] == 5){
				count[5] += 1;
			}
			else if(arr[i] == 6){
				count[6] += 1;
			}
			else if(arr[i] == 7){
				count[7] += 1;
			}
			else if(arr[i] == 8){
				count[8] += 1;
			}
			else if(arr[i] == 9){
				count[9] += 1;
			} else {
				System.out.println(" ");
			}	
		}
		//카운트 함수를 하나씩 호출하여 출력
		for(int i = 0; i<count.length; i++) {
			System.out.println(count[i]);
		}
		}
}

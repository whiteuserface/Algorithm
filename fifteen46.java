package Algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class fifteen46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		float[] first = new float[count];
		float[] second = new float[count];
		
		float sum = 0;
		
		float final_value =0;
		//입력받기
		for(int i = 0; i<first.length; i++) {
			first[i] = sc.nextInt();
			sum += first[i];
			}
		//입력받은값 second에 저장 후 오름차순으로 변경 후 가장 큰 수 구하여 공식만들기
		//second에 복사
		for(int i =0; i<first.length; i++) {
			second[i] = first[i];
		}
		//오름차순 변경
		Arrays.sort(second);
		//최댓수
		float max_num = second[second.length-1];
//		System.out.println(max_num);
		//다 합한수
//		System.out.println(sum);
		//최댓값을 제외한 평균
		float average = (sum)/first.length;
		//공식완성
		final_value = (average/max_num)*100;
		
		System.out.println(final_value);
		
		
		
		
		 
		//50/70
	}
}


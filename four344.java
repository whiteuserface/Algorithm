package Algorithm;
import java.util.Scanner;
public class four344 {
	public static void main(String[] args) {
		int sum = 0;
		
		//이중배열 생성
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("배열의 길이를 입력:");
		int arr_num = sc.nextInt();
		int[][] arr = new int[arr_num][];
		
		int[] average = new int[arr_num]; //평균값넣기
		int averageUp = 0;
		
		
		
		
			
		//이중배열 을 입력받은 값으로 생성
		for(int j=0; j<arr.length; j++) {
//		System.out.printf("%d번째 이중배열 길이를 입력:",j+1);
		int arr_num2 = sc.nextInt();
		arr[j] = new int[arr_num2];
			
				//이중배열 값을 입력받기
				
			for(int k=0; k < arr[j].length; k++) {
//				System.out.printf("%d번째 이중배열의 %d번째 값을 입력:",j+1,k+1);
				arr[j][k] = sc.nextInt();
				}
				
			}

			
	
		
		//----------------------------------------
		//이중배열의 값 평균 구하기.
		for(int i =0; i< arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
			sum	+= arr[i][j];
			}
			average[i] = sum/(arr[i].length);
			sum = 0;
		}
		//평균 위의 학생의 비율 반환
		
		for(int i =0; i< arr.length; i++) {
			//점수가 더 높은 인원의 사람명수 구하기.
			for(int j=0; j<arr[i].length; j++) {
			
				if(average[i]<arr[i][j]) {
					averageUp++;
				}
			}
			average[i] = averageUp;
			averageUp = 0;
		}
		
		for(int i=0; i<average.length; i++) {
		float percent	= (float)average[i]/(float)arr[i].length;
		String num = String.format("%.3f", percent*100);
		System.out.println(num+"%");
		}
		
		
		
		//이중배열 생성
	}
}

package Algorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class one0809 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//소문자 단어 입력받기
		String S = bf.readLine();
		bf.close();
		//잘 출력됨. (확인)
//		System.out.println(S);
		
		//26개 알파벳 위치에 대해서 -1을 표시할 배열 생성
		int[] alpha = new int[26];
		char[] charArray = new char[S.length()];
		//초기값을 -1로 setting
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = -1;
		}
		
		//소문자 단어를 검색해서 char배열에 차례대로 넣기.
		for(int i=0; i<S.length(); i++) {
			charArray[i] = S.charAt(i);
		}
		
		int a = S.charAt(0);
//		System.out.println(a);
		//-1로 초기화된 alpha배열에 charArray[i]의 값을 int로 변경해서 -97하면 0~26으로 비교가능
		// 이 for문안에 i는 자릿수이고 
		for(int i=0; i<charArray.length; i++) {
			int change = charArray[i]-97; // charArray의 값을 순서대로 int로 변경
			if(alpha[change]!=-1) {
				continue;
			} else {
				alpha[change] = i;
			}
			
		}
		for(int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i]+" ");
		}
	}
}

package Algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class one157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//String �ܾ �޴´�.
		String inputString = sc.next();
		
//		System.out.println(inputString);
		
		char[] charArray = new char[inputString.length()];
		// String�� �ܾ���� char �迭�� �־� ���߿� ���Ѵ�.
		for(int i=0; i<inputString.length(); i++) {
			charArray[i] = inputString.charAt(i);	
		}
		//�ϳ��� ���غ���.
		//���ϴ� ���ĺ��� ���ڸ� �ϳ��� �ø� �� �ִ� �迭�ϳ��� ������.
		int[] alphabetCount = new int[26];
		for(int i=0; i<inputString.length(); i++) {
			if((charArray[i] == 'a')||(charArray[i]=='A') ) {
				alphabetCount[0]++;
			}
			else if(charArray[i]=='b'||charArray[i]=='B') {
				alphabetCount[1]++;
			}
			else if(charArray[i]=='c'||charArray[i]=='C') {
				alphabetCount[2]++;
			}
			else if(charArray[i]=='d'||charArray[i]=='D') {
				alphabetCount[3]++;
			}
			else if(charArray[i]=='e'||charArray[i]=='E') {
				alphabetCount[4]++;
			}
			else if(charArray[i]=='f'||charArray[i]=='F') {
				alphabetCount[5]++;
			}else if(charArray[i]=='g'||charArray[i]=='G') {
				alphabetCount[6]++;
			}
			else if(charArray[i]=='h'||charArray[i]=='H') {
				alphabetCount[7]++;
			}
			else if(charArray[i]=='i'||charArray[i]=='I') {
				alphabetCount[8]++;
			}
			else if(charArray[i]=='j'||charArray[i]=='J') {
				alphabetCount[9]++;
			}
			else if(charArray[i]=='k'||charArray[i]=='K') {
				alphabetCount[10]++;
			}
			else if(charArray[i]=='l'||charArray[i]=='L') {
				alphabetCount[11]++;
			}
			else if(charArray[i]=='m'||charArray[i]=='M') {
				alphabetCount[12]++;
			}
			else if(charArray[i]=='n'||charArray[i]=='N') {
				alphabetCount[13]++;
			}
			else if(charArray[i]=='o'||charArray[i]=='O') {
				alphabetCount[14]++;
			}
			else if(charArray[i]=='p'||charArray[i]=='P') {
				alphabetCount[15]++;
			}
			else if(charArray[i]=='q'||charArray[i]=='Q') {
				alphabetCount[16]++;
			}
			else if(charArray[i]=='r'||charArray[i]=='R') {
				alphabetCount[17]++;
			}
			else if(charArray[i]=='s'||charArray[i]=='S') {
				alphabetCount[18]++;
			}
			else if(charArray[i]=='p'||charArray[i]=='P') {
				alphabetCount[19]++;
			}
			else if(charArray[i]=='u'||charArray[i]=='U') {
				alphabetCount[20]++;
			}
			else if(charArray[i]=='v'||charArray[i]=='V') {
				alphabetCount[21]++;
			}
			else if(charArray[i]=='w'||charArray[i]=='W') {
				alphabetCount[22]++;
			}
			else if(charArray[i]=='x'||charArray[i]=='X') {
				alphabetCount[23]++;
			}
			else if(charArray[i]=='y'||charArray[i]=='Y') {
				alphabetCount[24]++;
			}
			else if(charArray[i]=='z'||charArray[i]=='Z') {
				alphabetCount[25]++;
			}
			
		}
		//26���� �빮�� ���ĺ� �迭�� ���� ����� ���ĺ��� ����
		//���ڰ� ���ٸ� ?ǥ�� (if��)
		char[] BigAlphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','P','U','V','W','X','Y','Z'}; 
		int max = alphabetCount[0];
		int maxIndex = 0;
		int realMax = 0;
		int[] tmp = new int[26];
		for(int i=0; i<alphabetCount.length; i++) {
//			System.out.println(alphabetCount[i]);
			if(alphabetCount[i]>max) {
				max = alphabetCount[i];
				maxIndex = i;
			}
		}
		tmp = alphabetCount;
		tmp[maxIndex] = 0;
		for(int i=0; i<alphabetCount.length; i++) {
			if(alphabetCount[maxIndex] == tmp[i]) {
				System.out.println('?');
				break;
			} else {
				System.out.println(BigAlphabet[maxIndex]);
			}
		}
		
		
		
	}
}

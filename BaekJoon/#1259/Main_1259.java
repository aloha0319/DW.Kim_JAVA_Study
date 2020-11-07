package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 8.
 * 문제 제목 : 팰린드롬수
 * 문제 번호 : 1259
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬이라고 한다. 'radar', 'sees'는 팰린드롬이다.
 *          수도 팰린드롬으로 취급할 수 있다. 수의 숫자들을 뒤에서부터 읽어도 같다면 그 수는 팰린드롬수다.
 *          121, 12421 등은 팰린드롬수다. 123, 1231은 뒤에서부터 읽으면 다르므로 팰린드롬수가 아니다. 
 *          또한 10도 팰린드롬수가 아닌데, 앞에 무의미한 0이 올 수 있다면 010이 되어 팰린드롬수로 취급할 수도 있지만, 특별히 이번 문제에서는 무의미한 0이 앞에 올 수 없다고 하자.
 *
 * 입       력 : 입력은 여러 개의 테스트 케이스로 이루어져 있으며, 각 줄마다 1 이상 99999 이하의 정수가 주어진다. 입력의 마지막 줄에는 0이 주어지며, 이 줄은 문제에 포함되지 않는다.
 *
 * 출       력 : 각 줄마다 주어진 수가 팰린드롬수면 'yes', 아니면 'no'를 출력한다.
 *
 * 
 **/
public class Main_1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		StringBuilder sb = new StringBuilder();
		
		while((str = br.readLine()) != null){
			if(str.equals("0")) {
				break;
			}
			
			int len		= str.length();
			int start	= 0;
			int end 	= len - 1;
			
			boolean isPal = true;
			
			//두 탐색 인덱스가 교차할 떄 까지 순차 탐색
			
			while(start <= end) {
				if(str.charAt(start) != str.charAt(end)) {
					isPal = false;
					break;
				}
				
				start++;
				end--;
			}
			
			if(isPal) {
				sb.append("yes");
			}else {
				sb.append("no");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());

	}

}

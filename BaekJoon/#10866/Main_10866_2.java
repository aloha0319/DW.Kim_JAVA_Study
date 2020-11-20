package DW_Kim_JAVA_Study_BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 20.
 * 문제 제목 : 덱
 * 문제 번호 : 10866
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *          명령은 총 여덟 가지이다.
 *          	push_front X : 정수 X를 덱의 앞에 넣는다.
 *          	push_back X  : 정수 X를 덱의 뒤에 넣는다.
 *          	pop_front	 : 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *          	pop_back	 : 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *              size		 : 덱에 들어있는 정수의 개수를 출력한다.
 *              empty		 : 덱이 비어있으면 1을, 아니면 0을 출력한다.
 *              front		 : 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *              back		 : 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *          
 * 입       력 : 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 
 *          둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 *
 * 출       력 : 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 *
 * 
 **/
public class Main_10866_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String inputText;
		ArrayList<Integer> deque = new ArrayList<>();
		
		int inputNum;
		
		for(int i = 0; i < N; i++) {
			inputText = sc.next();
			
			switch(inputText) {
				case "push_front":
					inputNum = sc.nextInt();
					deque.add(0, inputNum);
					break;
				
				case "push_back":
					inputNum = sc.nextInt();
					deque.add(inputNum);
					break;
				
				case "pop_front":
					if(deque.size() != 0) {
						System.out.println(deque.get(0));
						deque.remove(0);
					} else {
						System.out.println(-1);
					}
					break;
				
				case "pop_back":
					if(deque.size() != 0) {
						System.out.println(deque.get(deque.size() - 1));
						deque.remove(deque.size() - 1);
					} else {
						System.out.println(-1);
					}
					break;
					
				case "size":
					System.out.println(deque.size());
					break;
					
				case "empty":
					if(deque.size() != 0) {
						System.out.println(0);
					} else {
						System.out.println(1);
					}
					break;
				
				case "front":
					if(deque.size() != 0) {
						System.out.println(deque.get(0));
					} else {
						System.out.println(-1);
					}
					break;
				
				case "back":
					if(deque.size() != 0) {
						System.out.println(deque.get(deque.size() - 1));
					} else {
						System.out.println(-1);
					}
					break;
			}
		}

	}

}

package DW_Kim_JAVA_Study_Programmers;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 5.
 * 문제 제목 : 두 정수의 사이의 합
 * 문제 출처 : https://programmers.co.kr/learn/courses/30/lessons/12912
 * 
 * 문       제 : 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
 *          예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 *
 * 제한 조건 : a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
 *         a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
 *         a와 b의 대소관계는 정해져있지 않습니다.
 *
 * 입출력 예 : a	b	return
 *         3	5	12
 *         3	3	3
 *         5	3	12
 *
 * 
 **/
class Solution {
	public long solution(int a, int b) {
		long answer = 0;
		
		if( a == b ) {
			answer = a;
		} else if( a < b ) {
			for( int i=a; i <= b; i++ ) {
				answer += i;
			}
		} else if( b < a ) {
			for( int i=b; i <= a; i++ ) {
				answer += i;
			}
		}
	
		return answer;

	}
}

/* 모범 답안 : 등차수열의 합 공식
	class Solution {
	
	    public long solution(int a, int b) {
	        return sumAtoB(Math.min(a, b), Math.max(b, a));
	    }
	
	    private long sumAtoB(long a, long b) {
	        return (b - a + 1) * (a + b) / 2;
	    }
	}
*/

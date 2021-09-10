package com.Study;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NewId {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String new_id = sc.next();
		
		new_id = new_id.toLowerCase(); // 1. 소문자로 치환
		
		new_id = new_id.replaceAll("[^a-z|0-9|\\-|_|.]", ""); // 2. 특정 조건을 제외한 모든 문자 제거 (정규식 활용) -> 빼기는 \\두개를 붙여줘야 마이너스라고 인식
		
		// 3. 마침표가 두번 이상 연속된 부분을 하나로 치환
		new_id = new_id.replaceAll("[.]{2,}", ".");
		
		// 4. 마침표가 처음이나 끝에 위치한다면 제거
		new_id = new_id.replaceAll("^[.]|[.]$", "");
		
		// 5. 빈 문자열이라면 a 대입
		if(new_id.isEmpty()) {
			new_id = "a";
		}
		
		// 6. 16자 이상이면 첫 15개 문자를 제외한 나머지 문자 제거
		if(new_id.length() > 15) {
			new_id = new_id.substring(0,15);
			new_id = new_id.replaceAll("[.]$", "");
		}
			
		
		// 7. 길이가 2자 이하라면 마지막 문자를 길이가 3이 될 때까지 붙인다.
		if(new_id.length() < 3) {
			while(new_id.length() < 3) {
				new_id = new_id.concat(new_id.substring(new_id.length()-1));	
			}
		}
		
		System.out.println(new_id);
		
		
	 }
}

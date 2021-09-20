package com.Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1003_피보나치 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(rd.readLine()); // 테스트 케이스 개수
		int[][] result = new int[41][2];

		result[0][0] = 1;
		result[0][1] = 0;
		result[1][0] = 0;
		result[1][1] = 1;
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(rd.readLine());
			for(int j=2; j<=n; j++) {
				result[j][0] = result[j-2][0] + result[j-1][0];
				result[j][1] = result[j-2][1] + result[j-1][1];
			}
			System.out.println(result[n][0] + " " + result[n][1]);
		}
	}
}

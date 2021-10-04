package com.Study;
import java.util.Scanner;

public class No2618_경찰차 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("동서방향 도로의 개수 : ");
		int n = sc.nextInt();
		
		System.out.print("처리해야 하는 사건의 개수 : ");
		int w = sc.nextInt();
		
		int police1_x = 1; int police1_y = 1;
		int police2_x = n; int police2_y = n;

		int[] police_num = new int[w];
		
		int[] result = new int[w];
		
		int[] x = new int[w];
		int[] y = new int[w];
		for(int i=0; i<w; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		int test = 0;
		double avg = 0;
		for(int i=0; i<w; i++) {
			test += x[i] + y[i];
		}
		avg = test/w;

		for(int i=0; i<w; i++) {
			if(avg >= x[i] + y[i]) {
				if(police1_x >= x[i] && police1_y >= y[i]) {
					result[i] = Math.abs((police1_x- x[i])) + Math.abs((police1_y - y[i]));	
				}
				else {
					result[i] = Math.abs((x[i] - police1_x)) + Math.abs((y[i] - police1_y));	
				}
				police1_x = x[i];
				police1_y = y[i];
				police_num[i] = 1;
			}
			else {
				if(x[i] < police2_x) {
					result[i] = Math.abs((police2_x - x[i])) + Math.abs((police2_y - y[i]));
				}
				else {
					result[i] = Math.abs((x[i] - police2_x)) + Math.abs((y[i] - police2_y));
				}
				police2_x = x[i];
				police2_y = y[i];
				police_num[i] = 2;
			}	
		}
		
		
		
//		for(int i=0; i<w; i++) {
//			// 만약 값에서 (1,1)을 뺀 것 보다 (N,N)에서 값을 뺀 값을 합친게 작을경우
//			if( ((x[i] - police1_x) + (y[i] - police1_y)) > ((police2_x - x[i]) + (police2_y - y[i])) ) {
//				
//				
//				if(x[i] < police2_x) {
//					result[i] = Math.abs((police2_x - x[i])) + Math.abs((police2_y - y[i]));
//				}
//				else {
//					result[i] = Math.abs((x[i] - police2_x)) + Math.abs((y[i] - police2_y));
//				}
//				police2_x = x[i];
//				police2_y = y[i];
//				police_num[i] = 2;
//				
//			}
//			else {
//				if(police1_x >= x[i] && police1_y >= y[i]) {
//					result[i] = Math.abs((police1_x- x[i])) + Math.abs((police1_y - y[i]));	
//				}
//				else {
//					result[i] = Math.abs((x[i] - police1_x)) + Math.abs((y[i] - police1_y));	
//				}
//				police1_x = x[i];
//				police1_y = y[i];
//				police_num[i] = 1;
//			}
//			System.out.println("result : " + result[i]);
//		}
		
		int sum=0;
		for(int i=0; i<w; i++) {
			sum += result[i];
		}
		System.out.println(sum);
		
		
		for(int i=0; i<w; i++) {
			System.out.println(police_num[i]);
		}
	}
}

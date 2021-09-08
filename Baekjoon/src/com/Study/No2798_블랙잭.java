package com.Study;

import java.util.Scanner;

public class No2798_블랙잭 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); // 카드 장수
      int m = sc.nextInt(); // 합
      
      int[] num = new int[n];
      for(int i=0; i<n; i++) {
         num[i] = sc.nextInt(); // n개의 숫자
      }
      
      // 입력 숫자 오름차순 정렬
      for(int i=0; i<n-1; i++) {
         for(int j=i+1; j<n; j++) {
            if(num[i] > num[j]) {
               int tmp = num[i];
               num[i] = num[j];
               num[j] = tmp;
            }
         }
      }
      
      
      int sum = 0;
      for(int i=n-1; i>-1; i--) {
         for(int j=i-1; j>0; j--) {
            for(int k=j-1; k>-1; k--) {
               if((num[i] + num[j] + num[k] <= m) && (sum < num[i] + num[j] + num[k])) {
                  sum = num[i] + num[j] + num[k];
               }
            }
         }
      }
      
      System.out.println();
      for(int i=0; i<n; i++) {
         System.out.print(num[i] + " "); // 입력값 정렬 출력
      }
      
      System.out.println("\n" + sum);
      
   }
}


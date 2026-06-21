package org.programmers.HighScoreKit;

import java.util.*;

public class DP_01 {
  public static void main(String[] args){
    solution(5, 12);
  } 
  
  private static int solution(int N, int num){
    int repeat = 0;
    Set<Integer>[] dp = new HashSet[9];

    for (int i = 1; i < 9; i++) {
        dp[i] = new HashSet<>();
        repeat = repeat*10+N;
        dp[i].add(repeat);
    }
    //한 번에 나오는 경우
    dp[1].add(N);
    if(dp[1].contains(num)) return 1;

    //그 이상
    for(int i=2; i<9; i++){
      // i개를 j개 + (i-j)개로 나눈다
      for(int j=1; j<i; j++){
        for(int a: dp[j]){
          for(int b: dp[i-j]){
            dp[i].add(a+b);
            dp[i].add(a-b);
            dp[i].add(a*b);
            if(b!=0){
              dp[i].add(a/b);
            }
          }
        }
      }

      if(dp[i].contains(num)) return i;
    }

    return -1;
  }
}

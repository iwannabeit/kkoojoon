package org.programmers.HighScoreKit;

import java.util.*;

public class DP_01 {
  public static void main(String[] args){
    solution(5, 12);
  } 
  
  private static int solution(int N, int num){
    int min = 0;
    int repeat = 0;
    Set<Integer>[] dp = new HashSet[9];

    for (int i = 1; i < 9; i++) {
        dp[i] = new HashSet<>();
        repeat = repeat*10+N;
        dp[i].add(repeat);
    }
    //한 번에 나오는 경우
    dp[1].add(N);
    if(dp[1].equals(num)) return 1;

    //그 이상
    for(int i=2; i<9; i++){

      for(int val: dp[i-1]){
        dp[i].add(val+N);
        dp[i].add(val*N);
        dp[i].add(val-N);
        dp[i].add(N-val);
        if(N!=0)
          dp[i].add(val/N);
        if(val!=0)
          dp[i].add(N/val);
      }
    }

    return min;
  }
}
